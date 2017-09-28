package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a Mood that can be added
 * to a Tweet object.
 *
 * @author Matt Kluk
 * @version 1.5
 * @see Happy
 * @see Sad
 * @since 1.2
 */
public abstract class Mood {
<<<<<<< HEAD
  // initialize the date
    private Date date;

  // if date not entered, create date, else, use date given
=======

    private Date date;

    /**
     * Constructs a Mood object
     *
     * @since 1.2
     */
>>>>>>> f17Wednesday
    public Mood(){
        date = new Date();
    }

    /**
     * Constructs a Mood object
     *
     * @param date
     * @since 1.2
     */
    public Mood(Date date){
        this.date = date;
    }

<<<<<<< HEAD
  // get and set the date
    public Date getDate(){ return date; }
=======
    /**
     * Get the date from the Mood object
     *
     * @return date of the Mood
     * @since 1.2
     */
    public Date getDate(){
        return date;
    }
>>>>>>> f17Wednesday

    /**
     * Set a new date for the Mood object
     *
     * @param date Mood date
     * @since 1.2
     */
    public void setDate(Date date) {
        this.date = date;
    }

<<<<<<< HEAD
  // string for subclasses to represent mood
=======
    /**
     * Abstract method that returns the string
     * for the moodType for each class that
     * inherits from the Mood class
     *
     * @return String moodType
     * @since 1.2
     */
>>>>>>> f17Wednesday
    public abstract String moodType();
}
