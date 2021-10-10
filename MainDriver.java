import java.util.*;

public class MainDriver{
   public static void main(String[] args){
      Scanner con = new Scanner(System.in);
      Queue kyu = new Queue();
      boolean repeat = true;

        do {
            System.out.println("Wash2Go Carwash");
            System.out.println("=====================================");
            System.out.println("1 - Add Car");
            System.out.println("2 - Finish washing");
            System.out.println("3 - Display cars in line");
            System.out.println("4 - Display car that is currently washed");
            System.out.println("5 - Display number of cars in line");
            System.out.println("q - Exit Program");

            System.out.print("\nEnter option: "); //the user inputs a character based on the options
            char opt = con.nextLine().charAt(0);

            switch (opt) {
                case '1':
                    // the user have to input the name of the car
                    System.out.print("\nName of Car: ");
                    String car = con.nextLine();
                    System.out.println("Car added to the queue!");
                    System.out.println("==========================================");
                    //calls the function enqueue() to store data into the queue
                    kyu.enqueue(car);
                    break;
                case '2':
                    //System.out.println("==========================================");
                    System.out.println("\nFinished washing "+ kyu.peekFront());
                    kyu.dequeue();//removes the first node
                    System.out.println("==========================================");
                    break;
                case '3':
                    System.out.println("==========================================");
                    System.out.println("Cars in line waiting to be washed:");
                    //calls the function to display all the cars in line
                    kyu.displayQueue();
                    break;
                case '4':
                    System.out.println("==========================================");
                    System.out.println("Car that is currently washed: " + kyu.peekFront() + "\n");//display the first
                    break;
                case '5':
                    System.out.println("==========================================");
                    System.out.println("Number of cars waiting in line: " + kyu.getLength() + "\n");//display the number of cars in queue
                    break;
                case 'q': case 'Q':
                    System.out.println("\nExiting the program...");//exits the program
                    repeat = false;
                    break;

                default:
                    System.out.println("==========================================");
                    System.out.println(" INVALID OPTION!!  "); // if the user inputs something other than the choices this is displayed
                    System.out.println("Please choose only on the options provided...");
                    System.out.println("==========================================");
                    break;

            }
            
        } while (repeat);
        con.close();
    }

   
   }


