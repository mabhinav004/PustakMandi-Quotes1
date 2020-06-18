package com.ishika.pustakmandiquotes.ui.feed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ishika.pustakmandiquotes.R;

import java.util.ArrayList;

public class feedFragment extends Fragment {

    private feedViewModel feedViewModel;
    RecyclerView recyclerView;
    feedAdapter adapter;
    ArrayList<String> items;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        feedViewModel =
                ViewModelProviders.of(this).get(feedViewModel.class);
        View root = inflater.inflate(R.layout.feedfrag, container, false);
        items=new ArrayList<>();
        items.add("Mishra topper");
        items.add("Mishra pro topper");
        items.add("Mishra ultimate topper");
        items.add("Mishra ultimate pro topper");
        items.add("Mishra infinity topper max");
        recyclerView= root.findViewById(R.id.FeedRecycle);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new feedAdapter(getContext(),items);
        recyclerView.setAdapter((RecyclerView.Adapter) adapter);
        return root;
    }
}
