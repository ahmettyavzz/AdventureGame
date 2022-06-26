package com.adventureGame.entities.abstracts;

import com.adventureGame.entities.concretes.Player;

public abstract class SafeLocation extends Location{

	
	
	public SafeLocation(Player player, String name,int id) {
		super(player, name,id);

	}



	@Override
	public boolean onLocation() {
		return true;
	}
}
