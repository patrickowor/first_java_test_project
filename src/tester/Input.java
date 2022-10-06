package tester;
public class Input {
    int x = 7;
    public static void main (String[] args){
        Input myObj1 = new Input();  // Object 1
        Input myObj2 = new Input();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x); 
    }
} 