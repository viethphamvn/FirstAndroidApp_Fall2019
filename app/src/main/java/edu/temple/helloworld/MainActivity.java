package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.clickButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myText = findViewById(R.id.textView);
                myText.setText("You have clicked the button");
            }
        });

    }
}
