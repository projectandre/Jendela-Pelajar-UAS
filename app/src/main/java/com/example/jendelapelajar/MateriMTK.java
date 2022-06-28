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

public class MateriMTK extends AppCompatActivity {
    ArrayList<Data_mtk> list;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_mtk);
    getSupportActionBar().setTitle("SOAL MATEMATIKA");
    data();
    listView = findViewById(R.id.listview);
    Adapter_MTK adapter = new Adapter_MTK(getApplicationContext(), list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent myIntent = new Intent(view.getContext(), Kuis_Mtk_Kelas4.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 1) {
                    Intent myIntent = new Intent(view.getContext(), Kuis_Mtk_Kelas5.class);
                    startActivityForResult(myIntent, 0);
                }
                if (i == 2) {
                    Intent myIntent = new Intent(view.getContext(), Kuis_Mtk_Kelas6.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

}


    void data() {
        list = new ArrayList<>();
        list.add(new Data_mtk("Kelas-4"));
        list.add(new Data_mtk("Kelas-5"));
        list.add(new Data_mtk("Kelas-6"));

    }

}


class Data_mtk {
    String materi_mtk = "";
    Data_mtk(String materi_mtk){
        this.materi_mtk = materi_mtk;
    }

    public String getMateri_mtk() {
        return materi_mtk;
    }
}

class Adapter_MTK extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Data_mtk> model;

    Adapter_MTK(Context context, ArrayList<Data_mtk> model)
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
        View view1 = layoutInflater.inflate(R.layout.list_item_mtk, viewGroup, false);
        materi = view1.findViewById(R.id.materi);

        materi.setText(model.get(i).getMateri_mtk());
        return view1;
    }
}