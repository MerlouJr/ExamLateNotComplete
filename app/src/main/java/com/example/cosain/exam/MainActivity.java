package com.example.cosain.exam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar PRICEbar;
    private TextView PRICEtextProgress,DISTANCEtextProgress, RATINGtextProgress;

    EditText first;
    EditText second;
    TextView pota;
    TextView another;
    SeekBar seekbar1;
    TextView pfft;
    int value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar1 = (SeekBar) findViewById(R.id.seekBar);
        pfft = (TextView) findViewById(R.id.seekEW);

        seekbar1.setOnSeekBarChangeListener(this);


        first = (EditText) findViewById(R.id.editText1);
        second = (EditText) findViewById(R.id.editText2);
        pota = (TextView) findViewById(R.id.textView7);
        another = (TextView) findViewById((R.id.textView8));


    }
    public  boolean isNotNullNotEmptyNotWhiteSpaceOnlyByJava(
            String string)
    {
        return string != null && !string.isEmpty() && !string.trim().isEmpty();
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



    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        int mnum1 = 0;
                int mnum2= 0;

        if (isNotNullNotEmptyNotWhiteSpaceOnlyByJava(first.getText().toString())) {

            mnum1 = Integer.parseInt(first.getText().toString());
        } else {
            mnum1 = 0;
        }
        if (isNotNullNotEmptyNotWhiteSpaceOnlyByJava(second.getText().toString())) {

            mnum2 = Integer.parseInt(second.getText().toString());

        } else {
            mnum2 = 0;
        }


        value = progress;
        pfft.setText(value + " % ");

        double sum =((mnum1 / mnum2 / 10)+ (0.010* value));
        int sum2 = mnum1 / mnum2 + value;

        pota.setText(Double.toString(sum));
        another.setText(Double.toString(sum2));


    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
    }


}
