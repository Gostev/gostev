package db.checker;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander Gostev
 * Date: 7/20/12
 * Time: 2:29 PM
 */
public class Output {

    private static Collection<DBcontent> DBcontents = new LinkedList<DBcontent>();
    public static Collection<DBcontent> getCollection() {
    ResultSet rs = null;

    try {
        rs = Database.execution();

        while(rs.next()) {
            DBcontents.add(new DBcontent(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        Database.closeConnection();
        return DBcontents;
    }

    public static void fileOut() {
        String currentDate = new SimpleDateFormat("dd-MMMMM-yyyy hh-mm a").format(java.util.Calendar.getInstance ().getTime());

        try {
            Writer output = null;
            File file = new File("Title " + currentDate + ".csv");
            output = new BufferedWriter(new FileWriter(file));
                output.write("ID, UUID, FIRST NAME, LAST NAME \n");

            for(DBcontent u: DBcontents) {
                output.write(u.toString() + "\n");
                output.write("");
            }
            output.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Your file has been written " + currentDate);
    }
}






