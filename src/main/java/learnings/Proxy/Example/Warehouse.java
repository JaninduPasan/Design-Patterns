package learnings.Proxy.Example;

import java.util.Hashtable;


/**
 * Real Subject class
 * Know how to process an order for fulfillment
 * Know how to report the current stock of items
 * Does not check if it has enough stock to fulfill an order -> order should only be sent to a warehouse if it can be fulfilled
 * */

public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;

    private String address;

    public Warehouse(String address) {
        this.stock = new Hashtable<>();
        this.address = address;
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            this.stock.replace(item.sku, stock.get(item) - 1);
            /* Process the order for shipment and delivery */
        }
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku).intValue();
        return 0;
    }
}
