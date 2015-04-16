package com.bearded.modules.ble.discovery.domain;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS
// KEEP INCLUDES - put your custom includes here

import com.bearded.modules.ble.discovery.persistence.dao.BleDeviceEntityDao;
import com.bearded.modules.ble.discovery.persistence.dao.BleEventSeriesEntityDao;
import com.bearded.modules.ble.discovery.persistence.dao.DaoSession;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import org.jetbrains.annotations.NotNull;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

import static com.bearded.modules.ble.discovery.persistence.dao.BleEventSeriesEntityDao.Properties.EndTimestamp;
import static com.bearded.modules.ble.discovery.persistence.dao.BleEventSeriesEntityDao.Properties.StartTimestamp;
// KEEP INCLUDES END

/**
 * Entity mapped to table BleEventSeries.
 */
public class BleEventSeriesEntity implements com.bearded.common.database.ParseableJson, java.lang.Comparable<BleEventSeriesEntity> {

    private Long id;
    private Long bleDeviceId;
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
    private transient BleEventSeriesEntityDao myDao;

    private BleDeviceEntity bleDeviceEntity;
    private Long bleDeviceEntity__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public BleEventSeriesEntity() {
    }

    public BleEventSeriesEntity(Long id) {
        this.id = id;
    }

    public BleEventSeriesEntity(Long id, Long bleDeviceId, String startTimestamp, String endTimestamp) {
        this.id = id;
        this.bleDeviceId = bleDeviceId;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBleEventSeriesEntityDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBleDeviceId() {
        return bleDeviceId;
    }

    public void setBleDeviceId(Long bleDeviceId) {
        this.bleDeviceId = bleDeviceId;
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
    public BleDeviceEntity getBleDeviceEntity() {
        Long __key = this.bleDeviceId;
        if (bleDeviceEntity__resolvedKey == null || !bleDeviceEntity__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BleDeviceEntityDao targetDao = daoSession.getBleDeviceEntityDao();
            BleDeviceEntity bleDeviceEntityNew = targetDao.load(__key);
            synchronized (this) {
                bleDeviceEntity = bleDeviceEntityNew;
                bleDeviceEntity__resolvedKey = __key;
            }
        }
        return bleDeviceEntity;
    }

    public void setBleDeviceEntity(BleDeviceEntity bleDeviceEntity) {
        synchronized (this) {
            this.bleDeviceEntity = bleDeviceEntity;
            bleDeviceId = bleDeviceEntity == null ? null : bleDeviceEntity.getId();
            bleDeviceEntity__resolvedKey = bleDeviceId;
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
    public int compareTo(@NotNull final BleEventSeriesEntity anotherBleEvent) {
        return this.startTimestamp.compareTo(anotherBleEvent.startTimestamp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public JsonObject toJsonObject() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.add(StartTimestamp.name, new JsonPrimitive(startTimestamp));
        jsonObject.add(EndTimestamp.name, new JsonPrimitive(endTimestamp));
        return jsonObject;
    }
    // KEEP METHODS END

}
