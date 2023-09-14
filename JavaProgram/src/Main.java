import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age ");
        int n=sc.nextInt();
        if(n<18)
        {
            System.out.println("sorry you are not eligible for vote");
        }
        else

        System.out.println("You are eligible for vote..!");
    }
}