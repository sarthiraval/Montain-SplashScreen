package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation two;
    ImageView imageView,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.app_logo);
        img2 = findViewById(R.id.app_ogo);

        //bounce
        //anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.clock);
        two = AnimationUtils.loadAnimation(MainActivity.this, R.anim.infinate);

       // imageView.setAnimation(anim);
        img2.setAnimation(two);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, Second.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        }, 5000);
    }
}