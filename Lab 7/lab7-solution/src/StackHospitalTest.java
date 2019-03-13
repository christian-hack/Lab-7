import org.junit.Assert;
import org.junit.Test;

public class StackHospitalTest {

	@Test
	public void StackHospitalTesting() 
	{
		StackHospital<Person> stack = new StackHospital<Person>();
		SickPerson sick = new SickPerson("David", 15, 2);
		SickPerson sick1 = new SickPerson("Maddie", 10, 2);
		SickPerson sick2 = new SickPerson("Dave", 13, 2);
		SickPerson sick3 = new SickPerson("Mike", 12, 2);
		HealthyPerson healthy = new HealthyPerson("David", 15, "flu");
		HealthyPerson healthy1 = new HealthyPerson("Steve", 13, "flu");
		HealthyPerson healthy2 = new HealthyPerson("Mark", 14, "flu");
		HealthyPerson healthy3 = new HealthyPerson("Jacob", 15, "flu");
		
		stack.addPatient(sick);
		stack.addPatient(sick1);
		stack.addPatient(sick2);
		stack.addPatient(sick3);
		stack.addPatient(healthy3);
		stack.addPatient(healthy);
		stack.addPatient(healthy1);
		stack.addPatient(healthy2);
		
		Person a = stack.nextPatient();
		//Person b = stack.treatNextPatient();
		
		Assert.assertEquals("A Stack-type hospital with 8 patients.", stack.toString());
		Assert.assertEquals(8, stack.numPatients());
		Assert.assertEquals("Stack", stack.hospitalType());
		Assert.assertEquals("David, a 15-year old. Severity level 2Maddie, a 10-year old. Severity level 2Dave, a 13-year old. Severity level 2Mike, a 12-year old. Severity level 2Jacob, a 15-year old. In for fluDavid, a 15-year old. In for fluSteve, a 13-year old. In for fluMark, a 14-year old. In for flu", stack.allPatientInfo());
		Assert.assertEquals("nextPatient incorrect for StackHospital", healthy2, a);
		Assert.assertEquals("treatNextPatient incorrect for StackHospital", healthy2, a);
		//Assert.assertEquals("Mark, a 14-year old. In for flu", stack.treatNextPatient());
		//Assert.assertEquals(expected, actual);
	}

}
