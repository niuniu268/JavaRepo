import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loop: while (true){
            System.out.println("1. input student info \n 2. delete student info \n3. revise student info \n 4. look up student info\n 5. exit \n");
            System.out.println(" please input your choice: ");

            Scanner scanner = new Scanner(System.in);
            ArrayList<Students> list = new ArrayList<>();
            Students student = new Students();
            student.setId(scanner.next());
            student.setName(scanner.next());
            student.setAge(scanner.nextInt());
            student.setAddress(scanner.next());

            switch (scanner.next()) {
                case "1" -> {
                    add(list, student);
                }
                case "2" -> {
                    remove(list, student);
                }
                case "3" -> {
                    revise(list,student);
                }
                case  "4" -> {
                    query(list,student);
                }
                case "5" -> {
                    break loop;
                }
            }
        }

    }

    public static ArrayList<Students> add(ArrayList<Students> list, Students student) {
        for (int i = 0; i < list.size(); i++) {
            Students member = list.get(i);
            if (student.getId().equals(member.getId())) {
                System.out.println("id is wrong");
                break;
            }
        }
        Boolean result = list.add(student);

        return list;
    }

    public static ArrayList<Students> remove(ArrayList<Students> list, Students student) {
        for (int i = 0; i < list.size(); i++) {
            Students member = list.get(i);
            if (student.getId().equals(member.getId())) {
                member = null;

            }

        }
        return list;

    }

    public static void query(ArrayList<Students> list){
        if (list.size()==0) {
            System.out.println("database is empty");
            return;

        }else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("student id "+ list.get(i).getId()+ "student name" + list.get(i).getName() + list.get(i).getAge()+list.get(i).getAddress());
            return;
            }
        }

    }

    public static void revise(ArrayList<Students> list, Students student){

    }

}