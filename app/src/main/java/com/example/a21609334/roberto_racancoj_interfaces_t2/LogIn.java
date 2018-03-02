package com.example.a21609334.roberto_racancoj_interfaces_t2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {

    private Button logInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        logInBtn = (Button) findViewById(R.id.loginButton);


        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logInBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.btncolor));

                Intent myIntent = new Intent(LogIn.this, MainActivity.class);

                startActivity(myIntent);
            }
        });

    }
}
