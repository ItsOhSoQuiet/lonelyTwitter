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

    private Date date;

    /**
     * Constructs a Mood object
     *
     * @since 1.2
     */
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

    /**
     * Get the date from the Mood object
     *
     * @return date of the Mood
     * @since 1.2
     */
    public Date getDate(){
        return date;
    }

    /**
     * Set a new date for the Mood object
     *
     * @param date Mood date
     * @since 1.2
     */
    public void setDate(Date date) {
        this.date = date;
    }


    /**
     * Abstract method that returns the string
     * for the moodType for each class that
     * inherits from the Mood class
     *
     * @return String moodType
     * @since 1.2
     */
    public abstract String moodType();
}
