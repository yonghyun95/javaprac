package Solution;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List mehtod1(int a, int b, int c){
        ArrayList<Integer> list = new ArrayList<>();

        if (a == b){
            for(int i = 0; i <= c; i++){
                list.add(i);
            }
            return list;
        }
        return list;    // question! if문 안에 있는 조건이 거짓일때 작동!
    }
}
