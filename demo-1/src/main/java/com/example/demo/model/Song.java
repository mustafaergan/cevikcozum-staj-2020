package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
@Id
	private long id;
	private String songname;
	
	
	

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	@Override
	public String toString() {
		return "Song [songname=" + songname + "]";
	}
	
	
	
	
	
}
