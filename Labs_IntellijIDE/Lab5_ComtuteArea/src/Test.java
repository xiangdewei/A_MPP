/**
 * 
 * @author 985219
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShape[] shapeList = { new Circle(11), new Rectangle(11, 22), new Triangle(10,20) };
		for(IShape shape:shapeList){
			System.out.println(shape.computeArea());
		}
	}

}
