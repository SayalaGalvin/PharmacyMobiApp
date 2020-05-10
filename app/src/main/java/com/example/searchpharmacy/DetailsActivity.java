package com.example.searchpharmacy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    TextView fullname;
    String PharmacyName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        fullname = findViewById(R.id.full_name);
        PharmacyName= getIntent().getStringExtra("full_name");
        fullname.setText(PharmacyName);
    }
}
