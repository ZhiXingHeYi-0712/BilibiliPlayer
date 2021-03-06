package com.github.zhixingheyi0712.bilibiliplayer.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.zhixingheyi0712.bilibiliplayer.FavListContentActivity;
import com.github.zhixingheyi0712.bilibiliplayer.R;
import com.github.zhixingheyi0712.bilibiliplayer.util.FavListObject;
import com.github.zhixingheyi0712.bilibiliplayer.util.GlobalVariables;

import java.util.List;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder> {
    private List<FavListObject> favListObjects;

    private Activity playListActivity;

    static class ViewHolder extends RecyclerView.ViewHolder {
        View favListView;
        TextView name;
        public ViewHolder(@NonNull View view) {
            super(view);
            favListView = view;
            name = view.findViewById(R.id.playlist_item_name);
        }
    }

    public PlaylistAdapter(List<FavListObject> favListObjects) {
        this.favListObjects = favListObjects;
    }

    @NonNull
    @Override
    public PlaylistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_item, parent, false);
        PlaylistAdapter.ViewHolder holder = new ViewHolder(view);

        holder.favListView.setOnClickListener(v -> {
            int position = holder.getLayoutPosition();
            FavListObject favList = favListObjects.get(position);

            Intent intent = new Intent(playListActivity, FavListContentActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("fid", favList.getFid());
            intent.putExtra("name", favList.getListName());
            playListActivity.startActivityForResult(intent, GlobalVariables.RETURN_SONG_LIST_INTENT_CODE);
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistAdapter.ViewHolder holder, int position) {
        FavListObject favListObject = favListObjects.get(position);
        holder.name.setText(favListObject.getListName());
    }

    @Override
    public int getItemCount() {
        return favListObjects.size();
    }

    public void setPlayListActivity(Activity playListActivity) {
        this.playListActivity = playListActivity;
    }
}
