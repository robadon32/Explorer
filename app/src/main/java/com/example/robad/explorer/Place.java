package com.example.robad.explorer;

public class Place {
    /** String resource id for the Name, Description, and Url of the location*/
    private String mLocationDescription;
    private String mLocationName;
    private String mLocationUrl;

    /** Icon Image resource id for location*/
    private int mLocationIconImage;

    /** Image resource id for location description*/
    private int mLocationImage;

    /** Create a new word
     *
     * @param nameTextView String resource id for the location name
     * @param iconImageResource Image resource id for the location icon
     * @param descriptionTextView String resource id for the location description
     * @param imageResourceId Image resource id for location description
     */
    Place(String nameTextView, int iconImageResource, String descriptionTextView, int imageResourceId){
        mLocationName = nameTextView;
        mLocationIconImage = iconImageResource;
        mLocationImage = imageResourceId;
        mLocationDescription = descriptionTextView;
    }

    /** Create a new word
     *
     * @param nameTextView String resource id for the location name
     * @param iconImageResource Image resource id for the location icon
     * @param url String resource id for the locations URL
     */
    Place(String nameTextView, int iconImageResource, String url){
        mLocationName = nameTextView;
        mLocationIconImage = iconImageResource;
        mLocationUrl = url;
    }

    /** Get the location URL String*/
    public String getmLocationUrl() {
        return mLocationUrl;
    }

    /** Get the location name*/
    public String getmLocationName() {
        return mLocationName;
    }

    /** Get the location description Image*/
    public int getmLocationImage() {
        return mLocationImage;
    }

    /** Get the location description String*/
    public String getmLocationDescription() {
        return mLocationDescription;
    }

    /** Get the location icon Image*/
    public int getmLocationIconImage() {
        return mLocationIconImage;
    }
}
