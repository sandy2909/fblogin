package com.example.fbloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button reg =findViewById(R.id.reg)
        reg.setOnClickListener(new view.setOnClickListener(){
            @Override
            public void onclick(view view) {
                Intent intent=new Intent(MainActivity.this,registeractivity.class);
                startActivity(intent);
                    }
                });
    }

    private class button {
    }
}