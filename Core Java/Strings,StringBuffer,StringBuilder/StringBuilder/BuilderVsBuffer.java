package StringBuilder;

public class BuilderVsBuffer
{

	public static void main(String[] args) {
        int N = 77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println("String Buffer speedtest "+(System.currentTimeMillis() - t));
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println("String Builder speedtest  "+(System.currentTimeMillis() - t));
        }
        {
            String st = new String("ram");
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                st.concat("");
            }
            System.out.println("String       speedtest  "+(System.currentTimeMillis() - t));
        }
    }
}
