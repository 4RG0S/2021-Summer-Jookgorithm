import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] dist;
	static final int INF = 100001;
	
	static void floyd() {
		for (int k = 1; k <= N; k++)
			for (int i = 1; i <= N; i++)
				for (int j = 1; j <= N; j++)
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		dist = new int[N + 1][N + 1];
		for (int i = 0; i <= N; i++) Arrays.fill(dist[i], INF);
		int M = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			dist[u][v] = w;
		}
		int maxDist = 0;
		for (int i = 1; i <= N; i++) {
			int cand = dist[i][X] + dist[X][i];
			if (cand < INF) maxDist = Math.max(maxDist, cand);
		}
		System.out.println(maxDist);
	}

}

class Pair implements Comparable<Pair> {
	int num; int cost;
	
	public Pair(int n, int c) { num = n; cost = c; }
	
	@Override
	public int compareTo(Pair o) { return cost - o.cost; }
	
}
