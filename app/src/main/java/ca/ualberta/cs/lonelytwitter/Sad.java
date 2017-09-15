package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Matt on 2017-09-14.
 */

public class Sad extends Mood {
    public Sad() { super(); }

    public Sad(Date date) { super(date);}

    @Override
    public String moodType() {
        return "Sad";
    }
}
