package com.adventureGame.entities.concretes.locations;

import com.adventureGame.entities.abstracts.BattleLocation;
import com.adventureGame.entities.concretes.Player;
import com.adventureGame.entities.concretes.monsters.Vampire;

public class Forest extends BattleLocation{
	
	
	
	public Forest(Player player) {
		super(player ,"Forest",2, new Vampire(),3);
	}

	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void geldiMi(Player player) {
		System.out.println("You got the -firewoord- award in the Forest!");
		player.getInventory().setFirewoord(true);
	}

}
