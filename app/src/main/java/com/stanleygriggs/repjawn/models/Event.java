package com.stanleygriggs.repjawn.models;

import org.joda.time.DateTime;

public class Event {

    private DateTime mDateTime;
    private int count;
    private String note;

    public Event(DateTime dateTime, int count, String note) {
        mDateTime = dateTime;
        this.count = count;
        this.note = note;
    }

    public DateTime getDateTime() {
        return mDateTime;
    }

    public void setDateTime(DateTime dateTime) {
        mDateTime = dateTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
