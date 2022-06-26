package com.adventureGame.entities.abstracts;

import com.adventureGame.entities.concretes.Player;

public abstract class Location {

	private int id;
	private Player player;
	private String name;
	
	public Location(Player player, String name,int id) {
		super();
		this.player = player;
		this.name = name;
		this.id=id;
	}
	
	
	public abstract boolean onLocation();
	



	public Player getPlayer() {
		return player;
	}




	public void setPlayer(Player player) {
		this.player = player;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}






	 
	
}
