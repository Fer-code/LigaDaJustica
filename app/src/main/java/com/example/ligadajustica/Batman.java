package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Batman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman);
    }
    public void siteDCBT(View view)
    {
        Uri uri = Uri.parse("https://www.dccomics.com/characters/batman");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Intent.createChooser(it, "Selecione"));

    }
    public void verMapa(View mapa)
    {


       Uri location = Uri.parse("geo: -23.5274603,-46.6640128?z=17");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent );
    }

}