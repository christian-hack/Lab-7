import org.junit.Assert;
import org.junit.Test;

public class AnimalTest 
{

	@Test
	public void AnimalTesting() 
	{
		Animal animal = new Animal("doxen", 10);
		Assert.assertEquals(10, animal.getAge());
		Assert.assertEquals("doxen", animal.getBreed());
		Assert.assertEquals("A 10-year old doxen.", animal.toString());
	}
}
