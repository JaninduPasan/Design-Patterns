package learnings.Proxy.Example;


import java.util.List;

/**
 * Proxy class
 * Checks warehouse inventory -> Ensure an order can be completed before sending request to the warehouse
 * Ask each warehouse on enough stock of a particular item
 * Separate order validation from order fulfillment by separating them into two pieces
 * Warehouse do not worry about the validation process or re-routing process if it can not be fulfilled
 * */

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void fulfillOrder(Order order) {
        /** For each item in a customer order, check each warehouse to see if it is in stock.
         * If it is then create a new Order for that warehouse. Else check the next warehouse.
         * Send all the Orders to the warehouse(s) after you finish iterating over all the items in the original Order. */

        for (Item item: order.itemList) {
            for (Warehouse warehouse: warehouses) {
                // Check availability logic
                int availableQty = warehouse.currentInventory(item);
                if (availableQty > 0) {
                    System.out.println(item + " is available in " + warehouse);
                }
            }
        }
        return;
    }
}
