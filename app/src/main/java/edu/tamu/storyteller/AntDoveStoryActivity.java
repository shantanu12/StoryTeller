package edu.tamu.storyteller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import java.util.List;
import java.util.Vector;

/**
 * Created by Shantanu on 4/2/2016.
 */
public class AntDoveStoryActivity extends FragmentActivity {
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    private List<Fragment> mFragments;

    private int mScore = 0;
    private int mQ1Tries = 0;
    private int mQ2Tries = 0;
    private int mQ3Tries = 0;
    private int mQ4Tries = 0;
    private int mQ5Tries = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);
        mPager = (ViewPager) findViewById(R.id.viewPager);
        mFragments = new Vector<>();
        set1();
    }

    private void set1() {
        mFragments.add(Fragment.instantiate(this, AntDoveTitleFragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveFrame1Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveQuestion1Fragment.class.getName()));
        mPagerAdapter = new PagerAdapter(super.getSupportFragmentManager(), mFragments);
        mPager.setAdapter(mPagerAdapter);
    }

    public void correct1(View v) {
        mScore++;
        mFragments.clear();
        mFragments.add(Fragment.instantiate(this, AntDoveCorrectFragment.class.getName()));
        set2();
    }

    public void wrong1(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ouch);
        mediaPlayer.start();
        mQ1Tries++;
        if (mQ1Tries == 1) {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveHint1Fragment.class.getName()));
            mFragments.add(Fragment.instantiate(this, AntDoveQuestion1Fragment.class.getName()));
            mPager.setAdapter(mPagerAdapter);
        } else {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveExplanation1Fragment.class.getName()));
            set2();
        }
    }

    private void set2() {
        mFragments.add(Fragment.instantiate(this, AntDoveFrame2Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveFrame3Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveFrame4Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveQuestion2Fragment.class.getName()));
        mPager.setAdapter(mPagerAdapter);
    }

    public void correct2(View v) {
        mScore++;
        mFragments.clear();
        mFragments.add(Fragment.instantiate(this, AntDoveCorrectFragment.class.getName()));
        set3();
    }

    public void wrong2(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ouch);
        mediaPlayer.start();
        mQ2Tries++;
        if (mQ2Tries == 1) {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveHint2Fragment.class.getName()));
            mFragments.add(Fragment.instantiate(this, AntDoveQuestion2Fragment.class.getName()));
            mPager.setAdapter(mPagerAdapter);
        } else {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveExplanation2Fragment.class.getName()));
            set3();
        }
    }

    private void set3() {
        mFragments.add(Fragment.instantiate(this, AntDoveFrame5Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveQuestion3Fragment.class.getName()));
        mPager.setAdapter(mPagerAdapter);
    }

    public void correct3(View v) {
        mScore++;
        mFragments.clear();
        mFragments.add(Fragment.instantiate(this, AntDoveCorrectFragment.class.getName()));
        set4();
    }

    public void wrong3(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ouch);
        mediaPlayer.start();
        mQ3Tries++;
        if (mQ3Tries == 1) {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveHint3Fragment.class.getName()));
            mFragments.add(Fragment.instantiate(this, AntDoveQuestion3Fragment.class.getName()));
            mPager.setAdapter(mPagerAdapter);
        } else {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveExplanation3Fragment.class.getName()));
            set4();
        }
    }

    private void set4() {
        mFragments.add(Fragment.instantiate(this, AntDoveFrame6Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveFrame7Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveFrame8Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveQuestion4Fragment.class.getName()));
        mPager.setAdapter(mPagerAdapter);
    }

    public void correct4(View v) {
        mScore++;
        mFragments.clear();
        mFragments.add(Fragment.instantiate(this, AntDoveCorrectFragment.class.getName()));
        set5();
    }

    public void wrong4(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ouch);
        mediaPlayer.start();
        mQ4Tries++;
        if (mQ4Tries == 1) {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveHint4Fragment.class.getName()));
            mFragments.add(Fragment.instantiate(this, AntDoveQuestion4Fragment.class.getName()));
            mPager.setAdapter(mPagerAdapter);
        } else {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveExplanation4Fragment.class.getName()));
            set5();
        }
    }

    private void set5() {
        mFragments.add(Fragment.instantiate(this, AntDoveFrame9Fragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, AntDoveQuestion5Fragment.class.getName()));
        mPager.setAdapter(mPagerAdapter);
    }

    public void correct5(View v) {
        mScore++;
        mFragments.clear();
        mFragments.add(Fragment.instantiate(this, AntDoveCorrectFragment.class.getName()));
        endSet();
    }

    public void wrong5(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ouch);
        mediaPlayer.start();
        mQ5Tries++;
        if (mQ5Tries == 1) {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveHint5Fragment.class.getName()));
            mFragments.add(Fragment.instantiate(this, AntDoveQuestion5Fragment.class.getName()));
            mPager.setAdapter(mPagerAdapter);
        } else {
            mFragments.clear();
            mFragments.add(Fragment.instantiate(this, AntDoveExplanation5Fragment.class.getName()));
            endSet();
        }
    }

    private void endSet() {
        Bundle data = new Bundle();
        data.putInt("score", mScore);
        mFragments.add(Fragment.instantiate(this, AntDoveEndFragment.class.getName()));
        mFragments.add(Fragment.instantiate(this, FinalStarsFragment.class.getName(), data));
        mPager.setAdapter(mPagerAdapter);
    }
}
