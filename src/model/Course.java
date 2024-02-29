package model;

public class Course {
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 100000;
	
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
		if(title != null && title.matches("[A-Za-z 0-9](4 - 40)"))
			this.title = title;
		else 
			this.title ="Undefined";	
	}

	public void setCreditPoints(int creditPoints) 
	{
		if(creditPoints >= 1 && creditPoints <= 20)
			this.creditPoints = creditPoints;
		else 
			this.creditPoints = 2;
	}

	public void setProfessor(Professor professor) 
	{
		if(professor != null)
			this.professor = professor;
		else 
			this.professor = new Professor();
	}
	
	
	public Course()
	{
		setCID();
		setTitle("JAVA");
		setCreditPoints(4);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditPoints, Professor professor)
	{
		setCID();
		setTitle("JAVA");
		setCreditPoints(4);
		setProfessor(new Professor());
	}
	
	public String toString()
	{
		return cID + ": " + title + "(" + creditPoints + "KP)" + professor.getName() + " " + professor.getSurname();
	}
}
