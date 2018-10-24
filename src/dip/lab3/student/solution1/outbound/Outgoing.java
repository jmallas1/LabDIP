package dip.lab3.student.solution1.outbound;

/**
 * Interface for processing an outgoing String message. However you want to
 * interpret a string and pass it along to your output method is up to you
 * @author Jared Mallas
 * @version 1.0
 */
public interface Outgoing
{
    void writeOutboundMessage(String aMessage);
}
