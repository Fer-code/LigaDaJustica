package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class FlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
    }
    public void enviarEmail(View view) throws UnsupportedEncodingException {

        String uriText =
                "mailto:fernandakui28@gmail.com" +
                        "?subject=" + URLEncoder.encode("Informe o assunto", "utf-8") +
                        "&body=" + URLEncoder.encode("O que gostaria do laboratório S.T.A.R ?", "utf-8");
        Uri uri = Uri.parse(uriText);
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(uri);
        startActivity(Intent.createChooser(it, "Para enviar email"));

    }


}