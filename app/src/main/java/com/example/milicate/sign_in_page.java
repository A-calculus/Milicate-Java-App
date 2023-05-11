package com.example.milicate;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sign_in_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);

        Button btn = findViewById(R.id.log_in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in_page.this, dashboard.class);
                startActivity(intent);
            }
        });

        TextView btn2 = findViewById(R.id.signUP);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in_page.this, signUp.class);
                startActivity(intent);
            }
        });
    }
}