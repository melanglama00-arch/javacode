import java.util.StringTokenizer;

public class DateSeperator {
    public static void main(String args[]){
        String date = "15/08/2026";

        StringTokenizer st = new StringTokenizer(date,"/");
        String day = st.nextToken();
         String month = st.nextToken();
          String year = st.nextToken();

          System.out.println("day: " + day);
          System.out.println("month: " + month);
          System.out.println("year: " + year);

    }
    
}
