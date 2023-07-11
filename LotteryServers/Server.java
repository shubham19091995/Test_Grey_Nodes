package LotteryServers;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Ticket> ticketCollection; // Collection of tickets stored in the server
    private Server partnerServer; // Reference to the partner server for replication

    public Server() {
        this.ticketCollection = new ArrayList<>(); // Initialize the ticket collection as an empty ArrayList
    }

    public void setPartnerServer(Server partnerServer) {
        this.partnerServer = partnerServer; // Set the partner server for replication
    }

    public void saveTicket(Ticket ticket) {
        ticketCollection.add(ticket); // Add the ticket to the server's ticket collection
        partnerServer.replicateTicket(ticket); // Replicate the ticket on the partner server
    }

    public void replicateTicket(Ticket ticket) {
        ticketCollection.add(ticket); // Add the replicated ticket to the server's ticket collection
    }

    public void printTicketCollection() {
        System.out.println("Tickets in Server:");
        for (Ticket ticket : ticketCollection) {
            System.out.println(ticket); // Print each ticket in the server's ticket collection
        }
    }
}
