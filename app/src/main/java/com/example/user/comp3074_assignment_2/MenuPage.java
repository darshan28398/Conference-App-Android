package com.example.user.comp3074_assignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class MenuPage extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        listView = (ListView) findViewById(R.id.lvMenu);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("General Schedule");
        arrayList.add("My Schedule");
        arrayList.add("Speakers");
        arrayList.add("Places of interest");
        arrayList.add("List of Attendees");
        arrayList.add("Sponsors");
        arrayList.add("Twitter");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent myIntent = new Intent(view.getContext(), GeneralSchedule.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);

                }
                if (position == 1)
                {
                    Intent myIntent = new Intent(view.getContext(), MySchedule.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                }
                if (position == 2)
                {
                    Intent myIntent = new Intent(view.getContext(), Speakers.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                }
                if (position == 3)
                {
                    Intent myIntent = new Intent(view.getContext(), Maps.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                }
                if (position == 4)
                {
                    Intent myIntent = new Intent(view.getContext(), Attendees.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                }
                if (position == 5)
                {
                    Intent myIntent = new Intent(view.getContext(), Sponsors.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                }
                if (position == 6)
                {
                    Intent myIntent = new Intent(view.getContext(), Twitter.class);
                    startActivityForResult(myIntent, 0);
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                }

            }
        });




    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
