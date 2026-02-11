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
    private String refNumber;
    private int borrowed;
    private final boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numberOfPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberOfPages;
        refNumber = ""; 
        borrowed = 0;
        courseText = isCourseText;
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

public boolean isCourseText()
{
    return courseText;
}


public void printDetails()
{
    String refToPrint;
    
    if(refNumber.length() >0 ){
        refToPrint = refNumber;
    } else {
        refToPrint = "ZZZ";
    }
    
    
    System.out.println(
        "Title: " + title
        + ", Author: " + author
        + ", Pages: " + pages
        + ", Ref#: " + refToPrint
        + ", Times Borrowed: "+ borrowed 
    );
}

public void setRefNumber(String ref)
{   
    if (ref.length() >= 3) {
        refNumber = ref; 
    } else {
        System.out.println("Error: Reference number must be at least 3 characters.");
    }
}
    
public String getRefNumber()
{
    return refNumber;
}

public void borrow()
{
     borrowed++;
}

public int getBorrowed()
{
    return borrowed;
}

}

