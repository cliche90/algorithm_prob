import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Created by LICHE on 2017-05-31.
 */
public class RodCutting {

    public static int N = 0;
    public static int cost[] = null;
    public static int dp[] = null;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        cost = new int[N + 1];
        dp = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++)    cost[i] = Integer.parseInt(st.nextToken());
        dp[1] = cost[1];

        // dp(i) : maximum cost of "rod of length i"
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], cost[j] + dp[i - j]);
            }
        }

        bw.write("" + dp[N]);
        bw.flush();
        bw.close();
    }
}
