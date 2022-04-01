
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;


public abstract class TacheDO extends Application {

    public static class Task {
        //SimpleStringProperty : toute modification déclenchée sera observée par le TableView, ce qui entraînera la mise à jour immédiate de la cellule
           SimpleStringProperty day;
           SimpleStringProperty description;
           SimpleStringProperty deadline;
           SimpleStringProperty priority;
           SimpleStringProperty share;

           public Task(String day1, String description1, String deadline1, String priority1, String share1) {

               this.day =   new SimpleStringProperty(day1);;
               this.description = new SimpleStringProperty(description1);
               this.deadline = new SimpleStringProperty(deadline1);
               this.priority = new SimpleStringProperty(priority1);
               this.share = new SimpleStringProperty(share1);

           }


        public String getDay() {
            return day.get();
        }
        public void setDay(String day1) { day.set(day1);}

        public String getDescription() {
        return description.get();
        }
        public void setDescription(String description1) {
           description.set(description1);
        }

       public String getDeadline() {
           return deadline.get();
       }
       public void setDeadline(String deadline1) {
           deadline.set(deadline1);
       }

       public String getPriority() {
           return priority.get();
       }
       public void setPriority(String priority1) {
           priority.set(priority1);
       }

       public String getShare() {
               return share.get();
           }
       public void setShare(String deadline1) {share.set(deadline1);}
    }
}





