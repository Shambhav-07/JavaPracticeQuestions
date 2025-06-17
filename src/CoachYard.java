//A railway coach yard is used to temporarily rearrange coaches before forming a train. Due to space and track design, coaches can only enter and leave from one end — this works like a stack (LIFO).
//
//        Your task is to simulate this yard system with the following conditions:
//
//        The yard can hold a maximum of 5 coaches at any time.
//
//        When a passenger express train is being formed, priority coaches (like AC First Class) must be added first.
//
//        You should not allow two identical coach IDs in the stack (i.e., no duplicates).
//
//        If the current top coach is a freight coach (F###), you must not add a passenger coach (P###) on top of it.
//
//        Implement the following operations:
//
//        push(coachID) → adds the coach after checking rules
//
//        pop() → removes the top coach
//
//        peek() → shows the top coach
//
//        isFull(), isEmpty() → standard checks
//
//        display() → show stack from top to bottom
public class CoachYard {
    private final int Max=5;
    private String [] stack = new String[Max];
    private int top =-1;

    public boolean isFull(){
        return top == Max-1;
    }
    public boolean isEmpty(){
        return top ==-1;
    }

    public boolean contains(String coachID){
        for (int i = 0; i <= top ; i++) {
            if(stack[i].equals(coachID)){
                return true;
            }

        }
        return false;
    }
    public void push(String coachID) {
        if (isFull()) {
            System.out.println("Cannot add " + coachID + "Yard is full");
            return;
        }
        if (contains(coachID)) {
            System.out.println("Cannot add " + coachID + "Duplicate coach ID");
            return;
        }

        if (top >= 0 && stack[top].charAt(0) == 'F' && coachID.charAt(0) == 'P') {
            System.out.println("Cannot add " + coachID + "Passenger coach cannot be on top of freight coach");
            return;
        }
        stack[++top] = coachID;
        System.out.println("Coach added: " + coachID);
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Cannot remove → Yard is empty");
        } else {
            System.out.println("Coach removed: " + stack[top]);
            top--;
        }
    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Yard is empty");
        } else {
            System.out.println("Top coach: " + stack[top]);
        }
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Yard is empty");
            return;
        }
        System.out.println("Coaches from top to bottom:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        CoachYard yard = new CoachYard();

        yard.push("A001");
        yard.push("P101");
        yard.push("F301");
        yard.display();
        yard.push("P202");
        yard.display();
        yard.push("F401");
        yard.push("A001");
        yard.display();

        yard.peek();
        yard.display();

        yard.pop();
        yard.display();
    }
}