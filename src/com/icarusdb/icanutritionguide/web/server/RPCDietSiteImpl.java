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
package com.icarusdb.icanutritionguide.web.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.icarusdb.icanutritionguide.web.client.RPCDietSite;

import fatsecret.platform.FatSecretAuth;
import fatsecret.platform.FatSecretException;

public class RPCDietSiteImpl extends RemoteServiceServlet implements
		RPCDietSite {

	FatSecretAPI2 fsapi = new FatSecretAPI2("712aeae1308a46518c0341598480da8c",
			"0b284a396a0b4ef1896ece331c00c6d7");

	@Override
	public String newUser(String strUserName) {

		String strTemp = "";
		try {

			FatSecretAuth fsa = fsapi.ProfileCreate(strUserName);

			strTemp = fsa.getToken();

		} catch (FatSecretException e) {
			e.printStackTrace();
		}

		return strTemp;
	}

	@Override
	public String getUserToken(String strUserName) {

		String strTemp = "";

		try {

			FatSecretAuth fsa = fsapi.ProfileGetAuth(strUserName);

			strTemp = fsa.getToken();

		} catch (FatSecretException e) {
			e.printStackTrace();
		}

		return strTemp;
	}

	@Override
	public String getFoods(String strFood) {

		String strTemp = "";

		try {

			strTemp = fsapi.FoodsSearch(strFood);

		} catch (FatSecretException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return strTemp;

	}

	@Override
	public String getFood(String strFoodID) {

		String strTemp = "";

		try {

			strTemp = fsapi.FoodGet(strFoodID);

		} catch (FatSecretException e) {

			e.printStackTrace();
		}

		return strTemp;

	}

	@Override
	public String getFoodServings(String strFoodID) {

		String strTemp = "";

		try {

			strTemp = fsapi.FoodGetServings(strFoodID);

		} catch (FatSecretException e) {

			e.printStackTrace();
		}

		return strTemp;

	}

}
