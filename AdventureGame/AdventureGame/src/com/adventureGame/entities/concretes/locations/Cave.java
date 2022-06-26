package com.adventureGame.entities.concretes.locations;

import com.adventureGame.entities.abstracts.BattleLocation;
import com.adventureGame.entities.concretes.Player;
import com.adventureGame.entities.concretes.monsters.Zombie;

public class Cave extends BattleLocation{

	
	
	public Cave(Player player) {
		super(player,"Cave",1,new Zombie(),3);
	}

	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void geldiMi(Player player) {

		System.out.println("You got the -food- award in the Cave!");
		player.getInventory().setFood(true);
		
	}

	

	

	
}
