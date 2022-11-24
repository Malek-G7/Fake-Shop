package Item;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.sql.*;

public class ItemReader implements Closeable {

    private final BufferedReader reader;
    private int line = 0;

    public ItemReader(BufferedReader reader) throws IllegalAccessError, IOException {
        this(reader, true);
    }

    public ItemReader(BufferedReader reader, boolean ignoreFirstLine) throws IOException{
        this.reader = reader;
        if(ignoreFirstLine){
            reader.readLine();
        }
    }

    public void close() throws IOException{
        this.reader.close();
    }

    public int getLineCount(){
        return line;
    }

    public String[] readRow() throws IOException{
        String line = reader.readLine();
        if(line == null){
            return null;
        }

        return line.split(",");
    }


//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/daintree","root","root");
//
//            Statement stmt = con.createStatement();
//            ResultSet item = stmt.executeQuery("select * from item list");
//
//            while(item.next()){
//                System.out.println(item.getString(1));
//                con.close();
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }




}
