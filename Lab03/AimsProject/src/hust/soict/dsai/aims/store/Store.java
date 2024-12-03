package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.media;

import java.util.ArrayList;
public class Store {
    private ArrayList<media> itemsInStore = new ArrayList<media>();
    
    public void addMedia(media media) {
        itemsInStore.add(media);
        System.out.println(media.getTitle()+ " has been added to the store.");
    }

    public void removeMedia(media media) {
	    boolean found = false; 
	    for (media item : itemsInStore) {
	        if (item.equals(media)) {
	        	itemsInStore.remove(item);
	            System.out.println(media.getTitle() + " has been removed from the store.");
	            found = true;
	            break;
	        }
	    }
	    if (!found) System.out.println(media.getTitle() + " is not in the store.");
	}
    public ArrayList<media> getItemsInStore() {return itemsInStore;}
}