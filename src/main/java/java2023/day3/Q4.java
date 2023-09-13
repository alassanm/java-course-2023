package java2023.day3;

//Empty interface PlanElement
interface PlanElement {
}

//Interface Activity extending PlanElement
interface Activity extends PlanElement {
 double getEndTime();
 void setEndTime(final double seconds);
 String getType();
 void setType(final String type);
 double getXCoord();
 double getYCoord();
}

//Class ActivityImpl implementing Activity
class ActivityImpl implements Activity {
 private double endTime;
 private String type;
 private double xCoord;
 private double yCoord;

 public ActivityImpl(double endTime, String type, double xCoord, double yCoord) {
     this.endTime = endTime;
     this.type = type;
     this.xCoord = xCoord;
     this.yCoord = yCoord;
 }

 @Override
 public double getEndTime() {
     return endTime;
 }

 @Override
 public void setEndTime(final double seconds) {
     this.endTime = seconds;
 }

 @Override
 public String getType() {
     return type;
 }

 @Override
 public void setType(final String type) {
     this.type = type;
 }

 @Override
 public double getXCoord() {
     return xCoord;
 }

 @Override
 public double getYCoord() {
     return yCoord;
 }
}

//Test Class
public class Q4 {
 public static void main(String[] args) {
     ActivityImpl activity = new ActivityImpl(3600, "work", 40.7128, 74.0060);

     System.out.println("Activity type: " + activity.getType());
     System.out.println("End time: " + activity.getEndTime());
     System.out.println("X coordinate: " + activity.getXCoord());
     System.out.println("Y coordinate: " + activity.getYCoord());
 }
}

