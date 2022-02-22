package SchachSpiel;

import java.awt.Image;
import java.io.IOException;

public class Turm extends Schachfigur {
	int posX;
	int posY;
	boolean isBlack;
	public  Image img;
	

	public Image getImg() {
		return img;
	}
	
	public Image setImg(Image img) {
		return this.img=img;
	}
	public boolean isBlack() {
		return isBlack;
	}


	public int move(int xp, int yp) throws NumberFormatException, IOException {
		
		int x = xp;
		
		int y = yp;
//		soll geprüft werden ob sich nur X oder nur Y Koordinaten sich geändert werden,
//		beide gleichzeitig dürfen sich nicht ändern
		if ((x == posX & y != posY) || (y == posY & x != posX)) {
			posY = y;
			posX = x;
			System.out.println("posX: "+posX+"posY="+posY);
			return posX;
		}

		return posX;
	}


	public int getX() {
		// TODO Auto-generated method stub
		return posX;
	}


	public int getY() {
		// TODO Auto-generated method stub
		return posY;
	}

	public Turm(int x, int y,boolean f) {
		posX = x;
		posY = y;
		isBlack=f;

	}


	public void setY(int i) {
		this.posY=i;
		
	}


	public void setX(int i) {
		this.posX=i;
		
	}





}
