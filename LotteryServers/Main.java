package LotteryServers;

public class Main {
    public static void main(String[] args) {
        Server serverA = new Server(); // Create Server A
        Server serverB = new Server(); // Create Server B

        serverA.setPartnerServer(serverB); // Set Server B as the partner server for Server A
        serverB.setPartnerServer(serverA); // Set Server A as the partner server for Server B

        Ticket ticket1 = new Ticket("Seller1", new int[]{5, 10, 15, 20, 25, 30}); // Create Ticket 1 with seller code and numbers
        Ticket ticket2 = new Ticket("Seller2", new int[]{1, 2, 3, 4, 5, 6}); // Create Ticket 2 with seller code and numbers

        serverA.saveTicket(ticket1); // Save Ticket 1 to Server A and replicate it on Server B
        serverB.saveTicket(ticket2); // Save Ticket 2 to Server B and replicate it on Server A

        serverA.printTicketCollection(); // Print the ticket collection on Server A
        serverB.printTicketCollection(); // Print the ticket collection on Server B
    }
}
