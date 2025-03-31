package structural.composite;

import structural.composite.calculator.ArithmeticExpression;
import structural.composite.calculator.Expression;
import structural.composite.calculator.Number;
import structural.composite.calculator.Operation;
import structural.composite.fileSystem.Directory;
import structural.composite.fileSystem.File;
import structural.composite.fileSystem.FileSystem;

public class Main
{
    public static void main(String[] args)
    {
        Directory movie = new Directory("Movie");
        FileSystem spiderman = new File("Spiderman");
        movie.add(spiderman);

        Directory comedyMovies = new Directory("Comedy Movies");
        File hulchul = new File("Hulchul");
        comedyMovies.add(hulchul);
        movie.add(comedyMovies);

        movie.ls();

        ArithmeticExpression two = new Number(2);
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression add = new Expression(one, seven, Operation.ADD);

        ArithmeticExpression expression = new Expression(two, add, Operation.MULTIPLY);
        // 2 * (1 + 7)
        System.out.println(expression.evaluate());
    }
}
