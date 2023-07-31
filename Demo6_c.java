public class Demo6_c {
    public static void main(String[] args) {
        final String FIRSTCOLOR="\033[31m";
        final String SECONDCOLOR="\033[35m";
        final String THIRDCOLOR="\033[37;1m";
        final String RESET ="\033[30;0m";
        int population1=3966936;
        int population2=8336817;

        String newYork ="\033[32mNew \033[31;0mYork"; 

        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%3$s%1$s%5$s \n","+","-".repeat(15),"-".repeat(12),FIRSTCOLOR,RESET);
        System.out.printf("%2$s|%3$s%1$1s%4$sCITY%3$s%1$10s%2$s|%3$s%1$1s%4$sSTATE%3$s%1$6s%2$s|%3$s%1$1s%4$sPOPULATION%4$s%1$1s%2$s|%3$s \n","",FIRSTCOLOR,RESET,THIRDCOLOR);
        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%3$s%1$s%5$s \n","+","-".repeat(15),"-".repeat(12),FIRSTCOLOR,RESET);
        System.out.printf("%1$s|%2$s%3$1s%4$-14s%1$s|%2$s%3$1s%5$s%3$1s%1$s|%2$s%3$2s%6$s%7$,d%3$1s%1$s|%2$s  \n",FIRSTCOLOR,RESET,"","Los Angeles","California",SECONDCOLOR,population1);
        System.out.printf("%1$s|%2$s%3$1s%4$s%3$6s%1$s|%2$s%3$1s%5$s%3$3s%1$s|%2$s%3$2s%6$s%7$,d%3$1s%1$s|%2$s  \n",FIRSTCOLOR,RESET,"",newYork,newYork,SECONDCOLOR,population2);
        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%3$s%1$s%5$s \n","+","-".repeat(15),"-".repeat(12),FIRSTCOLOR,RESET);
    }
    
}
