package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mkluk on 9/13/17.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>(); // List of moods to add to

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    public Date getDate() { return date; }

    // getter for the mood list
    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    // add to the mood list
    public void addMood(Mood mood) {
        moodList.add(mood);
    }

    public abstract Boolean isImportant();
}
