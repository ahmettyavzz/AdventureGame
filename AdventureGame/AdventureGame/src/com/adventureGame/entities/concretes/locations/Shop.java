package com.adventureGame.entities.concretes.locations;

import com.adventureGame.business.concretes.PlayerInfoUpdate;
import com.adventureGame.business.concretes.PlayerManager;
import com.adventureGame.entities.abstracts.BaseArmor;
import com.adventureGame.entities.abstracts.BaseGun;
import com.adventureGame.entities.abstracts.SafeLocation;
import com.adventureGame.entities.concretes.Player;
import com.adventureGame.entities.concretes.armors.ArmorHigh;
import com.adventureGame.entities.concretes.armors.ArmorLow;
import com.adventureGame.entities.concretes.armors.ArmorMedium;
import com.adventureGame.entities.concretes.guns.Pistol;
import com.adventureGame.entities.concretes.guns.Rifle;
import com.adventureGame.entities.concretes.guns.Sword;

public class Shop extends SafeLocation{

	Player player;
	
	public Shop(Player player) {
		super(player,"Tool Store",2);
		this.player=player;
	
	}

	@Override
	public boolean onLocation() {
		System.out.println("Welcome Tool Store!");
		buyEquipment();
		return super.onLocation();
	}

	
	
	BaseGun[] baseGunList= {new Pistol(),new Sword(),new Rifle()};
	BaseArmor[] baseArmorList= {new ArmorLow(),new ArmorMedium(),new ArmorHigh()};

	int selectedGun;
	int selectedArmor;
	
	PlayerInfoUpdate playerInfoUpdate =new PlayerInfoUpdate();
	
	public void getGunList() {
		for (BaseGun baseGuns : baseGunList) {
			System.out.println("ID: "+baseGuns.getId()+"   Name: "+baseGuns.getNameGun()+
					"   Price: "+baseGuns.getMoney());
		}
	}
	public void buyGun(BaseGun baseGun) {
		
		
		if (baseGun.getMoney()>player.getMoney()) {
			System.out.println("Insufficient balance.");
		}
		else {
			System.out.println("You bought the "+baseGun.getNameGun());
	
			player.getInventory().setBaseGun(baseGun);
			//envanterdeki silah değiştirildi
			
			int oldDamageValue=player.getDamage();
			int oldMoneyValue=player.getMoney();
			
			
			playerInfoUpdate.updateDamage(player, baseGun.getDamage());
			playerInfoUpdate.updateMoney(player, baseGun.getMoney());
		
			int newDamageValue= player.getDamage();
			int newMoneyValue=player.getMoney();
			
			System.out.println("********************************************");
			System.out.println("Damage Change: "+oldDamageValue+" --> "+newDamageValue);
			System.out.println("Money Change: "+oldMoneyValue+" --> "+newMoneyValue);
			System.out.println("********************************************");
			
			
		}
			
		}
		
	
	
	public void getArmorList() {
		for (BaseArmor baseArmors : baseArmorList) {
			System.out.println("ID: "+baseArmors.getId()+"   Name: "+baseArmors.getNameArmor()+
					"   Price: "+baseArmors.getMoney());
		}
	}
	
	public void buyArmor(BaseArmor baseArmor) {
		if (baseArmor.getMoney()>player.getMoney()) {
			System.out.println("Insufficient balance.");
		}
		else {
			System.out.println("You bought the "+baseArmor.getNameArmor());
			player.getInventory().setBaseArmor(baseArmor);
			
			
			int oldHealthValue=player.getHealthy();
			int oldMoneyValue=player.getMoney();
			
			
			playerInfoUpdate.updateHealth(player, baseArmor.getSave());
			playerInfoUpdate.updateMoney(player, baseArmor.getMoney());
		
			int newHealthValue= player.getHealthy();
			int newMoneyValue=player.getMoney();
			
			System.out.println("********************************************");
			System.out.println("Health Change: "+oldHealthValue+" --> "+newHealthValue);
			System.out.println("Money Change: "+oldMoneyValue+" --> "+newMoneyValue);
			System.out.println("********************************************");
			
			System.out.println("Gun: "+player.getInventory().getBaseGun().getNameGun()+",  "+
					"Armor: "+player.getInventory().getBaseArmor().getNameArmor()+",  "+
					"Damage: "+player.getDamage()+",  "+
					"Healthy: "+player.getHealthy()+",  "+
					"Money: "+player.getMoney());
		}
		
	}
	
	
	public void buyEquipment() {
		System.out.println("What would you like to buy?");
		System.out.println("1-Gun ");
		System.out.println("2-Armor");
		System.out.println("3-Exit");
		
		int selectedCase=PlayerManager.scanner.nextInt();
		
		
		
		switch (selectedCase) {
		//silah seçerlerse case 1;
		case 1: {
			
			getGunList();
			 selectedGun=PlayerManager.scanner.nextInt();
			 
			 switch (selectedGun) {
			 //pistol secerse
			case 1: {
				
				buyGun(new Pistol());
				
			break;
			}
			//kılıç secerse
			case 2:{
			
				buyGun(new Sword());
				break;
			}
			//tüfek secerse
			case 3:{
				buyGun(new Rifle());
				break;

			}
			default:{
				System.out.println("Insufficient balance.");
				buyEquipment();
			}
				
			 }
			
			break;
		}
		//zırh seçerlerse case 2;
		case 2:{
			getArmorList();
			
			selectedArmor=PlayerManager.scanner.nextInt();
			 
			 switch (selectedArmor) {
			 //düşük zırh secerse
			case 1: {
				
				buyArmor(new ArmorLow());
			
			break;
			}
			//orta zırh secerse
			case 2:{
			
				buyArmor(new ArmorMedium());							
				break;
			}
			//yuksek zırh secerse
			case 3:{
				
				buyArmor(new ArmorHigh());
							
				break;
			}
			default:{
				System.out.println("Insufficient balance.");
				buyEquipment();
			}
				
			 }
		
			break;
		}
		
		
		//exit derlerse case3;
		case 3:{
			System.out.println("Good bye!");
			break;
		}
		default:{
			System.out.println("Insufficient balance.");
			 selectedCase=PlayerManager.scanner.nextInt();}
		}
		
		
	}
	
}
