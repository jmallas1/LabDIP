package dip.lab3.student.solution1.inbound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InConsole implements Incoming
{
    @Override
    public String readInboundMessage()
    {
        System.out.println("Please enter a message...");
        return waitForInput();
    }

    private String waitForInput()
    {
        String rString = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            rString = br.readLine();
        } catch (IOException e) {
            System.out.println("Exception thrown while waiting for input");
            System.out.println(e.getMessage());
        }

        return rString;
    }
}
