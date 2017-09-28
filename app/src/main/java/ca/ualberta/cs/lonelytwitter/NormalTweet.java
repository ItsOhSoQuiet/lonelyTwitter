package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Class that extends the Tweet class
 * so that it is not classified as Important
 *
 * @author Team X
 * @version 1.5
 * @see Tweet
 * @see ImportantTweet
 * @since 1.1
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a NormalTweet object
     *
     * @param message Tweet message
     * @since 1.1
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * construct a NormalTweet object
     *
     * @param message Tweet message
     * @param date Tweet date
     * @since 1.1
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Set isImportant as FALSE
     *
     * @return isImportant = Boolean.FALSE
     * @since 1.1
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
