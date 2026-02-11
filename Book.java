/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Ernesto Cuellar.)
 * @version (02/11/2026.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // get the author of the book
    
    public String getAuthor()
    { return author;
    }
    
    //** get the title of the book
    
    public String getTitle()
{
    return title;
}

}
