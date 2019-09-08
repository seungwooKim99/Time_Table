package com.example.time_table_;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TimeCellView extends LinearLayout {
    LinearLayout backGround;

    public TimeCellView(Context context){
        super(context);
        init(context);
    }
    public TimeCellView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.time_cell, this, true);

        backGround = (LinearLayout)findViewById(R.id.backGround);

    }
}
