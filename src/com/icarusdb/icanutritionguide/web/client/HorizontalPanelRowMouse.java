package com.icarusdb.icanutritionguide.web.client;

import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class HorizontalPanelRowMouse extends HorizontalPanel implements
		MouseDownHandler, HasMouseDownHandlers, MouseUpHandler,
		HasMouseUpHandlers, MouseOverHandler, HasMouseOverHandlers,
		MouseOutHandler, HasMouseOutHandlers {

	public HorizontalPanelRowMouse() {

	}

	/**
	 * HasMouseDownHandlers
	 */
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		return addDomHandler(handler, MouseDownEvent.getType());
	}

	/**
	 * MouseDownHandler
	 */
	@Override
	public void onMouseDown(MouseDownEvent event) {

		event.preventDefault();

	}

	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return addDomHandler(handler, MouseUpEvent.getType());
	}

	@Override
	public void onMouseUp(MouseUpEvent event) {

		event.preventDefault();

	}

	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return addDomHandler(handler, MouseOverEvent.getType());
	}

	@Override
	public void onMouseOver(MouseOverEvent event) {

		event.preventDefault();

	}

	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return addDomHandler(handler, MouseOutEvent.getType());
	}

	@Override
	public void onMouseOut(MouseOutEvent event) {

		event.preventDefault();

	}

}