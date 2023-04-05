package com.aaronwells.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGO = {
                new BucketListEntry("Amazon ", "also called Amazon jungle or Amazonia, is a moist broadleaf tropical rainforest in the Amazon biome that covers most of the Amazon basin of South America", R.drawable.amazon, 4.5f),
                new BucketListEntry("Japan", "Japan is known for everything from onsen hot springs and kabuki baths, to all-night neon-lit dance parties, anime, and sushi boat restaurants, all of which are decidedly more modern.", R.drawable.japan, 5),
                new BucketListEntry("Kerala", "Kerala is the 21st largest Indian state by area. It is bordered by Karnataka to the north and northeast", R.drawable.kerala, 1.5f),
                new BucketListEntry("Vietnam", "Spectacular nature. Exceptional cuisine. Cultural diversity. Excellent service. Vietnam has fully reopened for international tourism", R.drawable.vietnam, 2),
                new BucketListEntry("Iceland", "Iceland is a Nordic island country in the North Atlantic Ocean and in the Arctic Ocean. Iceland is the most sparsely populated country in Europe.", R.drawable.iceland, 3.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGO);
        recyclerView.setAdapter(adapter);
    }
}