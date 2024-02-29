package model;

public class Student {
	private long stID;
	private String name;
	private String surname;
	
	private static long counter = 0;
	
	public long getSTID()
	{
		return stID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setSTID()
	{
		stID = counter;
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
	
	public Student()
	{
		setSTID();
		setName("Jānis");
		setSurname("Bērziņš");
	}
	
	public Student(String name, String surname)	{
		setSTID();
		setName(name);
		setSurname(surname);
	}
	
	public String toString()
	{
		return stID + ": " + name + " " + surname;
	}
	

}
