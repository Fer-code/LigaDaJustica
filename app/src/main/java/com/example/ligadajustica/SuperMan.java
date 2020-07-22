package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SuperMan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_man);
    }
    public void fortalezaSolidao(View s) {
        Uri uri = Uri.parse("https://www.google.com.br/search?q=fortaleza+super+man&tbm=isch&ved=2ahUKEwjEgsjXzN_qAhVIA7kGHZuHCLIQ2-cCegQIABAA&oq=fortaleza+super+man&gs_lcp=CgNpbWcQAzoECCMQJzoCCAA6BAgAEB46BAgAEBg6BwgjEOoCECc6BQgAELEDOggIABCxAxCDAToECAAQQzoHCAAQsQMQQzoECAAQAzoGCAAQChAYOgYIABAFEB46BggAEAgQHlC-uQtYrPoLYK3_C2gCcAB4A4AB4AGIAeMdkgEGMS4zMS4xmAEAoAEBqgELZ3dzLXdpei1pbWewAQrAAQE&sclient=img&ei=vIcXX8S0NsiG5OUPm4-ikAs&bih=657&biw=1366#imgrc=XEmoLNXxaGtI_M");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(Intent.createChooser(it, "Selecione"));
    }



}