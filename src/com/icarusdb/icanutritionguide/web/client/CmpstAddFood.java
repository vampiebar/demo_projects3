package com.icarusdb.icanutritionguide.web.client;

import java.util.List;

import name.pehl.totoe.xml.client.XmlParser;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstAddFood extends Composite {
	private VerticalPanel verticalPanel;
	private TextBox tctFoodSearch;
	private Button btnFoodSearch;
	private VerticalPanel vtpanFoodresults;

	public CmpstAddFood() {

		verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("gwt-VerticalPanelFoodAdd");
		initWidget(verticalPanel);

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel.add(horizontalPanel);
		verticalPanel.setCellHeight(horizontalPanel, "50px");
		horizontalPanel.setWidth("100%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1.setSpacing(6);
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("");

		Label lblNewLabel = new Label("Please enter food name");
		lblNewLabel.setStyleName("gwt-LabelMenu");
		horizontalPanel_1.add(lblNewLabel);

		tctFoodSearch = new TextBox();
		tctFoodSearch.setStyleName("gwt-TextBox1");
		horizontalPanel_1.add(tctFoodSearch);
		tctFoodSearch.setSize("240px", "24px");

		btnFoodSearch = new Button("New button");
		btnFoodSearch.addClickHandler(new doBtnFoodSearchClickHandler());
		btnFoodSearch.setText("Search Food");
		horizontalPanel_1.add(btnFoodSearch);

		vtpanFoodresults = new VerticalPanel();
		verticalPanel.add(vtpanFoodresults);
		vtpanFoodresults.setWidth("100%");
	}

	private class doBtnFoodSearchClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			putFoodSearchResultToGui(tctFoodSearch.getText());
		}
	}

	public void putFoodSearchResultToGui(String text) {

		RPCDietSite.Util.getInstance().getFoods(text,
				new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {

						name.pehl.totoe.xml.client.Document document = new XmlParser()
								.parse(result);
						List<XMLFoods> xmfl = XMLFoods.XML.readList(document,
								"foods");

						Window.alert(xmfl.size() + " size ");

						// String food_name = xmfl.get(0).food_name;

						// Window.alert("food name: " + food_name);

					}

					@Override
					public void onFailure(Throwable caught) {

						Window.alert("Error: " + caught.getMessage());
					}

				});
	}
}
