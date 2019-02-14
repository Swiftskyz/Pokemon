package pokemon.model;

public class Giratina extends Pokemon implements Ghost
{
	public Giratina(int number, String name)
	{
		super(number, name);
	}
	
	public void spook()
	{
		System.out.println("OOOOGGAAABOOOGAAAA");
	}
	
	public int woahLevel()
	{
		return 123456789;
	}
	
	public Giratina()
	{
		super(120, "Giratina");
	}
	
	public Giratina(String name)
	{
		super(120, name);
	}
}
