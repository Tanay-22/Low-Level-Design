package creationalDesignPattern.builderDesignPattern;

public class Director
{
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder)
    {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent()
    {

        if (studentBuilder instanceof EngineeringStudentBuilder)
        {
            return createEngineeringStudent();
        }
        else if (studentBuilder instanceof MBAStudentBuilder)
        {
            return createMBAStudent();
        }
        return null;
    }


    private Student createEngineeringStudent()
    {
        return studentBuilder
                .setRollNumber(74)
                .setAge(22)
                .setName("Tanay")
                .setSubjects()
                .build();
    }

    private Student createMBAStudent()
    {
        return studentBuilder
                .setRollNumber(29)
                .setAge(24)
                .setName("Kritika")
                .setFatherName("Saudagar")
                .setSubjects()
                .build();
    }
}
