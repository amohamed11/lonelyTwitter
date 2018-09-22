package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by amohamed on 9/20/18.
 */

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected ArrayList moods;

    public void setMessage(String message) throws TweetTooLongException{

        if (this.message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message=message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();

    public void update_moods(ArrayList moods){
        this.moods = moods;

    }
}