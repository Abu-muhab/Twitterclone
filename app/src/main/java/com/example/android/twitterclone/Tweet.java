package com.example.android.twitterclone;

import androidx.annotation.NonNull;

class Tweet {
    String aviUrl;
    String name;
    String handle;
    String content;

    public Tweet(@NonNull String name, @NonNull String handle, @NonNull String content) {
        this.name = name;
        this.handle = handle;
        this.content = content;
    }
}
