  /*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */
package showcurrenttime;

/**
 *
 * @author danasebai
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //obtain the total milliSeconds since midnight, Jan 1971
        long totalMilliSeconds = System.currentTimeMillis();
        
        //totalSeconds
        long totalSeconds = totalMilliSeconds / 1000;
        
        long currentSecond = (int) (totalSeconds % 60);
        
        //obtain totalMinutes
        long totalMinutes = totalSeconds / 60;
        
        long currentMinute = (int) (totalMinutes % 60);
        
        long totalHours = totalMinutes / 60;

        long currentHours = (int) (totalHours % 24);

        System.out.println("Current time is " + currentHours + " : "
                + currentMinute + ": " + currentSecond + " GMT");

    }

}
