package SchachSpiel;

import java.awt.Image;

/**
 * Klasse Bauer: Die Klasse Bauer erbt von der abstrakten Klasse Schachfigur
 * Stellt eine Figur aus dem Schachspiel dar
 * 
 * @author Julius Neimantas
 */
public class Bauer extends Schachfigur {
	/**
	 * Variable posX: horisontale Position der Schachfigur
	 */
	public int posX;
	/**
	 * Variable posY: vertikale Position der Schachfigur
	 */
	public int posY;
	/**
	 * Variable isBlack: Farbe der Schachfigur
	 */
	boolean isBlack;
	/**
	 * Referenzvariable img: Referenz auf das dazugehörige Bild der Schachfigur
	 */
	public Image img;
	/**
	 * Variable count: besagt ob die Schachfigur zum Ersten mal bewegt wird
	 */
	public int count;

	/**
	 * Die methode move() nimmt die Zielkoordinaten der Schachfigur entgegen und
	 * prüft auf die Gültigkeit des Bewegungsmusters der Figur
	 * @param x - horisontale Zielkoordinaten
	 * @param y - vertikale Zielkoordinaten
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
	 * Beim Instanzieren der Schachfigur werden folgende Parameter instanziiert:
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
	 * Methode getImg(): Referenz zum dazugehoerigem Bild wird zurueckgegeben
	 */
	public Image getImg() {
		return img;
	}

	/**
	 * Methode isBlack(): gibt die Farbe der Schachfigur zurueck
	 */
	@Override
	public boolean isBlack() {
		return isBlack;
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

	/**
	 * Methode setImg(): der Referenz img wird ein dazugehoeriges Bild zugewiesen
	 */
	public Image setImg(Image img) {
		return this.img = img;
	}

}
