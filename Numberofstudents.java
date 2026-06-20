public class Numberofstudents {
    public int countStudents(int[] students, int[] sandwiches){
            int zero = 0;
            int one = 0;

            for(int student : students){
                if(student == 0){
                    zero++;
            }
            else{
                one++;
            }
    }
    for(int sandwich : sandwiches){
        if(sandwich == 0){
            if(zero == 0){
                return one;

            }
            zero--;
        }
        else{
            if(one == 0){
                return zero;
            }
            one--;
        }
    }
    return 0;
}
public static void main(String[] args){
    Numberofstudents solution = new Numberofstudents();
    int[] students = {1, 1, 0, 0};
    int[] sandwiches = {0, 1, 0, 1};
    int remainingStudents = solution.countStudents(students, sandwiches);
    System.out.println("The number of students unable to eat is: " + remainingStudents);
}
}
