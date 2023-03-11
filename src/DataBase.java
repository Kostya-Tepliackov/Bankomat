import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Account> list = new  ArrayList();

    static{
        list.add(new Account("Vanya", 5256, 01, "4956"));
        list.add(new Account("Kostya", 10708, 02, "9134"));
        list.add(new Account("Nikita", 2322, 03, "5932"));
        list.add(new Account("Kolya", 10809, 04, "7417"));
        list.add(new Account("Oleg", 7802, 05, "0613"));
    }
}
