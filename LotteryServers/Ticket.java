package LotteryServers;
import java.io.Serializable;
import java.util.Arrays;

public class Ticket implements Serializable {
    private String sellerCode;
    private int[] numbers;

    public Ticket(String sellerCode, int[] numbers) {
        this.sellerCode = sellerCode;
        this.numbers = numbers;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "sellerCode='" + sellerCode + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
