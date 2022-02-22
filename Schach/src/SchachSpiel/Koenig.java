package SchachSpiel;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Klasse: Koenig Die Klasse Koenig erbt von der abstrakten Klasse Schachfigur
 * Stellt eine Figur aus dem Schachspiel dar
 * 
 * @author Julius Neimantas
 */
public class Koenig extends Schachfigur {
	/**
	 * Variable posX: horisontale Position der Schachfigur
	 */
	int posX;
	/**
	 * Variable posY: vertikale Position der Schachfigur
	 */
	int posY;
	/**
	 * Variable isBlack: Farbe der Schachfigur
	 */
	public boolean isBlack;
	/**
	 * Referenzvariable img: Referenz auf das dazugehörige Bild der Schachfigur
	 */
	public Image img;

	/**
	 * Die methode move() nimmt die Zielkoordinaten der Schachfigur entgegen und
	 * prüft auf die Gültigkeit des Bewegungsmusters der Figur
	 * @param x - horisontale Zielkoordinaten
	 * @param y - vertikale Zielkoordinaten
	 */
	public int move(int x, int y) {

		if (x + 1 == posX && y == posY || x - 1 == posX && y == posY || x - 1 == posX && y - 1 == posY
				|| x - 1 == posX && y + 1 == posY || x + 1 == posX && y - 1 == posY || x + 1 == posX && y + 1 == posY
				|| x == posX && y + 1 == posY || x == posX && y - 1 == posY) {
			posX = x;
			posY = y;
			return posX;
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
	public Koenig(int x, int y, boolean f) {
		posX = x;
		posY = y;
		isBlack = f;

	}

	/**
	 * Methode getImg(): Referenz zum dazugehoerigem Bild wird zurueckgegeben
	 */
	@Override
	public Image getImg() {
		// TODO Auto-generated method stub
		return img;
	}

	/**
	 * Methode:getY() gibt die y-Koordinaten der Schachfigur zurück
	 */
	public int getY() {
		return posY;
	}

	/**
	 * Methode:getX() gibt die x-Koordinaten der Schachfigur zurück
	 */
	public int getX() {
		return this.posX;
	}

	/**
	 * Methode isBlack(): gibt die Farbe der Schachfigur zurueck
	 */
	@Override
	public boolean isBlack() {
		return this.isBlack;
	}

	/**
	 * Methode:setY() ueberschreibt die Instanvariablen count und posY
	 */
	@Override
	public void setY(int i) {
		this.posY = i;
	}

	/**
	 * Methode:setX() ueberschreibt die Instanvariablen count und posX
	 */
	@Override
	public void setX(int i) {
		this.posX = i;

	}

	/**
	 * Methode setImg(): der Referenz img wird ein dazugehoeriges Bild zugewiesen
	 */
	public Image setImg(Image img) {
		return this.img = img;
	}

}
