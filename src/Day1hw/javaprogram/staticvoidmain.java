package Day1hw.javaprogram;

public class staticvoidmain {
    public static void main(String[] arg) {
        int n, cnt = 0, sum = 0;
        for (int i=0;i<arg.length;i++)
        {
            try {
                n = Integer.parseInt(arg[i]);
                   sum=sum+n;
            } catch (Exception e) {
                cnt++;
            }
        }
        System.out.println("sum of only valid integers is=" + sum);
        System.out.println("invalid integers are:" + cnt);
    }
}