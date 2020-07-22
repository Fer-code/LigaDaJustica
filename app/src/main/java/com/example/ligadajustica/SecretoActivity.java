package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecretoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secreto);
    }
    public void telefoneSecreto(View tl)
    {
        Uri uri = Uri.parse("tel: 11 983676652");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);

    }
}