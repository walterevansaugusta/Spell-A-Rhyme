package com.example.jda8301.spellarhyme;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class Unit2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2);

        // Change Action Bar Title
        View actionBar = findViewById(R.id.actionBar);
        TextView actionBarTitle = actionBar.findViewById(R.id.actionBarTitle);
        actionBarTitle.setText("UNIT 2");
    }

}
