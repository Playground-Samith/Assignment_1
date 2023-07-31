public class Demo4 {
    public static void main(String[] args) {
        int day=28;
        int month=12;
        int year = 2023;
        int hour=23;
        int minute=59;
        int second=59;
        final String DAYCOLOR="\033[31;1m";
        final String MONTHCOLOR="\033[32;1m";
        final String YEARCOLOR="\033[33;1m";
        final String HOURCOLOR="\033[34;1m";
        final String MINUTECOLOR="\033[35;1m";
        final String SECONDCOLOR="\033[36;1m";
        final String RESET ="\033[30;0m";
    
        System.out.printf("\"%s%d%s/%s%d%s/%s%d%s%s% 3d%s:%s%02d%s:%s%02d%s\" \n",MONTHCOLOR,month,RESET,DAYCOLOR,day,RESET,YEARCOLOR,year,RESET,
        HOURCOLOR,hour,RESET,MINUTECOLOR,minute,RESET,SECONDCOLOR,second,RESET);
    }
    
}
