// Last updated: 04/10/2025, 20:53:13
import java.util.*;

class Solution {
    int directions[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int trapRainWater(int[][] heightMap) {
        int a[][] = heightMap;
        int n = a.length;
        int m = a[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(b -> b[0]));
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            pq.offer(new int[] { a[i][0], i, 0 });
            pq.offer(new int[] { a[i][m - 1], i, m - 1 });
            vis[i][0] = true;
            vis[i][m - 1] = true;
        }

        for (int j = 0; j < m; j++) {
            pq.offer(new int[] { a[0][j], 0, j });
            pq.offer(new int[] { a[n - 1][j], n - 1, j });
            vis[0][j] = true;
            vis[n - 1][j] = true;
        }

        int res = 0;
        int maxH = 0;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int h = cur[0];
            int x = cur[1];
            int y = cur[2];

            maxH = Math.max(maxH, h);

            for (int[] d : directions) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m || vis[nx][ny])
                    continue;

                vis[nx][ny] = true;

                // if the neighbour is lower, it can trap water
                if (a[nx][ny] < maxH) {
                    res += maxH - a[nx][ny];
                }

                pq.offer(new int[] { a[nx][ny], nx, ny });
            }
        }

        return res;
    }
}
