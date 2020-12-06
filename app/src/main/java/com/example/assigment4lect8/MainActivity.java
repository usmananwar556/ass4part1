package com.example.assigment4lect8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker=findViewById(R.id.timepick);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void ShowTime(View V){
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            int hours = timePicker.getHour();
            int minutes = timePicker.getMinute();
             if(hours > 12){
                 hours= hours-12;
                 String h = Integer.toString(hours)
                 String m = Integer.toString(minutes)
                 Toast.makeText(this, h+";"+m+"PM", Toast.LENGTH_SHORT).show();
             }
             else{
                 String h = Integer.toString(hours)
                 String m = Integer.toString(minutes)
                 Toast.makeText(this, h+";"+m+"AM", Toast.LENGTH_SHORT).show();
             }
        }

    }

}