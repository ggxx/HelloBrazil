package edu.thu.ggxx.hellobrazil.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ggxx
 * Date: 6/7/14
 * Time: 12:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MatchAdapter extends ArrayAdapter<Match> {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
    private LayoutInflater layoutInflater = null;
    private MatchViewWrapper viewWrapper = null;

    public MatchAdapter(Context context, List<Match> objects) {
        super(context, R.layout.listitem, objects);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Match match = getItem(position);

        if (convertView == null) {
            convertView = this.layoutInflater.inflate(R.layout.listitem, parent, false);
            viewWrapper = new MatchViewWrapper(convertView);
            convertView.setTag(viewWrapper);
        } else {
            viewWrapper = (MatchViewWrapper) convertView.getTag();
        }

        if (match != null) {
            viewWrapper.setId(match.getId());
            viewWrapper.getMatchId().setText(match.getId());
            viewWrapper.getMatchTeams().setText(match.getHome() + " vs " + match.getAway());
            viewWrapper.getMatchDatetime().setText(simpleDateFormat.format(match.getDatetime()));
        }
        return convertView;
    }
}
