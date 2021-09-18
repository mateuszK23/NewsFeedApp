package com.matty.newsfeedapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HealthFragment extends HomeFragment {
    private ArrayList<Article> articles;
    private Adapter adapter;
    private RecyclerView recyclerView;
    private String category = "health";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.health_fragment, null);
        recyclerView = view.findViewById(R.id.recyclerViewHealth);

        articles = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), articles);
        recyclerView.setAdapter(adapter);

        findNews();
        return view;
    }

    public void findNews()
    {
        super.findCategorisedNews(category, articles, adapter);

    }
}
