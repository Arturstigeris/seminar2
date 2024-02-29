package model;

public class Course {
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;
	
	public long getCID()
	{
		return cID;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getCreditPoints()
	{
		return creditPoints;
	}
	
	public Professor getProfessor()
	{
		return professor;
	}
	
	public void setCID()
	{
		cID = counter;
		counter++;
	}
	
	public void setTitle(String title)
	{
		if(title != null && title.matches("[A-ZĀŪŽČĒŅĪĻĢĶ](1)[a-zāūžčēņīļģķ]+"))
			this.title = title;
		else 
			this.title ="Undefined";	
	}

	public void getCreditPoints(int creditPoints) 
	{
		if(creditPoints != null && creditPoints.matches("[0-4]"))
			this.creditPoints = creditPoints;
		else 
			this.creditPoints ="Undefined";
	}

	public void getProfessor(Degree professor) 
	{
		if(professor != null)
			this.professor = professor;
		else 
			this.professor = professor.other;
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
