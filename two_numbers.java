import java.util.Scanner;

class two_numbers{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=ip.next();
        
        System.out.println("Hello "+name);
        ip.close();
    }
}