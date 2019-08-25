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
public class LandmarkFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.landmark_1), R.drawable.statue_of_liberty_1,
                getString(R.string.statue_of_liberty),R.drawable.statue_liberty));
        places.add(new Place(getString(R.string.landmark_2), R.drawable.statue_of_liberty_1,
                getString(R.string.brooklyn_bridge),R.drawable.brooklyn_bridge));
        places.add(new Place(getString(R.string.landmark_3), R.drawable.statue_of_liberty_1,
                getString(R.string.central_park),R.drawable.central_park));
        places.add(new Place(getString(R.string.landmark_4), R.drawable.statue_of_liberty_1,
                getString(R.string.chrysler_building),R.drawable.chrysler_building));
        places.add(new Place(getString(R.string.landmark_5), R.drawable.statue_of_liberty_1,
                getString(R.string.empire_state_building),R.drawable.empire_state_building));
        places.add(new Place(getString(R.string.landmark_6), R.drawable.statue_of_liberty_1,
                getString(R.string.flat_iron_building),R.drawable.flat_iron_building));
        places.add(new Place(getString(R.string.landmark_7), R.drawable.statue_of_liberty_1,
                getString(R.string.grand_central_station),R.drawable.grand_central_station_des));
        places.add(new Place(getString(R.string.landmark_8), R.drawable.statue_of_liberty_1,
                getString(R.string.madison_squre_garden),R.drawable.madison_square_garden_des));
        places.add(new Place(getString(R.string.landmark_9), R.drawable.statue_of_liberty_1,
                getString(R.string.one_world_trade),R.drawable.one_world_trade));
        places.add(new Place(getString(R.string.landmark_10), R.drawable.statue_of_liberty_1,
                getString(R.string.charging_bull),R.drawable.wall_street_bull));

        // Find the ListView in the list xml with the id list_view.
        RecyclerView recyclerView = rootView.findViewById(R.id.list_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        RecyclerView.Adapter mAdapter = new PlaceAdapter(getActivity(),places);
        assert recyclerView != null;
        recyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
