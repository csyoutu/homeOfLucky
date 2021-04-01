package algorithm.test;

import java.util.Arrays;

/**
 * Created on 2021/3/26.11:54 上午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
public class tu {
    private static boolean result = false;
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0,1,0,1,1},
                {0,0,1,0,0},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        boolean[] visited = new boolean[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //节点i到j可达则进行深度优先搜索
                if (matrix[i][j] != 0) {
                    Arrays.fill(visited, false);
                    visited[j] = true;
                    dfs(matrix, i, j, visited);
                }
                if (result) {
                    System.out.println("存在环路");
                    return;
                }
            }
        }
        System.out.println("不存在环路");
    }
    private static void dfs(int[][] matrix, int start, int cur_node, boolean[] visited){
        for(int col = 0; col < matrix.length; col++){
            //当前节点可达且未访问过
            if(matrix[cur_node][col] != 0 && !visited[col]){
                if(col == start){
                    result = true;
                    return;
                }
                //记录访问过的节点
                visited[col] = true;
                dfs(matrix, start, col, visited);
                visited[col] = false;
            }
        }
    }

}
