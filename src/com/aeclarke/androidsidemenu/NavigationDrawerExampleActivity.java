package com.aeclarke.androidsidemenu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class NavigationDrawerExampleActivity extends ActionBarredActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        TextView contentTextView = (TextView) findViewById(R.id.navigation_drawer_text);
        String pageContent = getIntent().getStringExtra("optionName");
        pageContent = (pageContent == null) ? this.getString(R.string.navigation_drawer_text) : pageContent;
        contentTextView.setText(pageContent);

        Button returnToMainButton = (Button) findViewById(R.id.see_main_activity_button);
        returnToMainButton.setOnClickListener(mainButtonListener);
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

            Intent intent = new Intent(NavigationDrawerExampleActivity.this, NavigationDrawerExampleActivity.class);
            intent.putExtra("optionName", optionName);
            startActivity(intent);
        }
    };

    private View.OnClickListener mainButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(NavigationDrawerExampleActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };

}
