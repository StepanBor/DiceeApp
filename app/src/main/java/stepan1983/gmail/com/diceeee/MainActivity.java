package stepan1983.gmail.com.diceeee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton=findViewById(R.id.rollButton);

        final ImageView leftDice=findViewById(R.id.leftDice);
        final ImageView rightDice=findViewById(R.id.rightDice);

        final List<Integer> diceList=new ArrayList<>();

        diceList.add(R.drawable.dice1);
        diceList.add(R.drawable.dice2);
        diceList.add(R.drawable.dice3);
        diceList.add(R.drawable.dice4);
        diceList.add(R.drawable.dice5);
        diceList.add(R.drawable.dice6);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumbersGenerator=new Random();
                int randomNumberLeft=randomNumbersGenerator.nextInt(6);
                int randomNumberRight=randomNumbersGenerator.nextInt(6);

                leftDice.setImageResource(diceList.get(randomNumberLeft));
                rightDice.setImageResource(diceList.get(randomNumberRight));
            }
        });

    }
}
