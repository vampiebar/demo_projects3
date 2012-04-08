package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstFoodItem extends Composite {
	private Label lblFoodDesc;

	public String _foodID;
	public String _foodName;
	public String _foodType;
	public String _foodUrl;
	public String _foodDesc;

	private Frame frmFoodDetail;
	private Image imgFoodAdd;
	private Image imgFoodDetail;

	public CmpstFoodItem(String strFoodID, String strFoodName,
			String strFoodType, String strFoodUrl, String strFoodDesc) {

		_foodID = strFoodID;
		_foodName = strFoodName;
		_foodType = strFoodType;
		_foodUrl = strFoodUrl;
		_foodDesc = strFoodDesc;

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
		verticalPanel_1.setWidth("721px");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_1.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("716px");

		Label lblNewLabel = new Label("Food Name:");
		horizontalPanel_1.add(lblNewLabel);
		horizontalPanel_1.setCellWidth(lblNewLabel, "100px");
		horizontalPanel.setCellWidth(lblNewLabel, "100px");
		lblNewLabel.setWidth("100px");

		Label lblFoodName = new Label(_foodName);
		horizontalPanel_1.add(lblFoodName);
		lblFoodName.setWidth("539px");

		imgFoodAdd = new Image("images/navicons/10.png");
		imgFoodAdd.addClickHandler(new doImgFoodAddClickHandler());
		horizontalPanel_1.add(imgFoodAdd);
		imgFoodAdd.setWidth("32px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_2.setStyleName("gwt-HorizontalPanelFood2");
		verticalPanel_1.add(horizontalPanel_2);

		Label lblGeneric = new Label("Generic");
		horizontalPanel_2.add(lblGeneric);
		lblGeneric.setWidth("64px");

		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		horizontalPanel_2.add(horizontalPanel_3);
		horizontalPanel_3.setWidth("636px");

		lblFoodDesc = new Label(_foodDesc);
		horizontalPanel_3.add(lblFoodDesc);
		horizontalPanel_3.setCellVerticalAlignment(lblFoodDesc,
				HasVerticalAlignment.ALIGN_MIDDLE);
		lblFoodDesc.setWidth("600px");

		imgFoodDetail = new Image("images/navicons/40.png");
		imgFoodDetail.addClickHandler(new doImgFoodDetailClickHandler());
		horizontalPanel_3.add(imgFoodDetail);
		imgFoodDetail.setWidth("32px");

		HorizontalPanel horizontalPanel_4 = new HorizontalPanel();
		horizontalPanel_4.setStyleName("gwt-HorizontalPanelFood3");
		verticalPanel_1.add(horizontalPanel_4);

		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();
		horizontalPanel_4.add(horizontalPanel_5);
		horizontalPanel_5.setWidth("100%");

		frmFoodDetail = new Frame("");
		frmFoodDetail.setVisible(false);
		horizontalPanel_5.add(frmFoodDetail);
		frmFoodDetail.setSize("670px", "400px");

	}

	private class doImgFoodDetailClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			if (frmFoodDetail.isVisible()) {

				imgFoodDetail.setUrl("images/navicons/40.png");
				frmFoodDetail.setVisible(false);
				frmFoodDetail.setUrl("");

			} else {

				imgFoodDetail.setUrl("images/navicons/39.png");
				frmFoodDetail.setVisible(true);
				frmFoodDetail.setUrl(_foodUrl);

			}

		}
	}

	private class doImgFoodAddClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			/*
			 * RPCDietSite.Util.getInstance().getFood(_foodID, new
			 * AsyncCallback<String>() {
			 * 
			 * @Override public void onSuccess(String result) {
			 * 
			 * // Window.alert(result);
			 * 
			 * 
			 * }
			 * 
			 * @Override public void onFailure(Throwable caught) {
			 * 
			 * Window.alert("Error: " + caught.getMessage()); }
			 * 
			 * });
			 */

			DlgAddFood dlg = new DlgAddFood(_foodID, _foodName);
			dlg.center();

		}
	}
}
