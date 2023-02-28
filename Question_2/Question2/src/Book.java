public class Book {
  
        String title;
        String author;
        String publisher;
        double price;
        public Book(String x, String y, String z, double p) {
        title=x;
        author=y;
        publisher=z;
        price=p;
        }
        @Override
        public String toString() {
            return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
                    + "]";
        }
        
        
}
