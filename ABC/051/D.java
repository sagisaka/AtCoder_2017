import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max_point = sc.nextInt();
        int max_bar = sc.nextInt();
        int answer =0;
        int[][] test_point = new int[max_point+1][max_point+1];
        for(int i=0;i<max_bar;i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int last = sc.nextInt();
            test_point[first][second]=last;
        }
        for(int i=1;i<max_point;i++){
            for(int j=2;j<=max_point;j++){
                if(!(test_point[i][j]<=2)){
                    //ワーシャルフロイド法
                    answer++;
                }
            }
        }
        System.out.println(answer);
        
        sc.close();
    }
}
