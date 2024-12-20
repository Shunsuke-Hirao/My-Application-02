package com.example.myapplication02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;

    //the youtube about tutorial part 2 from 23:53
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        title=findViewById(R.id.title);

//        Button start=findViewById(R.id.start);
        ((Button)findViewById(R.id.start)).setOnClickListener(this);
        ((Button)findViewById(R.id.score)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int id = view.getId(); // Get the ID of the clicked view
        if (id == R.id.start) {
            Intent intentlevel = new Intent(getApplication(), GameLevel.class);
            startActivity(intentlevel);
        } else if (id == R.id.score) {
            Intent intentscore =new Intent(getApplication(), HighScore.class);
            startActivity(intentscore);
        }
    }
}