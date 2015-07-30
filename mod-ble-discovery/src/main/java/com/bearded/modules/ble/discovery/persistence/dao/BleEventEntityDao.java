package com.bearded.modules.ble.discovery.persistence.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.bearded.modules.ble.discovery.domain.BleEventEntity;
import com.bearded.modules.ble.discovery.domain.BleEventSeriesEntity;
import com.bearded.modules.ble.discovery.domain.LocationEntity;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.internal.SqlUtils;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table BleEvent.
 */
public class BleEventEntityDao extends AbstractDao<BleEventEntity, Long> {

    public static final String TABLENAME = "BleEvent";
    private DaoSession daoSession;

    ;
    private String selectDeep;


    public BleEventEntityDao(DaoConfig config) {
        super(config);
    }

    public BleEventEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'BleEvent' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'EVENT_SERIES_ID' INTEGER NOT NULL ," + // 1: eventSeriesId
                "'LOCATION_ID' INTEGER," + // 2: location_id
                "'START_TIMESTAMP' TEXT NOT NULL ," + // 3: startTimestamp
                "'END_TIMESTAMP' TEXT NOT NULL ," + // 4: endTimestamp
                "'MEDIAN_RECEIVED_SIGNAL_STRENGTH' INTEGER NOT NULL ," + // 5: medianReceivedSignalStrength
                "'BIN_SIZE' INTEGER NOT NULL );"); // 6: binSize
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'BleEvent'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, BleEventEntity entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getEventSeriesId());

        Long location_id = entity.getLocation_id();
        if (location_id != null) {
            stmt.bindLong(3, location_id);
        }
        stmt.bindString(4, entity.getStartTimestamp());
        stmt.bindString(5, entity.getEndTimestamp());
        stmt.bindLong(6, entity.getMedianReceivedSignalStrength());
        stmt.bindLong(7, entity.getBinSize());
    }

    @Override
    protected void attachEntity(BleEventEntity entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public BleEventEntity readEntity(Cursor cursor, int offset) {
        BleEventEntity entity = new BleEventEntity( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getLong(offset + 1), // eventSeriesId
                cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // location_id
                cursor.getString(offset + 3), // startTimestamp
                cursor.getString(offset + 4), // endTimestamp
                (byte) cursor.getShort(offset + 5), // medianReceivedSignalStrength
                cursor.getShort(offset + 6) // binSize
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, BleEventEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEventSeriesId(cursor.getLong(offset + 1));
        entity.setLocation_id(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setStartTimestamp(cursor.getString(offset + 3));
        entity.setEndTimestamp(cursor.getString(offset + 4));
        entity.setMedianReceivedSignalStrength((byte) cursor.getShort(offset + 5));
        entity.setBinSize(cursor.getShort(offset + 6));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(BleEventEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(BleEventEntity entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getBleEventSeriesEntityDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getLocationEntityDao().getAllColumns());
            builder.append(" FROM BleEvent T");
            builder.append(" LEFT JOIN BleEventSeries T0 ON T.'EVENT_SERIES_ID'=T0.'_id'");
            builder.append(" LEFT JOIN Location T1 ON T.'LOCATION_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }

    protected BleEventEntity loadCurrentDeep(Cursor cursor, boolean lock) {
        BleEventEntity entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        BleEventSeriesEntity bleEventSeriesEntity = loadCurrentOther(daoSession.getBleEventSeriesEntityDao(), cursor, offset);
        if (bleEventSeriesEntity != null) {
            entity.setBleEventSeriesEntity(bleEventSeriesEntity);
        }
        offset += daoSession.getBleEventSeriesEntityDao().getAllColumns().length;

        LocationEntity locationEntity = loadCurrentOther(daoSession.getLocationEntityDao(), cursor, offset);
        entity.setLocationEntity(locationEntity);

        return entity;
    }

    public BleEventEntity loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();

        String[] keyArray = new String[]{key.toString()};
        Cursor cursor = db.rawQuery(sql, keyArray);

        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }

    /**
     * Reads all available rows from the given cursor and returns a list of new ImageTO objects.
     */
    public List<BleEventEntity> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<BleEventEntity> list = new ArrayList<BleEventEntity>(count);

        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }

    protected List<BleEventEntity> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /**
     * A raw-style query where you can pass any WHERE clause and arguments.
     */
    public List<BleEventEntity> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }

    /**
     * Properties of entity BleEventEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property EventSeriesId = new Property(1, long.class, "eventSeriesId", false, "EVENT_SERIES_ID");
        public final static Property Location_id = new Property(2, Long.class, "location_id", false, "LOCATION_ID");
        public final static Property StartTimestamp = new Property(3, String.class, "startTimestamp", false, "START_TIMESTAMP");
        public final static Property EndTimestamp = new Property(4, String.class, "endTimestamp", false, "END_TIMESTAMP");
        public final static Property MedianReceivedSignalStrength = new Property(5, byte.class, "medianReceivedSignalStrength", false, "MEDIAN_RECEIVED_SIGNAL_STRENGTH");
        public final static Property BinSize = new Property(6, short.class, "binSize", false, "BIN_SIZE");
    }

}
