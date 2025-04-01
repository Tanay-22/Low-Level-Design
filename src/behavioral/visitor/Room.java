package behavioral.visitor;

public interface Room
{
    void accept(Visitor visitor);
}
