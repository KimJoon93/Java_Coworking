
public class StudentInfo {
	private String name, major; 
	private int idnumber;
	
	public StudentInfo(String name, String major, int idnumber) {
		this.name =  name;
		this.major = major;
		this.idnumber = idnumber;
	}
	
	public void studentInfo() {
		System.out.println("===============================");
		System.out.println("Name: " + getName());
		System.out.println("Major: " + getMajor());
		System.out.println("ID: " + getIdnumber());
		System.out.println("===============================");
	}

	public String getName() {
		return name;
	}

	private String getMajor() {
		return major;
	}

	private int getIdnumber() {
		return idnumber;
	}
	
}
