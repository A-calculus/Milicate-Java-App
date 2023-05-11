package com.example.milicate;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class Problem_response extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_response);

        FrameLayout btn = findViewById(R.id.go_to_home_layout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Problem_response.this, landing_page.class);
                startActivity(intent);
            }
        });

        FrameLayout btn2 = findViewById(R.id.exit_layout);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Problem_response.this, starting_page.class);
                startActivity(intent);
            }
        });
    }
}