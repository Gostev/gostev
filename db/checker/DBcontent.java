package db.checker;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander Gostev
 * Date: 7/20/12
 * Time: 12:51 PM
 */
public class DBcontent {
    private int firstRow;
    private String secondRow;
    private String thirdRow;
    private String fourthRow;

    public DBcontent() {
    }

    public DBcontent(int firstRow, String secondRow, String thirdRow, String fourthRow) {
        this.firstRow = firstRow;
        this.secondRow = secondRow;
        this.thirdRow = thirdRow;
        this.fourthRow = fourthRow;
    }

    public String toString() {
        return firstRow + ", " + secondRow + ", " + thirdRow + ", " + fourthRow;
    }
}
