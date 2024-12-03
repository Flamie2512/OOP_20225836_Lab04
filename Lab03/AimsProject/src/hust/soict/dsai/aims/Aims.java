package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        // Create DVDs and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f);
        anOrder.addMedia(dvd1);  // Using addMedia

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", 24.95f);
        anOrder.addMedia(dvd2);  // Using addMedia

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladdin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);  // Using addMedia

        // Remove a DVD from the cart
        anOrder.removeMedia(dvd1);  // Using removeMedia

        // Print total cost
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
