package SchachSpiel;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koenig extends Schachfigur {

	int posX;
	int posY;
	public boolean isBlack;
	public Image img;

	public Image setImg(Image img) {
		return this.img=img;
	}
	public int move(int x, int y) {
	
		if(x+1==posX&&y==posY||x-1==posX&&y==posY||x-1==posX&&y-1==posY||x-1==posX&&y+1==posY||x+1==posX&&y-1==posY||x+1==posX&&y+1==posY||x==posX&&y+1==posY||x==posX&&y-1==posY) {
		posX=x;
		posY=y;
		return posX;
		}
		return posX;
	}
	
	public int getY() {
		return posY;
	}

	public Koenig(int x, int y,boolean f) {
		posX=x;
		posY=y;
		isBlack=f;

	}


	public int getX() {
		// TODO Auto-generated method stub
		return posX;
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
