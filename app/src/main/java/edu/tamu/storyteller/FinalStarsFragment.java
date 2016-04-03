package edu.tamu.storyteller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Shantanu on 4/3/2016.
 */
public class FinalStarsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_final_stars, container, false);
        ImageView stars = (ImageView) v.findViewById(R.id.stars_imageView);
        Bundle data = getArguments();
        int score = data.getInt("score");
        switch (score) {
            case 1:
                stars.setImageResource(R.drawable.star1);
                break;
            case 2:
                stars.setImageResource(R.drawable.star2);
                break;
            case 3:
                stars.setImageResource(R.drawable.star3);
                break;
            case 4:
                stars.setImageResource(R.drawable.star4);
                break;
            case 5:
                stars.setImageResource(R.drawable.star5);
                break;
        }
        return v;
    }
}
