package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Class that extends the Tweet class
 * so that it is classified as Important
 *
 * @author Team X
 * @version 1.5
 * @see Tweet
 * @see NormalTweet
 * @since 1.1
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs an ImportantTweet object
     *
     * @param message Tweet message
     * @since 1.1
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * construct an ImportantTweet object
     *
     * @param message Tweet message
     * @param date Tweet date
     * @since 1.1
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Set isImportant as TRUE
     *
     * @return isImportant = Boolean.TRUE
     * @since 1.1
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
