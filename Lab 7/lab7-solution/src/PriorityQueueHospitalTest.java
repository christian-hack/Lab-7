import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest {

	@Test
	public void PriorityTest() {
		PriorityQueueHospital<Person> queue = new PriorityQueueHospital<Person>();
		SickPerson sick = new SickPerson("David", 15, 2);
		SickPerson sick1 = new SickPerson("Maddie", 10, 2);
		HealthyPerson healthy = new HealthyPerson("David", 15, "flu");
		HealthyPerson healthy1 = new HealthyPerson("Steve", 13, "flu");
		
		queue.addPatient(sick);
		queue.addPatient(sick1);
		queue.addPatient(healthy);
		queue.addPatient(healthy1);
		
		Person a = queue.nextPatient();
		//Person b = queue.treatNextPatient();
		
		Assert.assertEquals("A PriorityQueue-type hospital with 4 patients.", queue.toString());
		Assert.assertEquals(4, queue.numPatients());
		Assert.assertEquals("PriorityQueue", queue.hospitalType());
		Assert.assertEquals("David, a 15-year old. Severity level 2Maddie, a 10-year old. Severity level 2David, a 15-year old. In for fluSteve, a 13-year old. In for flu", queue.allPatientInfo());
		Assert.assertEquals("nextPatient incorrect for PriorityQueueHospital", sick, a);
		Assert.assertEquals("treatNextPatient incorrect for PriorityQueueHospital", sick, a);
	}

}
