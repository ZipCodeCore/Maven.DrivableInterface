import Driving.Drivable;

import java.util.Scanner;

public class App {
    static int appExecutionStatus = -1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (args[0].equals("test"))
            in = new Scanner(args[1]);
        Console c = new Console(in);

        System.out.println("What kinda of vehicle do you want to drive");
        Drivable vehicle = getVehicle(c);

        System.out.println("How far do you want to travel");
        Double distance = getDistance(c);

        Integer timeTraveled = vehicle.transport(distance);

        System.out.println(String.format("You traveled for %d seconds", timeTraveled));
        App.appExecutionStatus = 0;
    }

    public static Drivable getVehicle(Console c) {
        String input = c.getInput();
        return null;
    }

    public static Double getDistance(Console c) {
        String input = c.getInput();
        return null;
    }
}
