package JOTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 时间复杂度 O(n^2)
 * 
 * @author 网友
 *
 */
public class MaxPoint1 {
	public static int maxPoints(Point[] points) {
		//记录最大长度
		int maxLine = 0;
		//两点确定一条直线，一个点points[i],与其余点，如果分别有相同的斜率则他们都在一天直线上，
		//即之用确定斜率，不用判断直线方程的常数
		//例如：三个不同的点A，B，C，如果A，B的斜率与A，C斜率相同，则A,B,C在同一直线上。
		//当剩余的Point数目不足时，则不必再进行判断
		for (int i = 0; i < (points.length - maxLine); i++) {
			//记录相同点的数目
			int coincident = 0;
			Map<Float, Integer> pointCounts = new HashMap<Float, Integer>();
			for (int j = i + 1; j < points.length; j++) {
				float slope;
				if (points[i].x == points[j].x && points[i].y == points[j].y) {
					coincident++;
					continue;
				} else if (points[i].x == points[j].x) {
					slope = Float.NEGATIVE_INFINITY;
				} else if (points[i].y == points[j].y) {
					slope = (float) 0.0; // logically we don't need this, but in
									// practice i find that we do
				} else {
					slope = new Float((float) (points[i].y - points[j].y)
							/ (float) (points[i].x - points[j].x));
				}
				//如果已经有该斜率存在，记录数+1，不存在则添加
				if (pointCounts.containsKey(slope))
					pointCounts.put(slope, pointCounts.get(slope) + 1);
				else
					pointCounts.put(slope, new Integer(1));
			}
			maxLine = Math.max(maxLine, 1 + coincident + maxValue(pointCounts));
		}

		return maxLine;
	}

	private static int maxValue(Map<Float, Integer> doubleIntMap) {
		int max = 0;
		Set<Float> keys = doubleIntMap.keySet();
		Iterator iter = keys.iterator();
		while (iter.hasNext())
			max = Math.max(max, doubleIntMap.get(iter.next()));
		return max;
	}

	public static void main(String[] args) {
		Point[] points = { new Point(1, 1), new Point(1, 1), new Point(2, 3) };
		long st = System.nanoTime();
		System.out.println(maxPoints(points));
		long et = System.nanoTime();
		System.out.println(et-st);
	}
}
