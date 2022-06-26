package com.adventureGame;

import com.adventureGame.business.concretes.PlayerManager;


public class Main {
	
	public static boolean isContinue=true;
	
	
	public static void main(String[] args) {
	
	PlayerManager play= new PlayerManager();
	
	play.getName();
	play.charShow();
	
	
	
	while (isContinue) {
		play.chooseLocGeneral();

	}
	

	
	
	}

}
