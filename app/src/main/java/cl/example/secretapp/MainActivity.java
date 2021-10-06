package cl.example.secretapp;
//https://www.youtube.com/watch?v=b3hOM20aOgo
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnOtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOtra = findViewById(R.id.button);
        btnOtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OtraActivity.class); //el correcto llamado a la siguiente "página"
                startActivity(intent);
                FizzBuzz();
            }
        });



    }

    public void FizzBuzz(){
        //ver1
        int i;
        for (i=1; i < 31 ; i++) {
            //echo 'Contador for (i)'.$i;
            //System.out.println(" ");
            if (i%3 == 0) {
                System.out.println(" FIZZ ");
                //echo 'FIZZ ';
            }else if (i%5 == 0) {
                System.out.println(" BUZZ ");
                //echo ' BUZZ ';
            }else if (i%3 == 0 && i%5 == 0) {
                        System.out.println(" FIZZBUZZ MUTAFUKA! ");
                        //echo ' FIZZBUZZ MUTAFUKA! ';
            }else{
                System.out.println(i);
                //echo i;
            }

            //echo '<br>'; //al menos lo muestra en la consola. Aún no sabría como mostrarlo por pantalla
            //echo '<br>'; //me imprime los 3 y los 5
        }


    }

}