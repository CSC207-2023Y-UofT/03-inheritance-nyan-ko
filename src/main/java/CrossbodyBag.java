/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag {
    private int numberOfStraps;

    /**
     * Creates a new CrossbodyBag.
     *
     * @param color this instance's color.
     * @param capacity this instance's capacity.
     * @param numberOfStraps this instance's number of straps.
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    /**
     * Gets this CrossbodyBag's number of straps.
     *
     * @return this CrossbodyBag's number of straps.
     */
    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    /**
     * Sets this CrossbodyBag's number of straps.
     *
     * @param straps the number of straps this instance should have.
     */
    public void setNumberOfStraps(int straps) {
        numberOfStraps = straps;
    }

    /**
     * Increases this CrossbodyBag's capacity by 2.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    @Override
    public String toString() {
        String newString = "Crossbody Bag with " + numberOfStraps + " straps";
        return getColor() + " " + newString + " (" + getNumberOfContents() + " / " +
                getCapacity() + ")";
    }
}