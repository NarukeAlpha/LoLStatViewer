import java.util.ArrayList;

public class MethodHold extends MainClass {
	
	public static void champLC(ArrayList a){
		a.add("Aatrox");
		a.add("Ahri  ");
		a.add("Akali ");
		a.add("Alistar");		
		a.add("Amumu  ");		
		a.add("Anivia");		
		a.add("Annie  ");		
		a.add("Ashe");		
		a.add("Aurelion Sol");		
		a.add("Azir   ");		
		a.add("Bard   ");		
		a.add("Blitzcrank");		
		a.add("Brand  ");		
		a.add("Braum  ");		
		a.add("Caitlyn");	
		a.add("Camille");		
		a.add("Cassiopeia");		
		a.add("Cho'Gath");		
		a.add("Corki  ");		
		a.add("Darius");		
		a.add("Diana");		
		a.add("Dr.Mundo");		
		a.add("Draven");		
		a.add("Ekko   ");		
		a.add("Elise");		
		a.add("Evelynn");		
		a.add("Ezreal");		
		a.add("Fiddlesticks");		
		a.add("Fiora");		
		a.add("Fizz  ");		
		a.add("Galio");		
		a.add("Gangplank");		
		a.add("Garen");		
		a.add("Gnar  ");		
		a.add("Gragas");		
		a.add("Graves");		
		a.add("Hecarim");		
		a.add("Heimerdinger");		
		a.add("Illaoi");		
		a.add("Irelia");		
		a.add("Invern");		
		a.add("Janna");		
		a.add("Jarvan IV");		
		a.add("Jax  ");		
		a.add("Jayce");		
		a.add("Jhin ");		
		a.add("Jinx ");		
		a.add("Kalista");		
		a.add("Karma ");		
		a.add("Karthus");		
		a.add("Kassadin");		
		a.add("Katarina");		
		a.add("Kayle ");		
		a.add("Kennen");		
		a.add("Kah'Zix");		
		a.add("Kindred");		
		a.add("Kled  ");		
		a.add("Kog'Maw");		
		a.add("LeBlanc");		
		a.add("Lee Sin");		
		a.add("Leona ");		
		a.add("Lissandra");		
		a.add("Lucian");		
		a.add("Lulu  ");		
		a.add("Lux   ");		
		a.add("Malphite");		
		a.add("Malzahar");		
		a.add("Maokai");		
		a.add("Master Yi");		
		a.add("Miss Fortune");		
		a.add("Mordekaiser");		
		a.add("Morgana");		
		a.add("Nami  ");		
		a.add("Nasus ");		
		a.add("Nautilus");		
		a.add("Nidalee");		
		a.add("Nocturne");		
		a.add("Nunu  ");		
		a.add("Olaf  ");		
		a.add("Orianna");		
		a.add("Pantheon");		
		a.add("Poppy ");		
		a.add("Quinn ");		
		a.add("Rammus");		
		a.add("Rek'Sai");		
		a.add("Renekton");		
		a.add("Rengar");		
		a.add("Riven ");		
		a.add("Rumble");		
		a.add("Ryze  ");		
		a.add("Sejuani");		
		a.add("Shaco ");		
		a.add("Shen  ");		
		a.add("Shyvana");		
		a.add("Singed");		
		a.add("Sion  ");		
		a.add("Sivir ");		
		a.add("Skarner");		
		a.add("Sona  ");		
		a.add("Soraka");		
		a.add("Swain ");		
		a.add("Syndra");		
		a.add("Tahm Kench");		
		a.add("Taliyah");		
		a.add("Talon ");		
		a.add("Taric ");		
		a.add("Teemo ");		
		a.add("Tresh ");		
		a.add("Tristana");		
		a.add("Trundle");		
		a.add("Tryndamere");		
		a.add("TwistedFate");		
		a.add("Twitch");		
		a.add("Udyr  ");		
		a.add("Urgot ");		
		a.add("Varus ");		
		a.add("Vayne ");		
		a.add("Veigar");		
		a.add("Vel'koz");		
		a.add("Vi    ");		
		a.add("Viktor");		
		a.add("Vladimir");		
		a.add("Volibear");		
		a.add("Warwick");		
		a.add("Wukong");		
		a.add("Xerath");		
		a.add("Xin Zhao");		
		a.add("Yasuo ");		
		a.add("Yorick");		
		a.add("Zac   ");		
		a.add("Zed   ");		
		a.add("Ziggs ");		
		a.add("Zilean");		
		a.add("Zyra  ");		
		
	}
	

	public static void champPrint(ArrayList<String> champList) {
		int x=1;
		for(String s: champList){
			System.out.print(x+":"+s+"\t");
			if(x%6==0)
				System.out.println();
			x++;
		}
		
	}


	public static void champOLC(ArrayList<Hero> championList) {
    	ChampionSpecificAatrox Aatrox = new ChampionSpecificAatrox("Aatrox",537.8,85,
    			6.59,0.5,
    			105,45,
    			150,"Melee",
    			60.376,3.2,0.651,0.03,0,
    			24.384,3.8,32.1,1.25,
    			345);
		Champion$ManaUser Ahri = new Champion$ManaUser("Ahri",
				514.4,80,
				6.5,0.6,
				334,50,
				6,0.8,
				550,"Range",
				53.04,3,
				0.668,0.02,0,
				20.88,3.5,
				30,0,
				330);
		Champion$EnergyUser Akali = new Champion$EnergyUser("Akali",587.8,85,8.34,0.65,
				200,0,50,0,
				125,"Melee",
				58.376,3.2,0.694,0.031,0,
				26.38,3.5,32.1,1.25,350);
		Champion$ManaUser Alistar = new Champion$ManaUser("Alistar",613.36,106,8.675,0.85,
				278.84,38,8.5,0.8,
				125,"Melee",
				61.112,3.62,0.625,0.02125,0,
				24.38,3.5,31.2,1.25,330);
		Champion$ManaUser Amumu = new Champion$ManaUser("Amumu",613.12,84,8.875,0.85,
				287.2,40,7.38,0.525,
				125,"Melee",
				53.384,3.8,0.638,0.0218,0,
				23.544,3.8,32.1,1.25,335);
		Champion$ManaUser Anivia = new Champion$ManaUser("Anivia",467.6,70,5.57,0.55,
				396.04,50,6,0.8,
				600,"Ranged",
				51.376,3.2,0.625,0.0168,0,
				21.22,4,30,0,335);
    	championList.add(Aatrox);
    	championList.add(Ahri);

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	
//	public static void manaChampsPrint(String name, double health, double healthReg,double mana,double manaReg,
//			String AttackRange,String aAType, double ad, double adspeed, double armor,double magicResist){
//		System.out.println("Name: " +name);
//		System.out.println("Health: "+health);
//		System.out.println("Health Regen: "+healthReg/5);
//		System.out.println("Mana: "+mana);
//		System.out.println("Mana Regen:"+manaReg/5);
//		System.out.println("Auto Attack Type: "+aAType);
//		System.out.println("Auto Attack Range: "+AttackRange);
//		System.out.println("Attack Damage: "+ad);
//		System.out.println("Attack Speed: "+adspeed);
//		System.out.println("Armor: "+armor);
//		System.out.println("Magic Resist: "+magicResist);
//		
//	}
//	
//	public static void championStatsDisplay( int codex, int lvl){
//		switch(codex){
//		case 1:
//			break;
//		case 2:
//			Champion$ManaUser Ahri = new Champion$ManaUser("Ahri",
//					514.4,80,
//					6.5,0.6,
//					334,50,
//					6,0.8,
//					550,"Range",
//					53.04,3,
//					0.668,0.02,
//					20.88,3.5,
//					30,0,
//					330);
//			double health,healthRegen,mana,manaRegen,attackDamage,attackSpeed,armor,magicResist;
//			health = Ahri.initHealth + (Ahri.healthGPL*lvl);
//			healthRegen = Ahri.healthRegen + (Ahri.healthRegenGPL*lvl);
//			mana = Ahri.mana + (Ahri.manaGPL*lvl);
//			manaRegen = Ahri.manaRegen + (Ahri.manaGPL*lvl);
//			attackDamage = Ahri.aD + (Ahri.aDGPL*lvl);
//			attackSpeed = Ahri.attackSpeed + (Ahri.attackSpeedGPL*lvl);
//			armor = Ahri.armor + (Ahri.armorGPL*lvl);
//			magicResist = Ahri.magicResist + (Ahri.magicResistGPL*lvl);
//			//add explicit object pass to main switch method that hass every stat increase, and sum it up above. 
//
//			
//			
//			
//			
//			
//		}

}
