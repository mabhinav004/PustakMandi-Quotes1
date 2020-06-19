package com.ishika.pustakmandiquotes.ui.bookmark;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ishika.pustakmandiquotes.R;

import java.util.ArrayList;

public class bookmarkFragment extends Fragment {

    private bookmarkViewmodel bookmarkViewmodel;
    RecyclerView recyclerView;
    bookAdapter adapter;
    ArrayList<String> items;

    private com.ishika.pustakmandiquotes.ui.bookmark.bookmarkViewmodel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(com.ishika.pustakmandiquotes.ui.bookmark.bookmarkViewmodel.class);
        View root = inflater.inflate(R.layout.bookmarkfrag, container, false);

        recyclerView= root.findViewById(R.id.bookmarkscreen);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        return root;
    }
}

