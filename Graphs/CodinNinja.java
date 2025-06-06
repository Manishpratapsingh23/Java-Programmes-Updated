import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Problem statement
Given a NxM matrix containing Uppercase English Alphabets only. Your task is to tell if there is a path in the given matrix which makes the sentence “CODINGNINJA” .

There is a path from any cell to all its neighbouring cells. For a particular cell, neighbouring cells are those cells that share an edge or a corner with the cell.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
The first line of input contains two space separated integers N and M, where N is number of rows and M is the number of columns in the matrix. 
Each of the following N lines contain M characters. Please note that characters are not space separated.
Output Format :
Print 1 if there is a path which makes the sentence “CODINGNINJA” else print 0.
Constraints :
1 <= N <= 1000
1 <= M <= 1000
Time Limit: 1 second
Sample Input 1:
2 11
CXDXNXNXNXA
XOXIXGXIXJX
Sample Output 1:
1
Sample Input 2:
5 5
DANDO
NNINJ
AXGJC
INJAA
CODDI
Sample Output 2:
0
 */

public class CodinNinja {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final String target = "CODINGNINJA";

    public static char[][] takeInput() throws IOException {
        String[] dims = br.readLine().trim().split(" ");
        int m = Integer.parseInt(dims[0]);
        int n = Integer.parseInt(dims[1]);

        char[ ][] Graph = new char[m][n];
        for (int i = 0; i < m; i++) {
            String st = br.readLine();
            Graph[i] = st.toCharArray();
        }

        return Graph;
    }

    public static void main(String[] args) throws IOException {
        char[][] Graph = takeInput();
        System.out.println(isPath(Graph, Graph.length, Graph[0].length));
    }

    private static int isPath(char[][] graph, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 'C') {
                    boolean[][] visited = new boolean[m][n];  // fresh for each DFS
                    if (dfs(graph, i, j, visited, 0)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    private static boolean dfs(char[][] graph, int i, int j, boolean[][] visited, int idx) {
        if (idx == target.length()) return true;

        if (i < 0 || j < 0 || i >= graph.length || j >= graph[0].length ||
            visited[i][j] || graph[i][j] != target.charAt(idx)) {
            return false;
        }

        visited[i][j] = true;

        int[] dx = {-1, 1, 0, 0, -1, 1, 1, -1};
        int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};

        for (int k = 0; k < 8; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (dfs(graph, x, y, visited, idx + 1)) {
                return true;
            }
        }

        visited[i][j] = false; // backtrack
        return false;
    }
}
