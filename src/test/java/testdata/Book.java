package testdata;


/**
 * The Class Book.
 */
public class Book {

    /**
     * The identifier of the entity.
     */
    private Long id;

    /** The title. */
    private String title;

    /** The isbn. */
    private String isbn;

    /**
     * Gets the identifier of the entity.
     * 
     * @return the identifier of the entity
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the identifier of the entity.
     * 
     * @param id the new identifier of the entity
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the isbn.
     * 
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the isbn.
     * 
     * @param isbn the new isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
