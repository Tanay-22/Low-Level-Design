package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory
{
    private static Map<String, Robot> roboticObjectCache = new HashMap<>();

    public static Robot createRobot(String robotType)
    {
        if (roboticObjectCache.containsKey(robotType))
        {
            return roboticObjectCache.get(robotType);
        }
        else
        {
            if (robotType.equals("HUMANOID"))
            {
                Sprites humanoidSprite = new Sprites();
                Robot humanoidObject = new HumanoidRobot(robotType, humanoidSprite);
                roboticObjectCache.put(robotType, humanoidObject);
                return humanoidObject;
            }
            else if (robotType.equals("ROBOTIC_DOG"))
            {
                Sprites roboticDogSprite = new Sprites();
                Robot roboticDogObject = new RoboticDog(robotType, roboticDogSprite);
                roboticObjectCache.put(robotType, roboticDogObject);
                return roboticDogObject;
            }
            return null;
        }
    }
}
