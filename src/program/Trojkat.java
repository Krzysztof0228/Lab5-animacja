package program;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Path2D;

public class Trojkat extends Figura{
    public Trojkat(Graphics2D buf, int del, int w, int h, Color color) {
        super(buf, del, w, h, color);
        aft = new AffineTransform();
        Path2D trojkat = new Path2D.Double();
        trojkat.moveTo(0,0);
        trojkat.lineTo(15,30);
        trojkat.lineTo(30,0);
        trojkat.lineTo(0,0);
        trojkat.closePath();
        this.setShape(trojkat);
        setArea(new Area(getShape()));
    }

    public Trojkat(Graphics2D buffer, int del, int w, int h) {
        super(buffer, del, w, h);
        aft = new AffineTransform();
        Path2D trojkat = new Path2D.Double();
        trojkat.moveTo(0,0);
        trojkat.lineTo(15,30);
        trojkat.lineTo(30,0);
        trojkat.lineTo(0,0);
        trojkat.closePath();
        this.setShape(trojkat);
        setArea(new Area(getShape()));
    }
}
