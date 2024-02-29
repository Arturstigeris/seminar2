package model;

public class Professor {
	private long pID;
	private String name;
	private String surname;
	private Degree degree;
	
	private static long counter = 0;
	
	public long getPID()
	{
		return pID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public Degree getDegree()
	{
		return degree;
	}
	
	public void setPID()
	{
		pID = counter;
		counter++;
	}
	
	public void setName(String name)
	{
		if(name != null && name.matches("[A-ZĀŪŽČĒŅĪĻĢĶ](1)[a-zāūžčēņīļģķ]+"))
			this.name = name;
		else 
			this.name ="Undefined";	
	}

	public void setSurname(String surname) 
	{
		if(surname != null && surname.matches("[A-ZĀŪŽČĒŅĪĻĢĶ](1)[a-zāūžčēņīļģķ]+"))
			this.surname = surname;
		else 
			this.surname ="Undefined";
	}

	public void setDegree(Degree degree) 
	{
		if(degree != null)
			this.degree = degree;
		else 
			this.degree = Degree.other;
	}
	
	public Professor()
	{
		setPID();
		setName("Jānis");
		setSurname("Bērziņš");
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, Degree degree)
	{
		setPID();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	public String toString()
	{
		return pID + ": " + degree + ", " + name + " " + surname;
	}
	
}

