import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1- Add task");
        System.out.println("2- Drop task by name");
        System.out.println("3- Show all Task");
        System.out.println("4- Exit");
        Scanner scan = new Scanner(System.in);
        int opMenu = 0;
        ArrayList<Task> listTask = new ArrayList<>();
        while(opMenu != 4)
        {
            opMenu = scan.nextInt();
            switch(opMenu)
            {

                case 1-> addTask(listTask);
                case 2-> dropByName(listTask);
                case 3-> showAllTask();
            }
        }
    }

    private static void addTask(ArrayList<Task> listTask) {

        Scanner scan = new Scanner(System.in);
        String nameTask = addTaskName();
        String descriptionTask = addTaskDescription();
        Task task = new Task(nameTask,descriptionTask);
        listTask.add(task);
    }

    private static String addTaskName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert name of task");
        return scan.nextLine();
    }

    private static String addTaskDescription() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert description of task");
        return scan.nextLine();
    }
//--------------------------------------------------------
    private static void dropByName(ArrayList<Task> listTask)
    {
        Scanner scan = new Scanner(System.in);
        String nameTask = scan.nextLine();
        int getIndex = 0;
        ListIterator<Task> listItTask = listTask.listIterator();
        while(listItTask.hasNext())
        {
            Task task = listItTask.next();
            if(task.getName().equals(nameTask))
            {
                listItTask.remove();
            }
        }

    }

    private static void showAllTask() {
    }

}
