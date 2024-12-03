package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<media> {
	public int compare(media media1, media media2) {
        return Comparator.comparing(media::getTitle)
                .thenComparing(media::getCost)
                .compare(media1, media2);
    }
}