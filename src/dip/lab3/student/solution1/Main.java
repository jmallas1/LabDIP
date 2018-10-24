package dip.lab3.student.solution1;

import dip.lab3.student.solution1.broker.MessageBroker;
import dip.lab3.student.solution1.inbound.*;
import dip.lab3.student.solution1.outbound.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Main class to demonstrate message broker class and how it handles objects that
 * implement the Incoming and Outgoing interfaces. (In reality, all it does is
 * call the required methods) I thought it was rather clever that I borrowed
 * two classes from an earlier project (fileIO classes) and simply implemented
 * the interface-required methods.
 *
 * @author Jared Mallas
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        Random rand;
        Outgoing om;
        MessageBroker mb = new MessageBroker();
        ArrayList<Incoming> incomingArrayList = new ArrayList<Incoming>();
        ArrayList<Outgoing> outgoingArrayList = new ArrayList<Outgoing>();

        // generate list of incoming messages
        incomingArrayList.add(new InFile("InMessage.txt"));
        incomingArrayList.add(new InConsole());
        incomingArrayList.add(new InWindow());

        // generate list of outgoing messages
        outgoingArrayList.add(new OutFile("OutMessage.txt"));
        outgoingArrayList.add(new OutConsole());
        outgoingArrayList.add(new OutWindow());

        for (Incoming im : incomingArrayList)
        {
            rand = new Random();
            om = outgoingArrayList.get(rand.nextInt(outgoingArrayList.size()));
            mb.processInboundMessage(im);
            mb.processOutboundMessage(om);
        }

    }
}
