package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amohamed on 9/20/18.
 */

public class Sad extends Mood {
    protected Date date;
    protected String mood = "I am sad";

    public Sad(){
        this.date = new Date();
    }

    public Sad(Date date){
        this.date = date;
    }
}
