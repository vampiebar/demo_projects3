package com.icarusdb.icanutritionguide.web.client;

import java.util.Date;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.DefaultFormat;

public class CmpstFoodDate extends Composite {
	private VerticalPanel vtpanMain;
	private Button btnChooseDate;
	private DateBox dtpDate;
	static public ListBox cbxMealTime;

	public CmpstFoodDate() {

		vtpanMain = new VerticalPanel();
		vtpanMain.setStyleName("gwt-VerticalPanelFoodAdd2");
		initWidget(vtpanMain);
		vtpanMain.setWidth("620px");

		VerticalPanel verticalPanel = new VerticalPanel();
		vtpanMain.add(verticalPanel);

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel.add(horizontalPanel);
		horizontalPanel.setWidth("90%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_1.setSpacing(6);
		horizontalPanel.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		Label lblDate = new Label("Please select a date");
		lblDate.setStyleName("gwt-LabelMenu");
		horizontalPanel_1.add(lblDate);
		horizontalPanel_1.setCellWidth(lblDate, "260px");
		lblDate.setWidth("260px");

		dtpDate = new DateBox();
		dtpDate.setFormat(new DefaultFormat(DateTimeFormat
				.getFormat("MMM dd, yyyy")));
		dtpDate.setStyleName("gwt-TextBox1");
		horizontalPanel_1.add(dtpDate);
		dtpDate.setWidth("150px");

		btnChooseDate = new Button("New button");
		btnChooseDate.addClickHandler(new doBtnChooseDateClickHandler());
		btnChooseDate.setText("Select Date");
		horizontalPanel_1.add(btnChooseDate);
		btnChooseDate.setWidth("100px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_2.setSpacing(6);
		verticalPanel.add(horizontalPanel_2);

		Label lblPleaseSelectTime = new Label("Please select time");
		lblPleaseSelectTime.setStyleName("gwt-LabelMenu");
		horizontalPanel_2.add(lblPleaseSelectTime);
		lblPleaseSelectTime.setWidth("260px");

		cbxMealTime = new ListBox();
		cbxMealTime.addItem("Breakfast");
		cbxMealTime.addItem("Lunch");
		cbxMealTime.addItem("Dinner");
		cbxMealTime.addItem("Snacks / Other");
		cbxMealTime.setStyleName("gwt-TextBox1");
		horizontalPanel_2.add(cbxMealTime);
		cbxMealTime.setWidth("160px");

		if (!isDesignTime()) {

			dtpDate.setValue(new Date());
		}
	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

	private class doBtnChooseDateClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			dtpDate.setFocus(true);
		}

	}

}
