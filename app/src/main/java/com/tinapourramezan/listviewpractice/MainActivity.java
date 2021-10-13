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

        arrayList.add(new Language("English", "Spoken in England"));
        arrayList.add(new Language("French", "Spoken in France"));
        arrayList.add(new Language("Greek", "Spoken in Greece"));
        arrayList.add(new Language("German", "Spoken in Germany"));
//
        languageslist = findViewById(R.id.languageslist);
        adaapter = new ListAdaptor(this, arrayList);
        languageslist.setAdapter(adaapter);


    }
}