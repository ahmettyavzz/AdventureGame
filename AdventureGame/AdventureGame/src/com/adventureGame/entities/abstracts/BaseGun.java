package com.adventureGame.entities.abstracts;

public abstract class BaseGun {

	private int id;
	private int damage;
	private int money;
	private String nameGun;
	
	
	public BaseGun(int id, int damage, int money,String nameGun) {
		super();
		this.id = id;
		this.damage = damage;
		this.money = money;
		this.nameGun=nameGun;
	}

	

	public String getNameGun() {
		return nameGun;
	}

	public int getId() {
		return id;
	}

	public int getDamage() {
		return damage;
	}

	public int getMoney() {
		return money;
	}

	
}
