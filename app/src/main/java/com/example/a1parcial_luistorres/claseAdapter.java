package com.example.a1parcial_luistorres;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class claseAdapter extends BaseAdapter {

private ArrayList<ViewItem> items;

public claseAdapter(ArrayList<ViewItem> items) {this.items = items; }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ViewItem getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview, viewGroup, false);
        }
        decorateWith(view, items.get(i));
        return view;
    }

    private void decorateWith(View view, ViewItem ViewItem){
        ImageView ImageView = view.findViewById(R.id.imageView2);
        TextView TextView = view.findViewById(R.id.textView2);
        ImageView.setImageResource(ViewItem.getImageResource());
        TextView.setText(ViewItem.getTitle());

    }
}
