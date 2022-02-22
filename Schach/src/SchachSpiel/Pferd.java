package SchachSpiel;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pferd extends Schachfigur {
	int posX;
	int posY;
	boolean isBlack;
	public Image img;
	
	
	
	
	public Image setImg(Image img) {
		return this.img=img;
	}

	public int getPosX() {
		return posX;
	}
 
	public int move(int x, int y) throws Exception {

		if(posX-2==x&&posY-1==y) {
			posY = y;
			posX = x;
			return posX;
		}else if(posX-2==x&&posY+1==y) {
			posY = y;
			posX = x;
			return posX;
		}else if(posX-1==x&&posY-2==y) {
			posY = y;
			posX = x;
		return posX;
			}else if(posX+1==x&&posY-2==y) {
			posY = y;
			posX = x;
		return posX;
			}else if(posX+2==x&&posY-1==y) {
			posY = y;
			posX = x;
		return posX;
			}else if(posX+2==x&&posY+1==y) {
				posY = y;
				posX = x;
			return posX;
			}else if(posX-1==x&&posY+2==y) {
				posY = y;
				posX = x;
			return posX;
			}else if(posX+1==x&&posY+2==y) {
				posY = y;
				posX = x;
			return posX;
			}else {
				return posX;
			}
		
		
	}
	
	public Pferd(int x, int y,boolean f) {
		posX=x;
		posY=y;
		isBlack=f;
		

		
	}
	
	public int getPosY() {
		return posY;
	}

	public boolean isBlack() {
		return isBlack;
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
	public Image getImg() {
		// TODO Auto-generated method stub
		return img;
	}
	


}
