package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mkluk on 9/13/17.
 */

public abstract class Mood {
  // initialize the date
    private Date date;

  // if date not entered, create date, else, use date given
    public Mood(){
        date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

  // get and set the date
    public Date getDate(){ return date; }

    public void setDate(Date date) {
        this.date = date;
    }

  // string for subclasses to represent mood
    public abstract String moodType();
}
