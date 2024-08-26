package com.example.volumecalculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SphereActivity extends AppCompatActivity {

    TextView heading, result;
    Button button;
    EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere);

        heading=findViewById(R.id.heading);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        result=findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= editText.getText().toString();
                float radius=Float.parseFloat(str);
                float volume = (float) ((4.0/3.0)*Math.PI*radius*radius*radius);
                result.setText(volume+" m^3");
            }
        });

    }
}