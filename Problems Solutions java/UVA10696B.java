import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class UVA10696B{
    public static void main(String[] args) throws IOException  {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        while (n != 0) {
            if (n > 100){
                sb.append(String.format("f91(%s) = %s\n", n, n - 10));
            }else {
                sb.append(String.format("f91(%s) = 91\n", n));
            }
            //sb.setLength(0);
           n = Integer.valueOf(br.readLine());
        }
        System.out.print(sb);
    }
}