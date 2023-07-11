package LotteryServers;
import java.io.Serializable;
import java.util.Arrays;

public class Ticket implements Serializable {
    private String sellerCode; // Code representing the seller of the ticket
    private int[] numbers; // Array of numbers on the ticket

    public Ticket(String sellerCode, int[] numbers) {
        this.sellerCode = sellerCode; // Initialize the seller code of the ticket
        this.numbers = numbers; // Initialize the numbers on the ticket
    }

    public String getSellerCode() {
        return sellerCode; // Retrieve the seller code of the ticket
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode; // Set the seller code of the ticket
    }

    public int[] getNumbers() {
        return numbers; // Retrieve the numbers on the ticket
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers; // Set the numbers on the ticket
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "sellerCode='" + sellerCode + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}'; // Return a string representation of the ticket, including the seller code and numbers
    }
}
