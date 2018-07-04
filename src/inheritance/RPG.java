package inheritance;

public class RPG {

	static SwordsMan swordsMan;
	static Magician magician;
	
	public static void main(String[] args) {
		demoSwordMan();
		demoMagician();
		showBlood(swordsMan,magician);
		drawFight(swordsMan,magician);
	}

	static void demoSwordMan() {
		swordsMan = new SwordsMan();
		swordsMan.setName("William");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		
		System.out.println(swordsMan.toString());
		/*System.out.printf("劍士 : (角色名稱: %s , 等級: %d , 血量: %d) \n",
				swordsMan.getName(),swordsMan.getLevel(),swordsMan.getBlood());*/
		
		swordsMan.staticMethod();
	}
	static void demoMagician() {
		magician = new Magician();
		magician.setName("Maggie");
		magician.setLevel(1);
		magician.setBlood(50);

		System.out.println(magician.toString());
		magician.toString();
		/*System.out.printf("魔法師 : (角色名稱: %s , 等級: %d , 血量: %d) \n",
				magician.getName(),magician.getLevel(),magician.getBlood());*/
		
		magician.staticMethod();
	}
	static void showBlood(Role... roles) {
		int characterNum = 0;
		for (Role role : roles) {
			characterNum ++;
			System.out.printf("Character%d : %s (%d) \n",characterNum,role.getName(),role.getBlood());
		}
		
	}
	static void drawFight(Role...roles) {
		for (Role role : roles) {
			System.out.println(role.getName());
			role.fight();
		}
	}

}
