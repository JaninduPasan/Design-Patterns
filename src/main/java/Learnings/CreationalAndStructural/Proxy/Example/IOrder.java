package Learnings.CreationalAndStructural.Proxy.Example;

/**
 * Subject Interface that client software will use to interact with the system
 * */
public interface IOrder {
    public void fulfillOrder(Order order);
}
