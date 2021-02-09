package com.example.myass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button bun;
  EditText name;
  TextView mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bun =(Button) findViewById(R.id.button);
        name =(EditText) findViewById(R.id.editTextTextPersonName);
        mytext =(TextView) findViewById(R.id.textView);


        bun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str =name.getText().toString();
                mytext.setText("HELLO "+str +":) !");
            }
        });

    }
}