package com.ourownjava.spring.data.solr;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ourownjava.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-root-context.xml")
public class TestProductRepository {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void shouldIndexProducts(){
		productRepository.save(getProducts());
		final Product product = productRepository.findOne("p1");
		assertEquals("p1", product.getId());
		assertEquals("pname1", product.getName());
	}
	
	@Test
	public void shouldFindByName(){
		final List<Product> products = productRepository.findByName("pname2");
		assertEquals("p2", products.get(0).getId());
		assertEquals("pname2", products.get(0).getName());
	}
	
	private List<Product> getProducts(){
		final List<Product> products = new ArrayList<Product>();
		final Product product = new Product();
		product.setId("p1");
		product.setName("pname1");
		product.setPrice(11.11);
		products.add(product);
		final Product product1 = new Product();
		product1.setId("p2");
		product1.setName("pname2");
		product1.setPrice(12.12);
		products.add(product1);
		return products;
	}
	
}
