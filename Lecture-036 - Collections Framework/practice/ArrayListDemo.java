
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(9);
        list.add(1, 5);
        list.set(1, 6);
        list.addFirst(10);

        list.remove(3);
        
        System.out.println(list);

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1, "Himanshu"));
         list2.add(new Student(2, "Mayank"));

         System.out.println(list2);


         ListIterator<Student> listIterator = list2.listIterator();
         while (listIterator.hasNext()){
            System.out.println(listIterator.next());
         }


    }
}
