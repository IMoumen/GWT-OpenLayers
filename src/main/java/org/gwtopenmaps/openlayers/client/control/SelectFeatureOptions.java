package org.gwtopenmaps.openlayers.client.control;

import org.gwtopenmaps.openlayers.client.control.SelectFeature.SelectFeatureListener;
import org.gwtopenmaps.openlayers.client.control.SelectFeature.UnselectFeatureListener;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * See {@link SelectFeature}.
 *
 * Default mode of selection is clickout, see {@link SelectFeature}.
 *
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class SelectFeatureOptions extends ControlOptions {

	/**
	 *
	 */
	public void setHover(){
		getJSObject().setProperty("hover", true);
	}

	/**
	 *
	 */
	public void setToggle(){
		getJSObject().setProperty("toggle", true);
	}

	/**
	 *
	 */
	public void setMultiple(){
		getJSObject().setProperty("multiple", true);
	}

	/**
	 * Triggers when a feature is selected
	 *
	 */
	public void onSelect(SelectFeatureListener listener){
		JSObject callback = SelectFeatureImpl.createSelectFeatureCallback(listener);
		getJSObject().setProperty("onSelect", callback);
	}

	/**
	 * Triggers when a feature is unselected
	 *
	 */
	public void onUnSelect(UnselectFeatureListener listener){
		JSObject callback = SelectFeatureImpl.createUnselectFeatureCallback(listener);
		getJSObject().setProperty("onUnselect", callback);
	}

}