package com.example.milicate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;


public class landing_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        FrameLayout btn = findViewById(R.id.login_Layout2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(landing_page.this, sign_in_page.class);
                startActivity(intent);
            }
        });

        FrameLayout btn2 = findViewById(R.id.problem_Layout3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(landing_page.this, main_problem.class);
                startActivity(intent);
            }
        });
    }

}