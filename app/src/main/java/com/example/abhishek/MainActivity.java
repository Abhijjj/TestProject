package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.testproject.R;

public class MainActivity extends AppCompatActivity {
TextView click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
click=findViewById(R.id.click);
click.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});
*/

    }
}
