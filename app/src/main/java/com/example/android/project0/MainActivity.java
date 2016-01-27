package com.example.android.project0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void bProjectOne(View view){
        Toast.makeText(getApplicationContext(), "this button will lounch my SPOTIFY STREAMER app!", Toast.LENGTH_SHORT).show();
    }

    public void bProjectTwo(View view){
        Toast.makeText(getApplicationContext(), "this button will lounch my SCORES app!", Toast.LENGTH_SHORT).show();
    }

    public void bProjectThree(View view){
        Toast.makeText(getApplicationContext(), "this button will lounch my LIBARY app!", Toast.LENGTH_SHORT).show();
    }

    public void bProjectFour(View view){
        Toast.makeText(getApplicationContext(), "this button will lounch my  BUILD IT BIGGER app!", Toast.LENGTH_SHORT).show();
    }

    public void bProjectFive(View view){
        Toast.makeText(getApplicationContext(), "this button will lounch my BACON READER app!", Toast.LENGTH_SHORT).show();
    }

    public void bProjectSix(View view){
        Toast.makeText(getApplicationContext(), "this button will lounch my CAPSTONE: MY OWN APP!", Toast.LENGTH_SHORT).show();
    }
}
