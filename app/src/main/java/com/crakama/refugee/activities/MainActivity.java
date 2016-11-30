package com.crakama.refugee.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.crakama.refugee.R;
import com.crakama.refugee.adapters.HomeScreenAdapter;
import com.crakama.refugee.models.MainModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_mainscreen;
    LinearLayoutManager nwlinearLayoutManager;
    HomeScreenAdapter homeScreenAdapter;
    private List<MainModel> mainModelList = new ArrayList<>();

    public static final String TOWNS = "MainModel";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rv);

        homeNavigation();
        homeNavigationData();
    }

    public void homeNavigation() {
        nwlinearLayoutManager = new LinearLayoutManager(this);
        homeScreenAdapter = new HomeScreenAdapter(mainModelList);
        rv_mainscreen =(RecyclerView) findViewById(R.id.rv_reportOptions);
        rv_mainscreen.setLayoutManager(nwlinearLayoutManager);
        rv_mainscreen.setAdapter(homeScreenAdapter);
        rv_mainscreen.addOnItemTouchListener(new ReportItemClickListener(getApplicationContext(),
                new ReportItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
                        switch (i) {
                            case 0:
                                openUpdateNews();
                                break;
                            case 1:
                                // Toast.makeText(view.getContext(), "POSITION" + i, Toast.LENGTH_LONG).show();

                                openUpdateNoticeBoard();
                                break;
                            case 2:
                                // Toast.makeText(view.getContext(), "POSITION" + i, Toast.LENGTH_LONG).show();
                                openUpdateTownInfo();
                                break;
                            case 3:

                                //openUpdateTownInfo();
                                break;
                        }
                    }
                }));
    }


    private void openUpdateNews() {
        //u
        Intent reportIntent = new Intent( MainActivity.this, UpdateNews.class);
        startActivity(reportIntent);
    }

    private void openUpdateTownInfo() {
        Intent reportIntent = new Intent(MainActivity.this, UpdateHelpDesk.class);
        startActivity(reportIntent);
    }

    private void openUpdateNoticeBoard() {
        Intent reportIntent = new Intent( MainActivity.this, UpdateNoticeBoard.class);
        startActivity(reportIntent);
    }

    private void homeNavigationData() {
        MainModel model = new MainModel("Live News", R.drawable.news);
        mainModelList.add(model);

        model = new MainModel("Notice Board ",R.drawable.advert);
        mainModelList.add(model);

        model = new MainModel("Town Information ",R.drawable.about);
        mainModelList.add(model);

    }

}