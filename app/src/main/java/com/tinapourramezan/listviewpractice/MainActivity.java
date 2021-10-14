package com.tinapourramezan.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Language> arrayList = new ArrayList<>();
    private ListView languageslist;
    ListAdaptor adaapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList.add(new Language("English", "Spoken in England", R.drawable.gb));
        arrayList.add(new Language("French", "Spoken in France", R.drawable.fr));
        arrayList.add(new Language("Greek", "Spoken in Greece", R.drawable.gr));
        arrayList.add(new Language("German", "Spoken in Germany", R.drawable.de));
        arrayList.add(new Language("Italian", "Spoken in Italy", R.drawable.it));
        arrayList.add(new Language("Spanish", "Spoken in Spain", R.drawable.es));
        arrayList.add(new Language("Persian", "Spoken in Iran", R.drawable.ir));
        arrayList.add(new Language("Turkish", "Spoken in Turkey", R.drawable.tr));
        arrayList.add(new Language("Korean", "Spoken in Korea", R.drawable.kr));
        arrayList.add(new Language("Chinese", "Spoken in China", R.drawable.cn));
        arrayList.add(new Language("Japanese", "Spoken in Japan", R.drawable.jp));
        arrayList.add(new Language("Indian", "Spoken in India", R.drawable.in));
//
        languageslist = findViewById(R.id.languageslist);
        adaapter = new ListAdaptor(this, arrayList);
        languageslist.setAdapter(adaapter);


    }
}