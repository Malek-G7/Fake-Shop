package atu.ie.Item;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

public class ItemReader implements Closeable{
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

}
