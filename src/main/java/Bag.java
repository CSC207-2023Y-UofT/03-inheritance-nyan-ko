/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;




    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    /**
     * Creates an empty Bag instance with the given color and capacity.
     *
     * @param color the color of the bag.
     * @param capacity the capacity of the bag.
     */
    public Bag(String color, int capacity)
    {
        this.color = color;
        this.capacity = capacity;

        numberOfContents = 0;
        contents = new String[capacity];
    }




    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    /**
     * Gets this Bag's color.
     *
     * @return this Bag's color as a string.
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Gets this Bag's number of contents.
     *
     * @return the number of contents in this Bag.
     */
    public int getNumberOfContents()
    {
        return numberOfContents;
    }

    /**
     * Gets this Bag's capacity.
     *
     * @return this Bag's capacity.
     */
    public int getCapacity()
    {
        return capacity;
    }




    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    /**
     * Sets this Bag's color to the given string.
     *
     * @param color the color to set the Bag to.
     */
    public void setColor(String color)
    {
        this.color = color;
    }



    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /**
     * Tries adding an item to this Bag with respect to its capacity.
     *
     * @param item a String representing the item.
     * @return whether the item was added.
     */
    public boolean addItem(String item)
    {
        if (numberOfContents < capacity)
        {
            contents[numberOfContents] = item;
            numberOfContents++;
            return true;
        }
        return false;
    }





    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return the last item added to this Bag.
     */
    public String popItem()
    {
        if (numberOfContents > 0)
        {
            numberOfContents--;
            String popped = contents[numberOfContents];
            contents[numberOfContents] = null;
            return popped;
        }
        return null;
    }






    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        int newCapacity = capacity + n;
        String[] newContents = new String[newCapacity];
        for (int i = 0; i < capacity; i++)
        {
            if (i >= newCapacity)
            {
                break;
            }
            newContents[i] = contents[i];
        }

        contents = newContents;
        capacity = newCapacity;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return the details of this Bag.
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}