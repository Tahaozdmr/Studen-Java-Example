import java.util.Scanner;

public class Student
{
    Scanner scanner=new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int number;
    private String school;
    private String department;
    private String lesson;
    private double examVize;
    private double examFinal;
    private double  quizOne;
    private double quizTwo;
    private double avarage;
    private double harfNot;



    public String getFirstName( ) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public double getExamVize() {
        return examVize;
    }

    public void setExamVize(double examVize) {
        this.examVize = examVize;
    }

    public double getExamFinal() {
        return examFinal;
    }

    public void setExamFinal(double examFinal) {
        this.examFinal = examFinal;
    }

    public double getQuizOne() {
        return quizOne;
    }

    public void setQuizOne(double quizOne) {
        this.quizOne = quizOne;
    }

    public double getQuizTwo() {
        return quizTwo;
    }

    public void setQuizTwo(double quizTwo) {
        this.quizTwo = quizTwo;
    }

    public double getAvarage() {
        return avarage=examVize*0.30+examFinal*0.40+quizOne*0.15+quizTwo*0.15;
    }

    public void setAvarage(double avarage)
    {
        this.avarage = avarage;
    }
    public String getHarfNot()
    {
        if (avarage<=100 && avarage>=85)
            return "AA";
        else if (avarage<=84 && avarage>=70)
            return "BB";
        else if (avarage<=69 && avarage>=50)
            return "CC";
        else if (avarage<49 && avarage>=0)
            return "FF";
        else if (avarage>100 && avarage>0)
            return "Geçersiz değer girdiniz.";
       return null;
    }
    public void   setHarfNot(double harfNot)
    {
        this.harfNot=harfNot;
    }
}
