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

public class CylinderActivity extends AppCompatActivity {

    TextView heading, result;
    Button button;
    EditText editText;
    EditText editText2,editText3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);

        heading=findViewById(R.id.heading);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        result=findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1= editText.getText().toString();
                String str2= editText2.getText().toString();
                float radius=Float.parseFloat(str2);
                float height=Float.parseFloat(str1);
                float volume = (float) (Math.PI*radius*radius*height);
                result.setText(volume+" m^3");
            }
        });

    }
}