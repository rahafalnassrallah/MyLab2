package com.example.mylab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.send);
        e=(EditText)findViewById(R.id.Name);

        b.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view ){
                String s=e.getText().toString();
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("personName",s);
                startActivity(intent);
            }


        });


    }
}