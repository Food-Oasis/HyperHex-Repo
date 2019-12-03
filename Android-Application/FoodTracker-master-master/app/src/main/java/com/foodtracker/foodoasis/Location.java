package com.foodtracker.foodoasis;

public class Location {

        private String vendorName, vendorType, vendorDistance;
        private int image, ratingBar;

        public Location() {
        }

        public Location(String vendorName, String vendorType, String vendorDistance, int image, int ratingBar) {
            this.vendorName = vendorName;
            this.vendorType = vendorType;
            this.vendorDistance = vendorDistance;
            this.image = image;
            this.ratingBar = ratingBar;
        }

        public String getVendorName() {
            return vendorName;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public String getVendorType() {
            return vendorType;
        }

        public void setVendorType(String vendorType) {
            this.vendorType = vendorType;
        }

        public String getVendorDistance() {
            return vendorDistance;
        }

        public void setVendorDistance(String vendorDistance) {
            this.vendorDistance = vendorDistance;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }


        public int getRatingBar() {
            return ratingBar;
        }

        public void setRatingBar(int ratingBar){
            this.ratingBar = ratingBar;
        }
    }

