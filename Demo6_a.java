public class Demo6_a {

    public static void main(String[] args) {
        int x=5;
        int y=0;
        String z="0%";

        final String BACKCOLOR1="\033[41;1m";
        final String BACKCOLOR2="\033[42;1m";
        final String RESET ="\033[30;0m";

        System.out.printf("%s[% 5d%s%s%-5s]%s \n",BACKCOLOR1,x,RESET,BACKCOLOR2,z,RESET);
    }
    
}
