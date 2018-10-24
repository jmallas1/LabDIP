package dip.lab3.student.solution1.broker;

import dip.lab3.student.solution1.inbound.Incoming;
import dip.lab3.student.solution1.outbound.Outgoing;

public class MessageBroker
{
    private String aMessage;

    public MessageBroker()
    {

    }

    public void processInboundMessage(Incoming im)
    {
        this.aMessage = im.readInboundMessage();
    }

    public void processOutboundMessage(Outgoing om)
    {
        om.writeOutboundMessage(aMessage);
    }
}
