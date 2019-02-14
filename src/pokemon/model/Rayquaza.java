package pokemon.model;

public class Rayquaza extends Pokemon implements Flying
{
	public Rayquaza(int number, String name)
	{
		super(number, name);
	}
	
	public void swoop()
	{
		System.out.println("SWISHSWISHSWOOSH");
	}
	
	public int woahLevel()
	{
		return 123456;
	}
	
	public Rayquaza()
	{
		super(98, "Rayquaza");
	}
	
	public Rayquaza(String name)
	{
		super(98, name);
	}
}
