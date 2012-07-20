package sql.checker;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander Gostev
 * Date: 7/20/12
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBcontent {
    private int first;
    private String second;
    private String third;
    private String fourth;

    public DBcontent() {
    }

    public DBcontent(int first, String second, String third, String fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public String toString() {
        return first + ", " + second + ", " + third + ", " + fourth;
    }
}
