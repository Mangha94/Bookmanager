import java.util.Scanner;
/**
 * 스캐너 역할
 */
public class Inputclass {
    private Scanner scanner=new Scanner(System.in);

    /**
     * 스트링을 입력받는다.
     * @return
     *
     */
    public InputMenu getInputMenu ()
    {
        String input = scanner.nextLine();

        // 종료가 되는 문자열 배열
        String [] exitStrs = {"q", "Q", "x", "X", ""};

        for (String s : exitStrs)
        {
            if (s.equals (input))
                return new InputMenu (true);
        }

        return new InputMenu (false, input);
    }

   /* public BookLend getBookLend()
    {
        String lend =scanner.nextLine();

        String[]lendStrs={"L","l"};

        for(String b : lendStrs)
        {
            if(b.equals(lend))
                return new BookLend(true);
        }
        return new BookLend(false,lend);
    }
    */



}