package SchachSpiel;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Klasse: Koenigin Die Klasse Koenigin erbt von der abstrakten Klasse
 * Schachfigur Stellt eine Figur aus dem Schachspiel dar
 * 
 * @author Julius Neimantas
 */
public class Koenigin extends Schachfigur {

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
	 * Die methode move() nimmt die Zielkoordinaten der Schachfigur entgegen und
	 * prüft auf die Gültigkeit des Bewegungsmusters der Figur
	 * @param x - horisontale Zielkoordinaten
	 * @param y - vertikale Zielkoordinaten
	 */
	public int move(int x, int y) throws NumberFormatException, IOException {

		posY = y;
		posX = x;

		return posX;
	}

	/**
	 * Beim Instanzieren der Schachfigur werden folgende Parameter instanziiert:
	 * 
	 * @param x - horizontale Position der Schachfigur
	 * @param y - vertikale Position der Schachfigur
	 * @param f - Farbe -weiß/schwarz
	 */
	public Koenigin(int posX, int posY, boolean f) {
		super();
		isBlack = f;
		this.posX = posX;
		this.posY = posY;

	}

	/**
	 * Methode:getX() gibt die x-Koordinaten der Schachfigur zurück
	 */
	public int getX() {
		// TODO Auto-generated method stub
		return posX;
	}

	/**
	 * Methode:getY() gibt die y-Koordinaten der Schachfigur zurück
	 */
	public int getY() {
		// TODO Auto-generated method stub
		return posY;
	}

	/**
	 * Methode isBlack(): gibt die Farbe der Schachfigur zurueck
	 */
	@Override
	public boolean isBlack() {
		// TODO Auto-generated method stub
		return this.isBlack;
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
	 * Methode:setY() ueberschreibt die Instanvariablen count und posY
	 */
	@Override
	public void setY(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * Methode:setX() ueberschreibt die Instanvariablen count und posX
	 */
	@Override
	public void setX(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * Methode setImg(): der Referenz img wird ein dazugehoeriges Bild zugewiesen
	 */
	public Image setImg(Image img) {
		return this.img = img;
	}

}
