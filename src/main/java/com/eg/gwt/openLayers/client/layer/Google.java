package com.eg.gwt.openLayers.client.layer;

import com.eg.gwt.openLayers.client.LonLat;
import com.eg.gwt.openLayers.client.util.JSObject;

/**
 * 
 * @author Erdem Gunay
 * @author Aaron Novstrup - Stottler Henke Associates, Inc.
 *
 */
public class Google extends Layer {

	protected Google(JSObject element) {
		super(element);
	}

	public Google(String name) {
		this(GoogleImpl.create(name));
	}
	
	public Google(String name, GoogleParams params) {
	   this(GoogleImpl.create(name, params.getJSObject()));
	}
	
	public LonLat forwardMercator(double lon, double lat)
	{
	   return LonLat.narrowToLonLat(GoogleImpl.forwardMercator(getJSObject(), lon, lat));
	}
	
}
