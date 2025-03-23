package creationalDesignPattern.prototypeDesignPattern;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student(20, 74, "Murdock");

        // creating clone of student

//        Student studentClone = new Student();
//        studentClone.setAge(student.getAge());
//        studentClone.setName(student.getName());
//        studentClone.setRollNumber(student.getRollNumber());

        Prototype studentClone = student.clone();
    }
}
