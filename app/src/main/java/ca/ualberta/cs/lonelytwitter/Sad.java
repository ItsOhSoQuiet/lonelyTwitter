package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Class that extends the Mood class
 * so that the string moodType equals "Sad"
 *
 * @author Matt Kluk
 * @version 1.5
 * @see Mood
 * @see Happy
 * @since 1.2
 */
public class Sad extends Mood {

    /**
     * Construct a Sad object
     *
     * @since 1.2
     */
    public Sad() {
        super();
    }

    /**
     * Construct a Sad object
     *
     * @param date Mood date
     * @since 1.2
     */
    public Sad(Date date) {
        super(date);
    }

    /**
     * Set String moodType as "Sad"
     *
     * @return moodType = "Sad"
     * @since 1.2
     */
    @Override
    public String moodType() {
        return "Sad";
    }
}
