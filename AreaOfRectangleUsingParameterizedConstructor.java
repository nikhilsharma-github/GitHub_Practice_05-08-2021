import java.util.Scanner;


class AreaOfRectangle{
   int area;
   AreaOfRectangle(int l,int b){
       System.out.println("Area of rectangle is :  ");
       System.out.print(l*b);
   }
}

class AreaOfRectangleUsingParameterizedConsturctor{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
   

        System.out.println("Enter the length of the rectangle : ");
        int len= ip.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int brt= ip.nextInt();

       new AreaOfRectangle(len,brt);  


        ip.close();
    }
}