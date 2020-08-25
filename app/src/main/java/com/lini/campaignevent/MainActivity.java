package com.lini.campaignevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.tes);
        mImageView = findViewById(R.id.profile_image);

        //mImageView.setColorFilter(getResources().getColor(R.color.green));

    }

    public void tester(View view){
        Intent mIntent = new Intent(MainActivity.this, Contact.class);
        startActivity(mIntent);
    }
}
