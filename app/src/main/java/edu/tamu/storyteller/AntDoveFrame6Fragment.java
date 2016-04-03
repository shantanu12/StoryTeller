package edu.tamu.storyteller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Shantanu on 4/3/2016.
 */
public class AntDoveFrame6Fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ant_dove_frame6, container, false);
        ImageView doveImage = (ImageView) v.findViewById(R.id.frame6_imageView);
        doveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(container.getContext(), R.raw.dove);
                mediaPlayer.start();
            }
        });
        return v;
    }
}
