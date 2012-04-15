package com.icarusdb.icanutritionguide.web.client;

import org.gwtwidgets.client.wrap.Effect;
import org.gwtwidgets.client.wrap.EffectOption;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstFoodItem extends Composite {
	private Label lblFoodDesc;

	public String _foodID;
	public String _foodName;
	public String _foodType;
	public String _foodUrl;
	public String _foodDesc;

	private Frame frmFoodDetail;
	private Image imgFoodDetail;
	public VerticalPanel vtpanMain;

	public int _index;
	private Label lblFoodName;
	private Label lblNewLabel;

	public ScrollPanel _scpanParent;
	public VerticalPanel _vtpanParent;

	public CmpstFoodItem(String strFoodID, String strFoodName,
			String strFoodType, String strFoodUrl, String strFoodDesc,
			int intIndex, ScrollPanel scpanParent, VerticalPanel vtpanParent) {

		_foodID = strFoodID;
		_foodName = strFoodName;
		_foodType = strFoodType;
		_foodUrl = strFoodUrl;
		_foodDesc = strFoodDesc;
		_index = intIndex;

		_scpanParent = scpanParent;
		_vtpanParent = vtpanParent;

		vtpanMain = new VerticalPanel();
		vtpanMain.setVisible(false);
		vtpanMain.setStyleName("gwt-HorizontalPanelFoodItem2");
		initWidget(vtpanMain);
		vtpanMain.setSize("560px", "100%");

		HorizontalPanelRowMouse horizontalPanel = new HorizontalPanelRowMouse();
		horizontalPanel.setStyleName("gwt-Label8");
		vtpanMain.add(horizontalPanel);
		horizontalPanel.setSize("100%", "100%");

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setSpacing(4);
		horizontalPanel.add(verticalPanel_1);
		verticalPanel_1.setWidth("100%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_1.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		lblNewLabel = new Label("Food Name:");
		horizontalPanel_1.add(lblNewLabel);
		horizontalPanel_1.setCellWidth(lblNewLabel, "100px");
		horizontalPanel.setCellWidth(lblNewLabel, "100px");
		lblNewLabel.setWidth("100px");

		lblFoodName = new Label(_foodName);
		horizontalPanel_1.add(lblFoodName);
		lblFoodName.setWidth("380px");

		Button btnAdd = new Button("New button");
		btnAdd.addClickHandler(new doBtnAddClickHandler());
		btnAdd.setText("Add");
		btnAdd.setStyleName("gwt-Button1");
		horizontalPanel_1.add(btnAdd);
		btnAdd.setHeight("50px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_2.setStyleName("gwt-HorizontalPanelFood2");
		verticalPanel_1.add(horizontalPanel_2);
		horizontalPanel_2.setWidth("100%");

		Label lblGeneric = new Label("Generic");
		horizontalPanel_2.add(lblGeneric);
		lblGeneric.setWidth("64px");

		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		horizontalPanel_2.add(horizontalPanel_3);
		horizontalPanel_3.setWidth("");

		lblFoodDesc = new Label("_foodDesc");
		horizontalPanel_3.add(lblFoodDesc);
		horizontalPanel_3.setCellVerticalAlignment(lblFoodDesc,
				HasVerticalAlignment.ALIGN_MIDDLE);
		lblFoodDesc.setWidth("420px");

		imgFoodDetail = new Image("images/navicons/40.png");
		imgFoodDetail.addClickHandler(new doImgFoodDetailClickHandler());
		horizontalPanel_3.add(imgFoodDetail);
		horizontalPanel_3.setCellHorizontalAlignment(imgFoodDetail,
				HasHorizontalAlignment.ALIGN_RIGHT);
		imgFoodDetail.setWidth("32px");

		HorizontalPanel horizontalPanel_4 = new HorizontalPanel();
		horizontalPanel_4.setStyleName("gwt-HorizontalPanelFood3");
		verticalPanel_1.add(horizontalPanel_4);
		horizontalPanel_4.setWidth("100%");

		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();
		horizontalPanel_4.add(horizontalPanel_5);
		horizontalPanel_5.setWidth("90%");

		frmFoodDetail = new Frame("");
		frmFoodDetail.setVisible(false);
		horizontalPanel_5.add(frmFoodDetail);
		frmFoodDetail.setSize("500px", "400px");

		if (!isDesignTime()) {

			Effect.appear(vtpanMain, new EffectOption[] {

			new EffectOption("duration", (_index + 1) * 0.3),
			// new EffectOption("afterFinish", callback)
					});
		}

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
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

	private class doBtnAddClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			// DlgAddFood dlg = new DlgAddFood(_foodID, _foodName);
			// dlg.center();

			/*
			 * for (int i = 0; i < vtpanMain.getWidgetCount(); i++) {
			 * 
			 * // if (i != _index) {
			 * 
			 * // _vtpanParent.getWidget(i).setVisible(false);
			 * 
			 * // Effect.fade(wdg, new EffectOption[] {
			 * 
			 * // new EffectOption("duration", 1.0),
			 * 
			 * new EffectOption("afterFinish", new Callback() {
			 * 
			 * @Override public void execute() {
			 * 
			 * // wdg.setVisible(false); // _vtpanParent.remove(wdg);
			 * 
			 * } })
			 * 
			 * // });
			 * 
			 * // } }
			 */

			_vtpanParent.clear();
			_scpanParent.setHeight(_vtpanParent.getOffsetHeight() + "px");

		}
	}

}
