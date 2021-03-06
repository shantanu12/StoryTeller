package edu.tamu.storyteller;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Shantanu on 3/31/2016.
 */
public class SignupActivity extends Activity {
    private EditText mEditTextName;
    private EditText mEditTextAge;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mEditTextName = (EditText) this.findViewById(R.id.name);
        mEditTextAge = (EditText) this.findViewById(R.id.age);
    }

    public void saveDetails(View v) {
        String name = mEditTextName.getText().toString();
        String age = mEditTextAge.getText().toString();
        SharedPreferences appPrefs = getSharedPreferences(getString(R.string.app_prefs), MODE_PRIVATE);
        SharedPreferences.Editor editor = appPrefs.edit();
        editor.putString(getString(R.string.user_name), name);
        editor.putString(getString(R.string.user_age), age);
        editor.commit();
        Intent intent = new Intent(SignupActivity.this, StorySelectionActivity.class);
        SignupActivity.this.startActivity(intent);
        SignupActivity.this.finish();
    }
}
