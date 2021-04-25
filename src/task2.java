import java.util.Scanner;

public class task2{
    public static String str = "";
    public static Scanner sc;

    public static String dv(int n){
        if(n/2!=0){
            dv(n/2);
        }
        str = str.concat(Integer.toString(n%2));
        return str;
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        System.out.println(dv(n));
    }
}
