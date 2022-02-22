package SchachSpiel;

import java.awt.Image;
import java.io.IOException;
/**
 * Klasse Turm: Die Klasse Turm erbt von der abstrakten Klasse Schachfigur
 * Stellt eine Figur aus dem Schachspiel dar
 * 
 * @author Julius Neimantas
 */
public class Turm extends Schachfigur {
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
	 * @param xp - horisontale Zielkoordinaten
	 * @param yp - vertikale Zielkoordinaten
	 */
	public int move(int xp, int yp) throws NumberFormatException, IOException {
			
//		soll geprüft werden ob sich nur X oder nur Y Koordinaten sich geändert werden,
//		beide gleichzeitig dürfen sich nicht ändern
		if ((xp == posX & yp != posY) || (yp == posY & xp != posX)) {
			posY = yp;
			posX = xp;
			System.out.println("posX: "+posX+"posY="+posY);
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
	public Turm(int x, int y,boolean f) {
		posX = x;
		posY = y;
		isBlack=f;
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
	 * Methode isBlack(): gibt die Farbe der Schachfigur zurueck
	 */
	@Override
	public boolean isBlack() {
		return isBlack;
	}
	
	/**
	 * Methode getImg(): Referenz zum dazugehoerigem Bild wird zurueckgegeben
	 */
	@Override
	public Image getImg() {
		return img;
	}
	/**
	 * Methode:setY() ueberschreibt die Instanvariablen count und posY
	 */
	public void setY(int i) {
		this.posY=i;
		
	}

	/**
	 * Methode:setX() ueberschreibt die Instanvariablen count und posX
	 */
	public void setX(int i) {
		this.posX=i;
		
	}

	/**
	 * Methode setImg(): der Referenz img wird ein dazugehoeriges Bild zugewiesen
	 */
	public Image setImg(Image img) {
		return this.img=img;
	}
	



}
