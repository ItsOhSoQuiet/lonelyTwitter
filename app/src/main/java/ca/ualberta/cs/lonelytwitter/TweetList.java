package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Matt on 2017-10-11.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public void add(Tweet tweet) {

        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }

    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public TweetList getTweets() {
        TweetList tweetsSave = new TweetList();
        TweetList sortedTweets = new TweetList();
        tweetsSave = this;
        Collections.sort(this.tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        sortedTweets = this;
        this.tweets = tweetsSave.tweets;
        return sortedTweets;
    }

    public int getCount() {
        return tweets.size();
    }

}
