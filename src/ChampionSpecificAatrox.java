
public class ChampionSpecificAatrox implements Hero {
	private String name;
	double initHealth;
	double healthGPL;
	double healthRegen;
	double healthRegenGPL;
	double blood;
	double bloodGPL;
	double attackRange;
	String attackType;
	double aD;
	double aDGPL;
	double attackSpeed;
	double attackSpeedGPL;
	double abilityPower;
	double armor;
	double armorGPL;
	double magicResist;
	double magicResistGPL;
	double moveSpeed;
	public ChampionSpecificAatrox(String name, double initHealth, double healthGPL, double healthRegen,
			double healthRegenGPL, double blood, double bloodGPL, double attackRange, String attackType, double aD,
			double aDGPL, double attackSpeed, double attackSpeedGPL, double abilityPower, double armor, double armorGPL, double magicResist,
			double magicResistGPL, double moveSpeed) {
		super();
		this.name = name;
		this.initHealth = initHealth;
		this.healthGPL = healthGPL;
		this.healthRegen = healthRegen;
		this.healthRegenGPL = healthRegenGPL;
		this.blood = blood;
		this.bloodGPL = bloodGPL;
		this.attackRange = attackRange;
		this.attackType = attackType;
		this.aD = aD;
		this.aDGPL = aDGPL;
		this.attackSpeed = attackSpeed;
		this.attackSpeedGPL = attackSpeedGPL;
		this.abilityPower = abilityPower;
		this.armor = armor;
		this.armorGPL = armorGPL;
		this.magicResist = magicResist;
		this.magicResistGPL = magicResistGPL;
		this.moveSpeed = moveSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInitHealth() {
		return initHealth;
	}
	public void setInitHealth(double initHealth) {
		this.initHealth = initHealth;
	}
	public double getHealthGPL() {
		return healthGPL;
	}
	public void setHealthGPL(double healthGPL) {
		this.healthGPL = healthGPL;
	}
	public double getHealthRegen() {
		return healthRegen;
	}
	public void setHealthRegen(double healthRegen) {
		this.healthRegen = healthRegen;
	}
	public double getHealthRegenGPL() {
		return healthRegenGPL;
	}
	public void setHealthRegenGPL(double healthRegenGPL) {
		this.healthRegenGPL = healthRegenGPL;
	}
	public double getBlood() {
		return blood;
	}
	public void setBlood(double blood) {
		this.blood = blood;
	}
	public double getBloodGPL() {
		return bloodGPL;
	}
	public void setBloodGPL(double bloodGPL) {
		this.bloodGPL = bloodGPL;
	}
	public double getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(double attackRange) {
		this.attackRange = attackRange;
	}
	public String getAttackType() {
		return attackType;
	}
	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}
	public double getaD() {
		return aD;
	}
	public void setaD(double aD) {
		this.aD = aD;
	}
	public double getaDGPL() {
		return aDGPL;
	}
	public void setaDGPL(double aDGPL) {
		this.aDGPL = aDGPL;
	}
	public double getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public double getAttackSpeedGPL() {
		return attackSpeedGPL;
	}
	public void setAttackSpeedGPL(double attackSpeedGPL) {
		this.attackSpeedGPL = attackSpeedGPL;
	}
	public double getAbilityPower(){
		return abilityPower;
	}
	public void setAbilityPower(double abilityPower){
		this.abilityPower = abilityPower;
	}
	public double getArmor() {
		return armor;
	}
	public void setArmor(double armor) {
		this.armor = armor;
	}
	public double getArmorGPL() {
		return armorGPL;
	}
	public void setArmorGPL(double armorGPL) {
		this.armorGPL = armorGPL;
	}
	public double getMagicResist() {
		return magicResist;
	}
	public void setMagicResist(double magicResist) {
		this.magicResist = magicResist;
	}
	public double getMagicResistGPL() {
		return magicResistGPL;
	}
	public void setMagicResistGPL(double magicResistGPL) {
		this.magicResistGPL = magicResistGPL;
	}
	public double getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(double moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	public void statPrint (int lvl){
		System.out.println("Name: "+name);
		System.out.println("level: "+lvl);
		System.out.println("Health: "+ (initHealth+(healthGPL*lvl)));
		System.out.println("Health Regen: "+(healthRegen+(healthRegenGPL*lvl)));
		System.out.println("Blood: "+(blood+(bloodGPL*lvl)));
		System.out.println("Auto Attack Type: "+attackType);
		System.out.println("Auto Attack Range: "+attackRange);
		System.out.println("Attack Damage: "+(aD+(aDGPL*lvl)));
		System.out.println("Attack Speed: "+(attackSpeed+(attackSpeedGPL*lvl)));
		System.out.println("Armor: "+(armor+(armorGPL*lvl)));
		System.out.println("Magic Resist: "+(magicResist+(magicResistGPL*lvl)));
		System.out.println("Movement Speed: "+moveSpeed);

	}
	

}
