package dip.lab3.student.solution1.inbound;

/**
 * Interface for an incoming message. Whatever you need to do to process an
 * incoming message, do so but then convert it to a string and return it
 * @author Jared Mallas
 * @version 1.0
 */
public interface Incoming
{
    String readInboundMessage();
}
