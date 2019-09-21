package com.example.acer.uni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Main2Activity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=9";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=13";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=10";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=227";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=230";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=231";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=232";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        button = (Button)findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://ugvle.ucsc.cmb.ac.lk/course/view.php?id=11";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }


}
