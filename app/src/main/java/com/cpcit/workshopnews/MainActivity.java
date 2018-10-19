package com.cpcit.workshopnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.cpcit.workshopnews.adapter.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNews = (ListView) findViewById(R.id.lv_news);



        initListView();


    }

    private void initListView() {
        //TODO init list view.
        List<String> dataNews = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataNews.add("");
        }
        NewsAdapter newsAdapter = new NewsAdapter(this, dataNews);
        lvNews.setAdapter(newsAdapter);
        lvNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this, NewsDetailActivity.class));
            }
        });
    }
}
