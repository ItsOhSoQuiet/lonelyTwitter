package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Interface that defines the methods that get the
 * message and date for Tweet objects
 *
 * @author Team X
 * @version 1.5
 * @see Tweet
 * @since 1.1
 */
public interface Tweetable {

    /**
     * Method signature for the method that would
     * get the message from the Tweet object
     *
     * @return N/A (must be defined by the class that extends Tweetable)
     */
    public String getMessage();

    /**
     * Method signature for the method that would
     * get the date from the Tweet object
     *
     * @return N/A (must be defined by the class that extends Tweetable)
     */
    public Date getDate();
}
