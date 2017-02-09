package com.example.formador.miparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ActividadDestino.class);

        Persona p = new Persona("Pablo", 36);
        PersonaParcelable pp = new PersonaParcelable("Fernando" , 32, "López");

        intent.putExtra("persona", p);
        intent.putExtra("personap" , pp);


        startActivity(intent);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
