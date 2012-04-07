package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DlgAddFood extends DialogBox {
	private VerticalPanel vtpanMain;

	public DlgAddFood() {
		setHTML("Add Food");

		vtpanMain = new VerticalPanel();
		setWidget(vtpanMain);
		vtpanMain.setSize("700px", "100%");

		vtpanMain.add(new CmpstAddFood());
	}

}
