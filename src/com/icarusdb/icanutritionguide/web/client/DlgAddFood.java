package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DlgAddFood extends DialogBox {
	private HorizontalPanel hzpanInner;
	private VerticalPanel vtpanMain;

	public String _foodID;
	public String _foodName;

	public DlgAddFood(String foodID, String strFoodName) {

		_foodID = foodID;
		_foodName = strFoodName;

		setGlassEnabled(true);
		setHTML("Add Food");

		vtpanMain = new VerticalPanel();
		setWidget(vtpanMain);
		vtpanMain.setSize("100%", "100%");

		hzpanInner = new HorizontalPanel();
		vtpanMain.add(hzpanInner);

		if (!isDesignTime()) {
			hzpanInner.add(new CmpstAddFood(_foodID, _foodName, this));
		}

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

}
