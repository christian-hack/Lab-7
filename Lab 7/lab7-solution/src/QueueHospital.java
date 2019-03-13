import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	private Queue<PatientType> queue = new LinkedList<PatientType>();
	
	QueueHospital() 
	{
		
	}
	
	public PatientType nextPatient() 
	{	
		return queue.peek();
	}
	
	public PatientType treatNextPatient() 
	{
		PatientType temp = queue.peek();
		//^^storing head of queue in temp variable
		queue.remove();
		return temp;
	}
	
	public int numPatients() 
	{	
		return queue.size();
	}
	
	public String hospitalType() 
	{
		
		return "QueueHospital";
		
	}
	
	public String allPatientInfo() 
	{	
		String temp = "";
		
		Iterator<PatientType> iterator = queue.iterator();
		//^^iterates through queue to be returned in String format
		
		while (iterator.hasNext()) 
		{
			temp += iterator.next().toString();
		}
		return temp;
		
	}
	@Override
	public void addPatient(PatientType patient) 
	{
				queue.add(patient);
	}
}
