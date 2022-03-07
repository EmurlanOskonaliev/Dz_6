package com.example.dz6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz6.databinding.ItemSongBinding;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {
	private ArrayList<Music> list;

	Music music;
	Click click;

	public MusicAdapter(ArrayList<Music> list,Click click) {
		this.list = list;
		this.click= click;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new ViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		holder.bind(list.get(position));
	}

	@Override
	public int getItemCount() {
		return list.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		ItemSongBinding binding;
		public ViewHolder(@NonNull  ItemSongBinding itemView) {
			super(itemView.getRoot());
			binding = itemView;
		}

		public void bind(Music music) {
			binding.tvNameA.setText(music.getName());
			binding.tvName.setText(music.getNameSong());
			binding.tvNumber.setText(music.getNumber());
			binding.tvTime.setText(music.getTime());
			itemView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					click.onClick(list.get(getLayoutPosition()));
				}
			});
		}
	}
}
