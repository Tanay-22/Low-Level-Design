package creationalDesignPattern.builderDesignPattern;

import java.util.List;

public class Student
{
    private final int rollNumber;
    private final int age;
    private final String name;
    private final String fatherName;
    private final String motherName;
    private final List<String> subjects;

    public Student(StudentBuilder builder)
    {
        this.rollNumber = builder.getRollNumber();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.fatherName = builder.getFatherName();
        this.motherName = builder.getMotherName();
        this.subjects = builder.getSubjects();
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
