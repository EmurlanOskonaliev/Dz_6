package com.example.dz6;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements Click {


	FragmentSecondBinding binding;
	ArrayList<Music> list = new ArrayList<>();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		binding = FragmentSecondBinding.inflate(inflater, container, false);
		return binding.getRoot();
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));
		list.add(new Music("3:33","get you","Mirbek Atabekov","1"));

		MusicAdapter musicAdapter = new MusicAdapter(list,this::onClick);
		binding.rvSecond.setAdapter(musicAdapter);
	}

	@Override
	public void onClick(Music music) {
		Intent intent = new Intent(getActivity(),MainActivity2.class);
		intent.putExtra("Key", music.getNameSong());
		startActivity(intent);
	}
}