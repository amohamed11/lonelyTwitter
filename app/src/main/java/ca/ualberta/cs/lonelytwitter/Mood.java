package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amohamed on 9/20/18.
 */

public abstract class Mood {
    protected Date date;
    protected String mood;

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMood(){
        return this.mood;
    }
}
