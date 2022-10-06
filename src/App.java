import java.util.Scanner;
public class App {
    public static void main(String[] args ){
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       
        // for (String car : cars){
        //     System.out.println(car);
        // }
        // System.out.println(Input(12));

        recurse (0, 1);
    }

    public static int recurse(int first, int second){
        int third = first + second;
        first = second; 
        second = third;
        System.out.print(third + ", " );
        if (third > 100000){
            return 0;
        } else {
            return (recurse(first, second));
        }
            
        
    }  

    public static String Input(String val){
        System.out.print(val + " ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        return text;

    }

    public static String Input(int val){
        System.out.print("" + val + ":");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        
        return text;
    }
}