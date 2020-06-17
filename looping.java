 public class looping
{
 public static void main (String [] args)
 {
 int x = 0;
 int y = 0;
 for (int z = 0; z < 5; z++)
 {
 if((++x > 4) || (++y > 4))
 {
 x++;
 }
 }
 System.out.println( x + " " + y);
 }
}