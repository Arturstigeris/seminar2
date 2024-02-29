package model;

public class Grade {
	private long gID;
	private int value;
	private Student student;
	private Course course;
	
	private static long counter = 200000;

	public long getgID() {
		return gID;
	}

	public void setgID() {
		gID = counter;
		counter++;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value >= 1 && value <= 10)
			this.value = value;
		else 
			this.value = 0;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		if(student != null)
			this.student = student;
		else 
			this.student = new Student();
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		if(course != null)
			this.course = course;
		else 
			this.course = new Course();
	}
	
	public Grade()
	{
		setgID();
		setValue(4);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	public Grade(int setValue, Student student, Course course)
	{
		setgID();
		setValue(4);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	
}
