import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввыведите расстояние : ");
        double km = scanner.nextDouble();
        System.out.println(TransportType.BMW.calculateTravelCost(km) + "$ за " + km + " km в " + TransportType.BMW);
        System.out.println(TransportType.MERCEDES_BENZ.calculateTravelCost(km) + "$ за " + km + " km в " + TransportType.MERCEDES_BENZ);
        System.out.println(TransportType.AUDI.calculateTravelCost(km) + "$ за " + km + " km в " + TransportType.AUDI);

    }
}
