package edu.thu.ggxx.hellobrazil.app;

import android.view.View;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: ggxx
 * Date: 6/7/14
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class MatchViewWrapper {

    private View view;
    private String id;
    private TextView textView_matchId;
    private TextView textView_matchTeams;
    private TextView textView_matchDatetime;
    private TextView textView_stadium;

    public MatchViewWrapper(View view) {
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public View getView() {
        return view;
    }

    public TextView getMatchId() {
        if (this.textView_matchId == null) {
            this.textView_matchId = (TextView) this.view.findViewById(R.id.match_id);
        }
        return this.textView_matchId;
    }

    public TextView getMatchTeams() {
        if (this.textView_matchTeams == null) {
            this.textView_matchTeams = (TextView) this.view.findViewById(R.id.match_teams);
        }
        return this.textView_matchTeams;
    }

    public TextView getMatchDatetime() {
        if (this.textView_matchDatetime == null) {
            this.textView_matchDatetime = (TextView) this.view.findViewById(R.id.match_datetime);
        }
        return this.textView_matchDatetime;
    }

    public TextView getMatchStadium(){
        if (this.textView_stadium == null) {
            this.textView_stadium = (TextView) this.view.findViewById(R.id.match_stadium);
        }
        return this.textView_stadium;
    }
}
