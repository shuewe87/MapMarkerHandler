/**
 * Created by Stephan Hüwe on 18.11.2019.
 * Email: shuewe87@gmail.com
 * <p>
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */

package com.shuewe.markerhandler;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * Implementation of A_LatLngWrapper for mapbox
 */
public class LatLngMapboxWrapper extends A_LatLngWrapper<LatLng> {

    /**
     * Public constructor
     *
     * @param latLng mapbox LatLng
     */
    public LatLngMapboxWrapper(LatLng latLng) {
        super(latLng);
    }

    /**
     * Public constructor
     *
     * @param latLng com.shuewe.markerhandler.LatLng
     */
    public LatLngMapboxWrapper(com.shuewe.markerhandler.LatLng latLng) {
        super(latLng);
    }

    @Override
    public com.shuewe.markerhandler.LatLng toLatLng() {
        return m_latLng_target == null ? new com.shuewe.markerhandler.LatLng(m_latLng_source.getLatitude(), m_latLng_source.getLongitude()) : m_latLng_target;
    }

    @Override
    public LatLng toOtherLatLng() {
        return m_latLng_source == null ? new LatLng(m_latLng_target.latitude, m_latLng_target.longitude) : m_latLng_source;
    }
}
