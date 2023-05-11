package com.example.milicate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class signUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button btn = findViewById(R.id.signup_btn);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(signUp.this, addPhoto.class);
            startActivity(intent);
        });
    }
}