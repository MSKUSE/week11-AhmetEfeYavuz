
public class Main {
    public static void main(String[] args) throws MyEmptyStackException{

        Stack stack = new StackLinkedList();
        try {
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}