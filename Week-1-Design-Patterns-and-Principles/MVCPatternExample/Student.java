class Student{
	String name;
	int id;
	String grade;
	
	Student(String name,int id,	String grade){
		this.name= name;
		this.id= id;
		this.grade=grade;
	}
	
	public String getName() { 
		return name; 
	}
	
    public void setName(String name) {
    	this.name = name;
    }

    public int getId() {
    	return id; 
    }
    
    public void setId(int id) {
    	this.id = id; 
    }

    public String getGrade() { 
    	return grade; 
    }
    
    public void setGrade(String grade) {
    	this.grade = grade; 
    }
}