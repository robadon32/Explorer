package com.example.robad.explorer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class HotelFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.hotel_1), R.drawable.bed,
                getString(R.string.affinia_hotel)));
        places.add(new Place(getString(R.string.hotel_2), R.drawable.bed,
                getString(R.string.yotel)));
        places.add(new Place(getString(R.string.hotel_3), R.drawable.bed,
                getString(R.string.empire_hotel)));
        places.add(new Place(getString(R.string.hotel_4), R.drawable.bed,
                getString(R.string.beacon_hotel)));
        places.add(new Place(getString(R.string.hotel_5), R.drawable.bed,
                getString(R.string.marquee_hotel)));
        places.add(new Place(getString(R.string.hotel_6), R.drawable.bed,
                getString(R.string.the_manhattan)));
        places.add(new Place(getString(R.string.hotel_7), R.drawable.bed,
                getString(R.string.the_standard)));
        places.add(new Place(getString(R.string.hotel_8), R.drawable.bed,
                getString(R.string.sofitel)));
        places.add(new Place(getString(R.string.hotel_9), R.drawable.bed,
                getString(R.string.casablanca_hotel)));
        places.add(new Place(getString(R.string.hotel_10), R.drawable.bed,
                getString(R.string.the_refinery_hotel)));
        places.add(new Place(getString(R.string.hotel_11), R.drawable.bed,
                getString(R.string.the_browery_hotel)));
        places.add(new Place(getString(R.string.hotel_12), R.drawable.bed,
                getString(R.string.the_greenwich_hotel)));
        places.add(new Place(getString(R.string.hotel_13), R.drawable.bed,
                getString(R.string.the_plaza_hotel)));
        places.add(new Place(getString(R.string.hotel_14), R.drawable.bed,
                getString(R.string.the_w_hotel)));
//
//        // Find the ListView in the list xml with the id list_view.
//        final ListView listView = rootView.findViewById(R.id.list_view);
//
//        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
//        // adapter knows how to create list items for each item in the list.
//        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
//        listView.setAdapter(adapter);
//
//        // Set a click listener to open the list items URL
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            // Get location of current place
//            Place currentItem = places.get(position);
//            // Start a new intent that will open the URL when item is clicked
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            // Get the location URL and set the data on the intent
//            intent.setData(Uri.parse(currentItem.getmLocationUrl()));
//            //Start the intent
//            startActivity(intent);
//            }
//        });
        return rootView;
    }

}
