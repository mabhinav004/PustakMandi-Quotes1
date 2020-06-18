package com.ishika.pustakmandiquotes.ui.feed;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ishika.pustakmandiquotes.R;

import java.util.List;
public class feedAdapter extends RecyclerView.Adapter<feedAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<String> data;
    List<Image> list;

    public feedAdapter(Context context, List<String> data) {
        this.layoutInflater=LayoutInflater.from(context);
        this.data=data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =layoutInflater.inflate(R.layout.feed_customview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //  bind the textview with data recieved
        String title=data.get(position);
        holder.textTitle.setText(title);
        // new image for each card and description
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            int i=0;
            textTitle=itemView.findViewById(R.id.textTitle);
        }
    }
}

