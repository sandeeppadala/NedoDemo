package com.example.nedodemo;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nedodemonew.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button on;
    Button off;

    Button on_two;
    Button off_two;

    Button on_three;
    Button off_three;

    Button on_four;
    Button off_four;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.button_on);
        off = findViewById(R.id.button_off);


        on_two = findViewById(R.id.button_on_two);
        off_two = findViewById(R.id.button_off_two);

        on_three = findViewById(R.id.button_on_three);
        off_three = findViewById(R.id.button_off_three);

        on_four = findViewById(R.id.button_on_four);
        off_four = findViewById(R.id.button_off_four);


        on_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_TWO");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(1);
            }
        });
        off_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_TWO");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(0);
            }
        });



        on.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_ONE");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(1);
            }
        });
        off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_ONE");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(0);
            }
        });

        on_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_THREE");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(1);
            }
        });
        off_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_THREE");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(0);
            }
        });

        on_four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_FOUR");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(1);
            }
        });
        off_four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS_FOUR");//LED_STATUS is Firebase database LED_STATUS
                myRef.setValue(0);
            }
        });
    }
}