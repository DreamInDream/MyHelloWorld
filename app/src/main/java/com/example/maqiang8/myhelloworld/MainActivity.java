package com.example.maqiang8.myhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"kk",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"kk",Toast.LENGTH_SHORT).show();
    }
    public static void print(){
        Log.e("dk","kdk");
    }
}
