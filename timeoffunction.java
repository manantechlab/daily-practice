import java.util.*;
class timeoffunction {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String log : logs){
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if(type.equals("start")){

                if(!stack.isEmpty()){
                    result[stack.peek()] += time - prevTime;
                }

                stack.push(id);
                prevTime = time;
        }
        else{
            result[stack.pop()] += time-prevTime + 1;

            prevTime = time + 1;
        }
    }
    return result;
}
public static void main(String[] args) {
    timeoffunction tof = new timeoffunction();
    List<String> logs = Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6");
    int n = 2;
    int[] result = tof.exclusiveTime(n, logs);
    System.out.println(Arrays.toString(result)); // Output: [3, 4]
}
}