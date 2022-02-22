package SchachSpiel;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laeufer extends Schachfigur {

	int posX;
	int posY;
	boolean isBlack;
	public  Image img;

	public Image setImg(Image img) {
		return this.img=img;
	}
	
	public int move(int x, int y) throws NumberFormatException, IOException {

		if (x != posX && y != posY && x < posX && y < posY) {
			System.out.println("diagonale Bewegung1");
			posY = y;
			posX = x;
			return posX;

		} else if (x != posX && y != posY && x < posX && y > posY) {
			System.out.println("diagonale Bewegung2");

			posY = y;
			posX = x;

			return posX;
		} else if (x != posX && y != posY && x > posX && y < posY) {
			System.out.println("diagonale Bewegung3");
			posY = y;
			posX = x;
			return posX;
		} else if (x != posX && y != posY && x > posX && y > posY) {
			System.out.println("diagonale Bewegung3");
			posY = y;
			posX = x;
			return posX;
		} else {
			System.out.println("posX: " + posX + "posY=" + posY);
			return posX;
		}

	}

	public Laeufer(int posX, int posY,boolean f) {
		this.posX = posX;
		this.posY = posY;
		isBlack=f;

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
		this.posY=i;

	}

	@Override
	public void setX(int i) {
		this.posX=i;

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

	public String toString() {
		return "Der Läufer hat folgende Position" + posX + " und Position " + posY;
	}

}
