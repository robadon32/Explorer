package com.example.robad.explorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Bundle extras = getIntent().getExtras();

        assert extras != null;
        // Get image resource id that was passed from LandmarkFragment or RestaurantFragment Fragments
        int descriptionImage = extras.getInt("resourceId");

        // Get String resource id that was passed from LandmarkFragment or RestaurantFragment Fragments
        String descriptionText = extras.getString("descriptionText");

        // Find TextView in activity_description xml with the id description_text
        TextView textView = findViewById(R.id.description_text);
        // Set the descriptionText String on the description_text TextView
        textView.setText(descriptionText);

        // Find ImageView in activity_description xml with the id description_image
        ImageView imageView = findViewById(R.id.description_image);
        // Display the descriptionImage resource id on the description_image ImageView
        imageView.setImageResource(descriptionImage);
    }
}
