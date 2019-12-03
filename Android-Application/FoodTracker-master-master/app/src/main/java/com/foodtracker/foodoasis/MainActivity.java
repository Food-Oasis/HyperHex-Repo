package com.foodtracker.foodoasis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mSearchButton;
    private Button mVendorButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mSearchButton = (Button)findViewById(R.id.searchButton);
        mVendorButton = (Button)findViewById(R.id.vendorButton);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userClicked();
            }
        });

        mVendorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vendorClicked();
            }
        });

    }

    public void userClicked(){
        Intent intentUser = new Intent(this, VendorList.class);
        startActivity(intentUser);

    }

    public void vendorClicked(){
        Intent intentUser = new Intent(this, VendorLogin.class);
        startActivity(intentUser);

    }

}
