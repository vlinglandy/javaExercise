package JavaPojectExercise.MyFiveZiQi;

import java.util.Scanner;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-04-08-04-17:53
 * @Description:JavaPojectExercise
 * @version:1.0
 */
public class FiveZiQi {

    /**
     * 1.输入，坐标
     * 2.判断下棋下棋是否成功
     * 3.绘制棋盘
     * 4.判断是否胜利
     * 5.切换用户
     */

    private static int size;
    private static int[][] flags;
    private static boolean vectory;

    public boolean getVectory(){
        return vectory;
    }

    public FiveZiQi (int size) throws NewException {
        this.size=size;
        if(size<=7){
            throw new NewException(size);
        }
        flags=new int[size][size];
        this.print();
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(flags[i][j]==0){
                    System.out.print("╂");
                }else if(flags[i][j]==1){
                    System.out.print("●");
                }else {
                    System.out.print("○");
                }
            }
            System.out.println();
        }
    }

    public boolean player1(Scanner sc){
        while (true){
            System.out.println("请玩家一输入横坐标:");
            int x = sc.nextInt();
            System.out.println("请玩家一输入纵坐标:");
            int y = sc.nextInt();
            if(flags[x-1][y-1]==0){
                flags[x-1][y-1]=1;break;
            }else{
                System.out.println("输入坐标有误，请重新输入");
            }
        }
        return this.isVectory();
    }

    private boolean isVectory() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if(i<size-4){
                    if(flags[i][j]!=0&&flags[i][j]==flags[i+1][j]&&flags[i+1][j]==flags[i+2][j]&&flags[i+2][j]==flags[i+3][j]&&flags[i+3][j]==flags[i+4][j]){
                        vectory=true;
                        return vectory;
                    }
                }
                if(j<size-4){
                    if(flags[i][j]!=0&&flags[i][j]==flags[i][j+1]&&flags[i][j+1]==flags[i][j+2]&&flags[i][j+2]==flags[i][j+3]&&flags[i][j+3]==flags[i][j+4]){
                        vectory=true;
                        return vectory;
                    }
                }
                if(i>3&&j<size-4){
                    if(flags[i][j]!=0&&flags[i][j]==flags[i+1][j+1]&&flags[i+1][j+1]==flags[i+2][j+2]&&flags[i+2][j+2]==flags[i+3][j+3]&&flags[i+3][j+3]==flags[i+4][j+4]){
                        vectory=true;
                        return vectory;
                    }
                }
                if(i>3&&j<size-4){
                    if(flags[i][j]!=0&&
                            flags[i][j]==flags[i-1][j-1]&&
                            flags[i-1][j-1]==flags[i-2][j-2]&&
                            flags[i-2][j-2]==flags[i-3][j-3]&&
                            flags[i-3][j-3]==flags[i-4][j-4]){
                        vectory=true;
                        return vectory;
                    }
                }

            }
        }
        return vectory;
    }

    public boolean computer() {
        while(true){
            int x=(int)(Math.random()*size-1);
            int y=(int)(Math.random()*size-1);
            if(flags[x][y]==0){
                flags[x][y]=2;break;
            }
        }
        this.print();
        return this.isVectory();
    }
}
