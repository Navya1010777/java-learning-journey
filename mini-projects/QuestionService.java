import java.util.*;

class QuestionService {

    List<Question> questionBank = new ArrayList<>();
    public QuestionService() {

        questionBank.add(new Question(1, "Which of the following is a programming language?", 0, "Python", "Spring", "Operating system", "None of these"));

        questionBank.add(new Question(2, 
        "Which component is responsible for executing Java bytecode?", 0, 
        "JVM", "JDK", "JRE", "JIT"
        ));

        questionBank.add(new Question(3, 
            "What is the default value of a local variable in Java?", 3, 
            "0", "null", "false", "Not initialized / Compilation error"
        ));

        questionBank.add(new Question(4, 
            "Which keyword is used to prevent a class from being subclassed?", 2, 
            "static", "abstract", "final", "private"
        ));

        questionBank.add(new Question(5, 
            "Which data type is used to store fractional numbers in Java?", 1, 
            "int", "double", "boolean", "char"
        ));

        
    }

    public int playQuiz() {
        int TotalScore = 0;
        Scanner scanner = new Scanner(System.in);
        int selectedAnswer = -1;
        for(Question q : questionBank) {
            selectedAnswer = -1;
            System.out.println("Question no: " + q.getId());

            //print question
            System.out.println(q.getQuestion());

            //print options
            int i = 1;
            for(String option : q.getOptions()) {
                System.out.println(i++ + ". " + option);
            }

            //Continue asking for valid answer
            boolean validInput = false;
            do  {
                System.out.print("Enter your option: ");
                try {
                    selectedAnswer = scanner.nextInt();
                    if (selectedAnswer >= 1 && selectedAnswer <= 4) {
                        validInput = true; 
                    } else {
                        System.out.println("Please enter valid option number");
                    }
                }
                catch(Exception e) {
                    System.out.println("Please enter the option number");
                    scanner.next();
                }
            } while(!validInput);

            selectedAnswer--;

            if (selectedAnswer == q.getCorrectAnswer())
                TotalScore++;
            
            
            System.out.println("--------------------------------------------------");
        }

        return TotalScore;
    }
    
}