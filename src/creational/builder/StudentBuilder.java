package creational.builder;

import java.util.List;

public abstract class StudentBuilder
{
    private int rollNumber;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age)
    {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name)
    {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName)
    {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName)
    {
        this.motherName = motherName;
        return this;
    }

    protected void setSubjects(List<String> subjects)
    {
        this.subjects = subjects;
    }

    public abstract StudentBuilder setSubjects();

    public Student build()
    {
        return new Student(this);
    }

    // GETTERS

    public int getRollNumber()
    {
        return rollNumber;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public String getFatherName()
    {
        return fatherName;
    }

    public String getMotherName()
    {
        return motherName;
    }

    public List<String> getSubjects()
    {
        return subjects;
    }
}
