package edu.thu.ggxx.hellobrazil.app;

import android.app.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.*;
import java.util.*;

public class MyActivity extends Activity {

    private ListView mListView;
    private MatchAdapter mAdapter;
    private static final String DELIMITER = "\\u007C"; //这里使用“|”的转义符

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mListView = (ListView) findViewById(R.id.listView);

        List<Match> matches = loadMatches();
        if (matches != null) {
            mAdapter = new MatchAdapter(this, matches);
            mListView.setAdapter(mAdapter);
            mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    final Match match = mAdapter.getItem(position);
                    final CharSequence[] items = {"30 min earlier", "20 min earlier", "10 min earlier", "5 min earlier"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(MyActivity.this);
                    builder.setTitle("Set Alarm");
                    builder.setItems(items, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0:
                                    setAlarm(match.getDatetime(), 30);
                                    break;
                                case 1:
                                    setAlarm(match.getDatetime(), 20);
                                    break;
                                case 2:
                                    setAlarm(match.getDatetime(), 10);
                                    break;
                                case 3:
                                    setAlarm(match.getDatetime(), 5);
                                    break;
                            }
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.setView(null, 0, 0, 0, 0);
                    alertDialog.show();
                    return false;
                }
            });
        }
    }

    private void setAlarm(Date date, int min) {
        long time = date.getTime() - (long) 1000 * 60 * min;
        Date newTime = new Date(time);
        Intent openNewAlarm = new Intent(AlarmClock.ACTION_SET_ALARM);
        openNewAlarm.putExtra(AlarmClock.EXTRA_HOUR, newTime.getHours());
        openNewAlarm.putExtra(AlarmClock.EXTRA_MINUTES, newTime.getMinutes());
        startActivity(openNewAlarm);
    }

    private List<Match> loadMatches() {
        List<Match> matches = new ArrayList<Match>();
        String path = "/sdcard/Download/output.txt";
        File file = new File(path);
        try {
            InputStream instream = new FileInputStream(file);
            if (instream != null) {
                InputStreamReader inputreader = new InputStreamReader(instream);
                BufferedReader buffreader = new BufferedReader(inputreader);
                String line;
                while ((line = buffreader.readLine()) != null) {
                    String[] tmp = line.split(DELIMITER);
                    Match match = new Match();
                    match.setId(tmp[0]);
                    match.setHome(tmp[1]);
                    match.setAway(tmp[2]);
                    match.setDatetime(new Date(Long.parseLong(tmp[3])));
                    match.setStadium(tmp[4]);
                    matches.add(match);
                }
                buffreader.close();
                inputreader.close();
                instream.close();
            }
        } catch (FileNotFoundException ex) {
            Toast.makeText(this, "no wc2014 file found", Toast.LENGTH_SHORT).show();
            return null;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        MatchSort comparator = new MatchSort();
        Collections.sort(matches, comparator);
        return matches;
    }
}
