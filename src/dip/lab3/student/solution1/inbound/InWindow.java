package dip.lab3.student.solution1.inbound;

import javax.swing.*;

public class InWindow implements Incoming
{
    @Override
    public String readInboundMessage()
    {
        return JOptionPane.showInputDialog(null, "Please enter a message... ");
    }
}
