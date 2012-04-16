package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstFoodDiaryItem extends Composite {
	private Label lblFoodName;
	private Label lblFoodServing;
	private Label lblFoodNutrition;
	private VerticalPanel vtpanMain;

	public CmpstFoodDiaryItem() {

		vtpanMain = new VerticalPanel();
		vtpanMain.setStyleName("gwt-VerticalPanelFoodAdd5");
		initWidget(vtpanMain);
		vtpanMain.setWidth("570px");

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		vtpanMain.add(verticalPanel_1);
		verticalPanel_1.setWidth("100%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		verticalPanel_1.add(horizontalPanel_1);
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_1.setSpacing(6);
		horizontalPanel_1.setWidth("100%");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_1.add(horizontalPanel_2);
		horizontalPanel_2.setWidth("218px");

		lblFoodName = new Label("Turkey bacon");
		lblFoodName.setWordWrap(false);
		horizontalPanel_2.add(lblFoodName);
		lblFoodName.setStyleName("gwt-Label-2");
		lblFoodName.setWidth("");

		lblFoodServing = new Label("1 Slice");
		lblFoodServing.setWordWrap(false);
		horizontalPanel_2.add(lblFoodServing);
		lblFoodServing.setStyleName("gwt-Label8");
		lblFoodServing.setWidth("");

		Button button = new Button("New button");
		button.setText("Delete");
		horizontalPanel_1.add(button);
		horizontalPanel_1.setCellHorizontalAlignment(button,
				HasHorizontalAlignment.ALIGN_RIGHT);
		button.setWidth("");

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setStyleName("gwt-VerticalPanel1");
		horizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel.setSpacing(6);
		vtpanMain.add(horizontalPanel);
		horizontalPanel.setWidth("100%");

		lblFoodNutrition = new Label("...");
		lblFoodNutrition.setStyleName("gwt-Label8");
		horizontalPanel.add(lblFoodNutrition);
		lblFoodNutrition.setWidth("100%");
	}

}
