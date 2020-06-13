/*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
 */
package showcurrenttime;

import java.util.Scanner;

/**
 *
 * @author danasebai
 */
public class ShowCurrentTime extends TimeOffsetToGMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int timeOffestToGmt = sc.nextInt();

        TimeOffsetToGMT offset = new TimeOffsetToGMT();
        offset.setTimeOffsetToGmt(timeOffestToGmt);
        
        offset.showCurrentTime();
        offset.showTime(timeOffestToGmt);
    
        System.out.println(offset.toString());
   
    } 
}

