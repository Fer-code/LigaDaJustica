package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  escolha(View m){

        RadioButton mullerM = (RadioButton)findViewById(R.id.mm);
        RadioButton superM = (RadioButton)findViewById(R.id.idSP) ;
        RadioButton batman = (RadioButton) findViewById(R.id.idBt) ;
        RadioButton flash = (RadioButton) findViewById(R.id.idFlash);
        Button secreto = (Button) findViewById(R.id.btnSecreto);

            if(mullerM.isChecked()) {
                Intent intent = new Intent(this, MulherMaravilha.class);
                startActivity(intent);
            }
            if(superM.isChecked()) {
                Intent superMan = new Intent(this, SuperMan.class);
                startActivity(superMan);
            }
            if(batman.isChecked()) {
            Intent bat = new Intent(this, Batman.class);
            startActivity(bat);
             }
            if(flash.isChecked()) {
            Intent fla = new Intent (this, FlashActivity.class);
            startActivity(fla);
             }

    }
    public void botaoSecreto(View bs){
            Intent btS = new Intent (this, SecretoActivity.class);
            startActivity(btS);
    }


}