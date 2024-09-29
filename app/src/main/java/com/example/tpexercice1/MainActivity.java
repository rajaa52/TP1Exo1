package com.example.tpexercice1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {

    private Button btnToast;
    private Button btnCount;
    private TextView countTextView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);
        btnCount = findViewById(R.id.btnCount);
        countTextView = findViewById(R.id.countTextView);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Toast !", Toast.LENGTH_SHORT).show();
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                countTextView.setText(String.valueOf(count));
            }
        });
    }
}