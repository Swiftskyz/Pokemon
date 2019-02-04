package pokemon.model;

public class Dialga extends Pokemon implements Steel
{
	public Dialga(int number, String name)
	{
		super(number, name);
	}
	
	public void strike()
	{
		System.out.println("SCUAWPOWPEW");
	}
	
	public int woahLevel()
	{
		return 1234567;
	}
}
