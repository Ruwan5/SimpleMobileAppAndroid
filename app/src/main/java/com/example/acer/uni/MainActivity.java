package com.example.acer.uni;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 =  findViewById(R.id.TextView1);
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                serve(view);
            }

            public void serve(View view) {
                Intent i=new Intent();
                Intent intent = i.setClass(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }

        });


        textView1 = findViewById(R.id.TextView2);
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                serve(view);
            }

            public void serve(View view) {
                Intent i=new Intent();
                Intent intent = i.setClass(getApplicationContext(), calender.class);
                startActivity(i);
            }

        });


        textView1 = findViewById(R.id.TextView3);
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                serve(view);
            }

            public void serve(View view) {
                Intent i=new Intent();
                Intent intent = i.setClass(getApplicationContext(), timetable.class);
                startActivity(i);
            }

        });

        textView1 = findViewById(R.id.TextView4);
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ugvle.ucsc.cmb.ac.lk/"));
                startActivity(intent);

            }


        });


        textView1 = findViewById(R.id.TextView5);
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ucscresult.club/#!/profile/17001161"));
                startActivity(intent);

            }


        });


        textView1 = findViewById(R.id.TextView6);
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=175"));
                startActivity(intent);

            }


        });


    }


}




