/*
 * Tweet
 *
 * Version 1.0
 *
 * September 13, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this projject. Otherwise please contact mkluk@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet
 *
 * @author Team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @since 1.0
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     * @since 1.0
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Get the message from the Tweet object
     *
     * @return message of the Tweet
     * @since 1.0
     */
    public String getMessage(){
        return message;
    }

    /**
     * Get the date from the Tweet object
     *
     * @return date of the Tweet
     * @since 1.0
     */
    public Date getDate() {
        return date;
    }

    /**
     * Get the list of moods from the Tweet object
     *
     * @return ArrayList moodList of Tweet object
     * @since 1.2
     */
    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    /**
     * Sets the tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     * @since 1.0
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns the Tweet object as a string
     *
     * @return String of Tweet in form "Tweet date | Tweet message"
     * @since 1.4
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    /**
     * Add a mood to the moodList
     *
     * @param mood mood to add
     * @see Mood
     * @since 1.2
     */
    public void addMood(Mood mood) {
        moodList.add(mood);
    }

    /**
     * Abstract method that determines if the class that inherits from Tweet
     * is important or not
     *
     * @return Boolean isImportant
     * @see ImportantTweet
     * @see NormalTweet
     * @since 1.1
     */
    public abstract Boolean isImportant();
}
