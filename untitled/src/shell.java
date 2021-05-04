import java.util.Random;
import java.util.Scanner;

public class shell {
    private static void ShellSort(int[] list){
        int n= list.length;
        for(int i= n/2; i>0; i=i/2) {
            if ((i % 2) == 0)
                i++;

                for (int j = 0; j < i; j++) {
                    shellinsert(list, j, n-1, i);
                }
        }
    }

    private static void shellinsert(int list[],int a ,int b, int c){
        int temp,j;
        for(int i=a+c;i<=b;i=i+c){
            temp=list[i];
            for(j=i-c;j>=a&&list[j]>temp;j=j-c){
                list[j+c]=list[j];
            }
            list[j+c]=temp;
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

        ShellSort(A);

        for(int i=0; i<A.length; i++){
            System.out.println("쉘 정렬 후:" +A[i]);
        }
        long afterTime=System.currentTimeMillis();
        long DiffTime=(afterTime-beforeTime)/1000;
        System.out.println("시간차이: "+DiffTime);
    }
}