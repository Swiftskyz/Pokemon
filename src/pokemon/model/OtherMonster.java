package pokemon.model;

public class OtherMonster extends Pokemon implements Normal
{
	public OtherMonster(int num, String pokename)
	{
		super(num,pokename);
	}
	
	public void smack()
	{
		System.out.println("My power is greater than ever before: " + this.getAttackPoints());
	}
	
	public int woahLevel()
	{
		return this.getHealthPoints();
	}
}
