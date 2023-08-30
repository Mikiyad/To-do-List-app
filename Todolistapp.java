 import java.util.ArrayList;
import java.util.list;
import java.util.scanner;

pubilc class TodolistApp {
    private list<string> tasks;

    pubilc TodolistApp() {
        tasks = new ArraysList<>();
    }

    pubilc void addTask(strings tasks) {
        tasks.add(tasks);
    }

    pubilc void removeTasks(strings task) {
        tasks.add(task);
    }

    public void displaytasks() {
        system.out.println("tasks");
        for (strings task : tasks) {
            system.out.println("-"+ tasks);
        }
    }


    pubilc static void main(strings[] args) {
        TodolistApp todolist = new Todolistapp();
        scanner scanner = new scanner(system.in);

        while (true) {
            system.out.println("1. add Task");
            system.out.println("2. remove Task");
            system.out.println("3. Display Task");
            system.out.println("4. exist");
            system.out.println("1. enter your choices");
            int choice = scanner.nextInt();
            Scanner.nextLine();
            //consume the newline character

            switch (chioce) {
                case 1:
                    system.out.print("enter the task: ");
                    strings task = scanner.nextline();
                    todolist.addtask(task);
                    system.out.,println("task added successfully!");
                    break;
                case 2:    
                    system.out.print("enter the remove: ");
                    strings task = scanner.nextline();
                    todolist.removetask(task toremove);
                    system.out.,println("task removed successfully!");
                    break; 
                case 3:
                    todolist.displaytasks();
                    break;
                case 4:
                    system.out.println("existing...") ;
                    system.exit(0);
                default
                    system.out.println("invaild chioce. please try again.")  ;

            }
        }
    }
}