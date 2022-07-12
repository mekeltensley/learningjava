import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        input.nextDouble();

//        int  [] numbers = {2, 0, 1};
//        String [] names = {"Ali", "Maria"};

//        int [] numbers = new int[3];
//        numbers[0] = 0;
//        numbers[1] = 1;
//        numbers[2] = 2;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(names));

//        double studentGPA = 3.45;
//        String studentFirstName = "Kayla";
//        String studentLastName = "Harley";
//
//        System.out.println(studentFirstName + " " +
//                studentLastName + " has a GPA of " + studentGPA);
//        System.out.println("What do you want to update it to?");
//
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//        System.out.println(studentFirstName + " " +
//                studentLastName + " now has a GPA of " + studentGPA);
            String question = "What is cookie monster's favorite snack?";
            String choiceOne = "cookies";
            String choiceTwo = "chocolate cookies ";
            String choiceThree = "walnuts";

            String correctAnswer = choiceTwo;

            System.out.println(question);

            System.out.println("Choose one of the following: " +
                    choiceOne + ", " + choiceTwo +  ", or " + choiceThree);

            Scanner scanner = new Scanner(System.in);

            String input = scanner.next();

            if (correctAnswer.equals(input)) {
                System.out.println("Congrats! That's the correct answer");
            } else {
                System.out.println("You are incorrect. The correct answer is: "
                        + correctAnswer);
            }

        }
    }


