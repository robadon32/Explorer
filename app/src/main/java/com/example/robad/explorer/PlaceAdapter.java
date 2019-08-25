package com.example.robad.explorer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {
    private ArrayList<Place> mDataset;
    private Context mContext;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;
        View parentView;

        ViewHolder(View v){
            super(v);
            this.parentView = v;
            this.mImageView = v.findViewById(R.id.item_image);
            this.mTextView = v.findViewById(R.id.item_text);
        }
    }
    PlaceAdapter(Context context, ArrayList<Place> myDataset) {
        mDataset = myDataset;
        mContext = context;
    }

    @NonNull
    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.ViewHolder holder, final int position) {
        final Place currentItem = mDataset.get(position);

        holder.mImageView.setImageResource(currentItem.getmLocationIconImage());
        holder.mTextView.setText(currentItem.getmLocationName());
        holder.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new intent that will start the DescriptionActivity when item is clicked
                Intent intent = new Intent(mContext,DescriptionActivity.class);
                // Get the location description text
                String description = currentItem.getmLocationDescription();
                // Get the location description image
                int image = currentItem.getmLocationImage();
                // Pass the location description text to the DescriptionActivity
                intent.putExtra("descriptionText", description);
                // Pass the location description image to the DescriptionActivity
                intent.putExtra("resourceId", image);
                mContext.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
