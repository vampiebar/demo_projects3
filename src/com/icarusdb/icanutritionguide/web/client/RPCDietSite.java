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

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("RPCDietSite")
public interface RPCDietSite extends RemoteService {

	String newUser(String strUserName);

	String getUserToken(String strUserName);

	String getFoods(String strFood);

	String getFood(String strFoodID);

	String getFoodServings(String strFoodID);

	String getFoodAdd(String strOauthToken, String strOauthSecret,
			String strFoodID, String strFoodName, String strServingID,
			String strAmount, String strMeal, String strDate);

	String getFoodEntriesByDate(String strOauthToken, String strOauthSecret,
			String strDate);

	/**
	 * Utility class for simplifying access to the instance of async service.
	 */
	public static class Util {
		private static RPCDietSiteAsync instance;

		public static RPCDietSiteAsync getInstance() {
			if (instance == null) {
				instance = GWT.create(RPCDietSite.class);
			}
			return instance;
		}
	}
}
