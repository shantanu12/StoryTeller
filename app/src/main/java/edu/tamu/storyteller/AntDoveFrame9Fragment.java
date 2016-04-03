package edu.tamu.storyteller;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Shantanu on 4/3/2016.
 */
public class AntDoveFrame9Fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ant_dove_frame9, container, false);
        ImageView antImage = (ImageView) v.findViewById(R.id.frame9_imageView);
        antImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(container.getContext(), R.raw.ant);
                mediaPlayer.start();
                Vibrator vib = (Vibrator) container.getContext().getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(1000);
            }
        });
        return v;
    }
}
