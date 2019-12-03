package com.foodtracker.foodoasis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class VendorRegistration extends Fragment {
    private EditText businessName, Email, Password, PhoNum, Add;
    private Button Register1, Register2;

    OnRegistrationActivityListener registrationActivityListener;

    public interface OnRegistrationActivityListener{
        public void performBtnLogin();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vendor_registration, container, false);
        businessName = view.findViewById(R.id.txtName);
        Email = view.findViewById(R.id.txtEmail);
        Password = view.findViewById(R.id.txtPwd);
        PhoNum = view.findViewById(R.id.txtPhoNum);
        Add = view.findViewById(R.id.txtAdd);
        Register1 = view.findViewById(R.id.btn_Register);
        Register2 = view.findViewById(R.id.btn_Register2);

        Register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is where the function for registering the vendor will go
            }
        });

        Register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function that will return the user to the login page
            }
        });
        return view;
    }

 /*   @Override
    public void OnAttach(Context context){
        super.onAttach(context);
        Activity activity = (Activity) context;
        registrationActivityListener = (VendorRegistration.OnRegistrationActivityListener) activity;

    }
*/
}
