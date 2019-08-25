package com.example.robad.explorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class FunFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.activity_1), R.drawable.tour_bus,
                getString(R.string.museum_of_modern_art),R.drawable.moma));
        places.add(new Place(getString(R.string.activity_2), R.drawable.tour_bus,
                getString(R.string.ripleys_believe_it_or_not),R.drawable.ripleys));
        places.add(new Place(getString(R.string.activity_3), R.drawable.tour_bus,
                getString(R.string.alladin),R.drawable.alladin));
        places.add(new Place(getString(R.string.activity_4), R.drawable.tour_bus,
                getString(R.string.the_lion_king),R.drawable.the_lion_king));
        places.add(new Place(getString(R.string.activity_5), R.drawable.tour_bus,
                getString(R.string.big_bus),R.drawable.bus_tour));
        places.add(new Place(getString(R.string.activity_6), R.drawable.tour_bus,
                getString(R.string.museum_of_natural_history),R.drawable.museum_of_natural_history));
        places.add(new Place(getString(R.string.activity_7), R.drawable.tour_bus,
                getString(R.string.times_square),R.drawable.time_square));
        places.add(new Place(getString(R.string.activity_8), R.drawable.tour_bus,
                getString(R.string.rocafeller_center),R.drawable.rocafeller_center));
        places.add(new Place(getString(R.string.activity_9), R.drawable.tour_bus,
                getString(R.string.brooklyn_bridge_park),R.drawable.walking_brooklyn_bridge));

        // Find the ListView in the list xml with the id list_view.
        RecyclerView mRecyclerView = rootView.findViewById(R.id.list_view);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        RecyclerView.Adapter mAdapter = new PlaceAdapter(getActivity(),places);
        assert mRecyclerView != null;
        mRecyclerView.setAdapter(mAdapter);
//
//        // Set a click listener to open DescriptionFragment to display the description text and image
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // Get location of current place
//                Place currentItem = places.get(position);
//                // Start a new intent that will start the DescriptionActivity when item is clicked
//                Intent intent = new Intent(getActivity(),DescriptionActivity.class);
//                // Get the location description text
//                String description = currentItem.getmLocationDescription();
//                // Get the location description image
//                int image = currentItem.getmLocationImage();
//                // Pass the location description text to the DescriptionActivity
//                intent.putExtra("descriptionText", description);
//                // Pass the location description image to the DescriptionActivity
//                intent.putExtra("resourceId", image);
//                // Start the DescriptionActivity
//                startActivity(intent);
//            }
//        });
        return rootView;
    }
}
