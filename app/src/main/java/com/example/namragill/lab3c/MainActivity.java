package com.example.namragill.lab3c;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TextFragment textFragment = new TextFragment();
        fragmentTransaction.add(R.id.textFragment, textFragment);
        ListFragment listFragment = new ListFragment();
        fragmentTransaction.add(R.id.listFragment, listFragment);
        fragmentTransaction.commit();
    }
    public void setFragment(Fragment fragment, boolean backstack){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id., fragment);
        if (backstack){
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }
}
