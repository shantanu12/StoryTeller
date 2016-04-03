package edu.tamu.storyteller;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class LoginActivity extends Activity {
    TextView mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserName = (TextView) this.findViewById(R.id.welcomeTextName);
    }

    protected void onResume() {
        super.onResume();
        SharedPreferences appPrefs = getSharedPreferences(getString(R.string.app_prefs), MODE_PRIVATE);
        String userName = appPrefs.getString(getString(R.string.user_name), "");
        mUserName.setText(userName);
        IntentLauncher launcher = new IntentLauncher();
        launcher.start();
    }

    private class IntentLauncher extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
            }
            Intent intent = new Intent(LoginActivity.this, StorySelectionActivity.class);
            LoginActivity.this.startActivity(intent);
            LoginActivity.this.finish();
        }
    }
}
