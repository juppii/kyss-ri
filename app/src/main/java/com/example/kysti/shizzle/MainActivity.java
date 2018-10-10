package com.example.kysti.shizzle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton myImageButton;
    MediaPlayer bkgrdmsc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bkgrdmsc = MediaPlayer.create(this, R.raw.hahaa);
        bkgrdmsc.setLooping(true);
        bkgrdmsc.start();

        myImageButton = (ImageButton) findViewById(R.id.my_image_button);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, pelaa.class);
                startActivity(intentLoadNewActivity);
            }
        });





        myImageButton = (ImageButton) findViewById(R.id.my_image_button2);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });




    }
}
