public class Printer {

    private int tonerlevel;
    private int pagesprinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerlevel) {
        this.duplex = duplex;
        this.pagesprinted = 0;
        this.tonerlevel = (tonerlevel >= 0 && tonerlevel <= 100) ? tonerlevel : -1;
    }

    public int addtoner(int tonerAmount){
        int tempamount = tonerAmount + tonerlevel;

        if (tempamount > 100  || tempamount < 0){
            return -1;
        }
        tonerlevel += tonerAmount;
        return tonerlevel;
    }

    public int printpages(int pages){
        int jobpages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesprinted += jobpages;
        return jobpages;
    }

    public int getPagesprinted(){
        return pagesprinted;
    }
}
