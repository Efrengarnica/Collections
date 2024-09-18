public class Course {
	//variables
	String name;
    String id;
    int credits;

    public Course( String name, String id, int credits ) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    @Override
    public String toString(){
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }
    
    public int obtenerCreditsOfCourse() {
    	return credits;
    }
    
    public String obtenerIdOfCourse() {
    	return id;
    }
    
}