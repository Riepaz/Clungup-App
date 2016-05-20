package com.array.rahma.clungup;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.array.rahma.clungup.R.drawable.loginbutton;

/**
 * Created by RIFAZ on 17/05/2016.
 */
public class loginForm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final EditText id = (EditText) findViewById(R.id.identitas);
        //final EditText pass = (EditText) findViewById(R.id.pass);
        final Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(loginForm.this, menuUtama.class);
                loginForm.this.startActivity(mainIntent);
                loginForm.this.finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(loginForm.this, register.class);
                loginForm.this.startActivity(mainIntent);
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
    }
}
