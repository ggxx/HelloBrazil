package edu.thu.ggxx.hellobrazil.app;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ggxx
 * Date: 6/7/14
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class Match {
    String id;
    String home;
    String away;
    Date datetime;
    String stadium;
    String scores;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }
}
