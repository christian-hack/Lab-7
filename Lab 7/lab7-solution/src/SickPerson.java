
public class SickPerson extends Person {

	private int severity;

	public SickPerson (String name, int age, int severity) {
		
		super(name, age);
		
		this.severity = severity;
		
	}
	
	protected int compareToImpl (Person p) {
		
		int sev = 0;
		
		if ( p instanceof SickPerson) 
		{
			if (((SickPerson) p).severity < this.severity) {
				sev = -1;
			}
			if (((SickPerson) p).severity > this.severity) {
				sev = 1;
			}
		}
		return sev;
		
	}
	@Override
	public String toString() {
		
		String o = super.toString();
		return String.format("%s Severity level %d", o, this.severity);
		
	}
}
