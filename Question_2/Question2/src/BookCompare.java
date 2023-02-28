import java.util.Comparator;

public class BookCompare implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        // TODO Auto-generated method stub
        if(b1.price>b2.price)
            return 1;
        else if(b1.price==b2.price) 
            return 0;
        else
            return -1;
    }
    // @Override
    // public int compare(Book b1, Book b2) {
    // // TODO Auto-generated method stub
    // if(b1.price>b2.price)
    // return 1;
    // else if(b1.price==b2.price){
    // return 0;
    // }
    // else
    // {
    // return -1;
    // }

}
