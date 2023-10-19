package com.lokesh.roomlibrary;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DataEntityDao {
    @Insert
    void insert(DataEntity item);

    @Update
    void update(DataEntity item);

    @Delete
    void delete(DataEntity item);

    @Query("SELECT * FROM shopping_list ")
    List<DataEntity> getAllItem();
}
