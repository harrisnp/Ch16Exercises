public class Student {

    //data - properties
    private String name;
    private int gradelevel;

    private String mathScore;
    private String englishScore;
    private String csScore;


    // constructor
    public Student(String name, int gradelevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        // setGradeLevel(gradeLevel);

        this.mathScore = "F";
        this.englishScore = "F";
        this.csScore = "F";
    }


    //other functions - abilities 
    //getters and setters
    public int getGradeLevel() {
        if (this.gradeLevel == 9) return "Freshman";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        }
    }

    public double setMathScore() {
        this.mathScore = mathScore;
    }

    // public String toString() {
    //         return sumarizeGPA();
    //     }

    //calculate gpa
    public double calculateGPA() {
    System.out.println("Calculating GPA...");
    return 0.0;
    }
    
    private double gradeValue(String grade) {
        if (grade.equals("A")) return 4.0;
        if (grade.equals("B")) return 3.0;
        if (grade.equals("C")) return 2.0;
        if (grade.equals("D")) return 1.0;
        
    }
}