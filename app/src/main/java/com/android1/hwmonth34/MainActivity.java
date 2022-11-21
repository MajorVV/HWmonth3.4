package com.android1.hwmonth34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new Continents());
        }
    }

    public void onClick1(View view) {
     Eurasia eu = new Eurasia();
     FragmentTransaction eu1 = getSupportFragmentManager().beginTransaction();
     eu1.replace(R.id.container, eu);
     eu1.commit();
    }

    public void onClick2(View view) {
        Australia au = new Australia();
        FragmentTransaction au1 = getSupportFragmentManager().beginTransaction();
        au1.replace(R.id.container, au);
        au1.commit();
    }
    public void onClick3(View view) {
        NorthAmerica na = new NorthAmerica();
        FragmentTransaction na1 = getSupportFragmentManager().beginTransaction();
        na1.replace(R.id.container, na);
        na1.commit();
    }
    public void onClick4(View view) {
        SouthAmerica sa = new SouthAmerica();
        FragmentTransaction sa1 = getSupportFragmentManager().beginTransaction();
        sa1.replace(R.id.container, sa);
        sa1.commit();
    }
    public void onClick5(View view) {
        Africa af = new Africa();
        FragmentTransaction af1 = getSupportFragmentManager().beginTransaction();
        af1.replace(R.id.container, af);
        af1.commit();
    }
    public void onClick6(View view) {
        Antarctica an = new Antarctica();
        FragmentTransaction an1 = getSupportFragmentManager().beginTransaction();
        an1.replace(R.id.container, an);
        an1.commit();
    }
}