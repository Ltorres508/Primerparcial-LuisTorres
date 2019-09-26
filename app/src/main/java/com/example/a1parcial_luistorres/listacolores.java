package com.example.a1parcial_luistorres;

import java.util.ArrayList;

public class listacolores {

public static ArrayList<ViewItem> provideItems(){
    ArrayList<ViewItem> list = new ArrayList<>();
    list.add(new ViewItem(R.drawable.circulo1,  "blue_bright", android.R.color.holo_blue_bright));
    list.add(new ViewItem(R.drawable.circulo2, "blue_light", android.R.color.holo_blue_light));
    list.add(new ViewItem(R.drawable.circulo3, "green_light", android.R.color.holo_green_light));
    list.add(new ViewItem(R.drawable.circulo4, "orange_light", android.R.color.holo_orange_light));
    list.add(new ViewItem(R.drawable.circulo5, "red_light", android.R.color.holo_red_light));
    list.add(new ViewItem(R.drawable.circulo6, "purple", android.R.color.holo_purple));
    list.add(new ViewItem(R.drawable.circulo7, "blue_dark", android.R.color.holo_blue_dark));
    list.add(new ViewItem(R.drawable.circulo8, "green_dark", android.R.color.holo_green_dark));
    list.add(new ViewItem(R.drawable.circulo9, "red_dark", android.R.color.holo_red_dark));
    list.add(new ViewItem(R.drawable.circulo10, "orange_dark", android.R.color.holo_orange_dark));
    return list;
}
}
