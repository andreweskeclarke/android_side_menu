package com.aeclarke.androidsidemenu;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_activity);
        String optionName = (String) getIntent().getStringExtra("optionName");
        ((TextView) findViewById(R.id.text_view_activity_text)).setText(optionName);

    }
}
