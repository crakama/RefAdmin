package com.crakama.refugee.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.crakama.refugee.R;
import com.crakama.refugee.models.MainModel;

import java.util.List;

/**
 * Created by crakama on 11/30/2016.
 */

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.MainModelVH> {
    private Context mcontext;
    private List<MainModel> mainModels;
    public class MainModelVH extends RecyclerView.ViewHolder{
        private TextView main_cv_title;
        private ImageView main_cv_img;

        public MainModelVH(View itemView) {
            super(itemView);
            main_cv_img = (ImageView) itemView.findViewById(R.id.cv_img_reportOptn);
            main_cv_title = (TextView) itemView.findViewById(R.id.txttown_name);
        }
    }

    public HomeScreenAdapter(List<com.crakama.refugee.models.MainModel> list){
        this.mainModels = list;
    }
    @Override
    public MainModelVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View rv_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_cv,parent,false);
        return new MainModelVH(rv_view);
    }
    @Override
    public void onBindViewHolder(MainModelVH holder, int position) {
        MainModel reportModel = mainModels.get(position);
        holder.main_cv_img.setImageResource(reportModel.getImg());
        holder.main_cv_title.setText(reportModel.getTitle());

    }
    @Override
    public int getItemCount() {
        return mainModels.size() ;
    }

}