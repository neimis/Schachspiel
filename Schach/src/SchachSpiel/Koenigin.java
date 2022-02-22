package SchachSpiel;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koenigin extends Schachfigur {

	int posX;
	int posY;
	boolean isBlack;
	public  Image img;

	public Image setImg(Image img) {
		return this.img=img;
	}
	public int move(int x, int y) throws NumberFormatException, IOException {

		posY = y;
		posX = x;

		return posX;
	}

	public Koenigin(int posX, int posY,boolean f) {
		super();
		isBlack=f;
		this.posX = posX;
		this.posY = posY;

	}

	public int getX() {
		// TODO Auto-generated method stub
		return posX;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return posY;
	}

	@Override
	public void setY(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setX(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isBlack() {
		// TODO Auto-generated method stub
		return this.isBlack;
	}
	@Override
	public Image getImg() {
		// TODO Auto-generated method stub
		return img;
	}

}
