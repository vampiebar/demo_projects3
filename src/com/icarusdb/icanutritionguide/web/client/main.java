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
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class main implements EntryPoint {
	private VerticalPanel vtpanMain;
	private HorizontalPanel hzpanBanner;
	private HorizontalPanel hzpanMenu;
	private HorizontalPanel hzpanMiddle;

	public void onModuleLoad() {

		RootPanel rootPanel = RootPanel.get();

		vtpanMain = new VerticalPanel();
		vtpanMain.setSpacing(6);
		rootPanel.add(vtpanMain);
		vtpanMain.setWidth("1024px");

		hzpanBanner = new HorizontalPanel();
		hzpanBanner.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		vtpanMain.add(hzpanBanner);
		hzpanBanner.setSize("100%", "80px");

		SimplePanel simplePanel = new SimplePanel();
		hzpanBanner.add(simplePanel);
		hzpanBanner.setCellWidth(simplePanel, "170px");
		simplePanel.setSize("160px", "80px");

		Label lblNewLabel = new Label("LOGO");
		simplePanel.setWidget(lblNewLabel);
		lblNewLabel.setSize("100%", "100%");

		SimplePanel simplePanel_1 = new SimplePanel();
		hzpanBanner.add(simplePanel_1);
		simplePanel_1.setSize("600px", "80px");
		hzpanBanner.setCellWidth(simplePanel_1, "610px");

		SimplePanel simplePanel_2 = new SimplePanel();
		hzpanBanner.add(simplePanel_2);
		simplePanel_2.setSize("220px", "80px");

		hzpanMenu = new HorizontalPanel();
		hzpanMenu.setSpacing(2);
		vtpanMain.add(hzpanMenu);
		hzpanMenu.setWidth("948px");

		SimplePanel simplePanel_3 = new SimplePanel();
		simplePanel_3.setStyleName("gwt-SimplePanelMenuActive");
		hzpanMenu.add(simplePanel_3);
		simplePanel_3.setSize("120px", "39px");

		Label lblHome = new Label("Home");
		lblHome.setStyleName("gwt-Label-WithCursor");
		simplePanel_3.setWidget(lblHome);
		lblHome.setSize("100%", "100%");

		SimplePanel simplePanel_4 = new SimplePanel();
		simplePanel_4.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_4);
		simplePanel_4.setSize("120px", "39px");

		Label lblTools = new Label("Tools");
		lblTools.setStyleName("gwt-Label-WithCursor");
		simplePanel_4.setWidget(lblTools);
		lblTools.setSize("100%", "100%");

		SimplePanel simplePanel_5 = new SimplePanel();
		simplePanel_5.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_5);
		simplePanel_5.setSize("120px", "39px");

		Label lblFoods = new Label("Foods");
		lblFoods.setStyleName("gwt-Label-WithCursor");
		simplePanel_5.setWidget(lblFoods);
		lblFoods.setSize("100%", "100%");

		SimplePanel simplePanel_6 = new SimplePanel();
		simplePanel_6.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_6);
		simplePanel_6.setSize("120px", "39px");

		Label lblRecipes = new Label("Recipes");
		lblRecipes.setStyleName("gwt-Label-WithCursor");
		simplePanel_6.setWidget(lblRecipes);
		lblRecipes.setSize("100%", "100%");

		SimplePanel simplePanel_7 = new SimplePanel();
		simplePanel_7.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_7);
		simplePanel_7.setSize("120px", "39px");

		Label lblChallenges = new Label("Challenges");
		lblChallenges.setStyleName("gwt-Label-WithCursor");
		simplePanel_7.setWidget(lblChallenges);
		lblChallenges.setSize("100%", "100%");

		SimplePanel simplePanel_8 = new SimplePanel();
		simplePanel_8.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_8);
		simplePanel_8.setSize("120px", "39px");

		Label lblFitness = new Label("Fitness");
		lblFitness.setStyleName("gwt-Label-WithCursor");
		simplePanel_8.setWidget(lblFitness);
		lblFitness.setSize("100%", "100%");

		SimplePanel simplePanel_9 = new SimplePanel();
		simplePanel_9.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_9);
		simplePanel_9.setSize("120px", "39px");

		Label lblCommunity = new Label("Community");
		lblCommunity.setStyleName("gwt-Label-WithCursor");
		simplePanel_9.setWidget(lblCommunity);
		lblCommunity.setSize("100%", "100%");

		SimplePanel simplePanel_10 = new SimplePanel();
		simplePanel_10.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_10);
		simplePanel_10.setSize("120px", "39px");

		Label lblArticles = new Label("Articles");
		lblArticles.setStyleName("gwt-Label-WithCursor");
		simplePanel_10.setWidget(lblArticles);
		lblArticles.setSize("100%", "100%");

		SimplePanel simplePanel_11 = new SimplePanel();
		simplePanel_11.setStyleName("gwt-SimplePanelMenuInactive");
		hzpanMenu.add(simplePanel_11);
		simplePanel_11.setSize("120px", "39px");

		Label lblMobiles = new Label("Mobile");
		lblMobiles.setStyleName("gwt-Label-WithCursor");
		simplePanel_11.setWidget(lblMobiles);
		lblMobiles.setSize("100%", "100%");

		hzpanMiddle = new HorizontalPanel();
		vtpanMain.add(hzpanMiddle);
		hzpanMiddle.setWidth("100%");

		VerticalPanel verticalPanel = new VerticalPanel();
		hzpanMiddle.add(verticalPanel);
		verticalPanel.setWidth("700px");

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		hzpanMiddle.add(verticalPanel_1);

	}
}
