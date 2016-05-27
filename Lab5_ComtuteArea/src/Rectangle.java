/**
 * 
 * @author 985219
 *
 */
public final class Rectangle implements IShape{
	private final double width;
	private final double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
}
