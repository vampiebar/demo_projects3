package com.icarusdb.icanutritionguide.web.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.DefaultFormat;

public class CmpstAddFood extends Composite {

	public String _foodID;
	public String _foodName;
	public List<String> _lstServingID;

	public List<Map<String, String>> _lstmapServingItems;
	private VerticalPanel verticalPanel_1;
	private HorizontalPanel horizontalPanel_1;
	private Label lblNewLabel_3;
	private DoubleBox tctAmount;
	private VerticalPanel verticalPanel_3;
	private HorizontalPanel horizontalPanel_3;
	private Label lblNewLabel_4;
	private ListBox cbxMeal;
	private HorizontalPanel horizontalPanel_4;
	private Label lblName;
	private TextBox tctFoodName;
	private Button btnSave;
	private Label lblServingType;
	private HorizontalPanel horizontalPanel_5;
	private Label lblFoodName;
	private VerticalPanel verticalPanel_4;
	private HorizontalPanel horizontalPanel_6;
	private Label lblFoodServeType;
	private HTML htmlNutritionValues;

	public String _html;
	private VerticalPanel vtpanServings;
	private Label lblNewLabel_2;
	private Label lblNewLabel_5;
	private Label lblAddThisItem;
	private HorizontalPanel horizontalPanel_7;
	private Label lblDate;
	private DateBox dtpDate;
	private HorizontalPanel horizontalPanel_8;
	private Button btnCancel;

	public DialogBox _dlgParent;

	public CmpstAddFood(String strFoodID, String strFoodName,
			DialogBox dlgParent) {

		_foodID = strFoodID;
		_foodName = strFoodName;
		_dlgParent = dlgParent;

		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("gwt-Label5");
		initWidget(verticalPanel);
		verticalPanel.setSize("482px", "411px");

		verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setSpacing(4);
		verticalPanel_4.setStyleName("gwt-Header1");
		verticalPanel.add(verticalPanel_4);
		verticalPanel_4.setWidth("100%");

		horizontalPanel_6 = new HorizontalPanel();
		horizontalPanel_6
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_4.add(horizontalPanel_6);
		horizontalPanel_6.setSize("100%", "30px");

		lblFoodServeType = new Label("...");
		lblFoodServeType.setStyleName("gwt-Label6");
		horizontalPanel_6.add(lblFoodServeType);

		horizontalPanel_5 = new HorizontalPanel();
		verticalPanel_4.add(horizontalPanel_5);
		horizontalPanel_5
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_5.setSize("100%", "30px");

		lblFoodName = new Label(_foodName);
		lblFoodName.setStyleName("gwt-Label7");
		horizontalPanel_5.add(lblFoodName);

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setSpacing(4);
		verticalPanel.add(horizontalPanel);
		verticalPanel.setCellHeight(horizontalPanel, "280px");

		htmlNutritionValues = new HTML(
				"<table class=\"fatsecret_nutrition_table\" style=\"border-collapse:\ncollapse; width: 181px; margin-top: 0px; margin-right: auto;\nmargin-bottom: 0px; margin-left: auto; color: rgb(0, 0, 0);\nfont-family: Arial; font-size: 12px; font-style: normal;\nfont-variant: normal; font-weight: normal; letter-spacing: normal;\nline-height: normal; orphans: 2; text-align: -webkit-auto;\ntext-indent: 0px; text-transform: none; white-space: normal;\nwidows: 2; word-spacing: 0px; -webkit-text-size-adjust: auto;\n-webkit-text-stroke-width: 0px; \">\n<tbody>\n<tr style=\"line-height: 13px; \">\n<td colspan=\"3\" style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \"><span class=\"fatsecret_nutritionpanel_header\"\nstyle=\"font-size: 22px; font-weight: 700; line-height:\n25px; font-family: 'Arial Black'; letter-spacing: 1px; \">Nutrition\nFacts</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td colspan=\"3\" style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \"><span class=\"fatsecret_serving_size_label\">Serving\nSize</span><span class=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_serving_size_value\">$serving_description</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_seperator fatsecret_first_seperator\"\ncolspan=\"3\" style=\"background-color: rgb(136, 136, 136);\nline-height: 5px; color: rgb(85, 85, 85); vertical-align:\ntop; height: 5px; \"><br>\n</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td colspan=\"3\" style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \"><span class=\"fatsecret_amount_per_serving\"\nstyle=\"font-size: 10px; font-weight: 700; \">Amount Per\nServing</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"3\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \">\n<div style=\"float: right; \"><span\nclass=\"fatsecret_calories_fat_label\"><br>\n</span><span class=\"fatsecret_calories_fat_value\"></span></div>\n<span class=\"fatsecret_calories_label\" style=\"font-weight:\n700; \">Calories</span><span class=\"Apple-converted-space\">\n</span><span class=\"fatsecret_calories_value\">$calories</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_seperator fatsecret_second_seperator\"\ncolspan=\"3\" style=\"background-color: rgb(136, 136, 136);\nline-height: 5px; height: 2px; color: rgb(85, 85, 85);\nvertical-align: top; \"><br>\n</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td colspan=\"3\" style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \" align=\"right\"><span class=\"fatsecret_daily_values\"\nstyle=\"font-size: 10px; font-weight: 700; \">% Daily\nValues*</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"2\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_one_label\" style=\"font-weight: 700; \">Total\nFat</span><span class=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_one_value\">$fat</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"\nalign=\"right\"><span class=\"fatsecret_perc_value\"\nstyle=\"font-weight: 700; \">3</span><span\nclass=\"Apple-converted-space\">&nbsp;</span><span\nclass=\"fatsecret_perc\">%</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_two_label\">Saturated Fat</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_two_value\">$saturated_fat</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"\nalign=\"right\"><span class=\"fatsecret_perc_value\"\nstyle=\"font-weight: 700; \">3</span><span\nclass=\"Apple-converted-space\">&nbsp;</span><span\nclass=\"fatsecret_perc\">%</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_two_label\">Polyunsaturated Fat</span><span\nclass=\"fatsecret_lvl_two_value\"> $polyunsaturated_fat<br>\n</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_two_label\">Monounsaturated Fat</span><span\nclass=\"fatsecret_lvl_two_value\"> $monounsaturated_fat<br>\n</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"2\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_one_label\" style=\"font-weight: 700; \">Cholesterol</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_one_value\">$cholesterol</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"\nalign=\"right\"><span class=\"fatsecret_perc_value\"\nstyle=\"font-weight: 700; \">7</span><span\nclass=\"Apple-converted-space\">&nbsp;</span><span\nclass=\"fatsecret_perc\">%</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"2\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_one_label\" style=\"font-weight: 700; \">Sodium</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_one_value\">$sodium</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"\nalign=\"right\"><span class=\"fatsecret_perc_value\"\nstyle=\"font-weight: 700; \">1</span><span\nclass=\"Apple-converted-space\">&nbsp;</span><span\nclass=\"fatsecret_perc\">%</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"2\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_one_label\" style=\"font-weight: 700; \">Potassium</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_one_value\">$potassium</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"2\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_one_label\" style=\"font-weight: 700; \">Total\nCarbohydrate</span><span class=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_one_value\">$carbohydrate</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"\nalign=\"right\"><span class=\"fatsecret_perc_value\"\nstyle=\"font-weight: 700; \">0</span><span\nclass=\"Apple-converted-space\">&nbsp;</span><span\nclass=\"fatsecret_perc\">%</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_two_label\">Dietary Fiber</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_two_label\">$fiber</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"\nalign=\"right\"><span class=\"fatsecret_perc_value\"\nstyle=\"font-weight: 700; \">0</span><span\nclass=\"Apple-converted-space\">&nbsp;</span><span\nclass=\"fatsecret_perc\">%</span></td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_two_label\">Sugars</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_two_value\">$sugar</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"2\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \"><span\nclass=\"fatsecret_lvl_one_label\" style=\"font-weight: 700; \">Protein</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_lvl_one_value\">$protein</span></td>\n<td class=\"fatsecret_border_top\" style=\"border-top-width: 1px;\nborder-top-style: solid; border-top-color: rgb(188, 188,\n188); color: rgb(85, 85, 85); vertical-align: top; \">&nbsp;</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_seperator fatsecret_third_seperator\"\ncolspan=\"3\" style=\"background-color: rgb(136, 136, 136);\nline-height: 5px; color: rgb(85, 85, 85); vertical-align:\ntop; height: 5px; \"><br>\n</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td colspan=\"3\" style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \">\n<table class=\"fatsecret_perc_daily_table\" width=\"100%\"\ncellpadding=\"0\" cellspacing=\"0\">\n<tbody>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \" width=\"45%\"><span\nclass=\"fatsecret_perc_daily_label\">Vitamin A </span><span\nclass=\"Apple-converted-space\"></span><span\nclass=\"fatsecret_perc\">$vitamin_a</span></td>\n<td class=\"fatsecret_dot\" style=\"color: rgb(85, 85,\n85); vertical-align: top; \" align=\"center\"><img\nsrc=\"http://platform.fatsecret.com/js/static/images/icons/myfs_darkcir.gif\"\nheight=\"6\" width=\"6\"></td>\n<td style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \" width=\"45%\"><span\nclass=\"fatsecret_perc_daily_label\">Vitamin C</span><span\nclass=\"Apple-converted-space\">&nbsp; </span><span\nclass=\"fatsecret_perc_daily_value\">$vitamin_c</span><span\nclass=\"fatsecret_perc\"></span></td>\n</tr>\n</tbody>\n</table>\n</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td colspan=\"3\" class=\"fatsecret_border_top\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \">\n<table class=\"fatsecret_perc_daily_table\" width=\"100%\"\ncellpadding=\"0\" cellspacing=\"0\">\n<tbody>\n<tr style=\"line-height: 13px; \">\n<td style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \" width=\"45%\"><span\nclass=\"fatsecret_perc_daily_label\">Calcium</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_perc_daily_value\">$calcium</span><span\nclass=\"fatsecret_perc\"></span></td>\n<td class=\"fatsecret_dot\" style=\"color: rgb(85, 85,\n85); vertical-align: top; \" align=\"center\"><img\nsrc=\"http://platform.fatsecret.com/js/static/images/icons/myfs_darkcir.gif\"\nheight=\"6\" width=\"6\"></td>\n<td style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \" width=\"45%\"><span\nclass=\"fatsecret_perc_daily_label\">Iron</span><span\nclass=\"Apple-converted-space\"> </span><span\nclass=\"fatsecret_perc_daily_value\">$iron</span><span\nclass=\"Apple-converted-space\"></span><span\nclass=\"fatsecret_perc\"></span></td>\n</tr>\n</tbody>\n</table>\n</td>\n</tr>\n<tr style=\"line-height: 13px; \">\n<td class=\"fatsecret_border_top\" colspan=\"3\"\nstyle=\"border-top-width: 1px; border-top-style: solid;\nborder-top-color: rgb(188, 188, 188); color: rgb(85, 85,\n85); vertical-align: top; \">\n<table class=\"fatsecret_perc_daily_note_table\">\n<tbody>\n<tr style=\"line-height: 13px; \" valign=\"top\">\n<td style=\"color: rgb(85, 85, 85); vertical-align:\ntop; \">*</td>\n<td class=\"fatsecret_perc_daily_note\" style=\"color:\nrgb(85, 85, 85); vertical-align: top; font-size:\n9px; \">Percent Daily Values are based on a 2000\ncalorie diet. Your daily values may be higher or\nlower depending on your calorie needs.</td>\n</tr>\n</tbody>\n</table>\n</td>\n</tr>\n</tbody>\n</table>",
				true);
		horizontalPanel.add(htmlNutritionValues);

		verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setSpacing(10);
		horizontalPanel.add(verticalPanel_1);

		vtpanServings = new VerticalPanel();
		verticalPanel_1.add(vtpanServings);

		lblNewLabel_2 = new Label("Common Serving Sizes:");
		lblNewLabel_2.setStyleName("gwt-Label8");
		vtpanServings.add(lblNewLabel_2);

		lblNewLabel_5 = new Label("New label");
		lblNewLabel_5.setStyleName("gwt-LabelServingItem");
		vtpanServings.add(lblNewLabel_5);

		verticalPanel_3 = new VerticalPanel();
		verticalPanel_1.add(verticalPanel_3);

		lblAddThisItem = new Label("Add this item");
		verticalPanel_3.add(lblAddThisItem);
		lblAddThisItem.setStyleName("gwt-Label8");

		horizontalPanel_7 = new HorizontalPanel();
		horizontalPanel_7
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_7.setSpacing(6);
		verticalPanel_3.add(horizontalPanel_7);

		lblDate = new Label("DATE");
		horizontalPanel_7.add(lblDate);

		dtpDate = new DateBox();
		dtpDate.setFormat(new DefaultFormat(DateTimeFormat
				.getFormat("MMM dd, yyyy")));
		dtpDate.setStyleName("gwt-Label8");
		horizontalPanel_7.add(dtpDate);
		dtpDate.setWidth("121px");

		horizontalPanel_3 = new HorizontalPanel();
		horizontalPanel_3
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_3.setSpacing(6);
		verticalPanel_3.add(horizontalPanel_3);

		lblNewLabel_4 = new Label("MEAL");
		horizontalPanel_3.add(lblNewLabel_4);

		cbxMeal = new ListBox();
		cbxMeal.addItem("Breakfast");
		cbxMeal.addItem("Lunch");
		cbxMeal.addItem("Dinner");
		cbxMeal.addItem("Snacks / Other");
		horizontalPanel_3.add(cbxMeal);
		cbxMeal.setWidth("126px");

		horizontalPanel_4 = new HorizontalPanel();
		horizontalPanel_4
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_4.setSpacing(6);
		verticalPanel_3.add(horizontalPanel_4);

		lblName = new Label("NAME");
		horizontalPanel_4.add(lblName);

		tctFoodName = new TextBox();
		tctFoodName.setStyleName("gwt-Label8");
		horizontalPanel_4.add(tctFoodName);

		horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1.setSpacing(2);
		verticalPanel_3.add(horizontalPanel_1);
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

		lblNewLabel_3 = new Label("AMOUNT");
		horizontalPanel_1.add(lblNewLabel_3);
		lblNewLabel_3.setWidth("60px");

		tctAmount = new DoubleBox();
		tctAmount.setStyleName("gwt-Label5");
		tctAmount.setText("1");
		horizontalPanel_1.add(tctAmount);
		tctAmount.setWidth("26px");
		tctAmount.setAlignment(TextAlignment.RIGHT);

		lblServingType = new Label("...");
		lblServingType.setVisible(false);
		lblServingType.setStyleName("gwt-Label6");
		horizontalPanel_1.add(lblServingType);
		lblServingType.setWidth("156px");

		horizontalPanel_8 = new HorizontalPanel();
		horizontalPanel_8.setSpacing(4);
		verticalPanel_3.add(horizontalPanel_8);
		horizontalPanel_8.setWidth("100%");

		btnSave = new Button("New button");
		horizontalPanel_8.add(btnSave);
		btnSave.setWidth("80px");
		btnSave.setText("SAVE");
		verticalPanel_3.setCellHorizontalAlignment(btnSave,
				HasHorizontalAlignment.ALIGN_CENTER);
		verticalPanel_3.setCellVerticalAlignment(btnSave,
				HasVerticalAlignment.ALIGN_MIDDLE);

		btnCancel = new Button("New button");
		btnCancel.addClickHandler(new doBtnCancelClickHandler());
		btnCancel.setText("CANCEL");
		horizontalPanel_8.add(btnCancel);
		horizontalPanel_8.setCellHorizontalAlignment(btnCancel,
				HasHorizontalAlignment.ALIGN_RIGHT);
		btnCancel.setWidth("80px");

		_lstServingID = new ArrayList<String>();
		_lstmapServingItems = new ArrayList<Map<String, String>>();

		if (!isDesignTime()) {

			_html = htmlNutritionValues.getHTML();

			if (_foodName.contains("(")) {

				tctFoodName.setText(_foodName.substring(0,
						_foodName.indexOf("(")));
			} else {

				tctFoodName.setText(_foodName);
			}

			dtpDate.setValue(new Date());

			putFoodIdServingsToGui(_foodID);
		}

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

	public void putFoodIdServingsToGui(String strFoodID) {

		_lstServingID.clear();
		_lstmapServingItems.clear();

		vtpanServings.clear();
		lblNewLabel_2 = new Label("Common Serving Sizes:");
		lblNewLabel_2.setStyleName("gwt-Label8");
		vtpanServings.add(lblNewLabel_2);

		RPCDietSite.Util.getInstance().getFoodServings(strFoodID,
				new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {

						/*
						 * name.pehl.totoe.xml.client.Document document = new
						 * XmlParser() .parse(result);
						 */

						// result =
						// result.substring(result.indexOf("<servings>"),
						// result.lastIndexOf("</foods>"));

						result = "<servings>" + result + "</servings>";

						// Window.alert("result: " + result);

						List<XMLFoodServings> xmfl = XMLFoodServings.XML
								.readList(result);

						String strServingID = "";
						String strServingDesc = "";

						for (int i = 0; i < xmfl.size(); i++) {

							strServingID = xmfl.get(i).serving_id;
							strServingDesc = xmfl.get(i).serving_description;

							_lstServingID.add(strServingID);

							// ADDING LABEL FOR SERVING
							Label lblItem = new Label(strServingDesc);
							lblItem.setStyleName("gwt-LabelServingItem");
							lblItem.addClickHandler(new ClickHandler() {

								@Override
								public void onClick(ClickEvent event) {

									int intSelected = -1;
									for (int i = 0; i < vtpanServings
											.getWidgetCount(); i++) {

										if (i > 0) {
											((Label) vtpanServings.getWidget(i))
													.setStyleName("gwt-LabelServingItem");
										}

										if ((Label) vtpanServings.getWidget(i) == ((Label) event
												.getSource())) {

											intSelected = i - 1;
										}

									}

									((Label) event.getSource())
											.setStyleName("gwt-LabelServingItemSelected");

									putMapToHtml(intSelected);

								}
							});
							vtpanServings.add(lblItem);

							// Adding Map
							Map<String, String> map = new HashMap<String, String>();

							map.put("serving_description",
									xmfl.get(i).serving_description);

							map.put("number_of_units",
									xmfl.get(i).number_of_units);

							map.put("measurement_description",
									xmfl.get(i).measurement_description);

							map.put("calories", xmfl.get(i).calories);

							map.put("carbohydrate", xmfl.get(i).carbohydrate);

							map.put("protein", xmfl.get(i).protein);

							map.put("fat", xmfl.get(i).fat);

							map.put("saturated_fat", xmfl.get(i).saturated_fat);

							map.put("polyunsaturated_fat",
									xmfl.get(i).polyunsaturated_fat);

							map.put("monounsaturated_fat",
									xmfl.get(i).monounsaturated_fat);

							map.put("trans_fat", xmfl.get(i).trans_fat);

							map.put("cholesterol", xmfl.get(i).cholesterol);

							map.put("sodium", xmfl.get(i).sodium);

							map.put("potassium", xmfl.get(i).potassium);

							map.put("fiber", xmfl.get(i).fiber);

							map.put("sugar", xmfl.get(i).sugar);

							map.put("vitamin_a", xmfl.get(i).vitamin_a);

							map.put("vitamin_c", xmfl.get(i).vitamin_c);

							map.put("calcium", xmfl.get(i).calcium);

							map.put("iron", xmfl.get(i).iron);

							_lstmapServingItems.add(map);

						}

						// Select first item
						putMapToHtml(0);
						((Label) vtpanServings.getWidget(1))
								.setStyleName("gwt-LabelServingItemSelected");
						// ((Label) vtpanServings.getWidget(1)).getText();

					}

					@Override
					public void onFailure(Throwable caught) {

						Window.alert("Error: " + caught.getMessage());
					}

				});
	}

	public void putMapToHtml(int index) {

		lblFoodServeType
				.setText(getValueWithNull(index, "serving_description"));

		lblServingType.setText(getValueWithNull(index, "serving_description"));

		String strHtml = _html.replace("$calories",
				getValueWithNull(index, "calories"));

		strHtml = strHtml.replace("$carbohydrate",
				getValueWithNull(index, "carbohydrate"));

		strHtml = strHtml.replace("$protein",
				getValueWithNull(index, "protein"));

		strHtml = strHtml.replace("$fat", getValueWithNull(index, "fat"));

		strHtml = strHtml.replace("$saturated_fat",
				getValueWithNull(index, "saturated_fat"));

		strHtml = strHtml.replace("$polyunsaturated_fat",
				getValueWithNull(index, "polyunsaturated_fat"));

		strHtml = strHtml.replace("$monounsaturated_fat",
				getValueWithNull(index, "monounsaturated_fat"));

		// strHtml = strHtml.replace("$trans_fat",
		// _lstmapServingItems.get(index)
		// .get("trans_fat"));

		strHtml = strHtml.replace("$cholesterol",
				getValueWithNull(index, "cholesterol"));

		strHtml = strHtml.replace("$sodium", getValueWithNull(index, "sodium"));

		strHtml = strHtml.replace("$potassium",
				getValueWithNull(index, "potassium"));

		strHtml = strHtml.replace("$fiber", getValueWithNull(index, "fiber"));

		strHtml = strHtml.replace("$sugar", getValueWithNull(index, "sugar"));

		strHtml = strHtml.replace("$vitamin_a",
				getValueWithNull(index, "vitamin_a"));

		strHtml = strHtml.replace("$vitamin_c",
				getValueWithNull(index, "vitamin_c"));

		strHtml = strHtml.replace("$calcium",
				getValueWithNull(index, "calcium"));

		strHtml = strHtml.replace("$iron", getValueWithNull(index, "iron"));

		strHtml = strHtml.replace("$serving_description",
				getValueWithNull(index, "serving_description"));

		htmlNutritionValues.setHTML(strHtml);

	}

	public String getValueWithNull(int index, String valueToGet) {

		String strTemp = "";

		if (_lstmapServingItems.get(index).get(valueToGet) != null) {

			strTemp = _lstmapServingItems.get(index).get(valueToGet);
		}

		return strTemp;

	}

	private class doBtnCancelClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			_dlgParent.hide();
		}
	}
}
