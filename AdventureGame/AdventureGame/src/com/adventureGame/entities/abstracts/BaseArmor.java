package com.adventureGame.entities.abstracts;

public abstract class BaseArmor {

	private int id;
	private int save;
	private int money;
	private String nameArmor;
	
	public BaseArmor(int id, int save,int money,String nameArmor) {
		super();
		this.id = id;
		this.save = save;
		this.money=money;
		this.nameArmor=nameArmor;
	}

	

	public String getNameArmor() {
		return nameArmor;
	}

	public int getMoney() {
		return money;
	}



	public int getId() {
		return id;
	}

	public int getSave() {
		return save;
	}


}
