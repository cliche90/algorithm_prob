import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Created by LICHE on 2017-05-30.
 */
public class AssemblyLineScheduling {

    public static int n = 0;
    public static int e1 = 0;
    public static int e2 = 0;
    public static int x1 = 0;
    public static int x2 = 0;

    public static int S[][] = null;
    public static int t[][] = null;

    public static int dp[][] = null;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e1 = Integer.parseInt(st.nextToken());
        e2 = Integer.parseInt(st.nextToken());
        x1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());

        S = new int[2][n + 1];
        t = new int[2][n];
        dp = new int[2][n + 1];     // minimum cost to reach S[a][n + 1] status

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)    S[0][i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)    S[1][i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++)     t[0][i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++)     t[1][i] = Integer.parseInt(st.nextToken());

        dp[0][1] = S[0][1] + e1;
        dp[1][1] = S[1][1] + e2;

        for (int i = 2; i <= n; i++) {
            dp[0][i] = Math.min(dp[0][i-1], dp[1][i-1] + t[1][i-1]) + S[0][i];
            dp[1][i] = Math.min(dp[1][i-1], dp[0][i-1] + t[0][i-1]) + S[1][i];
        }

        int result = Math.min(dp[0][n] + x1, dp[1][n] + x2);

        bw.write("" + result);
        bw.flush();
        bw.close();
    }
}
