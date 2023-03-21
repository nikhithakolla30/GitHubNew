import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
