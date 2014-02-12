package hs_sim;

public class Weapon {
	private int attack;
	private int durability;
	private boolean isSpell;
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	public boolean isSpell() {
		return isSpell;
	}
	public void setSpell(boolean isSpell) {
		this.isSpell = isSpell;
	}
	
}
