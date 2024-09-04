import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class InsSortInt {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("randInts.txt"));
        int [] nums = new int [1000];
        int i = 0;
        while(scanner.hasNextInt()){
             nums[i++] = scanner.nextInt();
        }
        int[] sortArr=sorter(nums);
        System.out.print("Largest "+sortArr[0]+" Smallest "+sortArr[sortArr.length-1]);
    }
    public static int[] sorter(int[] numArr){
    int[] tempArr=numArr;
    for(int i=0;i<tempArr.length;i++){
        for(int j=i;j>0;j--){
            if(tempArr[j]>tempArr[j-1]){
                int temp=tempArr[j-1];
                tempArr[j-1]=tempArr[j];
                tempArr[j]=temp;
            }else if(tempArr[j]<tempArr[j-1]){
                continue;
            }
        }
    }
    return tempArr;
}
}
