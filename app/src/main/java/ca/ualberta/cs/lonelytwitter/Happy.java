package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Class that extends the Mood class
 * so that the string moodType equals "Happy"
 *
 * @author Matt Kluk
 * @version 1.5
 * @see Mood
 * @see Sad
 * @since 1.2
 */
public class Happy extends Mood {
<<<<<<< HEAD
  // Happy subclass
    public Happy() { super(); }
=======
>>>>>>> f17Wednesday

    /**
     * Construct a Happy object
     *
     * @since 1.2
     */
    public Happy() {
        super();
    }

    /**
     * Construct a Happy object
     *
     * @param date Mood date
     * @since 1.2
     */
    public Happy(Date date) {
        super(date);
    }

    /**
     * Set String moodType as "Happy"
     *
     * @return moodType = "Happy"
     * @since 1.2
     */
    @Override
    public String moodType() {
        return "Happy";
    }
}
