package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstFoodItem extends Composite {
	private Label lblFoodDesc;

	public CmpstFoodItem() {

		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("gwt-HorizontalPanelFoodItem");
		initWidget(verticalPanel);
		verticalPanel.setSize("100%", "100%");

		HorizontalPanelRowMouse horizontalPanel = new HorizontalPanelRowMouse();
		horizontalPanel.setStyleName("gwt-Label5");
		verticalPanel.add(horizontalPanel);
		horizontalPanel.setSize("100%", "100%");

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setSpacing(4);
		horizontalPanel.add(verticalPanel_1);
		verticalPanel_1.setWidth("572px");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		verticalPanel_1.add(horizontalPanel_1);

		Label lblNewLabel = new Label("Food Name:");
		horizontalPanel_1.add(lblNewLabel);
		horizontalPanel.setCellWidth(lblNewLabel, "100px");
		lblNewLabel.setWidth("100px");

		Label lblFoodName = new Label("...");
		horizontalPanel_1.add(lblFoodName);
		lblFoodName.setWidth("350px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2.setStyleName("gwt-HorizontalPanelFood2");
		verticalPanel_1.add(horizontalPanel_2);

		Label lblFoodType = new Label("Food Type:");
		horizontalPanel_2.add(lblFoodType);
		lblFoodType.setWidth("100px");

		Label lblGeneric = new Label("Generic");
		horizontalPanel_2.add(lblGeneric);
		lblGeneric.setWidth("87px");

		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		horizontalPanel_2.add(horizontalPanel_3);

		lblFoodDesc = new Label("...");
		horizontalPanel_3.add(lblFoodDesc);
		lblFoodDesc.setWidth("366px");
	}

}
