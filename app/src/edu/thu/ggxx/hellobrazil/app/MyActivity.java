package edu.thu.ggxx.hellobrazil.app;

import android.app.Activity;
import android.os.Bundle;
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
        }
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
