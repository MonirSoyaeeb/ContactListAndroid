package com.example.contactlistandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView Detsname;
    private TextView Detsphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Detsname = findViewById(R.id.name);
        Detsphone = findViewById(R.id.phone);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            String name = bundle.getString("name");
            String phone = bundle.getString("phone");

            Detsname.setText(name);
            Detsphone.setText(phone);
        }



    }
}