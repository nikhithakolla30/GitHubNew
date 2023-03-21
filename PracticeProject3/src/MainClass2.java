import java.util.ArrayList;
import java.util.List;

public class MainClass2 {
    public static void main(String [] args){
        List<Integer>myList = new ArrayList<Integer>();

        myList.add(1);
        myList.add(4);
        myList.add(7);
        myList.add(9);

        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
