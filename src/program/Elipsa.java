package program;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class Elipsa extends Figura {
    public Elipsa(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        aft = new AffineTransform();
        setShape(new Ellipse2D.Double(10, 10, 20, 30));
        setArea(new Area(getShape()));
    }
}
