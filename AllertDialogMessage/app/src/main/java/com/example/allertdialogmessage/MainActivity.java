package com.example.allertdialogmessage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//context : hangi activitede olduğunu gösterir
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void save(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("SAVE İMAGE");
        builder.setMessage("Are you sure ?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"saved",Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"No saved",Toast.LENGTH_LONG).show();

            }
        }).show();
    }
}