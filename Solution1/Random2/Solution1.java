package Random2;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static List method1(int a, int b, int c){
        ArrayList<Integer> list = new ArrayList<>();

        if (a == b){
            for (int i = 0; i <= c; i++){
                list.add(i);
            }
            return list;
        }
        return list;

    }
}
