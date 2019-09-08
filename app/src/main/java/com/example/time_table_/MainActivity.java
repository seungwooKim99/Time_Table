package com.example.time_table_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    SingerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);

        adapter = new SingerAdapter();

        for(int i = 0;i<7;i++){
            for(int j=0;j<8;j++){
                adapter.addItem(new TimeCell());
            }
        }
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               TimeCell item = (TimeCell)adapter.getItem(position);
               Toast.makeText(getApplicationContext(), "선택 : "+  position, Toast.LENGTH_LONG).show();

            }
        });
        TimeCell item = (TimeCell)adapter.getItem(20);

    }

    class SingerAdapter extends BaseAdapter {
        ArrayList<TimeCell> items = new ArrayList<TimeCell>();

        @Override
        public int getCount(){
            return items.size();
        }

        public void addItem(TimeCell item){
            items.add(item);
        }

        @Override
        public Object getItem(int position){
            return items.get(position);
        }

        @Override
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup){
            TimeCellView view = new TimeCellView(getApplicationContext());
            TimeCell item = items.get(position);

            return view;
        }
    }
}
