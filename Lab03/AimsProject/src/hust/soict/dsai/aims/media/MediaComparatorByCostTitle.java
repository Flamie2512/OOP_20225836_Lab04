package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<media> {
	public int compare(media media1, media media2) {
        return Comparator.comparing(media::getCost)
                .thenComparing(media::getTitle)
                .compare(media1, media2);
    }
}