package dip.lab3.student.solution1.outbound;

import java.io.*;

/**
 * Class model for FileOutput
 * @author Jared R Mallas
 * @version 1.0
 */
public class OutFile implements Outgoing
{
    private String filePath;
    private Writer out = null;

    /**
     * Constructor for FileOutput
     * @param filePath String containing a full or relative path to a file
     */
    public OutFile(String filePath) {
        this.filePath = filePath;

        try
        {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Unable to open file for write: " + filePath + " "  + e);
        }
    }

    /**
     * Method for writing the contents of a String to a file
     * @param toWrite String to write to file.
     */
    public void writeFile(String toWrite)
    {
        try
        {
            out.write(toWrite);
            out.close();
        }
        catch(Exception e)
        {
            System.out.println("File Write Error: " + filePath + " "  + e);
        }
    }

    /**
     * Closes file that is opened by constructor
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void writeOutboundMessage(String aMessage)
    {
        this.writeFile(aMessage);
    }
}