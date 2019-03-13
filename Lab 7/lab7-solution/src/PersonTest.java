import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void HealthyPersonTest() 
	{
		HealthyPerson healthy = new HealthyPerson("David", 15, "flu");
		Assert.assertEquals(15, healthy.getAge());
		Assert.assertEquals("David", healthy.getName());
		Assert.assertEquals("David, a 15-year old. In for flu", healthy.toString());
	}
	
	@Test
	public void SickPersonTest()
	{
		SickPerson sick = new SickPerson("David", 15, 2);
		Assert.assertEquals(15, sick.getAge());
		Assert.assertEquals("David", sick.getName());
		Assert.assertEquals("David, a 15-year old. Severity level 2", sick.toString());
	}
	
	

}
