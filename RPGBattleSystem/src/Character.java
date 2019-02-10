public class Character {
	public String name;
	public double hitPoints;
	public double defense;
	public double attackPower;
	public boolean isDefeated;
	public double experienceAtCurrentLevel;
	public int level;
	
	public void takeDamage(double attackPower) {
		if (defense <= attackPower) {
			attackPower -= defense;
		}
		else {
			attackPower = 0.0;
		}
		hitPoints -= attackPower;
		if (hitPoints <= 0.0) {
			isDefeated = true;
		}
	}
	
	public void gainExperience(double newExperience) {
		if (newExperience >= 100.0) {
			System.out.println("Nice try...");
		}
		else {
			if (newExperience + experienceAtCurrentLevel >= 100) {
				level++;
				experienceAtCurrentLevel = (newExperience + experienceAtCurrentLevel) - 100;
			}
			else {
				experienceAtCurrentLevel += newExperience;
			}
		}
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Hit Points: " + hitPoints);
		System.out.println("Defense: " + defense);
		System.out.println("Defeated: " + isDefeated);
		System.out.println("Current Level: " + level);
		System.out.println("Experience at Current Level: " + experienceAtCurrentLevel);
		System.out.println();
	}
}	