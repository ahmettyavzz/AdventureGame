package com.adventureGame.entities.concretes.locations;

import com.adventureGame.entities.abstracts.BattleLocation;
import com.adventureGame.entities.concretes.Player;
import com.adventureGame.entities.concretes.monsters.Bear;

public class River extends BattleLocation{

	
	public River(Player player) {
		super(player,"River",3,new Bear(),2);
	}

	@Override
	public boolean onLocation() {
		return false;
	}

	@Override
	public void geldiMi(Player player) {
		System.out.println("You got the -water- award in the River!");
		player.getInventory().setWater(true);		
	}

}
