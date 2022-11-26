
public class Rectangle {
	
	double width = 1;
	double height = 1;
	
	Rectangle() {
		
	}
	
	//constructor
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		double area = width * height;
		return area;
	}
	
	double getPerimeter() {
		double perimeter = (width*2) + (height*2);
		return perimeter;
	}
	
	public static void main(String[] args) {
		
		/* 
		 * one with width 4 and height 40 and the other with width 3.5 and height 35.9.
		 * Display the width, height, area, and perimeter of each rectangle in this order.
		*/
		
		Rectangle rec1 = new Rectangle(4,40);
		System.out.println("width: " + rec1.width);
		System.out.println("height: " + rec1.height);
		System.out.println("area: " + rec1.getArea());
		System.out.println("perimeter: " + rec1.getPerimeter());
		
		System.out.println();
		
		Rectangle rec2 = new Rectangle(3.5,35.9);
		System.out.println("width: " + rec2.width);
		System.out.println("height: " + rec2.height);
		System.out.println("area: " + rec2.getArea());
		System.out.println("perimeter: " + rec2.getPerimeter());
		
		
		
	}
	
}
