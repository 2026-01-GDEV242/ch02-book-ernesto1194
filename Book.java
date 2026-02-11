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
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numberOfPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberOfPages;
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

public int getPages()
{   
    return pages;
}
   

public void printAuthor()
{   
    System.out.println(author);
}

public void printTitle()
{
    System.out.println(title);
}

public void printDetails()
{
    System.out.println
    ("Title: " + title
    + ", Author: " + author
    + ", Pages; " + pages);
}


}
