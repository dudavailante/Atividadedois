package br.com.mariaeduarda.splashduda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread1= new Thread(){
            @Override
            public void run(){

                try {
                    sleep(4500);
                    startActivity(new Intent(MainActivity.this,TelaLo.class));
                    finish();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }
        }; thread1.start();

    }
}