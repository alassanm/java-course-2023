package java2023.day4;
import java.util.ArrayList;

//Redefining PlanElement as NewPlanElement
interface NewPlanElement {}

//Redefining Leg as NewLeg
interface NewLeg extends NewPlanElement {
 String getMode();
 void setMode(String mode);
 // ... (other methods)
}

//Redefining LegImpl as NewLegImpl
class NewLegImpl implements NewLeg {
 private String mode;
 
 public String getMode() {
     return mode;
 }
 
 public void setMode(String mode) {
     this.mode = mode;
 }
 // ... (other methods)
}

//Activity interface
interface NewActivity extends NewPlanElement {
 String getType();
 void setType(String type);
}

//Plan interface
interface NewPlan {
 void setScore(double score);
 double getScore();
 ArrayList<NewPlanElement> getPlanElements();
 void addLeg(final NewLeg leg);
 void addActivity(final NewActivity act);
}

//Activity Implementation
class NewActivityImpl implements NewActivity {
 private String type;

 public String getType() {
     return type;
 }
 public void setType(String type) {
     this.type = type;
 }
}

//Plan Implementation
class NewPlanImpl implements NewPlan {
 private double score;
 private ArrayList<NewPlanElement> elements;

 public NewPlanImpl() {
     this.elements = new ArrayList<>();
 }

 public void setScore(double score) {
     this.score = score;
 }
 public double getScore() {
     return score;
 }
 public ArrayList<NewPlanElement> getPlanElements() {
     return elements;
 }
 public void addLeg(final NewLeg leg) {
     elements.add(leg);
 }
 public void addActivity(final NewActivity act) {
     elements.add(act);
 }
}

//Test Program in Q6.java
public class Q6 {
 public static void main(String[] args) {
     NewPlanImpl plan = new NewPlanImpl();
     plan.setScore(100.0);

     // Add activities and legs
     NewLeg car1 = new NewLegImpl();
     car1.setMode("car");
     NewLeg car2 = new NewLegImpl();
     car2.setMode("car");

     NewActivity home = new NewActivityImpl();
     home.setType("Home");

     NewActivity work = new NewActivityImpl();
     work.setType("Work");

     plan.addActivity(home);
     plan.addLeg(car1);
     plan.addActivity(work);
     plan.addLeg(car2);
     plan.addActivity(home);

     // Output the elements
     outputPlanElements(plan);
 }

 public static void outputPlanElements(NewPlan plan) {
     for (NewPlanElement element : plan.getPlanElements()) {
         if (element instanceof NewActivity) {
             System.out.print(((NewActivity) element).getType() + " - ");
         } else if (element instanceof NewLeg) {
             System.out.print(((NewLeg) element).getMode() + " - ");
         }
     }
     System.out.println();
 }
}

