/**Class: Airplane
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This implements the Flight class and creates two methods, also creates a constructor, getter and setter
 * method. This class also overrides the fly method with its print out statement
 */
public class Airplane implements Flight {
    String model;
    int yearBuilt;

    public Airplane(String model, int yearBuilt){
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void fly(){
        System.out.println("I'm an airplane that relies on an engine to fly");
    }

    @Override
    public String toString() {
        return "Airplane [" + "model='" + model + '\'' + ", yearBuilt=" + yearBuilt + ']';
    }
}
