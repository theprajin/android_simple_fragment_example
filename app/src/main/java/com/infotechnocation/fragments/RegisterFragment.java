package com.infotechnocation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Prajin Bajracharya on 11/27/2016.
 */

public class RegisterFragment extends Fragment {
    EditText mUserName;
    EditText mEmail;
    EditText mPwd;
    Button btnRegister;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.register_fragment,parent,false);

        mUserName = (EditText)view.findViewById(R.id.reg_username);
        mEmail = (EditText)view.findViewById(R.id.reg_email);
        mPwd = (EditText)view.findViewById(R.id.reg_pwd);
        btnRegister = (Button)view.findViewById(R.id.reg_btn);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
