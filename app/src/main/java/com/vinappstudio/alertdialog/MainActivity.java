package com.vinappstudio.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button showDialog;
private AlertDialog.Builder alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog = findViewById(R.id.button_id);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // show the actual dialog
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                // setup title
                alertDialog.setTitle(getResources().getString(R.string.title));

                // set icon
                alertDialog.setIcon(R.drawable.ic_launcher_background);
                //set massage
                alertDialog.setMessage(getResources().getString(R.string.message));

                // set cancelable
                alertDialog.setCancelable(false);

                //set positive button
                alertDialog.setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // exit our  window activity
                        MainActivity.this.finish();
                    }
                });
                // set Negative Button
                alertDialog.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                // creating the actual dialog
                AlertDialog dialog =  alertDialog.create();
                // show the actual dialog
                dialog.show();


            }
        });


    }
}