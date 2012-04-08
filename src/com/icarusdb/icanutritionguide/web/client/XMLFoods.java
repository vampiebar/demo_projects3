package com.icarusdb.icanutritionguide.web.client;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class XMLFoods {

	interface VubReader extends XmlReader<XMLFoods> {
	}

	public static final VubReader XML = GWT.create(VubReader.class);

	/*
	 * int count; String name; boolean readonly;
	 * 
	 * @Format("dd.MM.yyyy") Date createdAt;
	 */

	// <circle title="4817" cy="213" cx="480" r="25" stroke-width="1"
	// stroke-opacity="1.0" stroke="black" fill-opacity="1.0"
	// fill="red"></circle>

	// <rect title="4818" height="50" width="50" y="203" x="259"
	// stroke-width="1" stroke-opacity="1.0" stroke="black" fill-opacity="1.0"
	// fill="blue"></rect>

	/*
	 * @Path("food") List<String> food;
	 */

	@Path("food_id")
	String food_id;

	@Path("food_name")
	String food_name;

	@Path("food_type")
	String food_type;

	@Path("food_url")
	String food_url;

	@Path("food_description")
	String food_description;

}
