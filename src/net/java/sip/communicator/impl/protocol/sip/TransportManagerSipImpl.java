/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.protocol.sip;

import java.net.*;

import net.java.sip.communicator.service.protocol.media.*;

/**
 * @author Emil Ivov
 */
public class TransportManagerSipImpl extends TransportManager<CallPeerSipImpl>
{

    /**
     * Creates a new SIP {@link TransportManager}.
     *
     * @param callPeer the peer that we will be servicing.
     */
    protected TransportManagerSipImpl(CallPeerSipImpl callPeer)
    {
        super(callPeer);
    }

    /**
     * Returns the <tt>InetAddress</tt> that is most likely to be to be used
     * as a next hop when contacting the specified <tt>destination</tt>. This is
     * an utility method that is used whenever we have to choose one of our
     * local addresses to put in the Via, Contact or (in the case of no
     * registrar accounts) From headers. The method also takes into account
     * the existence of an outbound proxy and in that case returns its address
     * as the next hop.
     *
     * @param peer the CallPeer that we would contact.
     *
     * @return the <tt>InetAddress</tt> that is most likely to be to be used
     * as a next hop when contacting the specified <tt>destination</tt>.
     *
     * @throws IllegalArgumentException if <tt>destination</tt> is not a valid
     * host/ip/fqdn
     */
    protected InetAddress getIntendedDestination(CallPeerSipImpl peer)
    {
        return peer.getProtocolProvider()
            .getIntendedDestination(peer.getPeerAddress()).getAddress();
    }

    /**
     * Returns the extended type of the candidate selected if this transport
     * manager is using ICE.
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return The extended type of the candidate selected if this transport
     * manager is using ICE. Otherwise, returns null.
     */
    public String getICECandidateExtendedType(String streamName)
    {
        return null;
    }

    /**
     * Returns the current state of ICE processing.
     *
     * @return the current state of ICE processing.
     */
    public String getICEState()
    {
        return null;
    }

    /**
     * Returns the ICE local host address.
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return the ICE local host address if this transport
     * manager is using ICE. Otherwise, returns null.
     */
    public InetSocketAddress getICELocalHostAddress(String streamName)
    {
        return null;
    }

    /**
     * Returns the ICE remote host address.
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return the ICE remote host address if this transport
     * manager is using ICE. Otherwise, returns null.
     */
    public InetSocketAddress getICERemoteHostAddress(String streamName)
    {
        return null;
    }

    /**
     * Returns the ICE local reflexive address (server or peer reflexive).
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return the ICE local reflexive address. May be null if this transport
     * manager is not using ICE or if there is no reflexive address for the
     * local candidate used.
     */
    public InetSocketAddress getICELocalReflexiveAddress(String streamName)
    {
        return null;
    }

    /**
     * Returns the ICE remote reflexive address (server or peer reflexive).
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return the ICE remote reflexive address. May be null if this transport
     * manager is not using ICE or if there is no reflexive address for the
     * remote candidate used.
     */
    public InetSocketAddress getICERemoteReflexiveAddress(String streamName)
    {
        return null;
    }

    /**
     * Returns the ICE local relayed address (server or peer relayed).
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return the ICE local relayed address. May be null if this transport
     * manager is not using ICE or if there is no relayed address for the
     * local candidate used.
     */
    public InetSocketAddress getICELocalRelayedAddress(String streamName)
    {
        return null;
    }

    /**
     * Returns the ICE remote relayed address (server or peer relayed).
     *
     * @param streamName The stream name (AUDIO, VIDEO);
     *
     * @return the ICE remote relayed address. May be null if this transport
     * manager is not using ICE or if there is no relayed address for the
     * remote candidate used.
     */
    public InetSocketAddress getICERemoteRelayedAddress(String streamName)
    {
        return null;
    }
}
