package com.subhash.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    private NavigationMenu navigationMenu;

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = new Bundle();

        toolbar = getSupportActionBar();

        toolbar.setTitle("Google");

        Fragment fragment=new BlankFragment();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        bundle.putString("edt","http://www.google.com");
        fragment.setArguments(bundle);
        transaction.replace(R.id.fragmentss,fragment);
        transaction.commit();

        bottomNavigationView=findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectListener);


    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectListener = new BottomNavigationView.OnNavigationItemSelectedListener() {



        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment=new BlankFragment();
            FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

            Bundle bundle = new Bundle();

            switch (menuItem.getItemId())
            {
                case R.id.navi_google:
                    toolbar.setTitle("Google");
                    bundle.putString("edt","http://www.google.com");
                    fragment.setArguments(bundle);
                    transaction.replace(R.id.fragmentss,fragment);
                    transaction.commit();
                    return true;
                case R.id.navi_face:
                    toolbar.setTitle("Facebook");
                    bundle.putString("edt","http://www.facebook.com");
                    fragment.setArguments(bundle);
                    transaction.replace(R.id.fragmentss,fragment);
                    transaction.commit();
                    return true;
                case R.id.navi_android:
                    toolbar.setTitle("Android");
                    bundle.putString("edt","http://www.android.com");
                    fragment.setArguments(bundle);
                    transaction.replace(R.id.fragmentss,fragment);
                    transaction.commit();
                    return true;
                case R.id.navi_gmail:
                    toolbar.setTitle("Gmail");
                    bundle.putString("edt","http://www.gmail.com");
                    fragment.setArguments(bundle);
                    transaction.replace(R.id.fragmentss,fragment);
                    transaction.commit();
                    return true;

            }



            return false;
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }






}
