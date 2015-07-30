package com.bearded.modules.sensor.domain;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import static com.bearded.modules.sensor.persistence.dao.LocationEntityDao.Properties.AccuracyInMeters;
import static com.bearded.modules.sensor.persistence.dao.LocationEntityDao.Properties.Latitude;
import static com.bearded.modules.sensor.persistence.dao.LocationEntityDao.Properties.Longitude;
import static com.bearded.modules.sensor.persistence.dao.LocationEntityDao.Properties.SpeedInMetersSecond;
import static com.bearded.modules.sensor.persistence.dao.LocationEntityDao.Properties.Timestamp;
// KEEP INCLUDES END

/**
 * Entity mapped to table Location.
 */
public class LocationEntity implements com.bearded.common.persistance.ParseableJson, java.lang.Comparable<LocationEntity> {

    private Long id;
    private double latitude;
    private double longitude;
    /**
     * Not-null value.
     */
    private String timestamp;
    private Float accuracyInMeters;
    private Float speedInMetersSecond;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public LocationEntity() {
    }

    public LocationEntity(Long id) {
        this.id = id;
    }

    public LocationEntity(Long id, double latitude, double longitude, String timestamp, Float accuracyInMeters, Float speedInMetersSecond) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.accuracyInMeters = accuracyInMeters;
        this.speedInMetersSecond = speedInMetersSecond;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Not-null value.
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Float getAccuracyInMeters() {
        return accuracyInMeters;
    }

    public void setAccuracyInMeters(Float accuracyInMeters) {
        this.accuracyInMeters = accuracyInMeters;
    }

    public Float getSpeedInMetersSecond() {
        return speedInMetersSecond;
    }

    public void setSpeedInMetersSecond(Float speedInMetersSecond) {
        this.speedInMetersSecond = speedInMetersSecond;
    }

    // KEEP METHODS - put your custom methods here

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof LocationEntity)) {
            return false;
        }
        return compareTo((LocationEntity) other) == 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(@NonNull LocationEntity other) {
        if (this.getLatitude() > other.getLatitude()) {
            return 1;
        } else if (this.getLatitude() < other.getLatitude()) {
            return -1;
        } else if (this.getLongitude() > other.getLongitude()) {
            return 1;
        } else if (this.getLongitude() < other.getLongitude()) {
            return -1;
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public JsonObject toJsonObject() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add(Latitude.name, new JsonPrimitive(this.latitude));
        jsonObject.add(Longitude.name, new JsonPrimitive(this.longitude));
        jsonObject.add(Timestamp.name, new JsonPrimitive(this.timestamp));
        jsonObject.add(AccuracyInMeters.name, (accuracyInMeters == null)
                ? null : new JsonPrimitive(this.accuracyInMeters));
        jsonObject.add(SpeedInMetersSecond.name, (this.speedInMetersSecond == null)
                ? null : new JsonPrimitive(this.speedInMetersSecond));
        return jsonObject;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.toJsonObject().toString();
    }
    // KEEP METHODS END

}
