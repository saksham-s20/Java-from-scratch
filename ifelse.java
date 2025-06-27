import java.util.Scanner;
public class pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of the person: ");
        int age= sc.nextInt();
        System.out.println("enter true/false if the person is the citizen or not");
        boolean isCitizen = sc.nextBoolean();
        if(age >= 18){
            if(isCitizen){
                System.out.println("eligible to vote!!");
            }
            else{
                System.out.println("get citizenship to vote!!");
            }
        } else {
            System.out.println("not eligible to vote!!");
        }
    }
}
