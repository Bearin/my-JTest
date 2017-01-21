package JOTest;

import java.util.ArrayList;
import java.util.List;


/**
 * 未完成
 * @author XB
 *
 */
public class MaxPoint3 {
	
	static float getSlop(Point p1, Point p2){
		int x = p2.x-p1.x;
		int y = p2.y-p1.y;
		if(x==0)
			return Float.NEGATIVE_INFINITY;
		else
			return y/x;
	}
	
	static float getC(float slop, Point p){
		if(slop==Float.NEGATIVE_INFINITY){
			return p.x;
		}
		return p.y-p.x*slop;
	}
	
	static boolean isInALine(Line line, Point p){
		for(Point point:line.points){
			if(point.x==p.x&&point.y==p.y){
				line.addPoint(p);
				return true;
			}
		}
		if(line.points.size()>=2)
			if(p.y==(line.slop*p.x+line.c))
				return true;
		if(line.points.size()==1){
			line.addPoint(p);
			line.slop = getSlop(p, line.points.get(0));
			line.c = getC(line.slop, p);
			return true;
		}
		return false;
	}
	
	static int getMax(ArrayList<Line> lines){
		int result = 0;
		for(Line line: lines){
			if(line.points.size()>result)
				result = line.points.size();
		}
		return result;
	}
	static int maxPoint(Point[] points) {
		ArrayList<Line> lines = new ArrayList<Line>();
		boolean hasAdd = false;
		for(Point point: points){
			if(lines.isEmpty()){
				lines.add(new Line(point));
			}
			int n = lines.size();
			for(int i = 0; i<n; i++){
				if(isInALine(lines.get(i), point)){
					lines.get(i).addPoint(point);
					hasAdd = true;
				}
			}
			if(!hasAdd)
				lines.add(new Line(point));
		}
		
		return getMax(lines);
	}
	
	public static void main(String[] args){
		Point[] points = { new Point(1, 1), new Point(1, 1), new Point(4, 3) };
		System.out.println(maxPoint(points));
	}
}


class Line{
	float slop;
	float c;
	ArrayList<Point> points = new ArrayList<Point>();
	
	public Line(Point p){
		points.add(p);
	}
	
	public void addPoint(Point p){
		points.add(p);
	}
}

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}

