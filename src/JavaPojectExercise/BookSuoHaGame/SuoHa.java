package JavaPojectExercise.BookSuoHaGame;

import b.b.P;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-22-08-22-14:41
 * @Description:JavaPojectExercise.BookSuoHaGame
 * @version:1.0
 */
public class SuoHa {
    private static int number=5;
    public static class Peopleone{
        static boolean flag=true;
         static int paiNum=0;
        static String[] paiOne=new String[5];
    }

    public static class PeopleTwo{
        static boolean flag=true;
        static int paiNum=0;
        static String[] paiTwo=new String[5];
    }

    public static class PeopleThree{
        static boolean flag=true;
        static int paiNum=0;
        static String[] paiThree=new String[5];
    }

    public static class PeopleFour{
        static boolean flag=true;
        static int paiNum=0;
        static String[] paiFour=new String[5];
    }

    public static class PeopleFive{
        static boolean flag=true;
        static int paiNum=0;
        static String[] paiFive=new String[5];
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(Peopleone.flag){
                String pai = null;
                int[] a= new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
                int num=(int)((Math.random()*28+1)-0.000001);
                while(a[num-1]==0){
                    num=(int)((Math.random()*28+1)-0.000001);
                }
                a[num-1]=0;
                switch(num%4){
                    case 0 :pai="黑桃";
                    case 1 :pai="红桃";
                    case 2 :pai="草花";
                    case 3 :pai="方片";
                }
                switch((num-1)/4){
                    case 0:pai+="A";break;
                    case 1:pai+="2";break;
                    case 2:pai+="3";break;
                    case 3:pai+="4";break;
                    case 4:pai+="5";break;
                    case 5:pai+="6";break;
                    case 6:pai+="7";break;
                }
                Peopleone.paiNum+=1;
                Peopleone.paiOne[i]=pai;

            }






        }

    }
}
