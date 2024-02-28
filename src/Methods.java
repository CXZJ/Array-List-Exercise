import java.util.ArrayList;

public class Methods {
    public static void printArray(ArrayList<String> arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
    public static void searchColor(ArrayList<String> arr, String color) {
        if (arr.contains(color)) {
            System.out.println("this color is in the " + arr.indexOf(color) + "index");
        }
        else {
            System.out.println("this color is not in the list");
        }
    }
    public static ArrayList<String> removeDuplicates(ArrayList<String> arr) {
        ArrayList<String> newArr = new ArrayList<>();

        for (String s : arr) {
            if (! newArr.contains(s)) {newArr.add(s);}
        }

        return newArr;
    }
}
