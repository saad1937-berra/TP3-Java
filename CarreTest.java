class CarreTest {
    public static void main(String args[]) {
	// test du constructeur par defaut
	Carre c = new Carre() ;
	System.out.println("Carre \n"+c) ;
	System.out.println("De perimetre "+c.perimetre()) ;
	// test du constructeur avec valeurs d'initialisation
	Point p = new Point(0,2) ;
	c = new Carre(p, 2) ;
	System.out.println("Carre \n"+c) ;
	System.out.println("De perimetre "+c.perimetre()) ;
    }
}
