package week08;

import java.awt.geom.*;

import week03.ArrayList;

public class QuickConvexHull {
  public static void main(String[] args) {
    ArrayList<Point2D> hull = quickConvexHull();
    while (hull.hasNext()) {
      Point2D p = hull.next();
      System.out.printf("Point: (%.2f, %.2f) \n", p.getX(), p.getY());
    }
  }

  public static ArrayList<Point2D> quickConvexHull() {
    // The first 4 points are the boundary
    double[] px = {0.0, 0.5, 12.0, 13.0, 3.3, 5.4, 6.8, 9.5};
    double[] py = {0.0, 11.0, 11.5, 0.1, 9.1, 2.7, 9.1, 3.7};

    ArrayList<Point2D> points = new ArrayList<Point2D>();

    for (int i = 0; i < px.length; i++) {
      points.insertAt(points.size(), new Point2D.Double(px[i], py[i]));
    }

    ArrayList<Point2D> hull = new ArrayList<Point2D>();

    // Find left-most and right-most points
    Point2D leftMost = points.get(0);
    Point2D rightMost = points.get(0);

    for (int i = 0; i < px.length; i++) {
      if (points.get(i).getX() < leftMost.getX()) {
        leftMost = points.get(i);
      }
      if (points.get(i).getX() > rightMost.getX()) {
        rightMost = points.get(i);
      }
    }

    hull.insertAt(hull.size(), leftMost);
    addPointAbove(hull, leftMost, rightMost, points);
    hull.insertAt(hull.size(), rightMost);
    addPointAbove(hull, rightMost, leftMost, points);

    return hull;
  }

  static void addPointAbove(ArrayList<Point2D> hull, Point2D leftMost, Point2D rightMost, ArrayList<Point2D> points) {
    ArrayList<Point2D> above = new ArrayList<Point2D>();
    Line2D line = new Line2D.Double(leftMost, rightMost);
    double maxDistance = 0;
    Point2D maxPoint = null;
    points.reset();
    while (points.hasNext()) {
      Point2D p = points.next();
      if (line.relativeCCW(p) > 0) {
        above.insertAt(above.size(), p);
        // maximum distance?
        double distance = line.ptSegDistSq(p);
        if (line.ptSegDistSq(p) > maxDistance) {
          maxPoint = p;
          maxDistance = distance;
        }
      }
    }
    if (above.size() == 0) {
      return;
    }
    addPointAbove(hull, leftMost, maxPoint, above);
    hull.insertAt(hull.size(), maxPoint);
    addPointAbove(hull, maxPoint, rightMost, above);
  }
}
