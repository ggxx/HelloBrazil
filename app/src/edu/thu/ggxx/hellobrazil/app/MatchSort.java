package edu.thu.ggxx.hellobrazil.app;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: ggxx
 * Date: 6/7/14
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class MatchSort implements Comparator {

    public int compare(Object arg0, Object arg1) {
        Match m1 = (Match) arg0;
        Match m2 = (Match) arg1;
        int result = m1.getDatetime().compareTo(m2.getDatetime());
        if (result == 0) {
            return m1.getId().compareTo(m2.getId());
        } else {
            return result;
        }
    }
}
