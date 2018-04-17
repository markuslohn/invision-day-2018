package com.esentri.office;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esentri.office.Contact;
import com.esentri.office.ContactRepository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A test case for ContactRepository.
 * 
 * @author <a href="mailto:markus.lohn@esentri.com">mlohn</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetAll() {
	assertTrue(contactRepository.findAll().spliterator().getExactSizeIfKnown() == 1000);
    }

    @Test
    public void getOne() {
	assertTrue(contactRepository.findOne(1) != null);
    }

    @Test
    public void updateAContact() {
	Contact contact = contactRepository.findOne(2);
	assertTrue(contact != null);

	contact.setLastname("Green Apple");
	contactRepository.save(contact);

	assertTrue(contactRepository.findOne(2).getLastname().equals("Green Apple"));
    }

    @Test
    public void getWrongId() {
	assertTrue(contactRepository.findOne(9999) == null);
    }
}
