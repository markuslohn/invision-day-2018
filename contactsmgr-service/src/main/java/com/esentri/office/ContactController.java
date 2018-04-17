package com.esentri.office;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * Provides a simple REST service for contact management.
 * 
 * @author <a href="mailto:markus.lohn@esentri.com">mlohn</a>
 */
@Controller
@RequestMapping(value = "/api/contacts")
public final class ContactController {

    private static Logger LOGGER = LoggerFactory.getLogger(ContactController.class);

    private ContactRepository repository;

    /**
     * Creates a ContactController with a ContactRepository.
     * @param repository a repository to manage contacts 
     */
    @Autowired
    public ContactController(ContactRepository repository) {
	this.repository = repository;
    }
    
    @ResponseBody
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact get(@PathVariable(value = "id", required = true) Integer id) {
	LOGGER.info("Received request for contact with id {}", id);
	verifyContactExists(id);
	return repository.findOne(id);
    }
    
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact post(@RequestBody(required = false) Contact newContact) {
        return repository.save(newContact);
    }
    
    private void verifyContactExists(Integer id) {
        if (!repository.exists(id)) {
            throw new RuntimeException(String.format("Contact with id=%d was not found", id));
        }
    }
}
