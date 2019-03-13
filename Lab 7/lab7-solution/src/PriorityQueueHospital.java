import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>{
	
	private Queue<PatientType> queue = new LinkedList<PatientType>();
	
	PriorityQueueHospital() 
	{
		
	}
	
	@Override
	public void addPatient(PatientType patient) 
	{
		queue.add(patient);
	}
	
	@Override
	public PatientType nextPatient() 
	{	
		Collections.sort((List<PatientType>) queue);
		return queue.element();
	}
	@Override
	public PatientType treatNextPatient() 
	{
		Collections.sort((List<PatientType>) queue);
		return queue.remove();
		
	}
	@Override
	public int numPatients() 
	{
		return queue.size();
	}
	@Override
	public String hospitalType() {
		
		return "PriorityQueue";
		
	}
	@Override
	public String allPatientInfo() {
		
		String temp = "";
		Iterator<PatientType> iterator = queue.iterator();
		
		while (iterator.hasNext()) 
		{
			temp += iterator.next().toString();
		}
		return temp;
		
	}
}
