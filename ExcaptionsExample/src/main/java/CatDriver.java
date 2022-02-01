import java.text.ParseException;

public class CatDriver {
    public static void main(String[] args) {
        Cat angel = new Cat();
        System.out.println(angel.meow(null));
        System.out.println("Finished");
        try {
            System.out.println(angel.convertToDate("2022-02-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
