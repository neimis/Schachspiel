package SchachSpiel;

import java.awt.Image;
/**
 * Abstrakte Klasse Schachfigur
 * @author Julius Neimantas
 *
 */
public abstract class Schachfigur {
	/**
	 * Die abstrakte methode move() nimmt die Zielkoordinaten der Schachfigur entgegen und
	 * prüft auf die Gültigkeit des Bewegungsmusters der Figur
	 * @param xp - horisontale Zielkoordinaten
	 * @param yp - vertikale Zielkoordinaten
	 */
	public abstract int move(int i, int y) throws Exception;
	/**
	 * Methode:getX() gibt die x-Koordinaten der Schachfigur zurück
	 */
	public abstract int getX();
	/**
	 * Methode:getY() gibt die y-Koordinaten der Schachfigur zurück
	 */
	public abstract int getY();
	/**
	 * Methode:setY() ueberschreibt die Instanvariablen count und posY
	 */
	public abstract void setY(int i);
	/**
	 * Methode:setX() ueberschreibt die Instanvariablen count und posX
	 */
	public abstract void setX(int i);
	/**
	 * Methode isBlack(): gibt die Farbe der Schachfigur zurueck
	 */
	public abstract boolean isBlack();
	/**
	 * Methode getImg(): Referenz zum dazugehoerigem Bild wird zurueckgegeben
	 */
	public abstract Image getImg();
	/**
	 * Methode setImg(): der Referenz img wird ein dazugehoeriges Bild zugewiesen
	 */
	public abstract Image setImg(Image img);

	/**
	 * Ueberschreibt die equals Methode, damit Referenzobjekte aus einer ArrayList entfernt werden können
	 */
	@Override
	public boolean equals(Object ob) {
		if (ob instanceof Schachfigur) {
			Schachfigur test = (Schachfigur) ob;
			return test.getX()==this.getX()&& test.getY()== this.getY();
		}
		return false;
	}


}
