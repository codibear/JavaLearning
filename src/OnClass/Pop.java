package OnClass;

import java.util.Arrays;

/**
 * Created by 29185 on 2017/5/23.
 */
public class Pop {
    public static void main(String [] args){
        int [] num = {8,6,2,4,3,9,5,7,1};
        for(int i = 0;i<num.length;i++){
            for(int j = 0;j<num.length-i-1;j++){
                int temp = 0;
                if(num[j]<num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
