package javalab;
class Shape{
	public int area(int side) {
		System.out.println("its a square!");
		return side*side;
	}
	public int area(int l,int b) {
		System.out.println("its a rectangle!");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("its a circle!");
		return 3.14f*radius;
	}
}

public class TestOverLoading {
	public static void main(String [] args) {
		Shape shape=new Shape();
		shape.area(10);
		System.out.println(shape.area(30,58));
		shape.area(7.854f);
	}
}
