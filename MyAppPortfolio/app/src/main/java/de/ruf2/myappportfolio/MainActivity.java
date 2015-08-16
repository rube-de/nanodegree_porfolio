package de.ruf2.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void clickSpotify(View view){
        Toast t = Toast.makeText(this, "This button will launch spotify streamer", Toast.LENGTH_SHORT);
        t.show();
    }
    public void clickScoresApp(View view){
        Toast t = Toast.makeText(this, "This button will launch scores app", Toast.LENGTH_SHORT);
        t.show();
    }
    public void clickLibraryApp(View view){
        Toast t = Toast.makeText(this, "This button will launch library app", Toast.LENGTH_SHORT);
        t.show();
    }
    public void clickBuildItBiggerApp(View view){
        Toast t = Toast.makeText(this, "This button will launch build it bigger app", Toast.LENGTH_SHORT);
        t.show();
    }
    public void clickXYZReader(View view){
        Toast t = Toast.makeText(this, "This button will launch xyz readr", Toast.LENGTH_SHORT);
        t.show();
    }
    public void clickCapstone(View view){
        Toast t = Toast.makeText(this, "This button will launch capstone app", Toast.LENGTH_SHORT);
        t.show();
    }
}
