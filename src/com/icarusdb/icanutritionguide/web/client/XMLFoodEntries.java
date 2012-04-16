package com.icarusdb.icanutritionguide.web.client;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class XMLFoodEntries {

	interface VubReader extends XmlReader<XMLFoodEntries> {
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

	@Path("food_entry_id")
	String food_entry_id;

	@Path("food_entry_description")
	String food_entry_description;

	@Path("date_int")
	String date_int;

	@Path("meal")
	String meal;

	@Path("food_id")
	String food_id;

	@Path("serving_id")
	String serving_id;

	@Path("number_of_units")
	String number_of_units;

	@Path("food_entry_name")
	String food_entry_name;

	@Path("calories")
	String calories;

	@Path("carbohydrate")
	String carbohydrate;

	@Path("protein")
	String protein;

	@Path("fat")
	String fat;

	@Path("saturated_fat")
	String saturated_fat;

	@Path("polyunsaturated_fat")
	String polyunsaturated_fat;

	@Path("monounsaturated_fat")
	String monounsaturated_fat;

	@Path("sodium")
	String sodium;

	@Path("potassium")
	String potassium;

	@Path("fiber")
	String fiber;

	@Path("sugar")
	String sugar;

	@Path("vitamin_a")
	String vitamin_a;

	@Path("vitamin_c")
	String vitamin_c;

	@Path("calcium")
	String calcium;

	@Path("iron")
	String iron;

}
