package com.ourownjava.spring.data.solr;

import org.apache.solr.client.solrj.beans.Field;

/**
 * 
 * @author ourownajava.com
 *
 */
public class Product {
	
	@Field
	private String id;
	@Field
	private String name;
	@Field
	private Double price;
	
	public String getId() {
		return id;
	}
	public void setId(final String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(final Double price) {
		this.price = price;
	}

}
