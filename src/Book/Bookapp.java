package Book;

import Book.BookAPL.BookCenter;
import Book.BookMenu;
import Book.InputMenu;
import Book.Inputclass;
import Book.Member.MemberCenter;

/**
 * 메뉴 표출 및 연결
 */
public class Bookapp
{
    Inputclass in=new Inputclass();

    BookCenter bc =new BookCenter();
    MemberCenter mc=new MemberCenter();

    public void start()
    {
        while(true)
        {
            //초입 메뉴 출력
            titlePrint("도서 관리 프로그램",new String[]{"1.도서 관련","2.회원관련"});

            InputMenu inputMenu=in.getInputMenu();

            if(inputMenu.isBack())
                break;
            if("1".equals(inputMenu.getMenuCode()))
            {
                System.out.println("도서 관련");
                //북관련 메뉴 실행
                BookMenu bm=new BookMenu(bc);
                bm.bookMenu();
            }
            else if("2".equals(inputMenu.getMenuCode()))
            {
                System.out.println("회원 관련");
                //회원 관련 메뉴 실행
                MemberMenu mm=new MemberMenu(mc);
                mm.membermenu();
            }
        }

        //프로그램 종료시 메세지
        System.out.println("Bye");
    }
    /**
     * 타이틀을 출력한다.
     * @param title
     * @param subTitles
     */
    private void titlePrint(String title, String[] subTitles)
    {
        System.out.println("---------------------------------------");
        System.out.println(title);
        System.out.println("---------------------------------------");

        if (subTitles != null)
        {
            for (String subTitle : subTitles)
            {
                System.out.println(subTitle);
            }
        }

        System.out.println ("('x'나 'q' 를 입력하시면 뒤로가실수 있습니다.)");
    }
}
