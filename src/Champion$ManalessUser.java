
public class Champion$ManalessUser implements Hero{
	private String name;
	double initHealth;
	double healthGPL;
	double healthRegen;
	double healthRegenGPL;
	double attackRange;
	String attackType;
	double aD;
	double aDGPL;
	double attackSpeed;
	double attackSpeedGPL;
	double armor;
	double armorGPL;
	double magicResist;
	double magicResistGPL;
	double moveSpeed;
	public Champion$ManalessUser(String name, double initHealth, double healthGPL, double healthRegen,
			double healthRegenGPL, double attackRange, String attackType, double aD, double aDGPL, double attackSpeed,
			double attackSpeedGPL, double armor, double armorGPL, double magicResist, double magicResistGPL,
			double moveSpeed) {
		super();
		this.name = name;
		this.initHealth = initHealth;
		this.healthGPL = healthGPL;
		this.healthRegen = healthRegen;
		this.healthRegenGPL = healthRegenGPL;
		this.attackRange = attackRange;
		this.attackType = attackType;
		this.aD = aD;
		this.aDGPL = aDGPL;
		this.attackSpeed = attackSpeed;
		this.attackSpeedGPL = attackSpeedGPL;
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
	

}
