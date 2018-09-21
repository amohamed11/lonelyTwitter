package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amohamed on 9/20/18.
 */

public class Happy extends Mood {
    protected Date date;
    protected String mood = "I am happy";

    public Happy(){
        this.date = new Date();
    }

    public Happy(Date date){
        this.date = date;
    }
}
