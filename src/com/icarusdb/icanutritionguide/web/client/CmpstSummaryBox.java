package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CmpstSummaryBox extends Composite {
	private VerticalPanel vtpanSummaryBox;
	private Button btnAddFood;
	private VerticalPanel vtpanFood;
	private VerticalPanel vtpanActivity;
	private Button btnTotalCalDetails;

	static public VerticalPanel _vtpanParent;

	private CmpstFoodDate _cmpstFoodDate;
	private CmpstSearchFood _cmpstSearchFood;

	public CmpstSummaryBox(VerticalPanel vtpanParent) {

		_vtpanParent = vtpanParent;

		vtpanSummaryBox = new VerticalPanel();
		vtpanSummaryBox
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		initWidget(vtpanSummaryBox);
		vtpanSummaryBox.setHeight("120px");

		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setSpacing(6);
		vtpanSummaryBox.add(horizontalPanel);
		vtpanSummaryBox.setCellHeight(horizontalPanel, "55px");

		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setSpacing(6);
		horizontalPanel.add(verticalPanel);

		vtpanFood = new VerticalPanel();
		verticalPanel.add(vtpanFood);
		vtpanFood.setStyleName("gwt-PanelRounded1");
		vtpanFood.setSpacing(3);
		vtpanFood.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vtpanFood.setWidth("100px");

		Label lblNewLabel = new Label("Food");
		lblNewLabel.setStyleName("gwt-Label-1");
		vtpanFood.add(lblNewLabel);

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vtpanFood.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		Label label_1 = new Label("+0");
		horizontalPanel_1.add(label_1);
		label_1.setStyleName("gwt-Label-2");

		btnAddFood = new Button("New button");
		btnAddFood.addClickHandler(new doBtnAddFoodClickHandler());
		btnAddFood.setStyleName("gwt-ButtonAdd");
		btnAddFood.setText("Add Food");
		verticalPanel.add(btnAddFood);
		btnAddFood.setSize("100%", "40px");
		verticalPanel.setCellHorizontalAlignment(btnAddFood,
				HasHorizontalAlignment.ALIGN_CENTER);

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		verticalPanel_1.setSpacing(6);
		horizontalPanel.add(verticalPanel_1);

		vtpanActivity = new VerticalPanel();
		verticalPanel_1.add(vtpanActivity);
		vtpanActivity.setStyleName("gwt-PanelRounded1");
		vtpanActivity.setSpacing(3);
		vtpanActivity
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vtpanActivity.setWidth("100px");

		Label lblActivities = new Label("Activities");
		lblActivities.setStyleName("gwt-Label-1");
		vtpanActivity.add(lblActivities);

		Label label_2 = new Label("+0");
		label_2.setStyleName("gwt-Label-2");
		vtpanActivity.add(label_2);

		Button button = new Button("New button");
		button.addClickHandler(new doButtonClickHandler());
		button.setText("Add Act.");
		button.setStyleName("gwt-ButtonAdd");
		verticalPanel_1.add(button);
		button.setSize("100%", "40px");

		VerticalPanel verticalPanel_4 = new VerticalPanel();
		verticalPanel_4.setSpacing(6);
		horizontalPanel.add(verticalPanel_4);

		VerticalPanel verticalPanel_2 = new VerticalPanel();
		verticalPanel_4.add(verticalPanel_2);
		verticalPanel_2.setStyleName("gwt-PanelRounded2");
		verticalPanel_2.setSpacing(3);
		verticalPanel_2
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		verticalPanel_2.setWidth("100px");

		Label lblTotalCals = new Label("Total Cals");
		lblTotalCals.setWordWrap(false);
		lblTotalCals.setStyleName("gwt-Label-1");
		verticalPanel_2.add(lblTotalCals);

		Label label_3 = new Label("+0");
		label_3.setStyleName("gwt-Label-2");
		verticalPanel_2.add(label_3);

		btnTotalCalDetails = new Button("New button");
		btnTotalCalDetails
				.addClickHandler(new doBtnTotalCalDetailsClickHandler());
		btnTotalCalDetails.setText("Details");
		btnTotalCalDetails.setStyleName("gwt-ButtonAdd");
		verticalPanel_4.add(btnTotalCalDetails);
		btnTotalCalDetails.setSize("100%", "40px");

		VerticalPanel verticalPanel_5 = new VerticalPanel();
		verticalPanel_5.setSpacing(6);
		horizontalPanel.add(verticalPanel_5);

		VerticalPanel verticalPanel_3 = new VerticalPanel();
		verticalPanel_5.add(verticalPanel_3);
		verticalPanel_3.setStyleName("gwt-PanelRounded3");
		verticalPanel_3.setSpacing(3);
		verticalPanel_3
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		verticalPanel_3.setWidth("150px");

		Label lblRemaining = new Label("Remaining");
		lblRemaining.setWordWrap(false);
		lblRemaining.setStyleName("gwt-Label-3");
		verticalPanel_3.add(lblRemaining);

		Label label_4 = new Label("+0");
		label_4.setStyleName("gwt-Label-2");
		verticalPanel_3.add(label_4);

		if (!isDesignTime()) {

			_cmpstFoodDate = new CmpstFoodDate();
			_cmpstSearchFood = new CmpstSearchFood();
		}

	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

	private class doButtonClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			String strURL = "http://platform.fatsecret.com/rest/server.api?method=profile.create&oauth_consumer_key=712aeae1308a46518c0341598480da8c&oauth_nonce=1234&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1333726791&oauth_version=1.0";

			RequestBuilder rb;

			rb = new RequestBuilder(RequestBuilder.GET, URL.encode(strURL));

			rb.setHeader("Content-Type", "application/xml");

			try {

				rb.sendRequest(null, new RequestCallback() {

					@Override
					public void onResponseReceived(Request request,
							Response response) {

						String strUserXML = response.getText();

						Window.alert("response " + strUserXML + " "
								+ response.getStatusCode() + "///"
								+ Response.SC_OK);

					}

					@Override
					public void onError(Request request, Throwable exception) {

						Window.alert("Error " + exception.getMessage());
					}

				});

			} catch (RequestException e) {

				e.printStackTrace();

				Window.alert("Request Exception " + e.getMessage());
			}

		}
	}

	private class doBtnAddFoodClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			_vtpanParent.remove(_cmpstFoodDate);
			_vtpanParent.add(_cmpstFoodDate);

			_vtpanParent.remove(_cmpstSearchFood);
			_vtpanParent.add(_cmpstSearchFood);

		}

	}

	public void addNewUser(final String strUser) {

		RPCDietSite.Util.getInstance().newUser(strUser,
				new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {

						if (result.length() < 2) {

							getExistingUserAuth(strUser);

						} else {

							Window.alert("result: " + result);
						}
					}

					@Override
					public void onFailure(Throwable caught) {

						Window.alert("Error: " + caught.getMessage());

					}
				});

	}

	protected void getExistingUserAuth(String strUser) {

		RPCDietSite.Util.getInstance().getUserToken(strUser,
				new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {

						Window.alert("result: " + result);

					}

					@Override
					public void onFailure(Throwable caught) {

						Window.alert("Error: " + caught.getMessage());

					}

				});

	}

	private class doBtnTotalCalDetailsClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			/*
			 * RPCDietSite.Util.getInstance().getFoods("cake", new
			 * AsyncCallback<String>() {
			 * 
			 * @Override public void onFailure(Throwable caught) {
			 * 
			 * Window.alert("Error: " + caught.getMessage());
			 * 
			 * }
			 * 
			 * @Override public void onSuccess(String result) {
			 * 
			 * Window.alert("result: " + result);
			 * 
			 * }
			 * 
			 * });
			 */

			// DlgSearchFood dlg = new DlgSearchFood();

			// dlg.center();

		}

	}
}