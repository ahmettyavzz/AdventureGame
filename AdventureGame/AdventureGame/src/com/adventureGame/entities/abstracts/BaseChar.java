package com.adventureGame.entities.abstracts;

public abstract class BaseChar {
		private  int id;
		private  int damage;
		private String nameChar;
		private int healthy;
		private int money;
		private int originalHealthy;
		
		
		public BaseChar(int id, int damage,String nameChar, int healthy, int money,int originalHealthy) {
			super();
			this.id = id;
			this.damage = damage;
			this.healthy = healthy;
			this.money = money;
			this.nameChar=nameChar;
			this.originalHealthy=originalHealthy;	
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNameChar() {
			return nameChar;
		}
		public void setNameChar(String nameChar) {
			this.nameChar = nameChar;
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

		public int getOriginalHealthy() {
			return originalHealthy;
		}

		public void setOriginalHealthy(int originalHealthy) {
			this.originalHealthy = originalHealthy;
		}
		
		
		
}
