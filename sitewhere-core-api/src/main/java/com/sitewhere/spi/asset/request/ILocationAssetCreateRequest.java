/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.asset.request;

import com.sitewhere.spi.asset.ILocationAsset;

/**
 * Information needed to create an {@link ILocationAsset}.
 * 
 * @author Derek
 */
public interface ILocationAssetCreateRequest extends IAssetCreateRequest {

	/**
	 * Get location latitude.
	 * 
	 * @return
	 */
	public Double getLatitude();

	/**
	 * Get location longitude.
	 * 
	 * @return
	 */
	public Double getLongitude();

	/**
	 * Get location elevation.
	 * 
	 * @return
	 */
	public Double getElevation();
}