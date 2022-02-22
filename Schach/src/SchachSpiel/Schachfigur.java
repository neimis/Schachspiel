package SchachSpiel;

import java.awt.Image;

public abstract class Schachfigur {

	public abstract int move(int i, int y) throws Exception;

	public abstract int getX();

	public abstract int getY();

	public abstract void setY(int i);

	public abstract void setX(int i);

	public abstract boolean isBlack();

	public abstract Image getImg();

	public abstract Image setImg(Image img);

	@Override
	public boolean equals(Object ob) {
		if (ob instanceof Schachfigur) {
			Schachfigur test = (Schachfigur) ob;
			return test.getX()==this.getX()&& test.getY()== this.getY();
		}
		return false;
	}

//	public abstract void kill();
}
