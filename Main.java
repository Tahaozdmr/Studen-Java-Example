import java.util.Scanner;

public class Main
{
    static Scanner scanner=new Scanner(System.in);
    static Student student=new Student();
    public static void main(String [] args)
    {
    add();
    eylem();
    }
    public static  void add()
    {

        System.out.println("Öğrenci ad giriniz.");
        student.setFirstName(scanner.nextLine());

        System.out.println("Öğrenci soyad giriniz.");
        student.setLastName(scanner.nextLine());

        System.out.println("Öğrenci okul giriniz.");
        student.setSchool(scanner.nextLine());

        System.out.println("Öğrenci ders giriniz.");
        student.setLesson(scanner.nextLine());

        System.out.println("Öğrenci numarası giriniz.");
        student.setNumber(scanner.nextInt());

        System.out.println("Öğrenci vize notu giriniz.");
        student.setExamVize(scanner.nextDouble());

        System.out.println("Öğrenci final notu giriniz.");
        student.setExamFinal(scanner.nextDouble());

        System.out.println("Öğrenci quiz1 notu giriniz.");
        student.setQuizOne(scanner.nextDouble());

        System.out.println("Öğrenci quiz2 notu giriniz.");
        student.setQuizTwo(scanner.nextDouble());

    }
    public static void eylem()
    {

        System.out.println("Öğrenci adı: "+student.getFirstName()+"\nÖğrenci Soyadı: "+student.getLastName()
                +"\nÖğrenci numarası:"+student.getNumber()+"\nOkul: "+student.getSchool()+"\nDers: "+
                student.getLesson()+"\nDers Notu: "+student.getAvarage()
                +"\nHarf Notu: "+student.getHarfNot());
    }
}
