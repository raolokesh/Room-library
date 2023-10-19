package com.lokesh.roomlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText item_name,item_price;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_submit = findViewById(R.id.btn_submit);
        item_name = findViewById(R.id.item_name);
        item_price = findViewById(R.id.item_price);
        DataBaseHelper dataBaseHelper = DataBaseHelper.getDB(this);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = item_name.getText().toString();
                String price = item_price.getText().toString();

                item_name.setText("");
                item_price.setText("");


                dataBaseHelper.dataEntityDao().insert(
                        new DataEntity(name,price));

                ArrayList<DataEntity> data = (ArrayList<DataEntity>) dataBaseHelper.dataEntityDao().getAllItem();

                for (int i = 0; i < data.size(); i++) {

                    Log.d("data model", "name:"+data.get(i).getItem_name()+"  price: "+data.get(i).getItem_price());

                }
            }

        });





    }
}