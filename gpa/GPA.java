public class GPA {

    public static void main(String[] args) {
        
        Student student = new Student("Alice" , 9);
        student.setMathScore("A");
        student.setEnglishScore("B");
        student.setCsScore("C");


        System.out.prtinln(student.getName() + "'s gpa is" + student.calculateGPA() + " in grade" + student.getGradeLevel());
        return 0.0;

        System.out.println();

        
        // double gpa = student.calculateGPA();
        // System.out.println(gpa);

        // gpa = student2.calculateGPA();

        // String name = student.getName();
        // System.out.println(name);

        // student.getGradeLevel(11);
        // System.out.println(student.getGradeLevel());
    }
}