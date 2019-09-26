package com.example.a1parcial_luistorres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     SeekBar seekBartransparente;
     View color;
     TextView textViewcolor;
     ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = findViewById(R.id.viewColor);
        seekBartransparente = findViewById(R.id.seekBar4);
        textViewcolor = findViewById(R.id.textViewAlpha);
        listView = findViewById(R.id.listacolores2);


        seekBartransparente.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progreso, boolean b) {
                textViewcolor.setText("Alpha:  " + progreso);
                color.setAlpha(seekBartransparente.getProgress()/100f);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final claseAdapter adapter = new claseAdapter(listacolores.provideItems());

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapter.getItem(i);
                color.setBackgroundColor(ContextCompat.getColor(view.getContext(), adapter.getItem(i).getColorId()));
            }
        });

        listView.setAdapter(adapter);
    }
}