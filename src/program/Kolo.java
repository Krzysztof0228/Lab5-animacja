package program;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class Kolo extends Figura{
    public Kolo(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        aft = new AffineTransform();
        setShape(new Ellipse2D.Double(10, 10, 30, 30));
        setArea(new Area(getShape()));
    }
}
