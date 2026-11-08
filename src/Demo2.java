import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static void main(String args[])
    {


        List<Integer> ls =  new ArrayList<>();

        int sum=0;

        ls.add(4);
        ls.add(5);
        ls.add(0);
        ls.add(9);
        ls.add(8);
        ls.add(10);



        for(int i=0;i<ls.size();i++)
        {
           if(ls.get(i)%2==0)
           {
               sum=sum+ls.get(i);
           }
        }

        System.out.println(sum);










    }
}
