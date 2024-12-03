package hust.soict.dsai.aims.media;

public abstract class media {
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof media) {
			media media = (media) obj;
			if (this.id == media.id) {
				return true;
			}
		}
		return false;
	}
}