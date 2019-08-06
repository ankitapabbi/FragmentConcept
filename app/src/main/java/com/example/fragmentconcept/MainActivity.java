package com.example.fragmentconcept;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements RedFragment.OnFragmentInteractionListener , GreenFragment.OnFragmentInteractionListener , BlueFragment.OnFragmentInteractionListener, View.OnClickListener {

    Button btnRed,btnGreen,btnBlue;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRed = (Button)findViewById(R.id.btnRed);
        btnGreen = (Button)findViewById(R.id.btnGreen);
        btnBlue = (Button)findViewById(R.id.btnBlue);


//        mFragmentManager = getSupportFragmentManager();
//        RedFragment mRedFragment = new RedFragment();
//        mFragmentTransaction = mFragmentManager.beginTransaction();
//        mFragmentTransaction.add(R.id.fragment1, mRedFragment);
//        mFragmentTransaction.commit();
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);

    }

    @Override
    public void onSetTitle(String title) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnRed:
                mFragmentManager = getSupportFragmentManager();
                RedFragment mRedFragment = new RedFragment();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.content, mRedFragment);
                mFragmentTransaction.commit();
                break;

            case R.id.btnGreen:
                mFragmentManager = getSupportFragmentManager();
                GreenFragment mGreenFragment = new GreenFragment();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.content, mGreenFragment);
                mFragmentTransaction.commit();
                break;

            case R.id.btnBlue:
                mFragmentManager = getSupportFragmentManager();
                BlueFragment mBlueFragment = new BlueFragment();
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.content, mBlueFragment);
                mFragmentTransaction.commit();
                break;
        }

    }
}
