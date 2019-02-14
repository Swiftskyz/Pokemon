package pokemon.model;

public class Arceus extends Pokemon implements Normal
{
	public Arceus(int number, String name)
	{
		super(number, name);
	}

	public void smack()
	{
		System.out.println("WEEWOOKACHOW");
	}
	
	public int woahLevel()
	{
		return 12345;
	}
	
	public Arceus()
	{
		super(98, "Arceus");
	}
	
	public Arceus(String name)
	{
		super(98, name);
	}
	
}
