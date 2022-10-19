import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void workingWithOrders() {
        Order firstOrder = new Order();

        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("Rogas iela 45");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("Rogas iela 33-56");
        secondOrder.setItemCount(3);

        System.out.println("Hello,World!");
        System.out.println("1st order");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println();

        System.out.println("2nd order");
        System.out.println(secondOrder.getTotalPrice());
        System.out.println(secondOrder.getItemCount());
        System.out.println(secondOrder.getAddress());
    }

}
