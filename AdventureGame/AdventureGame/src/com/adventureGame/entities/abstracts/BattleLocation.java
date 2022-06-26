package com.adventureGame.entities.abstracts;


import com.adventureGame.entities.concretes.Player;

public abstract class BattleLocation extends Location {

	
	private Player player;
	private BaseMonster baseMonster;
	private int maxMonster;
	//public static boolean aldiMi;
	
	public BattleLocation(Player player, String name, int id, BaseMonster baseMonster,int maxMonster) {
		super(player, name,id);
	
		this.baseMonster = baseMonster;
		this.maxMonster=maxMonster;
	}
	
	@Override
	public boolean onLocation() {
		
		
		
		return false;
	}
	
	
	
	public abstract void geldiMi(Player player);
	
	
	
	
	

	public Player getPlayer() {
		return player;
	}

	public BaseMonster getBaseMonster() {
		return baseMonster;
	}

	public void setBaseMonster(BaseMonster baseMonster) {
		this.baseMonster = baseMonster;
	}

	public int getMaxMonster() {
		return maxMonster;
	}

	


}
