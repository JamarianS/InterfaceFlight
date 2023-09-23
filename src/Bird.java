/**Class: Bird
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: September 22, 2023
 *
 * This class – This implements the Flight class and creates two methods, also creates a constructor, getter and setter
 * method. This class also overrides the fly method with its print out statement
 */
public class Bird implements Flight {

    String type;

    public Bird(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps wings to fly.");
    }

    @Override
    public String toString() {
        return "Bird [" + "type='" + type + '\'' + ']';
    }
}
