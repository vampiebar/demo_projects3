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
package com.icarusdb.icanutrition.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ICADietCalc implements EntryPoint {
	private VerticalPanel vtpanMain;

	public void onModuleLoad() {

		RootPanel rootPanel = RootPanel.get();

		vtpanMain = new VerticalPanel();
		rootPanel.add(vtpanMain, 5, 5);
		vtpanMain.setSize("725px", "15px");

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		vtpanMain.add(horizontalPanel);

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

}
