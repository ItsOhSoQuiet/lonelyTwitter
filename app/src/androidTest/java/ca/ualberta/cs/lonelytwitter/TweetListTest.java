package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Matt on 2017-10-11.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Tweet #1");
        Tweet tweet2 = new NormalTweet("Tweet #2");
        Tweet tweet3 = new NormalTweet("Tweet #3");
        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);
        int length = tweets.getCount();
        assertEquals(length, 3);
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        TweetList sortedTweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Tweet #1");
        Tweet tweet2 = new NormalTweet("Tweet #2");
        Tweet tweet3 = new NormalTweet("Tweet #3");
        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);
        sortedTweets = tweets.getTweets();
        assertEquals(sortedTweets, tweets);
    }
}
