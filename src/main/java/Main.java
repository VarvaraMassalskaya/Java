import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    /*1. Приветствовать любого пользователя при вводе его имени через командную строку.*/
        System.out.println("Type your name in command line");
         Scanner scanner = new Scanner(System.in);
         System.out.println("Hello, " + args);
    /*2. Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
          for( int i = args.length-1; i >= 0; i--){
                  System.out.println(args[i]);
               }
     /*3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку */
       System.out.println("How many random numbers would you like?:)");
        int n = Integer.parseInt(scanner.next());
        Random random = new Random();
        for(int i=0; i<n; i++){
            int num = random.nextInt(100);
            System.out.print(num + " ");
        }
        for(int i=0; i<n; i++){
            int num = random.nextInt(100);
            System.out.println(num);
        }
     /*4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.*/
        int sum=0;
        for(int i=0; i<args.length; i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    /*4. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
    Осуществить проверку корректности ввода чисел.*/
        int month;
        System.out.println("write down the number from 1 to 12");
        month = Integer.parseInt(scanner.next());
        switch(month){
            case 1: System.out.println("january");
            break;
            case 2: System.out.println("february");
                break;
            case 3: System.out.println("march");
                break;
            case 4: System.out.println("april");
                break;
            case 5: System.out.println("may");
                break;
            case 6: System.out.println("june");
                break;
            case 7: System.out.println("july");
                break;
            case 8: System.out.println("august");
                break;
            case 9: System.out.println("september");
                break;
            case 10: System.out.println("october");
                break;
            case 11: System.out.println("november");
                break;
            case 12: System.out.println("december");
                break;
            default:
                throw new RuntimeException("Unknown month category");
        }
    }


    }

