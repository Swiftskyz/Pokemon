package pokemon.model;

public class Groudon extends Pokemon implements Ground
{
	public Groudon(int number, String name)
	{
		super(number, name);
	}
	
	public void stomp()
	{
		System.out.println("SKAKAKAKBWOMMMM");
	}
	
	public int woahLevel()
	{
		return 12345678;
	}
	
	public Groudon(int i, Object object)
	{
		super(130, "Groudon");
	}
	
	public Groudon(String name)
	{
		super(130, name);
	}
}