package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {

    // in interfaces, defining methods as public is redundant
    // caught by Analyze -> Inspect code
    String getMessage();

    Date getDate();

}
