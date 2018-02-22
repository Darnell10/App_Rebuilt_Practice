package c4q.com.app_rebuild_practice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import c4q.com.app_rebuild_practice.modelclasses.Results;

/**
 * Created by D on 2/22/18.
 */

public class RvAdapter extends RecyclerView.Adapter<ViewHolder>{

    List<Results> resultsList;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Results results =resultsList.get(position);
        holder.onbind(results);

    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }
}
