package com.example.dz6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dz6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
	private ActivityMainBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityMainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());
		getSupportFragmentManager().beginTransaction().replace(R.id.container_app,new FirstFragment()).commit();
		getSupportFragmentManager().beginTransaction().replace(R.id.container_bottom,new SecondFragment()).commit();

	}
}