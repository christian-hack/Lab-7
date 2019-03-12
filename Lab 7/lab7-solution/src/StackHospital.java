import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private Stack<PatientType> stack = new Stack<PatientType>();
	
	StackHospital() 
	{
	
	}
	@Override
	public void addPatient(PatientType patient) 
	{
		stack.push(patient);
	}
	
	public PatientType nextPatient() 
	{
		return stack.lastElement();
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
		return " " + this.getClass().getName();	
	}
	
	public String allPatientInfo() 
	{
		String patients = "";
		
		for (int index = 0; index < stack.size(); ++index) 
		{
			patients += stack.elementAt(index).toString();
		}
		return patients;
	}
	
}
