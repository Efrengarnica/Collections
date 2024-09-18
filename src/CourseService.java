
import java.util.HashMap;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
        //TODO implement so it adds the given course form the student
    	boolean estaInscrito=false;
    	for (Course c : students.get(studentId).getEnrolledCourses()) {
    			if(c.obtenerIdOfCourse().equals(courseId)) {
    				estaInscrito=true;
    			}
    		}
    	if(estaInscrito) {
    		System.out.println("El alumno ya está inscrito en ese curso");
    	}else {
    		students.get(studentId).enroll(courses.get(courseId));
    		System.out.println("Se inscribió con éxito al alumno");
    	}
    	
    }

    public void unEnrollStudent(String studentId, String courseId){
        //TODO implement so it removes the given course form the student
    	if(students.get(studentId).getEnrolledCourses().isEmpty()) {
    		System.out.println("No puedes eliminar el curso, ya que el alumno no está inscrito a ningún curso");
    	}else {
    		boolean estaInscrito=false;
        	for (Course c : students.get(studentId).getEnrolledCourses()) {
        			if(c.obtenerIdOfCourse().equals(courseId)) {
        				estaInscrito=true;
        			}
        		}
        	if(estaInscrito) {
        		students.get(studentId).unEnroll(courses.get(courseId));
        		System.out.println("Se eliminó el curso exitosamente");
        	}else {
        		System.out.println("El alumno NO está registrado en ese curso,elija un curso en el que esté registrado el alumno");
        	}
    		
    		
    	}
    	
    }

    public void displayCourseInformation(String courseId){
        //TODO implement so it shows the course name, id and credits
    	System.out.println(courses.get(courseId).toString());
    }

    public void displayStudentInformation(String studentId){
        //TODO implement so it shows the student name, id and list of enrolled courses
    	
    	if(students.containsKey(studentId)) {
    		if(students.get(studentId).getEnrolledCourses().isEmpty()) {
    			System.out.println((students.get(studentId)).getName());
            	System.out.println(students.get(studentId).getId());
    			System.out.println("El alumno NO está inscrito en ningún curso");
    		}else { 
    			System.out.println((students.get(studentId)).getName());
            	System.out.println(students.get(studentId).getId());
            	for (Course c : students.get(studentId).getEnrolledCourses()) {
            		System.out.println(c.toString());
            		}
    		}
    		
    		
    	} else {
    		System.out.println("No existe ningún alumno asociado a ese ID");
    		
    	}
    	
    	
    	
    }
    
    public void totalCreditsStudent(String studentId) {
    	int totalCredits = 0;
    	for (Course c : students.get(studentId).getEnrolledCourses()) {
    		totalCredits+= c.obtenerCreditsOfCourse();
    		}
    	System.out.println("Total of credits: " + totalCredits );
    	
    }


}