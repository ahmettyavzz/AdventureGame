package com.adventureGame.entities.concretes;

import com.adventureGame.entities.abstracts.BaseArmor;
import com.adventureGame.entities.abstracts.BaseGun;
import com.adventureGame.entities.concretes.guns.Punch;

public class Inventory {
	
	private boolean water=false;
	private boolean food=false;
	private boolean firewoord=false;
	
	
	

	
	private BaseArmor baseArmor;
	
	
	public Inventory() {
		this.baseGun = new Punch();
		
	}


	public BaseGun getBaseGun() {
		return baseGun;
	}


	public void setBaseGun(BaseGun baseGun) {
		this.baseGun = baseGun;
	}


	public BaseArmor getBaseArmor() {
		return baseArmor;
	}


	public void setBaseArmor(BaseArmor baseArmor) {
		this.baseArmor = baseArmor;
	}
	
	
	
	private BaseGun baseGun;
	public boolean isWater() {
		return water;
	}


	public void setWater(boolean water) {
		this.water = water;
	}


	public boolean isFood() {
		return food;
	}


	public void setFood(boolean food) {
		this.food = food;
	}


	public boolean isFirewoord() {
		return firewoord;
	}


	public void setFirewoord(boolean firewoord) {
		this.firewoord = firewoord;
	}


	
}
