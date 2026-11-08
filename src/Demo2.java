import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static void main(String args[])
    {


        List<Integer> list =  new ArrayList<>();

        int sum=0;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        for(int i=0;i<list.size();i++)
        {
           sum= list.get(i);
            System.out.print(sum+" ");
        }










    }
}
