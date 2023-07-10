package LotteryServers;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Ticket> ticketCollection;
    private Server partnerServer;

    public Server() {
        this.ticketCollection = new ArrayList<>();
    }

    public void setPartnerServer(Server partnerServer) {
        this.partnerServer = partnerServer;
    }

    public void saveTicket(Ticket ticket) {
        ticketCollection.add(ticket);
        partnerServer.replicateTicket(ticket);
    }

    public void replicateTicket(Ticket ticket) {
        ticketCollection.add(ticket);
    }

    public void printTicketCollection() {
        System.out.println("Tickets in Server:");
        for (Ticket ticket : ticketCollection) {
            System.out.println(ticket);
        }
    }
}
