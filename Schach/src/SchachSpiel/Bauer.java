package SchachSpiel;

import java.awt.Image;

/**
 * Klasse: Bauer Die Klasse Bauer erbt von der abstrakten Klasse Schachfigur
 * Stellt eine Figur aus dem Schachspiel dar
 * 
 * @author Julius Neimantas
 */
public class Bauer extends Schachfigur {

	public int posX;
	public int posY;
	boolean isBlack;
	public Image img;
//	count besagt ob der Bauer zum Ersten mal  bewegt wird
	public int count;

	/**
	 * Methode isBlack(): gibt die Farbe der Schachfigur zurueck
	 */
	public boolean isBlack() {
		return isBlack;
	}

	/**
	 * Methode setImg(): der Referenz img wird ein dazugehoeriges Bild zugewiesen
	 */
	public Image setImg(Image img) {
		return this.img = img;
	}
	/**
	 * Methode getImg(): Referenz zum dazugehoerigem Bild wird zurueckgegeben
	 */
	public Image getImg() {
		return img;
	}

	/**
	 * Die methode move() nimmt die Zielkoordinaten der Schachfigur entgegen und
	 * prüft auf die Gültigkeit des Bewegungsmusters der Figur
	 */
	public int move(int x, int y) {
		if (x == posX + 1 && y == posY && isBlack == false
				|| x == posX + 2 && y == posY && this.count == 0 && isBlack == false) {
			System.out.println("ergibt true");
			posX = x;
			posY = y;
			this.count++;
			return posX;
		} else if (x == posX - 1 && y == posY && isBlack == true
				|| x == posX - 2 && y == posY && this.count == 0 && isBlack == true) {
			System.out.println("ergibt true");
			posX = x;
			posY = y;
			this.count++;

			return posX;
		} else if (x == posX + 1 && y == posY + 1 && isBlack == false
				|| x == posX + 1 && y == posY - 1 && isBlack == false) {
			posX = x;
			posY = y;
		} else if (x == posX - 1 && y == posY + 1 && isBlack == true
				|| x == posX - 1 && y == posY - 1 && isBlack == true) {
			posX = x;
			posY = y;
		}
		return posX;
	}

	/**
	 * Beim Instanzieren der Schachfigur werden folgende Parameter definiert:
	 * 
	 * @param x - horizontale Position der Schachfigur
	 * @param y - vertikale Position der Schachfigur
	 * @param f - Farbe -weiß/schwarz
	 */
	public Bauer(int x, int y, boolean f) {
		posX = x;
		posY = y;
		isBlack = f;

	}


	/**
	 * Methode:getX() gibt die x-Koordinaten der Schachfigur zurück
	 */
	public int getX() {
		return posX;
	}

	/**
	 * Methode:getY() gibt die y-Koordinaten der Schachfigur zurück
	 */
	public int getY() {
		return posY;
	}

	/**
	 * Methode:setY() ueberschreibt die Instanvariablen count und posY
	 */
	@Override
	public void setY(int i) {
		count = 0;
		this.posY = i;

	}

	/**
	 * Methode:setX() ueberschreibt die Instanvariablen count und posX
	 */
	@Override
	public void setX(int i) {
		count = 0;
		this.posX = i;

	}
}
