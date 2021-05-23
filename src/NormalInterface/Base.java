package NormalInterface;

public class Base implements Drawable{
	public void draw() {
		System.out.println("Drawing....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.draw();
	}

}
