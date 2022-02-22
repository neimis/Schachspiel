package SchachSpiel;

import java.awt.Image;

public class Bauer extends Schachfigur {

	public int posX;
	public int posY;
	boolean isBlack;
	public Image img;
//	count besagt ob der Bauer zum Ersten mal  bewegt wird
	public int count;
	
	
	public boolean isBlack() {
		return isBlack;
	}


	public Image setImg(Image img) {
		return this.img=img;
	}
	
	public Image getImg() {
		return img;
	}
	public int move(int x, int y) {
		if (x  == posX+ 1 && y == posY && isBlack==false || x  == posX+ 2 && y == posY && this.count == 0 && isBlack==false) {
			System.out.println("ergibt true");
			posX = x;
			posY = y;
			this.count++;
			return posX;
		}else if(x  == posX- 1 && y == posY && isBlack==true || x  == posX- 2 && y == posY && this.count == 0 && isBlack==true) {
			System.out.println("ergibt true");
			posX = x;
			posY = y;
			this.count++;
		
			return posX;
	}
		else if(x  == posX+ 1 && y == posY+1 && isBlack==false||x  == posX+ 1 && y == posY-1 && isBlack==false) {
			posX = x;
			posY = y;
		}else if(x  == posX- 1 && y == posY+1 && isBlack==true||x  == posX- 1 && y == posY-1 && isBlack==true) {
			posX = x;
			posY = y;
		}
		return posX;
	}
	public int getX() {
		return posX;
	}

	public int getY() {
		return posY;
	}

	public Bauer(int x, int y,boolean f) {
		posX = x;
		posY = y;
		isBlack=f;
		
		

	}

	public String toString() {
		return "Der Bauer hat folgende Position: " + posX + " und Position: " + posY;
	}

	@Override
	public void setY(int i) {
		count=0;
		this.posY=i;

	}

	@Override
	public void setX(int i) {
		count=0;
		this.posX=i;

	}
}
