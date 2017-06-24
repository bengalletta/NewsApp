package com.example.android.newsapp;

/**
 * Created by bengalletta on 6/23/17.
 */

import android.app.Activity;

import android.os.AsyncTask;
import android.widget.TextView;




public class RequestHandler extends AsyncTask<String, Void, String> {



    @Override
    protected String doInBackground(String... params) {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
        }
        return "Executed";
    }

    @Override
    protected void onPostExecute(String result) {
        TextView txt = (TextView) MainActivity.findViewById(R.id.output);
        txt.setText("Executed"); // txt.setText(result);
        // might want to change "executed" for the returned string passed
        // into onPostExecute() but that is upto you
    }

    @Override
    protected void onPreExecute() {}

    @Override
    protected void onProgressUpdate(Void... values) {}
}