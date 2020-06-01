package com.example.dice_gamble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public static int randomdicevalue()
    {
        return RANDOM.nextInt(6) + 1 ;
    }

    private Button rolldices ;
     private ImageView imageview1 , imageview2 ;

    public static final Random RANDOM = new Random() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rolldices = (Button) findViewById(R.id.roll_button) ;

        imageview1 = (ImageView) findViewById(R.id.image_leftdice) ;
        imageview2 = (ImageView) findViewById(R.id.image_rightdice) ;

        final int[] dicearray = { R.drawable.dice1 , R.drawable.dice2 , R.drawable.dice3 , R.drawable.dice4 , R.drawable.dice5 , R.drawable.dice6 } ;

        rolldices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int var  = randomdicevalue() ;

                imageview1.setImageResource(dicearray[var-1]);
                var = randomdicevalue() ;
                imageview2.setImageResource(dicearray[var-1]);
            }
        });

    }

}
