package edu.tamu.storyteller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Shantanu on 4/1/2016.
 */
public class StorySelectionActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_selection);
    }

    public void showAntStory(View v) {
        Intent intent = new Intent(StorySelectionActivity.this, AntDoveStoryActivity.class);
        StorySelectionActivity.this.startActivity(intent);
    }

    public void showPigStory(View v) {
        Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
    }
}
