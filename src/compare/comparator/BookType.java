package compare.comparator;

public class BookType {

	String	idsn;
	String	name;

	/**
	 * @param idsn
	 * @param name
	 */
	public BookType(String idsn, String name) {
		super();
		this.idsn = idsn;
		this.name = name;
	}

	/**
	 * @return Returns the idsn.
	 */
	public String getIdsn() {
		return idsn;
	}

	/**
	 * @param idsn
	 *            The idsn to set.
	 */
	public void setIdsn(String idsn) {
		this.idsn = idsn;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
