package com.icarusdb.icanutritionguide.web.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gwtwidgets.client.wrap.Callback;
import org.gwtwidgets.client.wrap.Effect;
import org.gwtwidgets.client.wrap.EffectOption;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.DefaultFormat;

public class CmpstFoodDiary extends Composite {

	private VerticalPanel vtpanMain;
	private Label lblDetailBreakfast;
	private Label lblDetailLunch;
	private Label lblDetailDinner;
	private Label lblDetailOther;
	private Label lblDetailTotal;
	private HorizontalPanel hzpanBreakfast;
	private HorizontalPanel hzpanLunch;
	private HorizontalPanel hzpanDinner;
	private HorizontalPanel hzpanOther;
	private HorizontalPanel hzpanTotal;
	private VerticalPanel vtpanDetailBreakfast;
	private VerticalPanel vtpanDetailLunch;
	private VerticalPanel vtpanDetailDinner;
	private VerticalPanel vtpanDetailOther;
	private ToggleButton tglbtnEditBreakfast;
	private ToggleButton tglbtnEditLunch;
	private ToggleButton tglbtnEditDinner;
	private ToggleButton tglbtnEditOther;
	private PushButton pshbtnAddBreakfast;
	private PushButton pshbtnAddLunch;
	private PushButton pshbtnAddDinner;
	private PushButton pshbtnAddOther;
	private HorizontalPanel horizontalPanel;
	private HorizontalPanel horizontalPanel_2;
	private Label lblDate;
	static public DateBox dtpDiaryDate;
	private Button btnDiarySelectDate;

	public List<Map<String, String>> _lstmapBreakfast = new ArrayList<Map<String, String>>();
	public List<Map<String, String>> _lstmapLunch = new ArrayList<Map<String, String>>();
	public List<Map<String, String>> _lstmapDinner = new ArrayList<Map<String, String>>();
	public List<Map<String, String>> _lstmapOther = new ArrayList<Map<String, String>>();

	// BUG DATE TIME PICKER DOUBLE PROCESS
	public boolean _isDateBusy = false;
	private Image imgLoading;

	public CmpstFoodDiary() {

		vtpanMain = new VerticalPanel();
		vtpanMain.setStyleName("gwt-VerticalPanelFoodAdd4");
		initWidget(vtpanMain);
		vtpanMain.setWidth("620px");

		horizontalPanel = new HorizontalPanel();
		horizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel.setSpacing(6);
		vtpanMain.add(horizontalPanel);
		horizontalPanel.setWidth("100%");

		horizontalPanel_2 = new HorizontalPanel();
		horizontalPanel_2
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel.add(horizontalPanel_2);
		horizontalPanel_2.setWidth("100%");

		lblDate = new Label("Date");
		lblDate.setStyleName("gwt-LabelMenu");
		horizontalPanel_2.add(lblDate);
		horizontalPanel_2.setCellWidth(lblDate, "126px");
		lblDate.setWidth("120px");

		dtpDiaryDate = new DateBox();
		dtpDiaryDate.setFormat(new DefaultFormat(DateTimeFormat
				.getFormat("MMM dd, yyyy")));
		dtpDiaryDate
				.addValueChangeHandler(new doDtpDiaryDateValueChangeHandler());
		dtpDiaryDate.setStyleName("gwt-TextBox1");
		horizontalPanel_2.add(dtpDiaryDate);
		horizontalPanel_2.setCellWidth(dtpDiaryDate, "170px");
		dtpDiaryDate.setWidth("150px");

		btnDiarySelectDate = new Button("New button");
		btnDiarySelectDate
				.addClickHandler(new doBtnDiarySelectDateClickHandler());
		btnDiarySelectDate.setText("Select Date");
		horizontalPanel_2.add(btnDiarySelectDate);
		horizontalPanel_2.setCellWidth(btnDiarySelectDate, "120px");
		btnDiarySelectDate.setWidth("100px");

		imgLoading = new Image("images/ajax-loader.gif");
		horizontalPanel_2.add(imgLoading);
		imgLoading.setWidth("24px");

		VerticalPanel verticalPanel_1 = new VerticalPanel();
		vtpanMain.add(verticalPanel_1);
		verticalPanel_1.setWidth("100%");

		hzpanBreakfast = new HorizontalPanel();
		verticalPanel_1.add(hzpanBreakfast);
		hzpanBreakfast.setWidth("96%");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel_1
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_1.setSpacing(6);
		hzpanBreakfast.add(horizontalPanel_1);
		horizontalPanel_1.setWidth("100%");

		Label lblBreakfast = new Label("Breakfast");
		lblBreakfast.setStyleName("gwt-LabelMenu");
		horizontalPanel_1.add(lblBreakfast);
		horizontalPanel_1.setCellWidth(lblBreakfast, "120px");
		lblBreakfast.setWidth("120px");

		lblDetailBreakfast = new Label("...");
		lblDetailBreakfast.setStyleName("gwt-Label8");
		horizontalPanel_1.add(lblDetailBreakfast);
		horizontalPanel_1.setCellWidth(lblDetailBreakfast, "420px");
		lblDetailBreakfast.setWidth("350px");

		tglbtnEditBreakfast = new ToggleButton("Edit");
		tglbtnEditBreakfast
				.addValueChangeHandler(new doTglbtnEditBreakfastValueChangeHandler());
		horizontalPanel_1.add(tglbtnEditBreakfast);
		tglbtnEditBreakfast.setWidth("30px");

		pshbtnAddBreakfast = new PushButton("Add");
		pshbtnAddBreakfast
				.addClickHandler(new doPshbtnAddBreakfastClickHandler());
		horizontalPanel_1.add(pshbtnAddBreakfast);

		vtpanDetailBreakfast = new VerticalPanel();
		vtpanDetailBreakfast.setVisible(false);
		vtpanDetailBreakfast
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		vtpanDetailBreakfast.setSpacing(6);
		vtpanDetailBreakfast
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_1.add(vtpanDetailBreakfast);
		vtpanDetailBreakfast.setSize("580px", "0px");

		hzpanLunch = new HorizontalPanel();
		verticalPanel_1.add(hzpanLunch);
		hzpanLunch.setWidth("96%");

		HorizontalPanel horizontalPanel_3 = new HorizontalPanel();
		horizontalPanel_3
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_3.setSpacing(6);
		hzpanLunch.add(horizontalPanel_3);
		horizontalPanel_3.setWidth("100%");

		Label lblLunch = new Label("Lunch");
		lblLunch.setStyleName("gwt-LabelMenu");
		horizontalPanel_3.add(lblLunch);
		horizontalPanel_3.setCellWidth(lblLunch, "120px");
		lblLunch.setWidth("120px");

		lblDetailLunch = new Label("...");
		lblDetailLunch.setStyleName("gwt-Label8");
		horizontalPanel_3.add(lblDetailLunch);
		horizontalPanel_3.setCellWidth(lblDetailLunch, "420px");
		lblDetailLunch.setWidth("350px");

		tglbtnEditLunch = new ToggleButton("Edit");
		tglbtnEditLunch
				.addValueChangeHandler(new doTglbtnEditLunchValueChangeHandler());
		horizontalPanel_3.add(tglbtnEditLunch);
		tglbtnEditLunch.setWidth("30px");

		pshbtnAddLunch = new PushButton("Add");
		pshbtnAddLunch.addClickHandler(new doPshbtnAddLunchClickHandler());
		horizontalPanel_3.add(pshbtnAddLunch);

		vtpanDetailLunch = new VerticalPanel();
		vtpanDetailLunch.setVisible(false);
		vtpanDetailLunch
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		vtpanDetailLunch.setSpacing(6);
		vtpanDetailLunch
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		verticalPanel_1.add(vtpanDetailLunch);
		vtpanDetailLunch.setSize("580px", "0px");

		hzpanDinner = new HorizontalPanel();
		verticalPanel_1.add(hzpanDinner);
		hzpanDinner.setWidth("96%");

		HorizontalPanel horizontalPanel_7 = new HorizontalPanel();
		horizontalPanel_7
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_7.setSpacing(6);
		hzpanDinner.add(horizontalPanel_7);
		horizontalPanel_7.setWidth("100%");

		Label lblDinner_1 = new Label("Dinner");
		lblDinner_1.setStyleName("gwt-LabelMenu");
		horizontalPanel_7.add(lblDinner_1);
		lblDinner_1.setWidth("120px");

		lblDetailDinner = new Label("...");
		lblDetailDinner.setStyleName("gwt-Label8");
		horizontalPanel_7.add(lblDetailDinner);
		horizontalPanel_7.setCellWidth(lblDetailDinner, "420px");
		lblDetailDinner.setWidth("350px");

		tglbtnEditDinner = new ToggleButton("Edit");
		tglbtnEditDinner
				.addValueChangeHandler(new doTglbtnEditDinnerValueChangeHandler());
		horizontalPanel_7.add(tglbtnEditDinner);
		tglbtnEditDinner.setWidth("30px");

		pshbtnAddDinner = new PushButton("Add");
		pshbtnAddDinner.addClickHandler(new doPshbtnAddDinnerClickHandler());
		horizontalPanel_7.add(pshbtnAddDinner);

		vtpanDetailDinner = new VerticalPanel();
		vtpanDetailDinner.setVisible(false);
		vtpanDetailDinner
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		vtpanDetailDinner.setSpacing(6);
		vtpanDetailDinner
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		verticalPanel_1.add(vtpanDetailDinner);
		vtpanDetailDinner.setSize("580px", "0px");

		hzpanOther = new HorizontalPanel();
		verticalPanel_1.add(hzpanOther);
		hzpanOther.setWidth("96%");

		HorizontalPanel horizontalPanel_9 = new HorizontalPanel();
		horizontalPanel_9
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_9.setSpacing(6);
		hzpanOther.add(horizontalPanel_9);
		horizontalPanel_9.setWidth("100%");

		Label label_4 = new Label("Other");
		label_4.setStyleName("gwt-LabelMenu");
		horizontalPanel_9.add(label_4);
		label_4.setWidth("120px");

		lblDetailOther = new Label("...");
		lblDetailOther.setStyleName("gwt-Label8");
		horizontalPanel_9.add(lblDetailOther);
		horizontalPanel_9.setCellWidth(lblDetailOther, "420px");
		lblDetailOther.setWidth("350px");

		tglbtnEditOther = new ToggleButton("Edit");
		tglbtnEditOther
				.addValueChangeHandler(new doTglbtnEditOtherValueChangeHandler());
		horizontalPanel_9.add(tglbtnEditOther);
		tglbtnEditOther.setWidth("30px");

		pshbtnAddOther = new PushButton("Add");
		pshbtnAddOther.addClickHandler(new doPshbtnAddOtherClickHandler());
		horizontalPanel_9.add(pshbtnAddOther);

		vtpanDetailOther = new VerticalPanel();
		vtpanDetailOther.setVisible(false);
		verticalPanel_1.add(vtpanDetailOther);
		vtpanDetailOther
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		vtpanDetailOther.setSpacing(6);
		vtpanDetailOther
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		vtpanDetailOther.setSize("580px", "0px");

		hzpanTotal = new HorizontalPanel();
		verticalPanel_1.add(hzpanTotal);
		hzpanTotal.setWidth("96%");

		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();
		horizontalPanel_5
				.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		horizontalPanel_5.setSpacing(6);
		hzpanTotal.add(horizontalPanel_5);
		horizontalPanel_5.setWidth("100%");

		Label lblDinner = new Label("Total");
		lblDinner.setStyleName("gwt-LabelMenu");
		horizontalPanel_5.add(lblDinner);
		horizontalPanel_5.setCellWidth(lblDinner, "120px");
		lblDinner.setWidth("120px");

		lblDetailTotal = new Label("...");
		lblDetailTotal.setStyleName("gwt-Label7");
		horizontalPanel_5.add(lblDetailTotal);
		horizontalPanel_5.setCellWidth(lblDetailTotal, "380px");
		lblDetailTotal.setWidth("350px");

		if (!isDesignTime()) {

			dtpDiaryDate.setValue(new Date());

			String strDateDay = String.valueOf((dtpDiaryDate.getValue()
					.getTime() / (24 * 60 * 60 * 1000)) + 1);
			populateFoodEntries(strDateDay);

		}
	}

	// Implement the following method exactly as-is
	private static final boolean isDesignTime() {
		return false;
	}

	public void populateFoodEntries(String strDateDay) {

		_lstmapBreakfast.clear();
		_lstmapLunch.clear();
		_lstmapDinner.clear();
		_lstmapOther.clear();

		lblDetailBreakfast.setText("No entries");
		lblDetailLunch.setText("No entries");
		lblDetailDinner.setText("No entries");
		lblDetailOther.setText("No entries");

		RPCDietSite.Util.getInstance().getFoodEntriesByDate(main._oauthToken,
				main._oauthSecret, strDateDay, new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {

						_isDateBusy = false;
						imgLoading.setVisible(false);

						Window.alert("Error: " + caught.getMessage());

					}

					@Override
					public void onSuccess(String result) {

						if (result.length() < 5) {

							_isDateBusy = false;
							imgLoading.setVisible(false);

							return;
						}

						String strXML = "<food_entries>" + result
								+ "</food_entries>";

						List<XMLFoodEntries> xmfl = XMLFoodEntries.XML
								.readList(strXML);

						String food_entry_id;
						String food_entry_description;
						String date_int;
						String meal;
						String food_id;
						String serving_id;
						String number_of_units;
						String food_entry_name;
						String calories;
						String carbohydrate;
						String protein;
						String fat;
						String saturated_fat;
						String polyunsaturated_fat;
						String monounsaturated_fat;
						String sodium;
						String potassium;
						String fiber;
						String sugar;
						String vitamin_a;
						String vitamin_c;
						String calcium;
						String iron;

						for (int i = 0; i < xmfl.size(); i++) {

							food_entry_id = xmfl.get(i).food_entry_id;
							food_entry_description = xmfl.get(i).food_entry_description;
							date_int = xmfl.get(i).date_int;
							meal = xmfl.get(i).meal;
							food_id = xmfl.get(i).food_id;
							serving_id = xmfl.get(i).serving_id;
							number_of_units = xmfl.get(i).number_of_units;
							food_entry_name = xmfl.get(i).food_entry_name;
							calories = xmfl.get(i).calories;
							carbohydrate = xmfl.get(i).carbohydrate;
							protein = xmfl.get(i).protein;
							fat = xmfl.get(i).fat;
							saturated_fat = xmfl.get(i).saturated_fat;
							polyunsaturated_fat = xmfl.get(i).polyunsaturated_fat;
							monounsaturated_fat = xmfl.get(i).monounsaturated_fat;
							sodium = xmfl.get(i).sodium;
							potassium = xmfl.get(i).potassium;
							fiber = xmfl.get(i).fiber;
							sugar = xmfl.get(i).sugar;
							vitamin_a = xmfl.get(i).vitamin_a;
							vitamin_c = xmfl.get(i).vitamin_c;
							calcium = xmfl.get(i).calcium;
							iron = xmfl.get(i).iron;

							Map<String, String> map = new HashMap<String, String>();
							map.put("food_entry_id", food_entry_id);
							map.put("food_entry_description",
									food_entry_description);
							map.put("date_int", date_int);
							map.put("meal", meal);
							map.put("food_id", food_id);
							map.put("serving_id", serving_id);
							map.put("number_of_units", number_of_units);
							map.put("food_entry_name", food_entry_name);
							map.put("calories", calories);
							map.put("carbohydrate", carbohydrate);
							map.put("protein", protein);
							map.put("fat", fat);
							map.put("saturated_fat", saturated_fat);
							map.put("polyunsaturated_fat", polyunsaturated_fat);
							map.put("monounsaturated_fat", monounsaturated_fat);
							map.put("sodium", sodium);
							map.put("potassium", potassium);
							map.put("fiber", fiber);
							map.put("sugar", sugar);
							map.put("vitamin_a", vitamin_a);
							map.put("vitamin_c", vitamin_c);
							map.put("calcium", calcium);
							map.put("iron", iron);

							// Put into boxes
							if (meal.equalsIgnoreCase("breakfast")) {

								_lstmapBreakfast.add(map);

							} else if (meal.equalsIgnoreCase("lunch")) {

								_lstmapLunch.add(map);

							} else if (meal.equalsIgnoreCase("dinner")) {

								_lstmapDinner.add(map);

							} else {

								_lstmapOther.add(map);

							}

						} // FOR

						putFoodEntriesToGui();

					}

				});

	}

	protected void putFoodEntriesToGui() {

		_isDateBusy = false;
		imgLoading.setVisible(false);

		lblDetailBreakfast.setText("" + _lstmapBreakfast.size() + " Items");
		vtpanDetailBreakfast.clear();
		for (int i = 0; i < _lstmapBreakfast.size(); i++) {

			vtpanDetailBreakfast.add(new CmpstFoodDiaryItem(_lstmapBreakfast
					.get(i).get("food_entry_id"), _lstmapBreakfast.get(i).get(
					"food_id"), _lstmapBreakfast.get(i).get(
					"food_entry_description"), _lstmapBreakfast.get(i).get(
					"number_of_units"), _lstmapBreakfast.get(i).get(
					"food_entry_name")));

		}

		lblDetailLunch.setText("" + _lstmapLunch.size() + " Items");
		vtpanDetailLunch.clear();
		for (int i = 0; i < _lstmapLunch.size(); i++) {

			vtpanDetailLunch.add(new CmpstFoodDiaryItem(_lstmapLunch.get(i)
					.get("food_entry_id"), _lstmapLunch.get(i).get("food_id"),
					_lstmapLunch.get(i).get("food_entry_description"),
					_lstmapLunch.get(i).get("number_of_units"), _lstmapLunch
							.get(i).get("food_entry_name")));

		}

		lblDetailDinner.setText("" + _lstmapDinner.size() + " Items");
		vtpanDetailDinner.clear();
		for (int i = 0; i < _lstmapDinner.size(); i++) {

			vtpanDetailDinner.add(new CmpstFoodDiaryItem(_lstmapDinner.get(i)
					.get("food_entry_id"), _lstmapDinner.get(i).get("food_id"),
					_lstmapDinner.get(i).get("food_entry_description"),
					_lstmapDinner.get(i).get("number_of_units"), _lstmapDinner
							.get(i).get("food_entry_name")));

		}

		lblDetailOther.setText("" + _lstmapOther.size() + " Items");
		vtpanDetailOther.clear();
		for (int i = 0; i < _lstmapOther.size(); i++) {

			vtpanDetailOther.add(new CmpstFoodDiaryItem(_lstmapOther.get(i)
					.get("food_entry_id"), _lstmapOther.get(i).get("food_id"),
					_lstmapOther.get(i).get("food_entry_description"),
					_lstmapOther.get(i).get("number_of_units"), _lstmapOther
							.get(i).get("food_entry_name")));

		}

	}

	private class doTglbtnEditBreakfastValueChangeHandler implements
			ValueChangeHandler<Boolean> {
		public void onValueChange(ValueChangeEvent<Boolean> event) {

			final boolean down = ((ToggleButton) event.getSource()).isDown();

			if (down) {

				Effect.appear(vtpanDetailBreakfast, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailBreakfast.setVisible(down);

							}
						})

				});

			} else {

				Effect.fade(vtpanDetailBreakfast, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailBreakfast.setVisible(down);

							}
						})

				});

			}

		}
	}

	private class doTglbtnEditLunchValueChangeHandler implements
			ValueChangeHandler<Boolean> {
		public void onValueChange(ValueChangeEvent<Boolean> event) {

			final boolean down = ((ToggleButton) event.getSource()).isDown();

			if (down) {

				Effect.appear(vtpanDetailLunch, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailLunch.setVisible(down);

							}
						})

				});

			} else {

				Effect.fade(vtpanDetailLunch, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailLunch.setVisible(down);

							}
						})

				});

			}

		}
	}

	private class doTglbtnEditDinnerValueChangeHandler implements
			ValueChangeHandler<Boolean> {
		public void onValueChange(ValueChangeEvent<Boolean> event) {

			final boolean down = ((ToggleButton) event.getSource()).isDown();

			if (down) {

				Effect.appear(vtpanDetailDinner, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailDinner.setVisible(down);

							}
						})

				});

			} else {

				Effect.fade(vtpanDetailDinner, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailDinner.setVisible(down);

							}
						})

				});

			}

		}
	}

	private class doTglbtnEditOtherValueChangeHandler implements
			ValueChangeHandler<Boolean> {
		public void onValueChange(ValueChangeEvent<Boolean> event) {

			final boolean down = ((ToggleButton) event.getSource()).isDown();

			if (down) {

				Effect.appear(vtpanDetailOther, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailOther.setVisible(down);

							}
						})

				});

			} else {

				Effect.fade(vtpanDetailOther, new EffectOption[] {

				new EffectOption("duration", 1.0),
						new EffectOption("afterFinish", new Callback() {

							@Override
							public void execute() {
								vtpanDetailOther.setVisible(down);

							}
						})

				});

			}

		}
	}

	private class doBtnDiarySelectDateClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

			dtpDiaryDate.setFocus(true);
		}
	}

	private class doDtpDiaryDateValueChangeHandler implements
			ValueChangeHandler<Date> {
		public void onValueChange(ValueChangeEvent<Date> event) {

			if (_isDateBusy == false) {

				_isDateBusy = true;
				imgLoading.setVisible(true);

				String strDateDay = String.valueOf((dtpDiaryDate.getValue()
						.getTime() / (24 * 60 * 60 * 1000)) + 1);
				populateFoodEntries(strDateDay);

			}

		}
	}

	private class doPshbtnAddBreakfastClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {

		}
	}

	private class doPshbtnAddLunchClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {
		}
	}

	private class doPshbtnAddDinnerClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {
		}
	}

	private class doPshbtnAddOtherClickHandler implements ClickHandler {
		public void onClick(ClickEvent event) {
		}
	}
}
