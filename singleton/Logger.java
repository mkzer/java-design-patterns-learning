/*code entrainement concept thread + design pattern singleton  */

import java.time.LocalDateTime;


public class Logger
{
    private static final Logger instance  = new Logger();
    private static int count = 0 ;

    private Logger()
    {}

    public static Logger getInstance()
    {
        return instance ; 
    }

    public static synchronized void log (String message)
    {   
        count ++;
        LocalDateTime now = LocalDateTime.now();
        System.out.println("[LOG "+count+"- "+now+"] "+message);
    }


}