
public class MethodHold extends MainClass {
	
	public static void manaChampsPrint(String name, double health, double healthReg,double mana,double manaReg,
			String AttackRange,String aAType, double ad, double adspeed, double armor,double magicResist){
		System.out.println("Name: " +name);
		System.out.println("Health: "+health);
		System.out.println("Health Regen: "+healthReg/5);
		System.out.println("Mana: "+mana);
		System.out.println("Mana Regen:"+manaReg/5);
		System.out.println("Auto Attack Type: "+aAType);
		System.out.println("Auto Attack Range: "+AttackRange);
		System.out.println("Attack Damage: "+ad);
		System.out.println("Attack Speed: "+adspeed);
		System.out.println("Armor: "+armor);
		System.out.println("Magic Resist: "+magicResist);
		
	}
	
	public static void championStatsDisplay( int codex, int lvl){
		switch(codex){
		case 1:
			break;
		case 2:
			Champion$ManaUser Ahri = new Champion$ManaUser("Ahri",
					514.4,80,
					6.5,0.6,
					334,50,
					6,0.8,
					550,"Range",
					53.04,3,
					0.668,0.02,
					20.88,3.5,
					30,0,
					330);
			double health,healthRegen,mana,manaRegen,attackDamage,attackSpeed,armor,magicResist;
			health = Ahri.initHealth + (Ahri.healthGPL*lvl);
			healthRegen = Ahri.healthRegen + (Ahri.healthRegenGPL*lvl);
			mana = Ahri.mana + (Ahri.manaGPL*lvl);
			manaRegen = Ahri.manaRegen + (Ahri.manaGPL*lvl);
			attackDamage = Ahri.aD + (Ahri.aDGPL*lvl);
			attackSpeed = Ahri.attackSpeed + (Ahri.attackSpeedGPL*lvl);
			armor = Ahri.armor + (Ahri.armorGPL*lvl);
			magicResist = Ahri.magicResist + (Ahri.magicResistGPL*lvl);
			//add explicit object pass to main switch method that hass every stat increase, and sum it up above. 

			
			
			
			
			
		}
	}

}
