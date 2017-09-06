
public class runAnimal {

	public static void main(String[] args) {

		Dog mydog;
		Bird mybird;
		Animal a;
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {

			if (Math.random() < 0.5)
			// create a dog
			{
				a = new Dog();
			} else {
				// create a bird
				a = new Bird();
			}
			// now call the right move method
			a.move();
		}
	}

}
