package com.aeclarke.androidsidemenu;

import android.os.Bundle;

public class MainActivity extends SideMenuActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inflateSideMenu();
    }
}
