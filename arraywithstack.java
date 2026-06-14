import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class arraywithstack {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int left = 0, right = target.length -1;
        while(left <right){
        int temp = target[left];
        target[left] = target[right];
        target[right] = temp;

        left++;
        right--;  
        }
        for(int num : target){
            stack.push(num);
        }

        for(int i = 1; i <= n; i++){
            if(!stack.isEmpty()){
            if(stack.peek() == i){
                ans.add("Push");
                stack.pop();
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            } else {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        arraywithstack obj = new arraywithstack();
        int[] target = {1, 3};
        int n = 3;
        List<String> result = obj.buildArray(target, n);
        System.out.println(result);
    }
}
