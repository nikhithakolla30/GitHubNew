import java.util.ArrayList;
import java.util.List;

public class StringArray {
    public static void main(String [] args){
        List<String>myList = new ArrayList<String>();

        myList.add("Fremont");
        myList.add("Dublin");
        myList.add("Cleveland");
        myList.add("Cincinnati");

        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
