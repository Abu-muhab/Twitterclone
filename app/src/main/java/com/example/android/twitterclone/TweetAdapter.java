package com.example.android.twitterclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.TweetViewHolder> {
    private final LayoutInflater inflater;
    private ArrayList<Tweet> tweets;
    private Context context;

    TweetAdapter(Context context, ArrayList<Tweet> tweets) {
        inflater = LayoutInflater.from(context);
        this.tweets = tweets;
        this.context = context;
    }

    @Override
    public TweetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.tweet, parent, false);
        return new TweetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TweetViewHolder holder, int position) {
        final Tweet current = tweets.get(position);
        if (tweets != null) {
            holder.name.setText(current.name);
            holder.handle.setText(current.handle);
            holder.content.setText(current.content);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
        } else {
            holder.name.setText("No text");
            holder.handle.setText("No text");
            holder.content.setText("No text");
        }
    }

    void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (tweets != null) {
            return tweets.size();
        } else {
            return 0;
        }
    }

    class TweetViewHolder extends RecyclerView.ViewHolder {
        public final TextView name;
        public final TextView handle;
        public final TextView content;
        public final View itemView;

        public TweetViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            handle = itemView.findViewById(R.id.handle);
            content = itemView.findViewById(R.id.content);
            this.itemView = itemView;
        }

    }
}

