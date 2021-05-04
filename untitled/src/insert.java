import java.util.Random;
import java.util.Scanner;

public class insert {
    public static void InsertSort(int[] list){
        int temp;

        for(int i=1; i<list.length; i++) {
            for (int j = i-1; j>=0; j--) {
                if (list[j]>list[i]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    i=j;
                }
            }
        }
    }
    public static int[] Randomnum(int n){
        int[] array=new int[n];
        Random rd=new Random();

        for(int i=0;i< array.length;i++){
            array[i]=rd.nextInt(100000);
        }return array;
    }

    public static void main(String []args){
        long beforeTime= System.currentTimeMillis();

        Scanner sc=new Scanner(System.in);
        System.out.println("배열의 크기: ");
        int N=sc.nextInt();

        System.out.println("배열값은 랜덤으로 생성: ");
        int[] A=Randomnum(N);

        InsertSort(A);

        for(int i=0; i<A.length; i++){
            System.out.println("삽입 정렬 후:" +A[i]);
        }
        long afterTime=System.currentTimeMillis();
        long DiffTime=(afterTime-beforeTime)/1000;
        System.out.println("시간차이: "+DiffTime);
    }
}