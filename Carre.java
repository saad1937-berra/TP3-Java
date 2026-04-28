public class Carre {
    private Segment s1, s2, s3, s4;


    public Carre() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(0, 1);
        s1 = new Segment(p1, p2);
        s2 = new Segment(p2, p3);
        s3 = new Segment(p3, p4);
        s4 = new Segment(p4, p1);
    }


    public Carre(Point basGauche, int cote) {
        int x = basGauche.getX();
        int y = basGauche.getY();
        Point p1 = basGauche;
        Point p2 = new Point(x + cote, y);
        Point p3 = new Point(x + cote, y + cote);
        Point p4 = new Point(x, y + cote);
        s1 = new Segment(p1, p2);
        s2 = new Segment(p2, p3);
        s3 = new Segment(p3, p4);
        s4 = new Segment(p4, p1);
    }

    public int perimetre() {

        return (int)(s1.longueur() * 4);
    }

    public String toString() {
        return s1 + " " + s2 + " " + s3 + " " + s4;
    }
}