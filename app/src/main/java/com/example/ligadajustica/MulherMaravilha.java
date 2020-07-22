package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MulherMaravilha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_maravilha);
    }

    public void efetuarBusca(View view)
    {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Mulher Maravilha";
        intent.putExtra(SearchManager.QUERY, query);
        startActivity(intent);
    }
    public void imagemLaço(View a)
    {
        Uri uri = Uri.parse("https://www.google.com.br/search?q=la%C3%A7o+da+verdade&sxsrf=ALeKk015N3ieu4fRcSnmC7IqrBi-yTTabQ:1595377594004&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiEo5fWzN_qAhVhK7kGHWn9DvwQ_AUoAnoECAwQBA&biw=1366&bih=657");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Intent.createChooser(it, "Selecione"));

    }
}