import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String args[])
    {

        List<Integer> ls = new ArrayList<Integer>();

        ls.add(4);
        ls.add(5);
        ls.add(0);
        ls.add(9);
        ls.add(8);
        ls.add(10);

        int sum=0;
        int avrg=0;
        int count=0;
        int agg=0;

        for(int i=0;i<ls.size();i++)
        {
            sum=sum+ls.get(i);

             agg =sum;


            count=count+1;

            avrg=sum/count;


            System.out.print(ls.get(i)+"  ");
        }

        System.out.println( );

        System.out.println("Count of the array - "+ count);
        System.out.println("sum - "+sum);
        System.out.println("agg - "+ agg);
        System.out.println("Average - "+ avrg);



    }



}
