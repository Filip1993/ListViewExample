package com.filipkesteli.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static String [] cities = {"London", "Paris", "Babina Greda"};
    private ListView lvCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListView();
    }

    private void initListView() {
        lvCities = (ListView) findViewById(R.id.lvCities);

//        ArrayAdapter<CharSequence> adapter =
//                ArrayAdapter.createFromResource(
//                        this,
//                        R.array.cities,
//                        android.R.layout.simple_list_item_1
//                );

        ArrayAdapter<CharSequence> adapter =
                new ArrayAdapter<CharSequence>(
                        this,
                        android.R.layout.simple_list_item_checked,
                        cities
        );

        lvCities.setAdapter(adapter);
    }
}
