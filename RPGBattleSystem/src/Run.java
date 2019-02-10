public class Run {
	public static void main(String[] args) {
		//create Scottie
		Character scottie = new Character();
		scottie.name = "Scottie";
		scottie.hitPoints = 100.0;
		scottie.attackPower = 25.0;
		scottie.defense = 20.0;
		scottie.isDefeated = false;
		scottie.level = 1;
		scottie.experienceAtCurrentLevel = 50.0;
		
		//create Mister P
		Character misterP = new Character();
		misterP.name = "Partridge";
		misterP.hitPoints = 100.0;
		misterP.attackPower = 35.0;
		misterP.defense = 15.0;
		misterP.isDefeated = false;
		misterP.level = 1;
		misterP.experienceAtCurrentLevel = 25.0;
		
		//attack Scottie
		scottie.takeDamage(misterP.attackPower);
		
		//attack Mister P
		misterP.takeDamage(scottie.attackPower);
		
		//gain experience
		scottie.gainExperience(55.0);
		misterP.gainExperience(100.0);
		
		//print state
		scottie.display();
		misterP.display();
	}

}