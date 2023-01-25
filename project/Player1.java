package project;
public class Player1 {
	public String name;
	public int health = 100;
	public void player1(String name, int health) {
		this.name = name;
		if (health < 0 || health > 100) {
			this.health = 100;
		} else
			this.health = health;
	}
	public void damageByGun1() {          //damage got by gun1 
		this.health -= 30;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println(name + "'s got hit by gun 1. Health is reduced by 30" + ".New health is" + this.health);
		if (this.health == 0) {
			System.out.println(getName() + " is dead");
			System.exit(health);
		}
	}
	public void damageByGun2() {          //damage got by gun2 
		this.health -= 50;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println(name + "'s got hit by gun 2. Health is reduced by 50" + ".New health is" + this.health);
		if (this.health == 0) {
			System.out.println(getName() + " is dead");
			System.exit(health);
		}
	}
	public void heal() {                 //when heal is used
		if (this.health <= 0)
			System.out.println("Player is dead. Heal not possible");
		else {
			this.health += 60;
			System.out.println(name + "'s health is " + this.health);
		}
	} 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}