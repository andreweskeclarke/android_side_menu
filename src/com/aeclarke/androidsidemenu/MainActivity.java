package com.aeclarke.androidsidemenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends SideMenuActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inflateSideMenu();
        View navigationDrawerButton = findViewById(R.id.navigation_drawer_button);
        navigationDrawerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NavigationDrawerActivity.class);
                startActivity(intent);
            }
        });
    }
}
