
import java.util.Vector;

public class MemoryEater
{
  public static void main(String[] args)
  {
    Vector v = new Vector();
    //for (int i=0; i<1000; i++ )
    while (true)
    {
      byte b[] = new byte[1048576];
      v.add(b);
      Runtime rt = Runtime.getRuntime();

      System.out.println( "free memory: " + rt.freeMemory() );
/*      try
      {
        Thread.sleep(250);
      }
      catch (InterruptedException e)
      {
      }
*/
    }
  }
}
