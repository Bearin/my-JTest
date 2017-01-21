package JOTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * 求出在同一直线上点数最大的数目，仅限于横竖直线
 * 
 * @author XB
 *
 */
public class MaxPoints {

	public static int maxPoint(Point[] points) {
		Map<Integer, Integer> mapX = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapY = new HashMap<Integer, Integer>();
		int result = 1;
		for (Point p : points) {
			if (!mapX.containsKey(p.x)) {
				mapX.put(p.x, result);
			}else if (mapX.containsKey(p.x)) {
				mapX.put(p.x, mapX.get(p.x) + 1);
			}
			if (!mapY.containsKey(p.y)) {
				mapY.put(p.y, result);
			}else if (mapY.containsKey(p.y)) {
				mapY.put(p.y, mapY.get(p.y) + 1);
			}
		}
		int x = getMax(mapX);
		int y = getMax(mapY);
		return result = (x > y ? x : y);
	}

	static int getMax(Map<Integer, Integer> map) {
		int result = 0;
		Iterator<Integer> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			if (map.get(key) > result) {
				result = map.get(key);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Point[] points = { new Point(0, 0), new Point(1, 0) };
		System.out.println(maxPoint(points));
	}
}
