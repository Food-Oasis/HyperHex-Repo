package com.foodtracker.foodoasis;

import android.content.Context;
import android.location.Location;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import android.content.Context;
import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


//This java file needs to be worked on

    public class LocationListAdapter extends RecyclerView.Adapter<LocationListAdapter.LocationViewHolder> {

        private ArrayList<Location> mLocations = new ArrayList<>();
        private Context mContext;

        public LocationListAdapter(Context context, ArrayList<Location> locations) {
            mContext = context;
            mLocations = locations;
        }

        @NonNull
        @Override
        public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class LocationViewHolder extends RecyclerView.ViewHolder {
            public LocationViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

    }
