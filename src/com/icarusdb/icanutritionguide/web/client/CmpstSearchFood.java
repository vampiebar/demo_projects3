package com.icarusdb.icanutritionguide.web.client;

import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstSearchFood extends Composite {
	private VerticalPanel vtpanMain;
	private TextBox tctFoodSearch;
	private Button btnFoodSearch;
	private VerticalPanel vtpanFoodResults;
	private ScrollPanel scpanFoodResults;

	public CmpstSearchFood() {

		vtpanMain = new VerticalPanel();
		vtpanMain.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vtpanMain.setStyleName("gwt-VerticalPanelFoodAdd1");
		initWidget(vtpanMain);
		vtpanMain.setWidth("100%");

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		vtpanMain.add(horizontalPanel);
		vtpanMain.setCellHeight(horizontalPanel, "50px");
		horizontalPanel.setWidth("90%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		horizontalPanel_1.setSpacing(6);
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		Label lblNewLabel = new Label("Please find food to add your diary");
		lblNewLabel.setStyleName("gwt-LabelMenu");
		horizontalPanel_1.add(lblNewLabel);

		tctFoodSearch = new TextBox();
		tctFoodSearch.setText("turkey");
		tctFoodSearch
				.addValueChangeHandler(new doTctFoodSearchValueChangeHandler());
		tctFoodSearch.setStyleName("gwt-TextBox1");
		horizontalPanel_1.add(tctFoodSearch);
		tctFoodSearch.setSize("240px", "24px");

		btnFoodSearch = new Button("New button");
		btnFoodSearch.addClickHandler(new doBtnFoodSearchClickHandler());
		btnFoodSearch.setText("Search Food");
		horizontalPanel_1.add(btnFoodSearch);
		btnFoodSearch.setWidth("120px");

		scpanFoodResults = new ScrollPanel();
		vtpanMain.add(scpanFoodResults);
		scpanFoodResults.setSize("600px", "1px");

		vtpanFoodResults = new VerticalPanel();
		vtpanFoodResults.setSpacing(8);
		scpanFoodResults.setWidget(vtpanFoodResults);
		vtpanFoodResults.setSize("90%", "100%");
	}

	private class doBtnFoodSearchClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			putFoodSearchResultToGui(tctFoodSearch.getText());
		}
	}

	public void putFoodSearchResultToGui(String text) {

		vtpanFoodResults.clear();

		RPCDietSite.Util.getInstance().getFoods(text,
				new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {

						/*
						 * name.pehl.totoe.xml.client.Document document = new
						 * XmlParser() .parse(result);
						 */

						// EFFECT Resize scpan
						scpanFoodResults.setHeight("550px");
						vtpanMain.getElement().scrollIntoView();

						// Effect.grow(scpanFoodResults);

						result = result.substring(result.indexOf("<food>"),
								result.lastIndexOf("</foods>"));

						result = "<foods>" + result + "</foods>";

						// Window.alert("result: " + result);

						List<XMLFoods> xmfl = XMLFoods.XML.readList(result);

						String strFoodID = "";
						String strFoodName = "";
						String strFoodType = "";
						String strFoodUrl = "";
						String strFoodDesc = "";

						for (int i = 0; i < xmfl.size(); i++) {

							strFoodID = xmfl.get(i).food_id;
							strFoodName = xmfl.get(i).food_name;
							strFoodType = xmfl.get(i).food_type;
							strFoodUrl = xmfl.get(i).food_url;
							strFoodDesc = xmfl.get(i).food_description;

							CmpstFoodItem cfi = new CmpstFoodItem(strFoodID,
									strFoodName, strFoodType, strFoodUrl,
									strFoodDesc, i, scpanFoodResults,
									vtpanFoodResults);

							vtpanFoodResults.add(cfi);
						}

						// Window.alert("size " + xmfl.size());

						// String food_name = xmfl.get(0).food_name;

						// Window.alert("food name: " + food_name);

					}

					@Override
					public void onFailure(Throwable caught) {

						Window.alert("Error: " + caught.getMessage());
					}

				});
	}

	private class doTctFoodSearchValueChangeHandler implements
			ValueChangeHandler<String> {
		public void onValueChange(ValueChangeEvent<String> event) {

			new doBtnFoodSearchClickHandler().onClick(null);
		}

	}

}
