package com.example.jaywanth.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicked(View view)
    {
        EditText et1=(EditText)findViewById(R.id.editText);
        Toast.makeText(this, "Hi There, "+et1.getText().toString(), Toast.LENGTH_SHORT).show();


    }
}
