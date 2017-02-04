import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 책 정보(제목 저자 출판사 가격 분류)저장 클래스
 */
public class Book {
    String title;
    String writer;
    String publisher;
    String price;
    String classification;

    public List<Book> book = new ArrayList<Book>();

    Book() {
    this.title=title;
    this.writer=writer;
    this.publisher=publisher;
    this.price=price;
    this.classification=classification;
    }



    public String [] setbook() {

        this.book=book;

        Iterator it=book.iterator();

        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
        return setbook();
    }

}

