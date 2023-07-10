package LotteryServers;
public class Main {
    public static void main(String[] args) {
        Server serverA = new Server();
        Server serverB = new Server();

        serverA.setPartnerServer(serverB);
        serverB.setPartnerServer(serverA);

        Ticket ticket1 = new Ticket("Seller1", new int[]{5, 10, 15, 20, 25, 30});
        Ticket ticket2 = new Ticket("Seller2", new int[]{1, 2, 3, 4, 5, 6});

        serverA.saveTicket(ticket1);
        serverB.saveTicket(ticket2);

        serverA.printTicketCollection();
        serverB.printTicketCollection();
    }
}
