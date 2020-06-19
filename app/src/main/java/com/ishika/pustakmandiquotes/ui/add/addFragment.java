package com.ishika.pustakmandiquotes.ui.add;

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

import com.ishika.pustakmandiquotes.R;

public class addFragment extends Fragment {

    private com.ishika.pustakmandiquotes.ui.add.addViewModel addViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addViewModel =
                ViewModelProviders.of(this).get(com.ishika.pustakmandiquotes.ui.add.addViewModel.class);
        View root = inflater.inflate(R.layout.addfrag, container, false);

        return root;
    }
}


