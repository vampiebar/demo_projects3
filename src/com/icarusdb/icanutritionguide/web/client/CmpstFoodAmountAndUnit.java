package com.icarusdb.icanutritionguide.web.client;

import java.util.List;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstFoodAmountAndUnit extends Composite {

	public String _foodID;
	private ListBox cbxServingType;
	private TextBox tctDescription;
	private TextBox tctItem;
	private TextBox tctAmount;
	private VerticalPanel vtpanMain;

	public List<String> _lstServingID;

	public CmpstFoodAmountAndUnit(String strFoodID) {

		_foodID = strFoodID;

		vtpanMain = new VerticalPanel();
		vtpanMain.setVisible(false);
		vtpanMain.setStyleName("gwt-VerticalPanelFoodAdd3");
		initWidget(vtpanMain);
		vtpanMain.setWidth("620px");

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		vtpanMain.add(verticalPanel_1);

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel_1.add(horizontalPanel);
		horizontalPanel.setWidth("90%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_1.setSpacing(6);
		horizontalPanel.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		Label lblItem = new Label("Item");
		lblItem.setStyleName("gwt-LabelMenu");
		horizontalPanel_1.add(lblItem);
		lblItem.setWidth("140px");

		tctItem = new TextBox();
		tctItem.setReadOnly(true);
		tctItem.setText("turkey");
		tctItem.setStyleName("gwt-TextBox1");
		horizontalPanel_1.add(tctItem);
		tctItem.setSize("400px", "24px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_2.setSpacing(6);
		verticalPanel_1.add(horizontalPanel_2);

		Label lblDescription = new Label("Description");
		lblDescription.setStyleName("gwt-LabelMenu");
		horizontalPanel_2.add(lblDescription);
		lblDescription.setWidth("140px");

		tctDescription = new TextBox();
		tctDescription.setText("turkey");
		tctDescription.setStyleName("gwt-TextBox1");
		horizontalPanel_2.add(tctDescription);
		tctDescription.setSize("400px", "24px");

		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		verticalPanel_1.add(horizontalPanel_3);
		horizontalPanel_3
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_3.setSpacing(6);

		Label lblAmount = new Label("Amount");
		lblAmount.setStyleName("gwt-LabelMenu");
		horizontalPanel_3.add(lblAmount);
		lblAmount.setWidth("140px");

		tctAmount = new TextBox();
		tctAmount.setText("1");
		tctAmount.setStyleName("gwt-TextBox1");
		horizontalPanel_3.add(tctAmount);
		tctAmount.setSize("70px", "24px");

		cbxServingType = new ListBox();
		cbxServingType.setStyleName("gwt-TextBox1");
		horizontalPanel_3.add(cbxServingType);
		cbxServingType.setSize("324px", "34px");

		HorizontalPanel horizontalPanel_4 = new HorizontalPanel();
		horizontalPanel_4
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		verticalPanel_1.add(horizontalPanel_4);
		horizontalPanel_4.setWidth("100%");

		Button button = new Button("New button");
		button.setText("Add to meal");
		button.setStyleName("gwt-Button1");
		horizontalPanel_4.add(button);
		button.setHeight("50px");

		if (!isDesignTime()) {

			putFoodIdServingsToGui(_foodID);
		}

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

	// FOOD SERVINGS
	public void putFoodIdServingsToGui(String strFoodID) {

		cbxServingType.clear();
		_lstServingID.clear();

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

							cbxServingType.addItem(strServingDesc);

						}

					}

					@Override
					public void onFailure(Throwable caught) {

						Window.alert("Error: " + caught.getMessage());
					}

				});
	}
}
