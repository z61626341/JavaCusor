package Inheritance;

public abstract class Role {
	protected String name;
	protected int level;
	protected int blood;
	
	public abstract void fight();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public String toString() {
		return String.format("[角色名稱: %s , 等級: %d , 血量: %d] \n",this.name,this.level,this.blood);
	}
	public Role getClassNum() {
		return this;
	}
	static public void staticMethod() {
		System.out.println("Method of Role");
	}
}
