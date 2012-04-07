/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class main implements EntryPoint {
	private VerticalPanel vtpanMain;
	private HorizontalPanel hzpanBanner;
	private HorizontalPanel hzpanMenu;
	private HorizontalPanel hzpanMiddle;
	private Image imgPhoto;
	private VerticalPanel vtpanMiddleLeft;
	private VerticalPanel vtpanMiddleRight;
	private Label lblStartNow;

	public void onModuleLoad() {

		RootPanel rootPanel = RootPanel.get();

		vtpanMain = new VerticalPanel();
		vtpanMain.setSpacing(6);
		rootPanel.add(vtpanMain);
		vtpanMain.setWidth("1024px");

		hzpanBanner = new HorizontalPanel();
		hzpanBanner.setStyleName("gwt-HorizontalPanelBanner");
		hzpanBanner.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		vtpanMain.add(hzpanBanner);
		hzpanBanner.setSize("1115px", "88px");

		SimplePanel simplePanel = new SimplePanel();
		hzpanBanner.add(simplePanel);
		hzpanBanner.setCellWidth(simplePanel, "170px");
		simplePanel.setSize("209px", "64px");

		Image image = new Image("images/logo2.gif");
		simplePanel.setWidget(image);
		image.setSize("100%", "100%");

		hzpanMenu = new HorizontalPanel();
		hzpanMenu.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		hzpanMenu.setStyleName("gwt-HorizontalPanelMenu");
		hzpanMenu.setSpacing(2);
		vtpanMain.add(hzpanMenu);
		hzpanMenu.setSize("1115px", "40px");

		Label lblNewLabel = new Label("Home");
		lblNewLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblNewLabel.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblNewLabel);
		lblNewLabel.setWidth("140px");

		Label lblDiets = new Label("Diets");
		lblDiets.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblDiets.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblDiets);
		lblDiets.setWidth("140px");

		Label lblMeals = new Label("Meals");
		lblMeals.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblMeals.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblMeals);
		lblMeals.setWidth("140px");

		Label lblSupplements = new Label("Supplements");
		lblSupplements
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblSupplements.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblSupplements);
		lblSupplements.setWidth("140px");

		Label lblReviews = new Label("Reviews");
		lblReviews.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblReviews.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblReviews);
		lblReviews.setWidth("140px");

		Label lblReviews_1 = new Label("Experts");
		lblReviews_1
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblReviews_1.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblReviews_1);
		lblReviews_1.setWidth("140px");

		Label lblHealth = new Label("Health");
		lblHealth.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblHealth.setStyleName("gwt-LabelMenu");
		hzpanMenu.add(lblHealth);
		lblHealth.setWidth("140px");

		hzpanMiddle = new HorizontalPanel();
		hzpanMiddle.setStyleName("gwt-HorizontalPanelMiddle");
		vtpanMain.add(hzpanMiddle);
		hzpanMiddle.setSize("100%", "900px");

		vtpanMiddleLeft = new VerticalPanel();
		vtpanMiddleLeft.setStyleName("gwt-HorizontalPanelMiddleInner");
		hzpanMiddle.add(vtpanMiddleLeft);
		hzpanMiddle.setCellWidth(vtpanMiddleLeft, "690px");
		vtpanMiddleLeft.setSize("683px", "362px");

		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		vtpanMiddleLeft.add(horizontalPanel_3);
		horizontalPanel_3.setWidth("100%");

		VerticalPanel verticalPanel_3 = new VerticalPanel();
		horizontalPanel_3.add(verticalPanel_3);
		horizontalPanel_3.setCellWidth(verticalPanel_3, "380px");

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setStyleName("gwt-HorizontalPanelMiddleWords");
		verticalPanel_3.add(horizontalPanel);
		horizontalPanel.setSize("100%", "");

		InlineHTML nlnhtmldidYouKnow = new InlineHTML(
				"<p> <font color=\"#404040\"><font face=\"Arial, sans-serif\"><font\nstyle=\"font-size: 16pt\" size=\"4\"><span\nstyle=\"text-decoration: none\">Did\nYou Know?</span></font></font></font></p>\n<font color=\"#808080\"><font face=\"Arial, sans-serif\"><font size=\"2\"><span\nstyle=\"text-decoration: none\">People\nwho kept a food diary like ours</span></font></font></font>\n<br>\n<font color=\"#000000\"><font face=\"Calibri, sans-serif\"><font\nsize=\"5\"><span style=\"text-decoration: none\"><font\ncolor=\"#808080\">lost\n</font><font color=\"#404040\"><b>TWICE</b></font><font\ncolor=\"#808080\">\nthe </font><font color=\"#404040\"><b>weight</b></font></span></font></font></font>\n<br>\n<font color=\"#808080\"><font face=\"Arial, sans-serif\"><font size=\"2\"><span\nstyle=\"text-decoration: none\">than\nthose who didn\u2019t?</span></font></font></font>\n<br>\n<font color=\"#a6a6a6\"><font face=\"Calibri, sans-serif\"><font\nstyle=\"font-size: 6pt\" size=\"1\"><span style=\"text-decoration:\nnone\">*Study\nby the National institute of Health</span></font></font></font>\n<p style=\"margin-bottom: 0in; font-style: normal; font-weight:\nnormal; text-decoration: none\">\n</p>\n<p style=\"margin-bottom: 0in; font-style: normal; font-weight:\nnormal; text-decoration: none\">\n<font color=\"#a6a6a6\"><font face=\"Calibri, sans-serif\"><font\nstyle=\"font-size: 6pt\" size=\"1\"><span\nstyle=\"text-decoration: none\">\n</span></font></font></font></p>");
		horizontalPanel.add(nlnhtmldidYouKnow);
		nlnhtmldidYouKnow.setHeight("");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		verticalPanel_3.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		VerticalPanel verticalPanel_2 = new VerticalPanel();
		verticalPanel_2.setStyleName("gwt-HorizontalPanelMiddleInner2");
		horizontalPanel_1.add(verticalPanel_2);
		verticalPanel_2.setSize("377px", "192px");

		HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
		verticalPanel_2.add(horizontalPanel_2);
		verticalPanel_2.setCellHeight(horizontalPanel_2, "30px");
		horizontalPanel_2.setWidth("100%");

		InlineHTML nlnhtmlNewInlinehtml = new InlineHTML(
				"<font color=\"#ffffff\"><font face=\"Arial, sans-serif\"><font\nstyle=\"font-size: 16pt\" size=\"2\"><b><span\nstyle=\"text-decoration: none\">Join\ntoday it\u2019s 100% FREE</span></b></font></font></font>\n");
		horizontalPanel_2.add(nlnhtmlNewInlinehtml);

		HorizontalPanel horizontalPanel_4 = new HorizontalPanel();
		horizontalPanel_4
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_2.add(horizontalPanel_4);
		verticalPanel_2.setCellHeight(horizontalPanel_4, "28px");
		verticalPanel_2.setCellHorizontalAlignment(horizontalPanel_4,
				HasHorizontalAlignment.ALIGN_CENTER);
		horizontalPanel_4.setWidth("80%");

		Image image_1 = new Image("images/fb_login_icon.gif");
		horizontalPanel_4.add(image_1);
		image_1.setSize("154px", "22px");

		Label lblNewLabel_1 = new Label("- OR -");
		lblNewLabel_1.setStyleName("gwt-Label2");
		horizontalPanel_4.add(lblNewLabel_1);

		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();
		horizontalPanel_5
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_2.add(horizontalPanel_5);
		verticalPanel_2.setCellHeight(horizontalPanel_5, "36px");
		verticalPanel_2.setCellHorizontalAlignment(horizontalPanel_5,
				HasHorizontalAlignment.ALIGN_CENTER);
		horizontalPanel_5.setWidth("80%");

		TextBox txtbxName = new TextBox();
		txtbxName.setText("Name");
		txtbxName.setStyleName("gwt-TextBox1");
		horizontalPanel_5.add(txtbxName);
		txtbxName.setSize("240px", "24px");

		HorizontalPanel horizontalPanel_6 = new HorizontalPanel();
		horizontalPanel_6
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_2.add(horizontalPanel_6);
		verticalPanel_2.setCellHeight(horizontalPanel_6, "36px");
		verticalPanel_2.setCellHorizontalAlignment(horizontalPanel_6,
				HasHorizontalAlignment.ALIGN_CENTER);
		horizontalPanel_6.setWidth("80%");

		TextBox txtbxEmail = new TextBox();
		txtbxEmail.setText("Email");
		txtbxEmail.setStyleName("gwt-TextBox1");
		horizontalPanel_6.add(txtbxEmail);
		txtbxEmail.setSize("240px", "24px");

		HorizontalPanel horizontalPanel_7 = new HorizontalPanel();
		horizontalPanel_7
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_2.add(horizontalPanel_7);
		verticalPanel_2.setCellHorizontalAlignment(horizontalPanel_7,
				HasHorizontalAlignment.ALIGN_CENTER);
		horizontalPanel_7.setWidth("80%");

		SimplePanel simplePanel_1 = new SimplePanel();
		simplePanel_1.setStyleName("gwt-SimplePanel1");
		horizontalPanel_7.add(simplePanel_1);
		horizontalPanel_7.setCellVerticalAlignment(simplePanel_1,
				HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_7.setCellHorizontalAlignment(simplePanel_1,
				HasHorizontalAlignment.ALIGN_CENTER);
		simplePanel_1.setSize("116px", "30px");

		lblStartNow = new Label("Start NOW");
		lblStartNow.addClickHandler(new doLblStartNowClickHandler());
		lblStartNow.setStyleName("gwt-Label3");
		simplePanel_1.setWidget(lblStartNow);
		lblStartNow.setSize("100%", "100%");

		VerticalPanel verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setStyleName("gwt-VerticalPanelPhoto");
		verticalPanel_4
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		horizontalPanel_3.add(verticalPanel_4);
		verticalPanel_4.setSize("100%", "332px");

		imgPhoto = new Image("images/photo.jpg");
		verticalPanel_4.add(imgPhoto);
		imgPhoto.setHeight("310px");

		vtpanMiddleRight = new VerticalPanel();
		vtpanMiddleRight.setStyleName("gwt-VerticalPanelMiddleRight");
		hzpanMiddle.add(vtpanMiddleRight);
		vtpanMiddleRight.setSize("99%", "577px");

		HorizontalPanel horizontalPanel_9 = new HorizontalPanel();
		vtpanMiddleRight.add(horizontalPanel_9);
		vtpanMiddleRight.setCellHeight(horizontalPanel_9, "20px");

		HorizontalPanel horizontalPanel_8 = new HorizontalPanel();
		vtpanMiddleRight.add(horizontalPanel_8);
		vtpanMiddleRight.setCellHeight(horizontalPanel_8, "80px");

		Grid grid = new Grid(3, 2);
		grid.setCellPadding(2);
		horizontalPanel_8.add(grid);

		Label lblProfile = new Label("Profile");
		lblProfile.setStyleName("gwt-Label4");
		lblProfile.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid.setWidget(0, 0, lblProfile);
		lblProfile.setWidth("100px");

		Label lblWeighIn = new Label("Weigh In");
		lblWeighIn.setStyleName("gwt-Label4");
		lblWeighIn.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid.setWidget(0, 1, lblWeighIn);
		lblWeighIn.setWidth("100px");

		Label lblAddFood = new Label("Add Food");
		lblAddFood.setStyleName("gwt-Label4");
		lblAddFood.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid.setWidget(1, 0, lblAddFood);
		lblAddFood.setWidth("100px");

		Label lblInvite = new Label("Invite");
		lblInvite.setStyleName("gwt-Label4");
		lblInvite.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid.setWidget(1, 1, lblInvite);
		lblInvite.setWidth("100px");

		Label lblAddExcersize = new Label("Add Exercise");
		lblAddExcersize.setStyleName("gwt-Label4");
		lblAddExcersize
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid.setWidget(2, 0, lblAddExcersize);
		lblAddExcersize.setWidth("100px");

		Label lblShare = new Label("Share");
		lblShare.setStyleName("gwt-Label4");
		lblShare.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid.setWidget(2, 1, lblShare);
		lblShare.setWidth("100px");

		HorizontalPanel horizontalPanel_10 = new HorizontalPanel();
		vtpanMiddleRight.add(horizontalPanel_10);
		vtpanMiddleRight.setCellHeight(horizontalPanel_10, "20px");

		HorizontalPanel horizontalPanel_11 = new HorizontalPanel();
		vtpanMiddleRight.add(horizontalPanel_11);

		Grid grid_1 = new Grid(3, 2);
		grid_1.setCellPadding(2);
		horizontalPanel_11.add(grid_1);

		Label lblMyHome = new Label("My Home");
		lblMyHome.setStyleName("gwt-Label4");
		lblMyHome.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_1.setWidget(0, 0, lblMyHome);
		lblMyHome.setWidth("100px");

		Label lblFood = new Label("Food");
		lblFood.setStyleName("gwt-Label4");
		lblFood.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_1.setWidget(0, 1, lblFood);
		lblFood.setWidth("100px");

		Label lblExercise = new Label("Exercise");
		lblExercise.setStyleName("gwt-Label4");
		lblExercise.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_1.setWidget(1, 0, lblExercise);
		lblExercise.setWidth("100px");

		Label lblRecipes = new Label("Recipes");
		lblRecipes.setStyleName("gwt-Label4");
		lblRecipes.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_1.setWidget(1, 1, lblRecipes);
		lblRecipes.setWidth("100px");

		Label lblWeighIn_1 = new Label("Weigh In");
		lblWeighIn_1.setStyleName("gwt-Label4");
		lblWeighIn_1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_1.setWidget(2, 0, lblWeighIn_1);
		lblWeighIn_1.setWidth("100px");

		Label lblShopping = new Label("Shopping");
		lblShopping.setStyleName("gwt-Label4");
		lblShopping.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_1.setWidget(2, 1, lblShopping);
		lblShopping.setWidth("100px");

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

	private class doLblStartNowClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			vtpanMiddleLeft.clear();
			vtpanMiddleLeft.add(new CmpstSummaryBox());
		}
	}
}
