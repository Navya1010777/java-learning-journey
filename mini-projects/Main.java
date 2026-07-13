public class Main {

    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();

        System.out.println("-----------------Welcome to Quiz mania------------------\n");

        System.out.println("\nYour total Score: " + questionService.playQuiz());
    }
    
}
