package project;
public class Player2 extends Player1 {
	String name;
	public int health = 100;
	boolean armour;
	public void damageByGun1() {				//damage got by gun1 
		if (armour) {                 			//if armour is on
			this.health -= 20;
			if (this.health <= 0)
				this.health = 0;
			System.out.println(
					name + "'s armour is on.Got hit by gun 1.Health is reduced by 20." + "New health is" + this.health);
		}
		if (!armour) {							//if armour is off
			this.health -= 30;
			if (this.health <= 0)
				this.health = 0;
			System.out.println(name + "'s armour is off.Got hit by gun 1.Health is reduced by 30." + "New health is"
					+ this.health);
		}
		if (this.health == 0) {
			System.out.println(name + " is dead");
			System.exit(health);
		}
	}
	public void damageByGun2() {				//damage got by gun2
		if (armour) {							//if armour is on
			this.health -= 40;
			if (this.health <= 0)
				this.health = 0;
			System.out.println(
					name + "'s armour is on.Got hit by gun 2.Health is reduced by 40." + "New health is" + this.health);
		}
		if (!armour) {							//if armour is off
			this.health -= 50;
			if (this.health <= 0)
				this.health = 0;
			System.out.println(name + "'s armour is off.Got hit by gun 2.Health is reduced by 50." + "New health is"
					+ this.health);
		}
		if (this.health == 0) {
			System.out.println(name + " is dead");
			System.exit(health);
		}
	}
	public void heal() {						//when heal is used
		if (this.health <= 0)
			System.out.println("Player is dead. Heal not possible");
		else {
			this.health += 60;
			System.out.println(name + "'s health healed, new health  is " + this.health);
		}
	}
}