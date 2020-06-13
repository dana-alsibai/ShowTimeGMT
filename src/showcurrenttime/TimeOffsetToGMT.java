  /*
        Name:  [Dana Alsibai ]
        Assignment:  [Exercise 1.1a]
        Program: []
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package showcurrenttime;

/**
 *
 * @author danasebai
 */
public class TimeOffsetToGMT {
    
    private int timeOffsetToGmt;
    private long currentHours;
    private long currentMinute;
    private long currentSecond;
 

    public int getTimeOffsetToGmt() {
        return timeOffsetToGmt;
    }

    public void setTimeOffsetToGmt(int timeOffsetToGmt) {
        this.timeOffsetToGmt = timeOffsetToGmt;
    }

    public long getCurrentHours() {
        return currentHours;
    }

    public void setCurrentHours(long currentHours) {
        this.currentHours = currentHours;
    }

    public long getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(long currentMinute) {
        this.currentMinute = currentMinute;
    }

    public long getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(long currentSecond) {
        this.currentSecond = currentSecond;
    }
    public void showCurrentTime(){
        
   long totalMiliSecond = System.currentTimeMillis();
    
    long totalSeconds = totalMiliSecond / 1000;
    
  currentSecond = (int)(totalSeconds % 60);
    
    long totalMinutes = totalSeconds / 60;
    
    currentMinute = (int) (totalMinutes % 60);
     
     long totalHours = totalMinutes / 60;
     
     currentHours = (int)(totalHours % 24);
    }
    
    public int showTime(int timeOffsetToGmt){

     currentHours = currentHours + timeOffsetToGmt;
     
     return (int)currentHours;
    }
 public String toString(){
return "Current time is " + currentHours + " : "
                + currentMinute + ": " + currentSecond + " GMT";
 }
     
   
    
  }


