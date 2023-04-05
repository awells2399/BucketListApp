package com.aaronwells.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        setupList();
    }

    private void setupList() {

        BucketListEntry[] thingsToDO = {
                new BucketListEntry("Climb a Mountain", "Some super long description about climbing a cliff", R.drawable.kilimanjaro, 3),
                new BucketListEntry("Jump out of a Plane", "Jump out of a moving plane or do the indoor skydiving", R.drawable.skydive, 5),
                new BucketListEntry("Scubba", "Go see the fish at the bottom of the sea", R.drawable.scubadive, 3.5f),
                new BucketListEntry("Road trip", "Pick a starting and ending place and get to driving", R.drawable.road_trip, 2),
                new BucketListEntry("See the Lights", "Go see the Northern Lights", R.drawable.northern_lights, 3.5f),
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDO);
        recyclerView.setAdapter(adapter);

    }
}