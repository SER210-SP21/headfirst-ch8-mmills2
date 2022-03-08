package edu.quinnipiac.ser210.bitsandpizzas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;
import android.app.ActionBar;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}