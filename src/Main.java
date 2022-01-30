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
        int opMenu;
        ArrayList<Task> listTask = new ArrayList<>();
        do
        {
            System.out.println("What option do you want to input?");
            opMenu = scan.nextInt();
            switch(opMenu)
            {

                case 1-> addTask(listTask);
                case 2-> dropByName(listTask);
                case 3-> showAllTask(listTask);
                case 4-> System.out.println("Exiting program...");
            }
        }
        while(opMenu != 4);
    }

    private static void addTask(ArrayList<Task> listTask) {

        String nameTask = addTaskName();
        String descriptionTask = addTaskDescription();
        Task task = new Task(nameTask,descriptionTask);
        boolean isTaskAdded = listTask.add(task);
        if(isTaskAdded)
            System.out.println("The task was added successfully");
        else
            System.out.println("Task already exist");
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
        System.out.println("Write the name of the task to be deleted");
        Scanner scan = new Scanner(System.in);
        String nameTask = scan.nextLine();
        ListIterator<Task> listItTask = listTask.listIterator();
        while(listItTask.hasNext())
        {
            Task task = listItTask.next();
            if(task.getName().equals(nameTask))
            {
                listItTask.remove();
                System.out.println("Task removed successfully");
            }
        }

    }

    private static void showAllTask(ArrayList<Task> listTask) {
       /* ListIterator<Task> listItTask = listTask.listIterator();
        while(listItTask.hasNext())
        {
            Task taskShow = listItTask.next();
            System.out.println("The name of the task is: "+ taskShow.getName()+" and his description is: "+taskShow.getDescription());
        } OLDForm*/
        for(Task taskShow : listTask)
        {
            System.out.println("The name of the task is: "+ taskShow.getName()+" and his description is: "+taskShow.getDescription());
        }
    }

}


/*Using while loop
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
* */
