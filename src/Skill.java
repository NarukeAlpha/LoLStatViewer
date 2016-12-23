
public class Skill {
	private String Q;
	private long damage;
	// Other properties of skills
	
	public Skill(String q, long damage) {
		super();
		Q = q;
		this.damage = damage;
	}

	public String getQ() {
		return Q;
	}

	public void setQ(String q) {
		Q = q;
	}

	public long getDamage() {
		return damage;
	}

	public void setDamage(long damage) {
		this.damage = damage;
	}

}
