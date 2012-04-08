package com.icarusdb.icanutritionguide.web.client;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

/*
 <servings>
 <serving>
 <serving_id>16758</serving_id>
 <serving_description>regular slice</serving_description>
 <serving_url>http://www.fatsecret.com/calories-nutrition/generic/french-toast-plain?portionid=16758&portionamount=1.000</serving_url>
 <metric_serving_amount>65.000</metric_serving_amount>
 <metric_serving_unit>g</metric_serving_unit>
 <number_of_units>1.000</number_of_units>
 <measurement_description>regular slice</measurement_description>
 <calories>159</calories>
 <carbohydrate>20.02</carbohydrate>
 <protein>5.58</protein>
 <fat>6.13</fat>
 <saturated_fat>1.585</saturated_fat>
 <polyunsaturated_fat>1.578</polyunsaturated_fat>
 <monounsaturated_fat>2.298</monounsaturated_fat>
 <trans_fat>0</trans_fat>
 <cholesterol>90</cholesterol>
 <sodium>320</sodium>
 <potassium>80</potassium>
 <fiber>0.8</fiber>
 <sugar>4.87</sugar>
 <vitamin_a>0</vitamin_a>
 <vitamin_c>0</vitamin_c>
 <calcium>8</calcium>
 <iron>9</iron>
 </serving>
 </servings>
 */

public class XMLFoodServings {

	interface VubReader extends XmlReader<XMLFoodServings> {
	}

	public static final VubReader XML = GWT.create(VubReader.class);

	@Path("serving_id")
	String serving_id;

	@Path("serving_description")
	String serving_description;

	@Path("serving_url")
	String serving_url;

	@Path("metric_serving_unit")
	String metric_serving_unit;

	@Path("number_of_units")
	String number_of_units;

	@Path("measurement_description")
	String measurement_description;

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

	@Path("trans_fat")
	String trans_fat;

	@Path("cholesterol")
	String cholesterol;

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
