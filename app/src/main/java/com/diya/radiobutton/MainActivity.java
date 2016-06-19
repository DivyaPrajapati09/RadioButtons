package com.diya.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId==R.id.male) {
            Toast.makeText(MainActivity.this, "you are Male", Toast.LENGTH_SHORT).show();
        }else if(checkedId==R.id.female){
            Toast.makeText(MainActivity.this, "You are Female", Toast.LENGTH_SHORT).show();

        }
    }
}
