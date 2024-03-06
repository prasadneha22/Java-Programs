public class Question7 {
    public static void main(String[] args) {
        
        int totalStudents = 90;

        int boys = 45;

        double gradeAPercentage = 50.0;

        int boysGradeA = 20;

       
        int totalGradeAStudents = (int) (totalStudents * (gradeAPercentage / 100));

       
        int girlsGradeA = totalGradeAStudents - boysGradeA;

        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
    }
}
