package SchachSpiel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * * @author Julius Neimantas
 * 
 *
 */

public class Brett implements ImageObserver {
	public static Schachfigur[][] sc = new Schachfigur[8][8];
	public static Schachfigur figur;
	public static JPanel pn;
	public static Graphics s;
	public static Image[] img;
	static Image imgTurm, imgTurmS;
	static Image imgBauer, imgBauerS;
	static Image imgKoenig, imgKoenigS;
	static Image imgKoenigin, imgKoeniginS;
	static Image imgLaeufer, imgLaeuferS;
	static Image imgPferd, imgPferdS;
	public static int posX;
	public static int posY;
	public static int count;
	static List<Schachfigur> list;
	public static boolean farbe;

	public static Schachfigur turm1, turm2, laeufer1, laeufer2, pferd1, pferd2, koenig, koenigin, bauer1, bauer2,
			bauer3, bauer4, bauer5, bauer6, bauer7, bauer8, turm11, turm22, laeufer11, laeufer22, pferd11, pferd22,
			koenigg, koeniginn, bauer11, bauer22, bauer33, bauer44, bauer55, bauer66, bauer77, bauer88;

	/**
	 * Methode: main()
	 * baut das Spiel auf
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		initImage();
		gui();

	}

	/**
	 * Methode: initImage() Die statischen Image Objekte werden initialisiert Das
	 * zweidimensionalle Array (Schachfigur Array) wird initialisiert Zusätzlich
	 * werden statische Referenzen initialisiert und und in einer ArrayList
	 * hinzugefuegt
	 */
	public static void initImage() {
		try {
			imgTurm = ImageIO.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\Turm.jpg"));

			imgBauer = ImageIO.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\Bauer.jpg"));
			imgKoenig = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\Koenig.jpg"));
			imgKoenigin = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\Koenigin.jpg"));
			imgLaeufer = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\Laeufer.jpg"));
			imgPferd = ImageIO.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\Pferd.jpg"));

			imgTurmS = ImageIO.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\TurmS.jpg"));

			imgBauerS = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\BauerS.jpg"));
			imgKoenigS = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\KoenigS.jpg"));
			imgKoeniginS = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\KoeniginS.jpg"));
			imgLaeuferS = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\LaeuferS.jpg"));
			imgPferdS = ImageIO
					.read(new File("C:\\Users\\Cezar\\Documents\\ECLIPSE-workspace\\Schach\\img\\PferdS.jpg"));

//			Objekte Zuordnen

			sc[0][3] = new Koenigin(0, 3, false);
			sc[0][4] = new Koenig(0, 4, false);
			sc[0][2] = new Laeufer(0, 2, false);
			sc[0][5] = new Laeufer(0, 5, false);
			sc[0][0] = new Turm(0, 0, false);
			sc[0][7] = new Turm(0, 7, false);
			sc[0][1] = new Pferd(0, 1, false);
			sc[0][6] = new Pferd(0, 6, false);
			for (int y = 0; y < sc[1].length; y++) {
				sc[1][y] = new Bauer(1, y, false);
				sc[6][y] = new Bauer(6, y, true);
			}
			sc[7][3] = new Koenigin(7, 3, true);
			sc[7][4] = new Koenig(7, 4, true);// test
			sc[7][2] = new Laeufer(7, 2, true);
			sc[7][5] = new Laeufer(7, 5, true);
			sc[7][0] = new Turm(7, 0, true);
			sc[7][7] = new Turm(7, 7, true);
			sc[7][1] = new Pferd(7, 1, true);
			sc[7][6] = new Pferd(7, 6, true);

//			statische Referenzen zweigen ebenfalls auf die Schachfiguren

			turm1 = sc[0][0];
			turm2 = sc[0][7];
			laeufer1 = sc[0][2];
			laeufer2 = sc[0][5];
			pferd1 = sc[0][1];
			pferd2 = sc[0][6];
			koenig = sc[0][4];
			koenigin = sc[0][3];
			bauer1 = sc[1][0];
			bauer2 = sc[1][1];
			bauer3 = sc[1][2];
			bauer4 = sc[1][3];
			bauer5 = sc[1][4];
			bauer6 = sc[1][5];
			bauer7 = sc[1][6];
			bauer8 = sc[1][7];

			turm11 = sc[7][7];
			turm22 = sc[7][0];
			laeufer11 = sc[7][2];
			laeufer22 = sc[7][5];
			pferd11 = sc[7][1];
			pferd22 = sc[7][6];
			koenigg = sc[7][4];// test
			koeniginn = sc[7][3];
			bauer11 = sc[6][0];
			bauer22 = sc[6][1];
			bauer33 = sc[6][2];
			bauer44 = sc[6][3];
			bauer55 = sc[6][4];
			bauer66 = sc[6][5];
			bauer77 = sc[6][6];
			bauer88 = sc[6][7];

//			die Referenzen werden in einer ArrayList gepackt

			list = new ArrayList<>();
			list.add(bauer1);
			list.add(bauer2);
			list.add(bauer3);
			list.add(bauer4);
			list.add(bauer5);
			list.add(bauer6);
			list.add(bauer7);
			list.add(bauer8);
			list.add(bauer11);
			list.add(bauer22);
			list.add(bauer33);
			list.add(bauer44);
			list.add(bauer55);
			list.add(bauer66);
			list.add(bauer77);
			list.add(bauer88);
			list.add(turm1);
			list.add(turm11);
			list.add(turm2);
			list.add(turm22);
			list.add(pferd1);
			list.add(pferd2);
			list.add(pferd11);
			list.add(pferd22);
			list.add(laeufer1);
			list.add(laeufer2);
			list.add(laeufer11);
			list.add(laeufer22);
			list.add(koenig);
			list.add(koenigg);
			list.add(koenigin);
			list.add(koeniginn);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methode gui() Verwaltet die grafische Darstellung des Spiels
	 * 
	 * @throws IOException
	 */
	public static void gui() throws IOException {

		final JFrame frame = new JFrame();

		frame.setBounds(10, 10, 512, 512);
		frame.setUndecorated(true);
		pn = new JPanel() {
			public void paint(Graphics g) {
				boolean white = true;
				for (int i = 0; i < 8; i++) {
					for (int ii = 0; ii < 8; ii++) {
						if (white) {
							g.setColor(Color.white);
						} else {
							g.setColor(Color.black);
						}
						g.fillRect(ii * 64, i * 64, 64, 64);
						white = !white;
					}
					white = !white;

					// weiße & schwarze Schachfiguren werden auf dem Brett angezeigt

					if (count == 0) {

						g.drawImage(turm1.setImg(imgTurm), sc[0][0].getY() * 64, sc[0][0].getX() * 64, this);// Turm
						g.drawImage(turm2.setImg(imgTurm), sc[0][7].getY() * 64, sc[0][7].getX() * 64, this);// Turm
						g.drawImage(laeufer1.setImg(imgLaeufer), sc[0][5].getY() * 64, sc[0][5].getX() * 64, this);
						g.drawImage(laeufer2.setImg(imgLaeufer), sc[0][2].getY() * 64, sc[0][2].getX() * 64, this);
						g.drawImage(pferd1.setImg(imgPferd), sc[0][1].getY() * 64, sc[0][1].getX() * 64, this);
						g.drawImage(pferd2.setImg(imgPferd), sc[0][6].getY() * 64, sc[0][6].getX() * 64, this);
						g.drawImage(koenig.setImg(imgKoenig), sc[0][4].getY() * 64, sc[0][4].getX() * 64, this);
						g.drawImage(koenigin.setImg(imgKoenigin), sc[0][3].getY() * 64, sc[0][3].getX() * 64, this);
						g.drawImage(turm11.setImg(imgTurmS), sc[7][7].getY() * 64, sc[7][7].getX() * 64, this);// Turm
						g.drawImage(turm22.setImg(imgTurmS), sc[7][0].getY() * 64, sc[7][0].getX() * 64, this);// Turm
						g.drawImage(laeufer11.setImg(imgLaeuferS), sc[7][2].getY() * 64, sc[7][2].getX() * 64, this);
						g.drawImage(laeufer22.setImg(imgLaeuferS), sc[7][5].getY() * 64, sc[7][5].getX() * 64, this);
						g.drawImage(pferd11.setImg(imgPferdS), sc[7][1].getY() * 64, sc[7][1].getX() * 64, this);
						g.drawImage(pferd22.setImg(imgPferdS), sc[7][6].getY() * 64, sc[7][6].getX() * 64, this);
						g.drawImage(koenigg.setImg(imgKoenigS), sc[7][4].getY() * 64, sc[7][4].getX() * 64, this);
						g.drawImage(koeniginn.setImg(imgKoeniginS), sc[7][3].getY() * 64, sc[7][3].getX() * 64, this);
						for (int y = 0; y < sc[1].length; y++) {
							g.drawImage(imgBauer, sc[1][y].getY() * 64, sc[1][y].getX() * 64, this);
							sc[1][y].setImg(imgBauer);
							g.drawImage(imgBauerS, sc[6][y].getY() * 64, sc[6][y].getX() * 64, this);
							sc[6][y].setImg(imgBauerS);
						}
					} else if (count > 0) {
						System.out.println("else if wird versucht");

						for (Schachfigur a : list)
							g.drawImage(a.getImg(), a.getY() * 64, a.getX() * 64, this);// Turm

//						
					}
				}
			}
		};
		frame.add(pn);
		frame.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {

			}

			/**
			 * Methode: mousePressed() wird eine Schachfigur angeklickt, so wird die
			 * Possition des Objekts in einer statischen Schachfigur zwischengespeichert.
			 */
			public void mousePressed(MouseEvent e) {
				try {

					int altX, altY;
					altX = e.getX() / 64;
					altY = e.getY() / 64;

//					aktuell ausgewählte Figur
					figur = sc[altY][altX];

					System.out.println(figur.getClass() + " Farbe:" + figur.isBlack() + " HashCode" + figur.hashCode());

				} catch (NullPointerException e1) {
					System.out.println("Du hast keine gültige Figur ausgewählt! Wähle erneut");
				}
			}

			/**
			 * Methode:mouseReleased() lässt man die Maus los, so wird zuerst geprüft ob
			 * schwarte oder weiße figuren dran sind die Ziel-Koordinaten der Schachfigur
			 * werden in die Methode moveFigur uebergeben übergeben um zu ueberpruefen, ob
			 * der Schachzug erlaubt ist.
			 */
			public void mouseReleased(MouseEvent e) {
//				
				try {
//					wohin soll die Figur bewegt werden
					if (figur.isBlack() == farbe) {
						moveFigur(e.getY() / 64, e.getX() / 64);
						frame.repaint();
						pn.repaint();
						count++;
//					wird überprüft welche Farbe dran ist
						farbe = farbe == false ? true : false;
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered");

			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});
		frame.addMouseMotionListener(new MouseMotionListener() {

			public void mouseDragged(MouseEvent e) {

			}

			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * Methode: kill() Die Methode wird beim schlagen der gegnerischen Figur
	 * aufgerufen Die Referenzen auf die geschlagene Figur werden sowohl aus der
	 * ArrayList als auch aus dem Array entfernt
	 * 
	 * @param tX
	 * @param tY tX- Zielkoordinaten horizontale Ebene tY- Zielkoordinaten vertikale
	 *           Ebene
	 */
	public static void kill(int tX, int tY) {

		list.remove(sc[tX][tY]);
		sc[tX][tY] = null;

	}

	/**
	 * Methode: moveFigur() die Methode feldFrei prueft ob der Schachzug erlaubt
	 * durch den Aufruf der move() Methode geprueft ob die Zielkoordinaten dem
	 * Bewegungsmuster der jeweiligen Schachfigur entsprechen. Bei einem gueltigen
	 * Schachzug wird die neue Position durch einem neuem Objekt ueberschrieben
	 * 
	 * @param x  - Zielkoordinaten horizontale Ebene
	 * @param y- Zielkoordinaten vertikale Ebene
	 * @throws Exception
	 */
	public static void moveFigur(int x, int y) throws Exception {
		int altX = figur.getX();
		int altY = figur.getY();

		if (figur != null) {

			int tX, tY;
			/*
			 * neue Koordinaten werden festgelegt x und y werden vorübergehend auf die neuen
			 * Positionen geändert wird außerdem geprueft ob der Bewegungsmuster der
			 * jeweiligen Schachfigur eingehalten wird
			 */
			tX = figur.move(x, y);
			tY = figur.getY();
			figur.setX(altX);
			figur.setY(altY);
//			soll geprüft werden ob der Schachzug möglich ist
			if (!feldFrei(tX, tY, altX, altY)) {
				System.out.println("schachzug ist nicht erlaubt(moveFigur())");
				return;
			}

//			die Figur wird auf eine andere Position bewegt
			figur.move(tX, tY); // x und y werden gesetzt
			figur.getY();
			sc[tX][tY] = figur;

//			alte Position wird erneut auf null gesetzt
			sc[altX][altY] = null;
		}
	}

	/**
	 * Methode: feldFrei()
	 * Die Methode prueft ob beim Schachzug 
	 * - eine gegnerische Schachfigur -->kill() methode wird aufgerufen, Schachzug gestattet
	 * - eine nicht gegnerische Schachfigur --> der Schachzug wird verweigert
	 * - leeres Feld steht --> Der Schachzug wird gestattet
	 * @param x    Zielkoordinaten horizontale Ebene
	 * @param y    Zielkoordinaten vertikale Ebene
	 * @param altX alte Koordinaten der Schachfigur horizontale Ebene
	 * @param altY alte Koordinaten der Schachfigur vertikale Ebene
	 * @return wird ein Boolean abhaengig davon zurueckgegeben oder oder Schachzug
	 *         erlaubt ist oder nicht
	 */

	static boolean feldFrei(int x, int y, int altX, int altY) {
		
		Schachfigur test = sc[altX][altY];
		boolean status = false;
		/**
		 * falls Turm
		 */
		if (test instanceof Turm) {

			/**
			 * soll geprüft werden ob sich die Koordinaten im X geändert hat, soll geprüft
			 * werden ob figuren im wege stehen
			 */

			if (x != altX && x > altX) {
				/**
				 * soll geprüft werden ob der Turm sich nach süden bewegen will
				 */

				
				for (int i = altX; i < x;) {

					if (sc[++i][y] != null && sc[i][y].isBlack() == test.isBlack()) {
						return false;

					} else if (sc[i][y] != null && sc[i][y].isBlack() != test.isBlack()) {

						kill(i, y);
						return true;

					} else if (sc[i][y] == null) {

						status = true;

					}

				}
				return status;

			} else if (x != altX && x < altX) {
				/**
				 * soll geprüft werden ob der Turm sich nach norden bewegen will
				 */

				
				for (int i = altX; i > x;) {
					if (sc[--i][y] != null && sc[i][y].isBlack() == test.isBlack()) {
					
						return false;

					} else if (sc[i][y] != null && sc[i][y].isBlack() != test.isBlack()) {
						
						kill(i, y);
						return true;
					} else if (sc[i][y] == null) {
						
						status = true;

					}

				}
				return status;

			}
			/**
			 * soll geprüft werden ob sich die Koordinaten von Y nach Osten geändert haben
			 */
			else if (y != altY && y > altY) {
				
				for (int i = altY; i < y;) {

					if (sc[x][++i] != null && sc[x][i].isBlack() == test.isBlack()) {
					
						return false;

					} else if (sc[x][i] != null && sc[x][i].isBlack() != test.isBlack()) {
						
						kill(x, i);
						return true;
					} else if (sc[x][i] == null) {
						
						status = true;

					}

				}
				return status;

			}
			/**
			 * soll geprüft werden ob sich die Koordinaten von Y nach Westen geändert haben
			 */
			else if (y != altY && y < altY) {
				
				for (int i = altY; i > y;) {

					if (sc[x][--i] != null && sc[x][i].isBlack() == test.isBlack()) {
						
						return false;

					} else if (sc[x][i] != null && sc[x][i].isBlack() != test.isBlack()) {
						
						kill(x, i);
						return true;
					} else if (sc[x][i] == null) {
						
						status = true;

					}

				}
				return status;

			}
		}

		/**
		 * Falls Koenigin oder König
		 */

		if (test instanceof Koenigin || test instanceof Koenig) {

			/**
			 * --------diagonale Bewegung
			 * 
			 */

			if (x != altX && y != altY && x < altX && y < altY) {
			
				int ii, i;
				for (i = altX, ii = altY; i > x && ii > y;) {
					if (sc[--i][--ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
						
						kill(i, ii);
						return true;
						
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[i][ii] == null) {
					
						status = true;
					}
				}
				return status;
			} else if (x != altX && y != altY && x < altX && y > altY) {
			
				int ii, i;
				for (i = altX, ii = altY; i > x && ii < y;) {
					if (sc[--i][++ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
					
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
					
						return false;
					} else if (sc[i][ii] == null) {
					
						status = true;
					}
				}
				return status;
			} else if (x != altX && y != altY && x > altX && y < altY) {
			
				int ii, i;
				for (i = altX, ii = altY; i < x && ii > y;) {
					if (sc[++i][--ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
						
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
					
						return false;
					} else if (sc[i][ii] == null) {
					
						status = true;
					}
				}
				return status;
			} else if (x != altX && y != altY && x > altX && y > altY) {
				
				int ii, i;
				for (i = altX, ii = altY; i < x && ii < y;) {
					if (sc[++i][++ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
					
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[i][ii] == null) {
						
						status = true;
					}
				}
				return status;
			}

			/**
			 * ----Horizontale und Vertikale Bewegung soll geprüft werden ob sich die
			 * Koordinaten im X geändert hat, soll geprüft werden ob figuren im wege stehen
			 */
			else if (x != altX && x > altX && altY == y) {
				/**
				 * soll geprüft werden ob der Turm sich nach süden bewegen will
				 */

				
				for (int i = altX; i < x;) {
					if (sc[++i][y] != null && sc[i][y].isBlack() != test.isBlack()) {
						
						kill(i, y);
						return true;
					} else if (sc[i][y] != null && sc[i][y].isBlack() == test.isBlack()) {
					
						return false;

					} else if (sc[i][y] == null) {
						
						status = true;
					}
				}
				return status;

			} else if (x != altX && x < altX && altY == y) {
				/**
				 * soll geprüft werden ob der Turm sich nach norden bewegen will
				 */

				System.out.println("x hat sich geändert");
				for (int i = altX; i > x;) {
					if (sc[--i][y] != null && sc[i][y].isBlack() != test.isBlack()) {
						
						kill(i, y);
						return true;
					} else if (sc[i][y] != null && sc[i][y].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[i][y] == null) {
						
						status = true;
					}
				}
				return status;
			}
			/**
			 * soll geprüft werden ob sich die Koordinaten von Y nach Osten geändert haben
			 */
			else if (y != altY && y > altY && altX == x) {
				
				for (int i = altY; i < y;) {
					if (sc[x][++i] != null && sc[x][i].isBlack() != test.isBlack()) {
						
						kill(x, i);
						return true;
					} else if (sc[x][i] != null && sc[x][i].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[x][i] == null) {
						
						status = true;
					}
				}
				return status;
			}
			/**
			 * soll geprüft werden ob sich die Koordinaten von Y nach Westen geändert haben
			 */
			else if (y != altY && y < altY && altX == x) {
			
				for (int i = altY; i > y;) {
					if (sc[x][--i] != null && sc[x][i].isBlack() != test.isBlack()) {
						
						kill(x, i);
						return true;
					} else if (sc[x][i] != null && sc[x][i].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[x][i] == null) {
					
						status = true;
					}
				}
				return status;
			}
		}

		/**
		 * Falls Läufer
		 */

		if (test instanceof Laeufer) {

			/**
			 * --------diagonale Bewegung
			 * 
			 */

			if (x != altX && y != altY && x < altX && y < altY) {
				
				int ii, i;
				for (i = altX, ii = altY; i > x && ii > y;) {
					if (sc[--i][--ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
					
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
					
						return false;
					} else if (sc[i][ii] == null) {
						
						status = true;
					}
				}
				return status;
			} else if (x != altX && y != altY && x < altX && y > altY) {
			
				int ii, i;
				for (i = altX, ii = altY; i > x && ii < y;) {
					if (sc[--i][++ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
						
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[i][ii] == null) {
						
						status = true;
					}
				}
				return status;
			} else if (x != altX && y != altY && x > altX && y < altY) {
				
				int ii, i;
				for (i = altX, ii = altY; i < x && ii > y;) {
					if (sc[++i][--ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
						
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
					
						return false;
					} else if (sc[i][ii] == null) {
						
						status = true;
					}
				}
				return status;

			} else if (x != altX && y != altY && x > altX && y > altY) {
				
				int ii, i;
				for (i = altX, ii = altY; i < x && ii < y;) {
					if (sc[++i][++ii] != null && sc[i][ii].isBlack() != test.isBlack()) {
						
						kill(i, ii);
						return true;
					} else if (sc[i][ii] != null && sc[i][ii].isBlack() == test.isBlack()) {
						
						return false;
					} else if (sc[i][ii] == null) {
						
						status = true;
					}
				}
				return status;

			}
		}

		if (test instanceof Bauer) {
//			für weiße figuren
			if (x == altX + 1 && y == altY - 1 && sc[x][y] != null && test.isBlack() != sc[x][y].isBlack()) {
			
				kill(x, y);
				return true;
			} else if (x == altX + 1 && y == altY - 1 && sc[x][y] == null) {
				
				return false;

			} else if (x == altX + 1 && y == altY + 1 && sc[x][y] != null && test.isBlack() != sc[x][y].isBlack()) {
				
				kill(x, y);
				return true;
			} else if (x == altX + 1 && y == altY + 1 && sc[x][y] == null) {
				
				return false;

//				für schwarze figuren
			} else if (x == altX - 1 && y == altY - 1 && sc[x][y] != null && test.isBlack() != sc[x][y].isBlack()) {
				
				kill(x, y);
				return true;
			} else if (x == altX - 1 && y == altY - 1 && sc[x][y] == null) {
				
				return false;

			} else if (x == altX - 1 && y == altY + 1 && sc[x][y] != null && test.isBlack() != sc[x][y].isBlack()) {
				
				kill(x, y);
				return true;
			} else if (x == altX - 1 && y == altY + 1 && sc[x][y] == null) {
				

				return false;

			} else if (sc[x][y] != null) {
				
				return false;
			}
		}

		if (test instanceof Pferd) {
			if (sc[x][y] != null && test.isBlack() != sc[x][y].isBlack()) {
				
				kill(x, y);
				return true;
			} else if (sc[x][y] != null && sc[x][y].isBlack() == test.isBlack()) {
			
				return false;
			} else if (sc[x][y] == null) {
			
				return true;
			}

		}

		if (sc[x][y] != null) {
			
			return false;

		} else {
			
			return true;

		}

	}

	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}

}
