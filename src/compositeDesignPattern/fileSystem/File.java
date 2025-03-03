package compositeDesignPattern.fileSystem;

public class File implements FileSystem
{
    private String name;

    public File(String name)
    {
        this.name = name;
    }

    @Override
    public void ls()
    {
        System.out.println("File name: " + name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
