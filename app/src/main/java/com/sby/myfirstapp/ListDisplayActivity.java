package com.sby.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListDisplayActivity extends AppCompatActivity {

    String []mobileArray = {"Android", "Iphone", "WindowsMobile", "Blackberry","WebOS","Ubuntu","Windows7","Max OS X"
    ,"Android2", "Iphone2", "WindowsMobile2", "Blackberry2","WebOS2","Ubunt2u","Windows72","Max OS X2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_display);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_listview, R.id.item_name, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
