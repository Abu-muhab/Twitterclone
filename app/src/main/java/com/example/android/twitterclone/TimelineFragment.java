package com.example.android.twitterclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TimelineFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_timeline, container, false);


        ArrayList<Tweet> tweets = new ArrayList<>();
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));
        tweets.add(new Tweet("Abdulmalik", "@abumuhab . 2h", "I'm just finding out the housemates in the big brother house have no idea what time it is as there are no clock in the house"));

        TweetAdapter adapter = new TweetAdapter(this.getContext(), tweets);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }
}