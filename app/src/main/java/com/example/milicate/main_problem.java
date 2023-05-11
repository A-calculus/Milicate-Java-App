package com.example.milicate;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class main_problem extends Activity {

    public static final String EXTRA_DATA = "EXTRA_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_problem);

        Spinner dropdown = findViewById(R.id.select_dropdown);

        String[] items = {"Urgent", "Not Urgent", "Can be Attended to Later"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);

        EditText inputText = findViewById(R.id.message_text);
        String vl =inputText.getText().toString();

        Button btn = findViewById(R.id.submit_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main_problem.this, Problem_response.class);
                intent.putExtra("abc", vl);
                setResult(Activity.RESULT_OK, intent);
                startActivity(intent);
                finish();
            }
        });
    }

}