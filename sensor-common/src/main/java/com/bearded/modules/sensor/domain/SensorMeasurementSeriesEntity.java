package com.bearded.modules.sensor.domain;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS
// KEEP INCLUDES - put your custom includes here

import android.support.annotation.NonNull;

import com.bearded.modules.sensor.persistence.dao.DaoSession;
import com.bearded.modules.sensor.persistence.dao.SensorEntityDao;
import com.bearded.modules.sensor.persistence.dao.SensorMeasurementSeriesEntityDao;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

import static com.bearded.modules.sensor.persistence.dao.SensorMeasurementSeriesEntityDao.Properties.EndTimestamp;
import static com.bearded.modules.sensor.persistence.dao.SensorMeasurementSeriesEntityDao.Properties.StartTimestamp;

// KEEP INCLUDES END

/**
 * Entity mapped to table SensorMeasurementSeries.
 */
public class SensorMeasurementSeriesEntity implements com.bearded.common.persistance.ParseableJson, java.lang.Comparable<SensorMeasurementSeriesEntity> {

    private Long id;
    private long sensor_id;
    /**
     * Not-null value.
     */
    private String startTimestamp;
    private String endTimestamp;

    /**
     * Used to resolve relations
     */
    private transient DaoSession daoSession;

    /**
     * Used for active entity operations.
     */
    private transient SensorMeasurementSeriesEntityDao myDao;

    private SensorEntity sensorEntity;
    private Long sensorEntity__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public SensorMeasurementSeriesEntity() {
    }

    public SensorMeasurementSeriesEntity(Long id) {
        this.id = id;
    }

    public SensorMeasurementSeriesEntity(Long id, long sensor_id, String startTimestamp, String endTimestamp) {
        this.id = id;
        this.sensor_id = sensor_id;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSensorMeasurementSeriesEntityDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(long sensor_id) {
        this.sensor_id = sensor_id;
    }

    /**
     * Not-null value.
     */
    public String getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public String getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public SensorEntity getSensorEntity() {
        long __key = this.sensor_id;
        if (sensorEntity__resolvedKey == null || !sensorEntity__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SensorEntityDao targetDao = daoSession.getSensorEntityDao();
            SensorEntity sensorEntityNew = targetDao.load(__key);
            synchronized (this) {
                sensorEntity = sensorEntityNew;
                sensorEntity__resolvedKey = __key;
            }
        }
        return sensorEntity;
    }

    public void setSensorEntity(SensorEntity sensorEntity) {
        if (sensorEntity == null) {
            throw new DaoException("To-one property 'sensor_id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.sensorEntity = sensorEntity;
            sensor_id = sensorEntity.getId();
            sensorEntity__resolvedKey = sensor_id;
        }
    }

    /**
     * Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context.
     */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context.
     */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context.
     */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here

    /**
     * {@inheritDoc}
     * NOTE: This implementation compares the two elements comparing its start timestamp.
     */
    @Override
    public int compareTo(@NonNull final SensorMeasurementSeriesEntity another) {
        return this.startTimestamp.compareTo(another.startTimestamp);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public JsonObject toJsonObject() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add(StartTimestamp.name, new JsonPrimitive(this.startTimestamp));
        jsonObject.add(EndTimestamp.name,
                (this.endTimestamp == null) ? null : new JsonPrimitive(this.endTimestamp));
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
