package JOTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 求二维方格上，给出点能构成直线的最大点数
 * 
 * @author XB
 *
 */
public class MaxPoints2 {

	static boolean isInALine(Point p1, Point p2) {
		if (p1.x == p2.x || p1.y == p2.y)
			return true;
		if(Math.abs(p2.x-p1.x)==Math.abs(p2.y-p1.y))
			return true;
		return false;
	}
	
	static boolean isInXY(Point p1, Point p2){
		if (p1.x == p2.x || p1.y == p2.y)
			return true;
		return false;
	}

	static int getSlope(Point p1, Point p2) {
		int y = p2.y - p1.y;
		int x = p2.x - p1.x;
		if (x == 0 ) {
			if(y>0)
				return (int) Float.POSITIVE_INFINITY;
			if(y<0)
				return (int) Float.NEGATIVE_INFINITY;
			else
				return 0;
		} else
			return y / x;
	}

	static boolean isLine(List<Point> line, Point p) {
		for(Point pp:line){
			if(pp.x==p.x&&pp.y==p.y)
				return true;
		}
		if (line.size() >= 2) {
			if (getSlope(line.get(0),line.get(1))==getSlope(line.get(0),p))
				return true;
			if(isInXY(line.get(0),p)&&isInXY(line.get(1),p))
					return true;
		} else if (line.size() == 1) {
			if (isInALine(p, line.get(0)))
				return true;
		}
		return false;
	}

	static int getMax(ArrayList<List<Point>> lines) {
		int result = 0;
		for (List<Point> p : lines) {
			if (p.size() > result)
				result = p.size();
		}
		return result;
	}

	static int maxPoints(Point[] points) {
		ArrayList<List<Point>> lines = new ArrayList<List<Point>>();
		List<Point> line;
		for (Point p : points) {
			int n = lines.size();
			for (int i = 0; i < n; i++) {
				line = lines.get(i);
				if (isLine(line, p)) {
					line.add(p);
					lines.set(i, line);
				}
			}
			if (lines.isEmpty()) {
				List<Point> L = new ArrayList<Point>();
				L.add(p);
				lines.add(L);
			}
		}
		return getMax(lines);
	}

	public static void main(String[] args) {
		Point[] points = { new Point(1, 1), new Point(1, 1), new Point(2, 3) };
		System.out.println(maxPoints(points));
		// ArrayList<List<Point>> lines = new ArrayList<List<Point>>();
		// List<Point> line1 = new ArrayList<Point>();
		// List<Point> line2 = new ArrayList<Point>();
		// line1.add(new Point(0,0));
		// line1.add(new Point(0,1));
		// line2.add(new Point(1,1));
		// lines.add(line1);
		// //lines.add(0,line2);
		// lines.set(0, line2);
		// System.out.println(lines.size());
	}
}

