package com.lokesh.roomlibrary;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "shopping_list")
public class DataEntity  {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String item_name;
    @ColumnInfo(name = "price")
    private String item_price;

    @Ignore
    public DataEntity(String item_name, String item_price) {
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public DataEntity(int id, String item_name, String item_price){

        this.id = id;
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }
}


