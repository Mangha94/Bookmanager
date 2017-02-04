/**
 * Created by ttinfo on 2017-01-29.
 */
public class BookLend {

    private boolean lend;

    private String lendCode;

    public BookLend(boolean lend) {this.lend=lend;}

    public BookLend(boolean lend,String lendCode)
    {
        this.lend=lend;
        this.lendCode=lendCode;
    }

    public boolean isLend () {return lend;}

    public String getLendCode() {return lendCode;}


}
