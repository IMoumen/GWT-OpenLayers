package com.eg.gwt.openLayers.client.format;

import com.eg.gwt.openLayers.client.util.JSObject;

/**
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class WMCImpl {

	public static native JSObject create()
	/*-{
		return new $wnd.OpenLayers.Format.WMC();
	}-*/;

}
