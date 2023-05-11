package com.example.milicate;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btn = findViewById(R.id.see_problem);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, problem_onboarding.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.check_officers);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, Onboarding.class);
                startActivity(intent);
            }
        });
    }
}