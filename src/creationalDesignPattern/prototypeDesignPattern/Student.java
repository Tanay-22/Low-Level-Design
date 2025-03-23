package creationalDesignPattern.prototypeDesignPattern;

public class Student implements Prototype
{
    private int age;
    private int rollNumber;
    private String name;

    public Student()
    {
    }

    public Student(int age, int rollNumber, String name)
    {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public Prototype clone()
    {
        return new Student(age, rollNumber, name);
    }
}
