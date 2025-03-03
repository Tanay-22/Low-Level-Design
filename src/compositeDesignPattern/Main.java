package compositeDesignPattern;

import compositeDesignPattern.calculator.ArithmeticExpression;
import compositeDesignPattern.calculator.Expression;
import compositeDesignPattern.calculator.Number;
import compositeDesignPattern.calculator.Operation;
import compositeDesignPattern.fileSystem.Directory;
import compositeDesignPattern.fileSystem.File;
import compositeDesignPattern.fileSystem.FileSystem;

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
