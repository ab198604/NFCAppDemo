package com.reallife.app_nfcdemo_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean ledon = false;
    private Button button = null;
    private CheckBox checkBoxLed1 = null;
    private CheckBox checkBoxLed2 = null;
    private CheckBox checkBoxLed3 = null;
    private CheckBox checkBoxLed4 = null;

    class MyButtonListerner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            ledon = !ledon;
            if( ledon == true)
            {
                button.setText("ALL OFF");
                checkBoxLed1.setChecked(true);
                checkBoxLed2.setChecked(true);
                checkBoxLed3.setChecked(true);
                checkBoxLed4.setChecked(true);
            }
            else
            {
                button.setText("All ON");
                checkBoxLed1.setChecked(false);
                checkBoxLed2.setChecked(false);
                checkBoxLed3.setChecked(false);
                checkBoxLed4.setChecked(false);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        checkBoxLed1 = (CheckBox) findViewById(R.id.LED1);
        checkBoxLed2 = (CheckBox) findViewById(R.id.LED2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.LED3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.LED4);

        button.setOnClickListener(new MyButtonListerner());
/*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on clickswl
                ledon = !ledon;
                if( ledon == true)
                {
                    button.setText("ALL OFF");
                }
                else
                {
                    button.setText("All ON");
                }
            }
        });
*/

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.LED1:
                if (checked)
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1 on", Toast.LENGTH_SHORT).show();
                else
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED1 off", Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED2:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(), "LED2 on", Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(), "LED2 off", Toast.LENGTH_SHORT).show();
                break;

            case R.id.LED3:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(), "LED3 on", Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(), "LED3 off", Toast.LENGTH_SHORT).show();
                break;


            case R.id.LED4:
                if (checked)
                    // Cheese me
                    Toast.makeText(getApplicationContext(), "LED4 on", Toast.LENGTH_SHORT).show();
                else
                    // I'm lactose intolerant
                    Toast.makeText(getApplicationContext(), "LED4 off", Toast.LENGTH_SHORT).show();
                break;
            // TODO: Veggie sandwich
        }
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
}
