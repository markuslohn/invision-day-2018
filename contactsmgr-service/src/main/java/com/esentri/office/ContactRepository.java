package com.esentri.office;

import org.springframework.data.repository.CrudRepository;

/**
 * A repository for Contact entities.
 *  
 * @author <a href="mailto:markus.lohn@esentri.com">mlohn</a>
 */
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
