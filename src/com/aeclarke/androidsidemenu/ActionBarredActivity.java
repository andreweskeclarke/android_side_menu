package com.aeclarke.androidsidemenu;


import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;

public class ActionBarredActivity extends Activity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_settings, menu);
        inflater.inflate(R.menu.action_bar_example, menu);
        return true;
    }

}
