package me.hearty.app.heartyme;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by jeffcheng on 7/26/2017.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Start home activity
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        // close splash activity
        finish();
    }
}
