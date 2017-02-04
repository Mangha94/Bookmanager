/**
 * 메뉴 표출 각 클래스 연결
 */
public class Bookapp {

    Inputclass in=new Inputclass();
    Bookrelated bl=new Bookrelated();

    public void start(){

        while(true){
            //제목 출력
            titlePrint("도서대여프로그램",new String[]{"1.도서관련","2.회원관련"});

            InputMenu inputMenu = in.getInputMenu ();

            if(inputMenu.isBack ())
                break;
            if("1".equals (inputMenu.getMenuCode ())) {
                //도서 관련 출력 모듈
                titlePrint("도서관련", new String[]{});
                bl.bookrelated();
            }
            else if("2".equals (inputMenu.getMenuCode ())) {
                //todo 회원 관련 모듈
                System.out.println("456");
            }
        }
        //프로그램 종료시 메세지
        System.out.println("Bye");
    }

    //todo 회원 관련 타이틀



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
