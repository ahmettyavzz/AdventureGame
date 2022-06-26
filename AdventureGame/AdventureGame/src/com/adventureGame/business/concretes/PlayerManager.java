package com.adventureGame.business.concretes;

import java.util.Random;
import java.util.Scanner;

import com.adventureGame.Main;
import com.adventureGame.entities.abstracts.BaseChar;
import com.adventureGame.entities.abstracts.BattleLocation;
import com.adventureGame.entities.abstracts.Location;
import com.adventureGame.entities.concretes.Player;
import com.adventureGame.entities.concretes.chars.Archer;
import com.adventureGame.entities.concretes.chars.Knight;
import com.adventureGame.entities.concretes.chars.Samurai;
import com.adventureGame.entities.concretes.locations.Cave;
import com.adventureGame.entities.concretes.locations.Forest;
import com.adventureGame.entities.concretes.locations.River;
import com.adventureGame.entities.concretes.locations.SafeHouse;
import com.adventureGame.entities.concretes.locations.Shop;

public class PlayerManager {
	

	public static Scanner scanner= new Scanner(System.in);
	String playerName;
	Player selectedChar;
	int charChoose;
	int locationChoose;
	int safeLocationchoose;
	int chooseLocGeneral;
	Location selectedSafeLocation;
	BattleLocation selectedBattleLocation;
	int randomMonster;
	
	
	{
		System.out.println("WELCOME TO GAME.");
		System.out.println("To win the game, you have to go to all locations and collect the rewards there.");
		
	}
	
	
	public void getName() {
		
		System.out.println("Enter your name please.");
		playerName=scanner.nextLine();
		
	}
	
    public void charShow() {
    	BaseChar[] charList={new Samurai(),new Archer(),new Knight()};
    	System.out.println("Choose a character please.");
    	for (BaseChar baseChar : charList) {
			System.out.println(
		"ID: "+baseChar.getId()+" "
    	+"Name: "+baseChar.getNameChar()+"  "
    	+"Damage: "+baseChar.getDamage()+"  "
    	+"Healty: "+baseChar.getHealthy()+"  "
    	+"Money: "+baseChar.getMoney()+"  ");
		}
    	charChoose= scanner.nextInt();
    	switch (charChoose) {
		case 1: {
			Player player = new Player(playerName,new Samurai());
			selectedChar=player;
			System.out.println(player.getNameChar());
			break;
		}
		case 2: {
			Player player = new Player(playerName,new Archer());
			selectedChar=player;
			System.out.println(player.getNameChar());
			break;
		}
		case 3: {
			Player player = new Player(playerName,new Knight());
			selectedChar=player;
			System.out.println(player.getNameChar());
			break;
		}			
		default:{
			System.out.println("Invalid choice.");
			charShow();
			break;
		}
		
		}
    	
    	
    }
    
    public void chooseLocGeneral() {
    	System.out.println("\n---------Choose where you want to go.--------");
    	System.out.println("1- Safe House,Tool Store");
    	System.out.println("2- Cave,Forest,River");
    	chooseLocGeneral= scanner.nextInt();
    	
    	switch (chooseLocGeneral) {
		case 1: {
			chooseSafeLoc();
			break;
		}
		case 2: {
			chooseBattleLocation();

			break;
		}			
		default:{
			chooseSafeLoc();
			break;
		}
    	}
   	
    }
    
    
    
    
   // selected char oyucunun seçtiği karakterde oluşturulmuş bir player nesnesidir.
    // selected location oyuncunun seçtiği konuma ait bir nesne oluşturur.
    
    
 
    
    public void chooseBattleLocation() {
    	
    	BattleLocation[] locationList={new Cave(selectedChar),new Forest(selectedChar),new River(selectedChar)};
    	System.out.println("\nChoose where you want to go.");
    	for (BattleLocation battleLocation : locationList) {
    		System.out.print("ID: "+battleLocation.getId());
			System.out.print("   Name: "+battleLocation.getName());
			System.out.println("   Monster:"+battleLocation.getBaseMonster().getNameChar());
		}  	
    	locationChoose= scanner.nextInt();
    	switch (locationChoose) {
		case 1: {
			BattleLocation location= new Cave(selectedChar);
			selectedBattleLocation=location;
			
			
			monsterAlert();
			
		/*	System.out.println(selectedChar.getNamePlayer()+" "+selectedBattleLocation.getName()+
					"'a dogru kosuyor!");		*/
			charMonsterBattle();
			break;
		}
		case 2: {
			BattleLocation location= new Forest(selectedChar);
			selectedBattleLocation=location;
			
			monsterAlert();
			
		/*	System.out.println(selectedChar.getNamePlayer()+" "+selectedBattleLocation.getName()+
					"'a dogru kosuyor!");	*/
			charMonsterBattle();
			break;
		}
		case 3: {
			BattleLocation location= new River(selectedChar);
			selectedBattleLocation=location;
			
			monsterAlert();
			
		/*	System.out.println(selectedChar.getNamePlayer()+" "+selectedBattleLocation.getName()+
					"'a dogru kosuyor!");		*/
			charMonsterBattle();
			break;
		}			
		default:{
			System.out.println("Invalid choice.");
			charShow();
			break;
		}
		
		}
   	
   }
    
   
    public void chooseSafeLoc() {
    	System.out.println("\nChoose where you want to go.");
    	Location[] safeLocationList={new SafeHouse(selectedChar),new Shop(selectedChar)};
    	for (Location  safeLocation: safeLocationList) {
    		System.out.print("ID : "+safeLocation.getId()+" Name: "+safeLocation.getName()+"\n");
   		
		}  	
    	safeLocationchoose= scanner.nextInt();
    	switch (safeLocationchoose) {
		case 1: {
			
			Location location= new SafeHouse(selectedChar);
			selectedSafeLocation=location;

			location.onLocation();
			break;
		}
		case 2: {
			Location location= new Shop(selectedChar);
			selectedSafeLocation=location;
			location.onLocation();

			break;
		}			
		default:{
			Location location= new SafeHouse(selectedChar);
			selectedSafeLocation=location;
			break;
					}
    	}
    }
    
    public void charMonsterBattle() {
    	
    	
    	System.out.println(selectedChar.getNameChar()+"  VS  "+selectedBattleLocation.getBaseMonster().getNameChar());
    	
    	int monsterHealth= selectedBattleLocation.getBaseMonster().getHealthy();
    	String monsterName=selectedBattleLocation.getBaseMonster().getNameChar();
    	int monsterDamage=selectedBattleLocation.getBaseMonster().getDamage();
    	int monsterMoney=selectedBattleLocation.getBaseMonster().getMoney();
    	
    	
    	System.out.println("Soul \n"+selectedChar.getHealthy()+"\n"+monsterHealth);
    	
    	while (selectedChar.getHealthy()>0 && monsterHealth>0) {
			
    		System.out.println(selectedChar.getNameChar()+" hit the "+monsterName);
    		monsterHealth-=selectedChar.getDamage();
    		
    		System.out.println("Soul \n"+selectedChar.getHealthy()+"\n"+monsterHealth);
			
    		if (monsterHealth<=0) {
				break;
			}
    		System.out.println(monsterName+" hit the "+selectedChar.getNameChar());
    		selectedChar.setHealthy(selectedChar.getHealthy()-monsterDamage*randomMonster);
    		
    		System.out.println("Soul \n"+selectedChar.getHealthy()+"\n"+monsterHealth);
    		
		}
    	
    	    	
    	if (selectedChar.getHealthy()>0) {
			System.out.println("WİN! YOU KİLLED "+randomMonster+" adet "+monsterName);
			
			selectedChar.setMoney(selectedChar.getMoney()+monsterMoney*randomMonster);
			System.out.println("Current Balance: "+selectedChar.getMoney());
			prizesControl(selectedBattleLocation, selectedChar);
		}else {
			System.out.println("GAME OVER!");
			Main.isContinue=false;
		}
    	
    	
    	
    }
    
    
    public void prizesControl(BattleLocation battleloc,Player pla) {
    	battleloc.geldiMi(pla);
    	
    	if (pla.getInventory().isFirewoord() &&
    			pla.getInventory().isFood()&&
    			pla.getInventory().isWater()) {
    		
    		System.out.println("You collected all the rewards and...");
    		System.out.println("YOU WİN THE GAME!!!");
    	Main.isContinue=false;
		}
    	else {
			System.out.println("missing prize");
		}
    	
    }
    
    
    
    public int randomMonsterNumber() {
		Random random= new Random();
		return random.nextInt(selectedBattleLocation.getMaxMonster())+1;
	}
    
    public void monsterAlert() {
    	 randomMonster=randomMonsterNumber();
    	
		System.out.println("You are in "+selectedBattleLocation.getName());
		System.out.println(randomMonster+"  "+selectedBattleLocation.getBaseMonster().getNameChar()+" live here.");
    }
    
   
	
}
