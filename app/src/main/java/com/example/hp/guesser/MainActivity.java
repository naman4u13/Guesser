package com.example.hp.guesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eview;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eview = (EditText)findViewById(R.id.eview);
        display = (TextView)findViewById(R.id.display);
    }
    void  guess(View view)
    {
        int number;
        try {
            number = Integer.parseInt(eview.getText().toString());

            if (number < 50)
            {
                display.setText("Guess a bigger number", TextView.BufferType.EDITABLE);
            } else if (number > 50&&number<101) {
                display.setText("Guess a smaller number", TextView.BufferType.EDITABLE);
            } else if(number == 50) {
                display.setText("CONGRATULATIONS !! YOU WON", TextView.BufferType.EDITABLE);
            }
            else
            {
                display.setText("Invalid Input, value entered is out of range ", TextView.BufferType.EDITABLE);
            }
        }
        catch(NumberFormatException e)
        {

            display.setText("Wrong Input", TextView.BufferType.EDITABLE);
        }
    }

     void retry(View view)
    {
        eview.setText("");
    }
}