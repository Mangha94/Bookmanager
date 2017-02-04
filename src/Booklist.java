import java.util.ArrayList;
import java.util.List;

/**
 * 책 보유 리스트
 */
public class Booklist {

    List<String> booklist = new ArrayList<String>(){
        {
            add("백설 공주");
            add("어린 왕자");
            add("톰 소여의 모험");
            add("너의 이름은");
            add("로미오와 줄리엣");
            add("햄릿");

        }
    };

    public String[]listbook() {

        this.booklist=booklist;

        System.out.println("도서 보유 현황");

        String[] listArr = booklist.toArray(new String[booklist.size()]);

        for (String line : listArr) {
            System.out.println(line);
        }
        return listbook();
    }

}
