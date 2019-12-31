package com.example.room_booking;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int No;
    EditText No_of_rooms, id_1, id_2, id_3, id_4, id_5;
    Button Next;
    TextView Room, id_msg, alertTexView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        No_of_rooms = findViewById(R.id.No_of_rooms);
        Next = findViewById(R.id.next);
        No=Integer.parseInt(No_of_rooms.getText().toString());

        id_1=findViewById(R.id.ID_1);
        id_2=findViewById(R.id.ID_2);
        id_3=findViewById(R.id.ID_3);
        id_4=findViewById(R.id.ID_4);
        id_5=findViewById(R.id.ID_5);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(No>5)
                {
                    AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);

                    builder.setCancelable(true);
                    builder.setTitle("MAX LIMIT EXCEEDED!");
                    builder.setMessage("You can book a maximum of 5 rooms.");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            dialogInterface.cancel();
                        }
                    });

                }
                else
                {
                    changeVisibility();
                }
            }
            public void changeVisibility()
            {
                if(Room.getVisibility()==View.VISIBLE)
                {
                    Next.setVisibility(View.GONE);
                    Room.setVisibility(View.GONE);
                    No_of_rooms.setVisibility(View.GONE);
                    id_msg.setVisibility(View.VISIBLE);
                    switch (No)
                    {
                        case 1: id_1.setVisibility(View.VISIBLE);
                                break;
                        case 2: id_1.setVisibility(View.VISIBLE);
                                id_2.setVisibility(View.VISIBLE);
                                break;
                        case 3: id_1.setVisibility(View.VISIBLE);
                                id_2.setVisibility(View.VISIBLE);
                                id_3.setVisibility(View.VISIBLE);
                                break;
                        case 4: id_1.setVisibility(View.VISIBLE);
                                id_2.setVisibility(View.VISIBLE);
                                id_3.setVisibility(View.VISIBLE);
                                id_4.setVisibility(View.VISIBLE);
                                break;
                        case 5: id_1.setVisibility(View.VISIBLE);
                                id_2.setVisibility(View.VISIBLE);
                                id_3.setVisibility(View.VISIBLE);
                                id_4.setVisibility(View.VISIBLE);
                                id_5.setVisibility(View.VISIBLE);
                                break;
                    }

                }

            }
        });


    }


}
