import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> stack = new Stack<PatientType>();
	
	StackHospital() 
	{
	
	}
	public void addPatient(PatientType patient) 
	{
		stack.push(patient);
	}
	
	public PatientType nextPatient() 
	{
		return stack.peek();
	}
	
	public PatientType treatNextPatient() 
	{
		PatientType temp = stack.lastElement();
		//^^ store patient to be popped in return variable
		stack.pop();
		return temp;
	}
	
	public int numPatients() 
	{
		return stack.size();
	}
	
	public String hospitalType() 
	{
		return "Stack";	
	}
	
	public String allPatientInfo() 
	{
		String patients = "";
		
		for (int index = 0; index < stack.size(); ++index) 
		{
			patients = patients + stack.elementAt(index).toString();
		}
		return patients;
	}
	
}
