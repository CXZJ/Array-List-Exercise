import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("White", "Orange", "Pink","Blue","Purple", "White"));

        Methods.printArray(colors);

        colors.add(2, "Black");
        colors.remove(1);
        System.out.println(colors);

        Methods.searchColor(colors, "White");

        System.out.println(Methods.removeDuplicates(colors));

    }
}