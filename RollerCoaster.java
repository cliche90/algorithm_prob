import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * Created by LICHE on 2017-05-30.
 */
public class RollerCoaster {

    public static int L = 0;
    public static int N = 0;
    public static int B = 0;

    public static int X[] = null;
    public static int W[] = null;
    public static int F[] = null;
    public static int C[] = null;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        X = new int[N + 1];     // length
        W = new int[N + 1];     // start point
        F = new int[N + 1];     // fun point
        C = new int[N + 1];     // coast

        for (int i = 1; i <= N; i++) {

            st = new StringTokenizer(br.readLine());

            X[i] = Integer.parseInt(st.nextToken());
            W[i] = Integer.parseInt(st.nextToken());
            F[i] = Integer.parseInt(st.nextToken());
            C[i] = Integer.parseInt(st.nextToken());

            
        }





    }
}
