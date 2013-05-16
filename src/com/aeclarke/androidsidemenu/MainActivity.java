package com.aeclarke.androidsidemenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends SideMenuActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inflateSideMenu();

        TextView mainTextContent = (TextView) findViewById(R.id.main_text_content);
        String mainText = getIntent().getStringExtra("optionName");
        mainText =  (mainText == null) ? this.getString(R.string.main_text) : mainText;
        mainTextContent.setText(mainText);

        Button navigationDrawerButton = (Button) findViewById(R.id.navigation_drawer_button);
        navigationDrawerButton.setOnClickListener(this.navigationDrawerButtonListener);
    }

    View.OnClickListener navigationDrawerButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, NavigationDrawerExampleActivity.class);
            startActivity(intent);
        }
    };

}
