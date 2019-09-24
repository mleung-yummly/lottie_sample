package com.example.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.airbnb.lottie.LottieAnimationView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieAnimationView = findViewById(R.id.thermometer_screen);
        lottieAnimationView.setImageAssetsFolder("images/");
    }
}
