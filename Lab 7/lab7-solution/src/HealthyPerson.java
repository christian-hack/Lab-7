
public class HealthyPerson extends Person{

	private String reason;
	
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public HealthyPerson (String name, int age, String reason) {
		
		super(name, age);
		
		this.reason = reason;
		
	}
	
	protected int compareToImpl (Person p) {
		
		int val = 0;
		//^^return variable
		char a = p.getName().charAt(0);
		//^^object
		char b = this.getName().charAt(0);
		//^^self

		if (p instanceof HealthyPerson) 
		{
			if (alphabet.indexOf(b) < alphabet.indexOf(a)) 
			{
				val = -1;
			}
			else if (alphabet.indexOf(b) > alphabet.indexOf(a)) 
			{
				val = 1;
			}
		}
		return val;
	}
	@Override
	public String toString() {
		
		String o = super.toString();
		//^^I assign the super's toString to a variable because I feel like it provides a more concrete definition
		
		return String.format("%s In for %s", o, this.reason);
	}
}

