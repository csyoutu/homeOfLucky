package algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2021/4/12.5:53 下午
 *
 * @author 刘会贤
 * @Description 类文件说明
 * @Version 1.0
 */
public class NumLCP37 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                new int[]{5, 2},
                new int[]{5, -4},
                new int[]{2, -5},
                new int[]{4, -1},
                new int[]{2, 0}
        };
        double v = minRecSize2(arr);
        System.err.println(v);
    }

    //此处会超时，不是最优解
    public static double minRecSize2(int[][] lines) {
        Double maxX = null;
        Double maxY = null;
        Double minX = null;
        Double minY = null;
        int pointCount = 0;
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {

                //不平行
                if (lines[i][0] != lines[j][0]) {
                    double x = ((double) (lines[j][1] - lines[i][1])) / (lines[i][0] - lines[j][0]);
                    double y = lines[j][0] * x + lines[j][1];
                    pointCount++;
                    if (minX == null) {
                        minX = x;
                        maxX = x;
                        minY = y;
                        maxY = y;
                    }

                    if (x > maxX) {
                        maxX = x;
                    } else if (x < minX) {
                        minX = x;
                    }

                    if (y > maxY) {
                        maxY = y;
                    } else if (y < minY) {
                        minY = y;
                    }
                }

            }
        }

        //交点数量大于1 且交点不在与X轴或者Y轴平行的线上
        if (pointCount > 1 && minX != maxX && minY != maxY) {
            return (maxY - minY) * (maxX - minX);
        }

        return 0d;
    }

    public static double minRecSize(int[][] lines) {
        List<int[]> collect = Arrays.stream(lines).sorted((a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        }).collect(Collectors.toList());




        return 0d;
    }
}
