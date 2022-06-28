package com.example.jendelapelajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MateriPKN extends AppCompatActivity {
    ArrayList<Data_pkn> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("SOAL PKN");

        setContentView(R.layout.activity_materi_pkn);
        data();
        listView = findViewById(R.id.listview);
        Adapter_PKN adapter = new Adapter_PKN(getApplicationContext(), list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent myIntent = new Intent(view.getContext(), Kuis_Pkn_Kelas4.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 1) {
                    Intent myIntent = new Intent(view.getContext(), Kuis_Pkn_Kelas5.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 2) {
                    Intent myIntent = new Intent(view.getContext(), Kuis_Pkn_Kelas6.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });
    }


    void data() {
        list = new ArrayList<>();
        list.add(new Data_pkn("Kelas-4"));
        list.add(new Data_pkn("Kelas-5"));
        list.add(new Data_pkn("Kelas-6"));
    }

}


    class Data_pkn {
        String materi_pkn = "";
        Data_pkn(String materi_pkn){
            this.materi_pkn = materi_pkn;
        }

        public String getMateri_pkn() {
            return materi_pkn;
        }
    }

    class Adapter_PKN extends BaseAdapter {
        LayoutInflater layoutInflater;
        Context context;
        ArrayList<com.example.jendelapelajar.Data_pkn> model;

        Adapter_PKN(Context context, ArrayList<com.example.jendelapelajar.Data_pkn> model)
        {
            this.context = context;
            this.layoutInflater = LayoutInflater.from(context);
            this.model = model;
        }

        @Override
        public int getCount() {
            return model.size();
        }

        @Override
        public Object getItem(int index) {
            return model.get(index);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        TextView materi;
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = layoutInflater.inflate(R.layout.list_item_pkn, viewGroup, false);
            materi = view1.findViewById(R.id.materi);

            materi.setText(model.get(i).getMateri_pkn());
            return view1;
        }
    }
