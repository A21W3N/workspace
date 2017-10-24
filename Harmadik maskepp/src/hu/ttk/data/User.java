package hu.ttk.data;

public class User {
	
	private Long id;
	private String name;
	private String faculty;
	private String sex;
	private Long years;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Long getYears() {
		return years;
	}
	public void setYears(Long years) {
		this.years = years;
	}
	
	
}
