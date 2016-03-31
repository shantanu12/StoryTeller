package edu.tamu.storyteller;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Shantanu on 3/31/2016.
 */
public class SplashActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }

    protected void onResume() {
        super.onResume();
        String className = "";
        SharedPreferences appPrefs = getSharedPreferences(getString(R.string.app_prefs), MODE_PRIVATE);
        if (appPrefs.getString(getString(R.string.user_name), "").equals("") || appPrefs.getString(getString(R.string.user_age), "").equals("")) {
            className = "Signup";
        } else {
            className = "Login";
        }
        IntentLauncher launcher = new IntentLauncher(className);
        launcher.start();
    }

    private class IntentLauncher extends Thread {
        private String className;

        public IntentLauncher(String className) {
            this.className = className;
        }

        public void run() {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
            }
            if (this.className.equals("Signup")) {
                Intent intent = new Intent(SplashActivity.this, Signup.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            } else {
                Intent intent = new Intent(SplashActivity.this, Login.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }
    }
}
