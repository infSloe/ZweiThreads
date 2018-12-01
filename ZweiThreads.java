
/**
 * Die Klasse ZweiThreads
 */
public class ZweiThreads
{
    // Methoden
    public static void main(String args[])
    {
        Aufgabe aufgabe = new Aufgabe();
        Thread a = new Thread(aufgabe);
        Thread b = new Thread(aufgabe);
        a.setName("Anna");
        b.setName("Bernd");
        a.start();
        b.start();
    }
}
