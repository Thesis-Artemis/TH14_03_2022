package com.example.on_gk_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DonutAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;


    public DonutAdapter(Context ctx, int layoutItem, ArrayList<SpDonut> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
       this.arrayList= arrayList;
    }
    ArrayList<SpDonut> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);

        TextView tvName = view.findViewById(R.id.tvName);
        TextView chuThich = view.findViewById(R.id.tvChuThich);
        TextView gia = view.findViewById(R.id.tvGia);
        ImageView imgDonut = view.findViewById(R.id.imgDonut);

        tvName.setText(arrayList.get(i).getName());
        chuThich.setText(arrayList.get(i).getChuThich());
        gia.setText(arrayList.get(i).getGiaTien());
        imgDonut.setImageResource(arrayList.get(i).getImageDonut());

        return view;
    }
}
