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

public class LoginFragment extends Fragment {

    EditText mEmail;
    EditText mPwd;
    Button mBtnLogin;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment,parent,false);

        mEmail = (EditText)view.findViewById(R.id.mEmail);
        mPwd = (EditText)view.findViewById(R.id.mPwd);
        mBtnLogin = (Button)view.findViewById(R.id.mBtnLogin);

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
