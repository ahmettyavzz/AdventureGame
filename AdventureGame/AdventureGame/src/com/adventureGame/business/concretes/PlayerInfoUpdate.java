package com.adventureGame.business.concretes;

import com.adventureGame.entities.concretes.Player;

public class PlayerInfoUpdate {
	
	
	
		public  void updateDamage(Player player,int damageValue) {
			
			player.setDamage(player.getDamage()+damageValue);
			
			//return player;
		}
	
		public void updateMoney(Player player,int moneyValue) {
			
			player.setMoney(player.getMoney()-moneyValue);
				
		}
		
		public void updateHealth(Player player,int healthValue) {
			
			player.setHealthy(player.getHealthy()+healthValue);
		}
		
}
