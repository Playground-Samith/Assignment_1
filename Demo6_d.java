public class Demo6_d {
    public static void main(String[] args) {
        
        final String FIRSTCOLOR="\033[33m";
        final String SECONDCOLOR="\033[34m";
        final String THIRDCOLOR="\033[37;1m";
        final String FOURTHCOLOR="\033[32m";
        final String FIFTHTHCOLOR="\033[31m";

        final String RESET ="\033[30;0m";
        String item1="Apples";
        String item2="Oranges";
        double price1=0.99;
        double price2=1.49;
        String dollarMark="$";
        int itemQty1=5;
        int itemQty2=10;
        
        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%6$s%1$s%5$s \n","+","-".repeat(15),"-".repeat(12),FIRSTCOLOR,RESET,"-".repeat(7));
        System.out.printf("%2$s|%3$s%1$1s%4$sITEM%3$s%1$10s%2$s|%3$s%1$1s%4$sQUANTITY%3$s%1$3s%2$s|%3$s%1$1s%4$sPRICE%4$s%1$1s%2$s|%3$s \n","",FIRSTCOLOR,RESET,THIRDCOLOR);
        System.out.printf("%4$s%1$s%5$s%7$s%2$s%5$s%4$s%1$s%3$s%1$s%5$s%7$s%6$s%5$s%4$s%1$s%5$s \n","+","-".repeat(15),"-".repeat(12),FIRSTCOLOR,RESET,"-".repeat(7),FOURTHCOLOR);
        System.out.printf("%1$s|%2$s%3$1s%4$-14s%1$s|%2$s%3$1s%6$s%5$10d%2$s%3$1s%1$s|%2$s%3$1s%9$s%8$s%2$s%10$s%7$.2f%2$s%3$1s%1$s|%2$s  \n",FIRSTCOLOR,RESET,"",item1,itemQty1,SECONDCOLOR,price1,dollarMark,FOURTHCOLOR,FIFTHTHCOLOR);
        System.out.printf("%1$s|%2$s%3$1s%4$-14s%1$s|%2$s%3$1s%6$s%5$10d%2$s%3$1s%1$s|%2$s%3$1s%9$s%8$s%2$s%10$s%7$.2f%2$s%3$1s%1$s|%2$s  \n",FIRSTCOLOR,RESET,"",item2,itemQty2,SECONDCOLOR,price2,dollarMark,FOURTHCOLOR,FIFTHTHCOLOR);
        System.out.printf("%4$s%1$s%5$s%7$s%2$s%5$s%4$s%1$s%3$s%1$s%5$s%7$s%6$s%5$s%4$s%1$s%5$s \n","+","-".repeat(15),"-".repeat(12),FIRSTCOLOR,RESET,"-".repeat(7),FOURTHCOLOR);

    }
    
}
