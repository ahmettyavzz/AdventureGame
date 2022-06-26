package com.adventureGame.entities.concretes.locations;

import com.adventureGame.entities.abstracts.SafeLocation;
import com.adventureGame.entities.concretes.Player;

public class SafeHouse extends SafeLocation{

	
	public SafeHouse(Player player) {
		super(player, "Safe House",1);
	
	}
 
	
	public void regeneration(Player player) {
		int oldValue=player.getHealthy();
		int zirhGucu;
		try {
			zirhGucu=player.getInventory().getBaseArmor().getSave();
		} catch (Exception e) {
			zirhGucu=0;
		}
		
		System.out.print("Your soul is renewed! "+oldValue+" --> ");
		player.setHealthy(player.getOriginalHealthy()+zirhGucu);
		System.out.println(player.getHealthy()); 
		
	}
	
	
	@Override
	public boolean onLocation() {
		
		System.out.println("You are in safe house!");
		regeneration(getPlayer());
		return super.onLocation();
		
		
	}

	

}
