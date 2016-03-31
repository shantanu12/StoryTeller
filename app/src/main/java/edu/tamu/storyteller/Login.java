package edu.tamu.storyteller;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;


public class Login extends Activity {
    TextView mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mUserName = (TextView) this.findViewById(R.id.welcomeTextName);
    }

    protected void onResume() {
        super.onResume();
        SharedPreferences appPrefs = getSharedPreferences(getString(R.string.app_prefs), MODE_PRIVATE);
        String userName = appPrefs.getString(getString(R.string.user_name), "");
        mUserName.setText(userName);
    }
}
