package com.bearded.modules.sensor.domain;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here

import android.support.annotation.NonNull;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.FifoMaxEventCount;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.FifoReservedEventCount;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.MaximumDelayMicroseconds;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.MaximumRange;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.MinimumDelayMicroseconds;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.PowerInMilliAmperes;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.ReportingMode;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorAddress;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorName;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorResolution;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorType;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorUnit;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorVendor;
import static com.bearded.modules.sensor.persistence.dao.SensorEntityDao.Properties.SensorVersion;
// KEEP INCLUDES END

/**
 * Entity mapped to table Sensor.
 */
public class SensorEntity implements com.bearded.common.persistance.ParseableJson, java.lang.Comparable<SensorEntity> {

    private Long id;
    /**
     * Not-null value.
     */
    private String sensorName;
    /**
     * Not-null value.
     */
    private String sensorType;
    /**
     * Not-null value.
     */
    private String sensorUnit;
    private String sensorAddress;
    private Integer minimumDelayMicroseconds;
    private Integer maximumDelayMicroseconds;
    private Integer fifoMaxEventCount;
    private Integer fifoReservedEventCount;
    private Float maximumRange;
    private String reportingMode;
    private Float powerInMilliAmperes;
    private Float sensorResolution;
    private String sensorVendor;
    private Integer sensorVersion;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public SensorEntity() {
    }

    public SensorEntity(Long id) {
        this.id = id;
    }

    public SensorEntity(Long id, String sensorName, String sensorType, String sensorUnit, String sensorAddress, Integer minimumDelayMicroseconds, Integer maximumDelayMicroseconds, Integer fifoMaxEventCount, Integer fifoReservedEventCount, Float maximumRange, String reportingMode, Float powerInMilliAmperes, Float sensorResolution, String sensorVendor, Integer sensorVersion) {
        this.id = id;
        this.sensorName = sensorName;
        this.sensorType = sensorType;
        this.sensorUnit = sensorUnit;
        this.sensorAddress = sensorAddress;
        this.minimumDelayMicroseconds = minimumDelayMicroseconds;
        this.maximumDelayMicroseconds = maximumDelayMicroseconds;
        this.fifoMaxEventCount = fifoMaxEventCount;
        this.fifoReservedEventCount = fifoReservedEventCount;
        this.maximumRange = maximumRange;
        this.reportingMode = reportingMode;
        this.powerInMilliAmperes = powerInMilliAmperes;
        this.sensorResolution = sensorResolution;
        this.sensorVendor = sensorVendor;
        this.sensorVersion = sensorVersion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Not-null value.
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    /**
     * Not-null value.
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    /**
     * Not-null value.
     */
    public String getSensorUnit() {
        return sensorUnit;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setSensorUnit(String sensorUnit) {
        this.sensorUnit = sensorUnit;
    }

    public String getSensorAddress() {
        return sensorAddress;
    }

    public void setSensorAddress(String sensorAddress) {
        this.sensorAddress = sensorAddress;
    }

    public Integer getMinimumDelayMicroseconds() {
        return minimumDelayMicroseconds;
    }

    public void setMinimumDelayMicroseconds(Integer minimumDelayMicroseconds) {
        this.minimumDelayMicroseconds = minimumDelayMicroseconds;
    }

    public Integer getMaximumDelayMicroseconds() {
        return maximumDelayMicroseconds;
    }

    public void setMaximumDelayMicroseconds(Integer maximumDelayMicroseconds) {
        this.maximumDelayMicroseconds = maximumDelayMicroseconds;
    }

    public Integer getFifoMaxEventCount() {
        return fifoMaxEventCount;
    }

    public void setFifoMaxEventCount(Integer fifoMaxEventCount) {
        this.fifoMaxEventCount = fifoMaxEventCount;
    }

    public Integer getFifoReservedEventCount() {
        return fifoReservedEventCount;
    }

    public void setFifoReservedEventCount(Integer fifoReservedEventCount) {
        this.fifoReservedEventCount = fifoReservedEventCount;
    }

    public Float getMaximumRange() {
        return maximumRange;
    }

    public void setMaximumRange(Float maximumRange) {
        this.maximumRange = maximumRange;
    }

    public String getReportingMode() {
        return reportingMode;
    }

    public void setReportingMode(String reportingMode) {
        this.reportingMode = reportingMode;
    }

    public Float getPowerInMilliAmperes() {
        return powerInMilliAmperes;
    }

    public void setPowerInMilliAmperes(Float powerInMilliAmperes) {
        this.powerInMilliAmperes = powerInMilliAmperes;
    }

    public Float getSensorResolution() {
        return sensorResolution;
    }

    public void setSensorResolution(Float sensorResolution) {
        this.sensorResolution = sensorResolution;
    }

    public String getSensorVendor() {
        return sensorVendor;
    }

    public void setSensorVendor(String sensorVendor) {
        this.sensorVendor = sensorVendor;
    }

    public Integer getSensorVersion() {
        return sensorVersion;
    }

    public void setSensorVersion(Integer sensorVersion) {
        this.sensorVersion = sensorVersion;
    }

    // KEEP METHODS - put your custom methods here

    /**
     * {@inheritDoc}
     * NOTE: This implementation compares the two elements comparing its sensor name.
     */
    @Override
    public int compareTo(@NonNull final SensorEntity anotherSensorEntity) {
        return this.sensorName.compareTo(anotherSensorEntity.getSensorName());
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public JsonObject toJsonObject() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add(SensorName.name, new JsonPrimitive(this.sensorName));
        jsonObject.add(SensorType.name, new JsonPrimitive(this.sensorType));
        jsonObject.add(SensorUnit.name, new JsonPrimitive(this.sensorUnit));
        jsonObject.add(SensorAddress.name,
                (this.sensorAddress == null) ?
                        null : new JsonPrimitive(this.sensorAddress));
        jsonObject.add(MinimumDelayMicroseconds.name,
                (this.minimumDelayMicroseconds == null) ?
                        null : new JsonPrimitive(this.minimumDelayMicroseconds));
        jsonObject.add(MaximumDelayMicroseconds.name,
                (this.maximumDelayMicroseconds == null) ?
                        null : new JsonPrimitive(this.maximumDelayMicroseconds));
        jsonObject.add(FifoMaxEventCount.name,
                (this.fifoMaxEventCount == null) ?
                        null : new JsonPrimitive(this.fifoMaxEventCount));
        jsonObject.add(FifoReservedEventCount.name,
                (this.fifoReservedEventCount == null) ?
                        null : new JsonPrimitive(this.fifoReservedEventCount));
        jsonObject.add(MaximumRange.name,
                (this.maximumRange == null) ?
                        null : new JsonPrimitive(this.maximumRange));
        jsonObject.add(ReportingMode.name,
                (this.reportingMode == null) ?
                        null : new JsonPrimitive(this.reportingMode));
        jsonObject.add(PowerInMilliAmperes.name,
                (this.powerInMilliAmperes == null) ?
                        null : new JsonPrimitive(this.powerInMilliAmperes));
        jsonObject.add(SensorResolution.name,
                (this.sensorResolution == null) ?
                        null : new JsonPrimitive(this.sensorResolution));
        jsonObject.add(SensorVendor.name,
                (this.sensorVendor == null) ?
                        null : new JsonPrimitive(this.sensorVendor));
        jsonObject.add(SensorVersion.name,
                (this.sensorVersion == null) ?
                        null : new JsonPrimitive(this.sensorVersion));
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
