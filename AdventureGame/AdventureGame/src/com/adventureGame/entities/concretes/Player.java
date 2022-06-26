package com.adventureGame.entities.concretes;

import com.adventureGame.entities.abstracts.BaseChar;

public class Player {

	private  int damage;	
	private int healthy;
	private int money;
	private String nameChar;
	private String namePlayer;
	private Inventory inventory;
	private int originalHealthy;
	
	private BaseChar baseChar;
	
	public Player(String namePlayer,BaseChar baseChar) {
		this.damage=baseChar.getDamage();
		this.healthy=baseChar.getHealthy();
		this.money=baseChar.getMoney();
		this.nameChar=baseChar.getNameChar();
		this.inventory= new Inventory();
		this.namePlayer=namePlayer;
		this.baseChar=baseChar;
		this.originalHealthy=baseChar.getOriginalHealthy();
	}

	
	
	
	public String getNamePlayer() {
		return namePlayer;
	}




	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}




	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getNameChar() {
		return nameChar;
	}

	public void setNameChar(String nameChar) {
		this.nameChar = nameChar;
	}


	public Inventory getInventory() {
		return inventory;
	}



	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}




	public int getOriginalHealthy() {
		return originalHealthy;
	}




	public void setOriginalHealthy(int originalHealthy) {
		this.originalHealthy = originalHealthy;
	}
	
	
	
}
