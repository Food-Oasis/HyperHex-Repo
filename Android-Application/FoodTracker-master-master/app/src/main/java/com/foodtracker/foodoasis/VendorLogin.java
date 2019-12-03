package com.foodtracker.foodoasis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;

public class VendorLogin extends AppCompatActivity {

    public static PreConfig prefConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_login);

        prefConfig = new PreConfig(this);

        //setting up back button (causing crashes right now for some reason)
        //ActionBar actionBar = getActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }
            if(prefConfig.readLoginStatus()){
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new VendorWelcome()).commit();
            } else {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new VendorLoginPage()).commit();
            }
        }

    }

/*    @Override
    public void performRegister(){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VendorRegistration()).addToBackStack(null).commit();
    }

    @Override
    public void performBtnLogin(){
        prefConfig.writeLoginStatus(false);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VendorLoginPage()).commit();
    }

    @Override
    public void performBtnRegister(){
        prefConfig.writeLoginStatus(false);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VendorRegistration()).commit();
    }

    @Override
    public void performLogin(String name){
        prefConfig.writeName(name);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VendorWelcome()).commit();

    }

    @Override
    public void logoutPreformed(){
        prefConfig.writeLoginStatus(false);

        prefConfig.writeName("Vendor");

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VendorLoginPage()).commit();
    } */
}
