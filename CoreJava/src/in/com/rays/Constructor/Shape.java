package in.com.rays.Constructor;

public class Shape {

	private String color;

	private int borderwidth;

	public Shape() {

	}

	public Shape(String color, int borderWidth) {
		this.color = color;
		this.borderwidth = borderWidth;
	}
		public void setColor(String color) {
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setBorderwidth(int borderwidth) {
			this.borderwidth = borderwidth;
		}

		public int getBorderwidth() {
			return borderwidth;
		}

	}

	

