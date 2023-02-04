package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void guess(View view){

        EditText editText =(EditText) findViewById(R.id.editText);
        String  numberString = editText.getText().toString();
        int guessNumber = Integer.parseInt(numberString);
        String message;

        if(guessNumber > randomNumber){
            message = "Lower !";
        }
        else if( guessNumber < randomNumber){
            message = "Higher !";
        }
        else{
            message="You have guessed correctly ! Try again";
            Random rand = new Random();
            randomNumber = rand.nextInt(20)+1;
        }

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
