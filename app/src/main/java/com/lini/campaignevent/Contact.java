package com.lini.campaignevent;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity{
    ImageView myImage1, myImage2, myImage3;
    TextView myText1, myText2, myText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        myImage1 = findViewById(R.id.contact);
        myImage2 = findViewById(R.id.chat);
        myImage3 = findViewById(R.id.about);
        myText1 = findViewById(R.id.multiLine1);
        myText2= findViewById(R.id.multiLine2);
        myText3 = findViewById(R.id.multiLine3);

        myImage1.setBackgroundResource(R.color.green);
        myImage1.setColorFilter(Color.WHITE);
        myText2.setVisibility(View.GONE);
        myText3.setVisibility(View.GONE);

        View.OnClickListener myListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImage1.setColorFilter(getResources().getColor(R.color.white));
                myImage2.setColorFilter(getResources().getColor(R.color.green));
                myImage3.setColorFilter(getResources().getColor(R.color.green));

                myImage1.setBackgroundResource(R.color.green);
                myImage2.setBackgroundResource(R.color.white);
                myImage3.setBackgroundResource(R.color.white);

                myText1.setVisibility(View.VISIBLE);
                myText2.setVisibility(View.GONE);
                myText3.setVisibility(View.GONE);

            }
        };
        myImage1.setOnClickListener(myListener1);

        View.OnClickListener myListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImage2.setColorFilter(getResources().getColor(R.color.white));
                myImage1.setColorFilter(getResources().getColor(R.color.green));
                myImage3.setColorFilter(getResources().getColor(R.color.green));

                myImage1.setBackgroundResource(R.color.white);
                myImage2.setBackgroundResource(R.color.green);
                myImage3.setBackgroundResource(R.color.white);

                myText2.setVisibility(View.VISIBLE);
                myText1.setVisibility(View.GONE);
                myText3.setVisibility(View.GONE);
            }
        };
        myImage2.setOnClickListener(myListener2);

        View.OnClickListener myListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImage3.setColorFilter(getResources().getColor(R.color.white));
                myImage1.setColorFilter(getResources().getColor(R.color.green));
                myImage2.setColorFilter(getResources().getColor(R.color.green));

                myImage3.setBackgroundResource(R.color.green);
                myImage2.setBackgroundResource(R.color.white);
                myImage1.setBackgroundResource(R.color.white);

                myText2.setVisibility(View.GONE);
                myText1.setVisibility(View.GONE);
                myText3.setVisibility(View.VISIBLE);
            }
        };
        myImage3.setOnClickListener(myListener3);
    }
}
