package com.example.dz6;

public class Music {

	private String time;
	private String nameSong;
	private String name;
	private String number;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNameSong() {
		return nameSong;
	}

	public void setNameSong(String nameSong) {
		this.nameSong = nameSong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Music(String time, String nameSong, String name, String number) {
		this.time = time;
		this.nameSong = nameSong;
		this.name = name;
		this.number = number;
	}
}
