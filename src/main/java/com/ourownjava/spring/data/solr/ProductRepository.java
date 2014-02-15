package com.ourownjava.spring.data.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * 
 * @author ourownjava.com
 *
 */
public interface ProductRepository extends SolrCrudRepository<Product, String>{
	
	public List<Product> findByName(final String name);

}
