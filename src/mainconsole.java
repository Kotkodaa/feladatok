import java.util.Scanner;

public class mainconsole {
    public mainconsole() {
        System.out.println("Feladat.301");
        String radiusStr = input("Sugár:");
        String heightStr = input("magasság:");
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Cone cone = new Cone();
        System.out.println(cone.calcVolume(radius, height));
    }
    public String input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + " ");
        String text = scanner.nextLine();
        return text;
    }
}
