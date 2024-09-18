
public class Main{
    public static void main( String[] args ) {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);
        courseService.unEnrollStudent( studentId, courseId );

        System.out.println("=====================");
        
        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
        System.out.println("=====================");

        courseService.enrollStudent( studentId, "biol_01" );
        courseService.enrollStudent( studentId, "phys_01" );
        courseService.displayStudentInformation( studentId);
        courseService.totalCreditsStudent(studentId);

        System.out.println("=====================");
        
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        courseService.totalCreditsStudent(studentId);
        
        System.out.println("=====================");
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        courseService.totalCreditsStudent(studentId);
        
       
    }


}