package com.aeclarke.androidsidemenu;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.*;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class SideMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void inflateSideMenu() {
        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setBehindOffsetRes(R.dimen.shadow_offset);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.side_menu);

        ListView menuList = (ListView) findViewById(R.id.menu);
        ListAdapter adapter;
        String[] options = {"Option 1", "Option 2"};
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, options);
        menuList.setAdapter(adapter);

        menuList.setOnItemClickListener(onItemClickListener);
    }

    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String optionName = ((TextView) view).getText().toString();

            Intent intent = new Intent(getApplicationContext(), TextActivity.class);
            intent.putExtra("optionName", optionName);
            startActivity(intent);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_settings, menu);
        inflater.inflate(R.menu.action_bar_example, menu);
        return true;
    }
}
