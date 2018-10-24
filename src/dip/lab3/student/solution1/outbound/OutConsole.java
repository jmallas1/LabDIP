package dip.lab3.student.solution1.outbound;

public class OutConsole implements Outgoing
{

    @Override
    public void writeOutboundMessage(String aMessage)
    {
        System.out.println(aMessage);
    }
}
