package water_sort_puzzle;

import java.util.List;
import java.util.Scanner;

public class GameRunner
{
    public static void main(String[] args)
    {
        Tube tube1 = new Tube();
        tube1.pushColor(Color.DARK_BLUE);
        tube1.pushColor(Color.DARK_BLUE);
        tube1.pushColor(Color.DARK_BLUE);
        tube1.pushColor(Color.YELLOW);

        Tube tube2 = new Tube();
        tube2.pushColor(Color.DARK_BLUE);
        tube2.pushColor(Color.RED);
        tube2.pushColor(Color.RED);
        tube2.pushColor(Color.RED);

        Tube tube3 = new Tube();
        tube3.pushColor(Color.RED);
        tube3.pushColor(Color.YELLOW);
        tube3.pushColor(Color.YELLOW);
        tube3.pushColor(Color.YELLOW);

        Tube tube4 = new Tube();
        Tube tube5 = new Tube();

        List<Tube> tubes = List.of(tube1, tube2, tube3, tube4, tube5);
        Game waterSortGame = new Game(tubes);
        Scanner sc = new Scanner(System.in);

        while (!waterSortGame.isWon())
        {
            System.out.print("From - To : ");
            String[] fromTo = sc.next().split("-");

            waterSortGame.pour(Integer.parseInt(fromTo[0]), Integer.parseInt(fromTo[1]));
        }
        System.out.println("You Won");
    }
}
