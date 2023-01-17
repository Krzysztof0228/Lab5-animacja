package program;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Kwadrat extends Figura{
    public Kwadrat(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        aft = new AffineTransform();
        setShape(new Rectangle2D.Double(10, 10, 30, 30));
        setArea(new Area(getShape()));
    }
}
