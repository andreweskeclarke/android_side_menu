package com.aeclarke.androidsidemenu;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NavigationDrawerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        String[] options = {"Option 1", "Option 2"};
        ListView navigationDrawerList = (ListView) findViewById(R.id.left_drawer);

        navigationDrawerList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, options));

        navigationDrawerList.setOnItemClickListener(onItemClickListener);
    }

    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String optionName = ((TextView) view).getText().toString();

            Intent intent = new Intent(getApplicationContext(), NavigationDrawerTextActivity.class);
            intent.putExtra("optionName", optionName);
            startActivity(intent);
        }
    };

}
