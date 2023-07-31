public class Demo6_b {
    public static void main(String[] args) {
        String person1="Alice";
        int agePerson1=24;
        String person2="Bob";
        int agePerson2=30;

        final String FIRSTCOLOR="\033[31m";
        final String SECONDCOLOR="\033[34;1m";
        final String THIRDCOLOR="\033[35;1m";
        final String RESET ="\033[30;0m";

        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%5$s \n","+","-".repeat(10),"-".repeat(5),FIRSTCOLOR,RESET);
        System.out.printf("%7$s|%6$s%1$s%5$s%2$s%6$s%5s%7$s|%6$s%1$s%5$s%4$s%6$s%1$s%7$s|%6$s \n"," ","NAME","","AGE",SECONDCOLOR,RESET,FIRSTCOLOR);
        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%5$s \n","+","-".repeat(10),"-".repeat(5),FIRSTCOLOR,RESET);
        System.out.printf("%s|%s%1s%-9s%s|%s%s% 4d%s%1s%s|%s \n",FIRSTCOLOR,RESET,"",person1,FIRSTCOLOR,RESET,THIRDCOLOR,agePerson1,RESET,"",FIRSTCOLOR,RESET);
        System.out.printf("%s|%s%1s%-9s%s|%s%s% 4d%s%1s%s|%s \n",FIRSTCOLOR,RESET,"",person2,FIRSTCOLOR,RESET,THIRDCOLOR,agePerson2,RESET,"",FIRSTCOLOR,RESET);

        System.out.printf("%4$s%1$s%2$s%1$s%3$s%1$s%5$s \n","+","-".repeat(10),"-".repeat(5),FIRSTCOLOR,RESET);
    }
    
}
