package com.tinapourramezan.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdaptor extends ArrayAdapter<Language>   {

public ListAdaptor(Context context, ArrayList<Language> languageArrayList){
  super(context,R.layout.list_item,languageArrayList);
}



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
     Language language = getItem(position);
     if (convertView==null){
         convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
     }
        TextView languageTitle = convertView.findViewById(R.id.languageTitle);
        TextView languageDescription = convertView.findViewById(R.id.languageDescription);
        ImageView flagIMage = convertView.findViewById(R.id.flagImage);

        languageTitle.setText(language.languageName);
        languageDescription.setText(language.languageDescription);
        flagIMage.setImageResource(language.flagImage);
      
        return convertView;
    }
}
