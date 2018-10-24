package dip.lab3.student.solution1.outbound;

import javax.swing.*;

public class OutWindow implements Outgoing {

    @Override
    public void writeOutboundMessage(String aMessage)
    {
        JOptionPane.showMessageDialog(null, aMessage);
    }
}
