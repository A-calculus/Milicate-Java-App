package com.example.milicate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class problem_onboarding extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_onboarding);
        Intent intent = new Intent(this, main_problem.class);
        Bundle bn = intent.getExtras();
        String result = bn.getString("abc");
        TextView rl = findViewById(R.id.message_text_2);
        rl.setText(String.valueOf(result));


        Button btn = findViewById(R.id.submit_btn);
        btn.setOnClickListener(view -> {
            Intent intent1 = new Intent(problem_onboarding.this, officers_dashboard.class);
            startActivity(intent1);
        });

        Spinner dropdown = findViewById(R.id.select_dropdown);
//        dropdown.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        String[] items = {"Urgent", "Not Urgent", "Can be Attended to Later"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        dropdown.setAdapter(adapter);
    }
}