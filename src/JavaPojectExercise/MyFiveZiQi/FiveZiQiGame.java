package JavaPojectExercise.MyFiveZiQi;

import java.util.Scanner;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-04-08-04-18:51
 * @Description:JavaPojectExercise
 * @version:1.0
 */
public class FiveZiQiGame {
    private static boolean player;
    /**
     * 1.输入棋盘大小
     * 2.判断
     * 3.绘制棋盘
     * 4.开始游戏
     * 5.玩家一
     * 6.判断是否胜利
     * 7.玩家二
     * 8.判断是否胜利
     * 9.直到胜利，标记变量变成true
     * @param args
     * @throws NewException
     */
    public static void main(String[] args) throws NewException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入棋盘大小:");
        int i = sc.nextInt();
        FiveZiQi fzq = new FiveZiQi(i);
        while(/*!fzq.getVectory()*/true){
            if(fzq.player1(sc)){
                player=true;
                break;
            }
            if(fzq.computer())break;
        }
        if(player){
            fzq.print();
            System.out.println("你赢了！");
        }else{
            System.out.println("这次没发挥好，再接再励！");
        }

    }

}
