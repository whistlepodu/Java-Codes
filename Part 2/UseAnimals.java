class UseAnimals
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		Animal a = (Animal)d;
		d.callme();
		a.callme();
		((Dog)a).callme2();
	}
}

class Animal
{
	void callme()
	{
		System.out.println("Call Me Animal");
	}
}

class Dog extends Animal
{
	void callme()
	{
		System.out.println("Call Me Dog");
	}
	void callme2()
	{
		System.out.println("call Me 2 Dog");
	}
}