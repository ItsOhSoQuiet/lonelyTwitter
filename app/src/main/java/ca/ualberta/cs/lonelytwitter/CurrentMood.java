package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mkluk on 9/13/17.
 */

public abstract class CurrentMood {
    private String mood;
    private Date date;

    public CurrentMood(String mood){
        date = new Date();
        this.mood = mood;
    }

    public CurrentMood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public String getMood(){ return mood; }
    public Date getDate(){ return date; }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String moodType();
}
