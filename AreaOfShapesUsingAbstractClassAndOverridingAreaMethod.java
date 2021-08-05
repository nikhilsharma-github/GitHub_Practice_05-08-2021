// import java.util.Scanner;

// Area of Shapes Using abstract class and overriding area method


abstract class shape {
	int a, b;
    shape(int length, int breadth)
    {
        this.a = length;
        this.b = breadth;
    }

	abstract void printArea();
}

class Rectangle extends shape {
    Rectangle(int length, int breadth)
    {
        super(length,breadth);
    }

	void printArea() {
		System.out.println("<<< HERE WE ARE FINDING THE AREA OF RECTANGLE >>>");
		System.out.println("The area of Rectangle is: " + a*b);
	}
}

class Triangle extends shape {
    Triangle(int base, int height)
    {
        super(base,height);
    }

	void printArea() {
		System.out.println("\n<<< HERE WE ARE FINDING THE AREA OF TRIANGLE >>>");
		System.out.println("The area of Triangle is: " + (a * b) / 2);
	}
}

class Circle extends shape {
    Circle(int a, int b)
    {
        super(a, b);
    }

	void printArea() {
		System.out.println("\n<<< HERE WE ARE FINDING THE AREA OF CIRCLE >>>");
		System.out.println("The area of Cricle is: " + 3.14f * a * a);
	}
}

public class  AreaOfShapesUsingAbstractClassAndOverridingAreaMethod{
	public static void main(String[] args) 
    {
		Rectangle rec1 = new Rectangle(11,9);
		rec1.printArea();

		Triangle tri1 = new Triangle(6,5);
		tri1.printArea();
		
		Circle cri1 = new Circle(12, 0);
		cri1.printArea();
	}
}


