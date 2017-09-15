package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Matt on 2017-09-14.
 */

public class Happy extends Mood {
    public Happy() { super(); }

    public Happy(Date date) { super(date); }

    @Override
    public String moodType() {
        return "Happy";
    }
}
