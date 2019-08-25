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
public class RestaurantFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurant_1), R.drawable.cutlery,
                getString(R.string.del_frisco)));
        places.add(new Place(getString(R.string.restaurant_2), R.drawable.cutlery,
                getString(R.string.texas_de_brazil)));
        places.add(new Place(getString(R.string.restaurant_3), R.drawable.cutlery,
                getString(R.string.guadalupe)));
        places.add(new Place(getString(R.string.restaurant_4), R.drawable.cutlery,
                getString(R.string.guantanamera)));
        places.add(new Place(getString(R.string.restaurant_5), R.drawable.cutlery,
                getString(R.string.peter_luger)));
        places.add(new Place(getString(R.string.restaurant_6), R.drawable.cutlery,
                getString(R.string.burgers_lobsters)));
        places.add(new Place(getString(R.string.restaurant_7), R.drawable.cutlery,
                getString(R.string.angelos_pizza)));
        places.add(new Place(getString(R.string.restaurant_8), R.drawable.cutlery,
                getString(R.string.flor_de_mayo)));
        places.add(new Place(getString(R.string.restaurant_9), R.drawable.cutlery,
                getString(R.string.chirping_chicken)));
        places.add(new Place(getString(R.string.restaurant_10), R.drawable.cutlery,
                getString(R.string.spice)));
        places.add(new Place(getString(R.string.restaurant_11), R.drawable.cutlery,
                getString(R.string.carmines)));
        places.add(new Place(getString(R.string.restaurant_12), R.drawable.cutlery,
                getString(R.string.the_sea_fire_grill)));
        places.add(new Place(getString(R.string.restaurant_13), R.drawable.cutlery,
                getString(R.string.smith_wollensky)));
        places.add(new Place(getString(R.string.restaurant_14), R.drawable.cutlery,
                getString(R.string.lincoln_ristorante)));
        places.add(new Place(getString(R.string.restaurant_15), R.drawable.cutlery,
                getString(R.string.tavern_green)));
        places.add(new Place(getString(R.string.restaurant_16), R.drawable.cutlery,
                getString(R.string.rosa_mexicano)));

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
