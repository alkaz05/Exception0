import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите 5 целых чисел");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                int x = scanner.nextInt();
                if (x == 13)
                    throw new Exception("ужас-ужас");
                list.add(x);
            }
            catch (InputMismatchException ex){
                System.out.println("вы ввели не число!");
                scanner.next();
            }
            catch (Exception ex) {
                System.out.println("у нас авария: "+ex.getMessage());

                //ex.printStackTrace();  //имеет смысл вывести в консоль стек функций,
                                        // в глубине которого произошло исключение
            }
        }
        System.out.println(list);
    }
}