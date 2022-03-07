package com.example.dz6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dz6.databinding.ActivityMain2Binding;
import com.example.dz6.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity implements Click {
	private ActivityMain2Binding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityMain2Binding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());
		String s = getIntent().getStringExtra("Key");
		binding.tvSet.setText(s);

    }

	@Override
	public void onClick(Music music) {

	}
}