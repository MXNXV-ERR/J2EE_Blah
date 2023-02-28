public class Book {
  
        String title;
        String auther;
        String publisher;
        double price;
        public Book(String x, String y, String z, double p) {
        title=x;
        auther=y;
        publisher=z;
        price=p;
        }
        @Override
        public String toString() {
            return "Book [title=" + title + ", auther=" + auther + ", publisher=" + publisher + ", price=" + price
                    + "]";
        }
        
        
}
