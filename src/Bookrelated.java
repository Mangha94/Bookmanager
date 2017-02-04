import java.util.Collections;
import java.util.Iterator;

/**
 * 책 관련 처리 클래스
 */

public class Bookrelated {

    Book b=new Book();


    public void bookrelated() {



        while(true){
        System.out.println("============================");
        System.out.println("1. 도서 대여");
        System.out.println("2. 도서 추가");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 찾기");

        Inputclass in = new Inputclass();

        InputMenu inputMenu = in.getInputMenu();

        if(inputMenu.isBack ())
                break;
        if (("1").equals(inputMenu.getMenuCode()))
        {
            //todo 도서 대여 메소드
            System.out.println("빌릴책을 입력해주세요");

        }
        else if (("2").equals(inputMenu.getMenuCode()))
        {
            //todo 도서 추가 메소드
            System.out.println("추가 할 책을 입력해주세요.(책 이름)");
            InputMenu inputMenuTitle = in.getInputMenu();
            b.title=inputMenuTitle.getMenuCode();

            System.out.println("책의 저자를 입력해주세요");
            InputMenu inputMenuWriter = in.getInputMenu();
            b.writer=inputMenuWriter.getMenuCode();

            System.out.println("책의 출판사를 입력해주세요");
            InputMenu inputMenuPublisher=in.getInputMenu();
            b.publisher=inputMenuPublisher.getMenuCode();

            System.out.println("책의 가격을 입력해주세요");
            InputMenu inputMenuPrice=in.getInputMenu();
            b.price=inputMenuPrice.getMenuCode();

            System.out.println("책의 분류(동화,소설,메뉴얼)");
            InputMenu inputMenuClassification=in.getInputMenu();
            b.classification=inputMenuClassification.getMenuCode();

            System.out.println(inputMenuTitle.getMenuCode()+"가 등록되었습니다.");

            System.out.println(" 제목 : "+b.title+"저자 : "+b.writer+"출판사 : "+b.publisher+"분류  : "+b.classification+" 가격 : "+b.price);

            Iterator it=b.book.iterator();

            while(it.hasNext()){
                Object obj=it.next();
                System.out.println(obj);
            }
        }
        /*
        else if (("3").equals(inputMenu.getMenuCode()))
        {
            //todo 도서 삭제 메소드
            System.out.println("삭제 할 책을 입력해주세요.");
            InputMenu inputMenu2 = in.getInputMenu();
            list.booklist.remove(inputMenu2.getMenuCode());
            System.out.println(inputMenu2.getMenuCode() + "가 삭제 되었습니다.");
        }
        else if(("4").equals(inputMenu.getMenuCode()))
        {
            //todo 도서 찾기 메소드
            System.out.println("찾을 책 제목이나 저자를 입력하시오");
            InputMenu inputMenu3=in.getInputMenu();
            System.out.println(list.booklist.contains(inputMenu3.getMenuCode()));

        }
        else
        {
            System.out.println("잘못입력하셨습니다.");
        }
*/
        }

    }
}

