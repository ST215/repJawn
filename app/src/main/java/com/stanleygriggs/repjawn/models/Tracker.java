package com.stanleygriggs.repjawn.models;

import org.joda.time.DateTime;

import java.util.List;

public class Tracker {

    private String mTitle;
    private int mGoal;
    private int mCurrent;
    private List<Event> mEventList;
    private DateTime mDateTime;
    private double mAverage;

    public Tracker(String title, int goal, int current, List<Event> mEventList, DateTime dateTime) {
        this.mTitle = title;
        this.mGoal = goal;
        this.mCurrent = current;
        this.mEventList = mEventList;
        this.mDateTime = dateTime;

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public int getGoal() {
        return mGoal;
    }

    public void setGoal(int goal) {
        this.mGoal = goal;
    }

    public int getCurrent() {
        return mCurrent;
    }

    public void setCurrent(int current) {
        this.mCurrent = current;
    }

    public List<Event> getEventList() {
        return mEventList;
    }

    public void setEventList(List<Event> eventList) {
        this.mEventList = eventList;
    }

    public DateTime getDateTime() {
        return mDateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.mDateTime = dateTime;
    }

    public double getAverage() {
        return mAverage;
    }

    public void setAverage(double average) {

        /// mAverage = mCurrent / days since goal was set
        this.mAverage = average;
    }
}
