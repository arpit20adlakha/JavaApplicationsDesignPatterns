package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOrangesMySolution {

    static class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static boolean outOfBound(int x, int y, int row, int column) {
        if (x < 0 || x > row -1 || y < 0 || y > column -1) {
            return true;
        } return false;
    }

    public static int orangesRotting(int[][] grid) {

        Queue<Pair> queue = new LinkedList<>();
        int row = grid.length;
        int column = grid[0].length;
        int minutes = 0;

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j));
                }
            }
        }
        Pair terminalPair = new Pair(-1, -1);
        queue.add(terminalPair);
        while(!queue.isEmpty()) {

           Pair pair = queue.poll();

           if (pair == terminalPair ) {
               minutes++;
               if (!queue.isEmpty())
                    queue.add(terminalPair);
           }
           int x = pair.x;
           int y = pair.y;
           rottenUtils(queue, grid, x-1, y, row, column);
           rottenUtils(queue, grid, x, y+1, row, column);
           rottenUtils(queue, grid, x+1, y, row, column);
           rottenUtils(queue, grid, x, y-1, row, column);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return minutes -1;
    }


    public static  void rottenUtils(Queue<Pair> queue, int [][] grid, int x, int y, int row, int column) {

        if (!outOfBound(x, y, row, column) && grid[x][y] == 1) {
            grid[x][y] = 2;
            queue.add(new Pair(x, y));
        }
    }

    public static void main(String[] args) {
        int [][] grid= {{2, 1, 1}, {1 ,1, 0}, {0, 1, 1}};
        int [] [] grid1 = {{1,2,1,1,2,1,1}};
        System.out.println((orangesRotting(grid1)));
    }

}
