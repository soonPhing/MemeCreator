package com.example.soon.memecreator;

/**
 * Created by Soon on 12/10/2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {
    private static TextView topText;
    private static TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topText = (TextView) view.findViewById(R.id.topText);
        bottomText = (TextView) view.findViewById(R.id.bottomText);
        return view;
    }

    public void setMemeText(String top, String bottom){
        topText.setText(top);
        bottomText.setText(bottom);
    }
}

