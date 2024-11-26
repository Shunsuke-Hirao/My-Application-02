package com.example.myapplication02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GameAction3 extends AppCompatActivity implements View.OnClickListener{

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game_action3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        b1=findViewById(R.id.num1);
        b1.setOnClickListener(this);
        b2=findViewById(R.id.num2);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.num3);
        b3.setOnClickListener(this);
        b4=findViewById(R.id.num4);
        b4.setOnClickListener(this);
        b5=findViewById(R.id.num5);
        b5.setOnClickListener(this);
        b6=findViewById(R.id.num6);
        b6.setOnClickListener(this);
        b7=findViewById(R.id.num7);
        b7.setOnClickListener(this);
        b8=findViewById(R.id.num8);
        b8.setOnClickListener(this);
        b9=findViewById(R.id.num9);
        b9.setOnClickListener(this);

        ((Button)findViewById(R.id.buttonHome)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonRetry)).setOnClickListener(this);

        List<String> number=new ArrayList<String>();
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");

        Collections.shuffle(number);


        b1.setText(number.get(0));
        b2.setText(number.get(1));
        b3.setText(number.get(2));
        b4.setText(number.get(3));
        b5.setText(number.get(4));
        b6.setText(number.get(5));
        b7.setText(number.get(6));
        b8.setText(number.get(7));
        b9.setText(number.get(8));

    }
    @Override
    public void onClick(View view){
        int id=view.getId();
        if(id==R.id.num1){

        }
        else if(id==R.id.num2){

        }
        else if(id==R.id.num3){

        }
        else if(id==R.id.num4){

        }
        else if(id==R.id.num5){

        }
        else if(id==R.id.num6){

        }
        else if(id==R.id.num7){

        }
        else if(id==R.id.num8){

        }
        else if(id==R.id.num9){

        }
        else if(id==R.id.buttonHome){
            Intent intenthome=new Intent(getApplication(), MainActivity.class);
            startActivity(intenthome);
        }
        else if(id==R.id.buttonRetry){

        }

    }
}