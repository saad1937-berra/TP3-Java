public class Segment {
    private Point a;
    private Point b;

    public Segment() {
        a = new Point(0, 0);
        b = new Point(1, 0);
    }

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Segment(int x1, int y1, int x2, int y2) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
    }

    public double longueur() {
        int dx = a.getX() - b.getX();
        int dy = a.getY() - b.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return a + " - " + b;
    }
}