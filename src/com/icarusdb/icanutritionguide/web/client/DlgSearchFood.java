package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DlgSearchFood extends DialogBox {
	private VerticalPanel vtpanMain;

	public DlgSearchFood() {

		setHTML("Search Food");

		vtpanMain = new VerticalPanel();
		setWidget(vtpanMain);
		vtpanMain.setSize("750px", "635px");

		vtpanMain.add(new CmpstSearchFood());

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vtpanMain.add(horizontalPanel);
		horizontalPanel.setWidth("100%");

		Button btnNewButton = new Button("New button");
		btnNewButton.setText("CLOSE");
		horizontalPanel.add(btnNewButton);
		btnNewButton.setWidth("100px");
	}

}
