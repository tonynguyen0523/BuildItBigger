package com.example.jokedisplay;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeDisplayFragment extends Fragment {


    public JokeDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_joke_display, container, false);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeDisplayActivity.JOKE_KEY);

        TextView displayJokeTextView = (TextView) view.findViewById(R.id.display_joke_textview);
        displayJokeTextView.setText(joke);

        return view;
    }

}
