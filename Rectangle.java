/**
 * This class represents a rectangle.
 * @author CS1027 Lecture Notes
 */
public class Rectangle {
    /**
     * Length of the rectangle
     */
    private int length;

    /**
     * Width of the rectangle
     */
    private int width;

    /**
     * Constructor creates a rectangle with the given length and width
     * @param len length of the rectangle
     * @param wid width of the rectangle
     */
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    /**
     * Accessor method to get the length of the rectangle
     * @return length of the rectangle
     */
    public int getLength() {
        return length;
    }
}
