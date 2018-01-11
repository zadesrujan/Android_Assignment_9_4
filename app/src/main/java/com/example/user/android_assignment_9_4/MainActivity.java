package com.example.user.android_assignment_9_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView);
        this.registerForContextMenu(tv);
        //Registers a context menu to be shown for the given view (multiple views can show the context menu).
    }

    //overriding the onCreateContextMenu
    //Android context menu appears when user press long click on the element. It is also known as floating menu.
    //Called when the context menu for this view is being built.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.menu, menu);
        menu.setHeaderTitle("context menu");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int selectedItemId = item.getItemId();
        // to the Main layout from xml file

        switch (selectedItemId) {
//one of the action will be selected
            // //A toast is a view containing a quick little message for the user. The toast class helps you create and show those.
            //Make a standard toast that just contains a text view with the text from a resource.
            //Context: The context to use. Usually your Application or Activity object.
            //text:The text to show. Can be formatted text.
            //int: How long to display the message. Either LENGTH_SHORT or LENGTH_LONG
            //LENGTH_SHORT :Show the view or text notification for a short period of time
            //show():Show the view for the specified duration.

            case R.id.Action1:
                Toast.makeText(getApplicationContext(), "Action 1  selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Action2:
                Toast.makeText(getApplicationContext(), "Action 2 selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Action3:
                Toast.makeText(getApplicationContext(), "Action 3 selected", Toast.LENGTH_LONG).show();
                break;


        }

        return true;
        //return the item
    }
}