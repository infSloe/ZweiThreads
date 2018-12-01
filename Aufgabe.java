
/**
 * Die Klasse Aufgabe
 */
public class Aufgabe implements Runnable
{
      // Methoden
    public void run()
    {
        for (int i = 0; i < 25; i++)
        {
            System.out.println("Ich bin " + Thread.currentThread().getName());
        }
    }
}
