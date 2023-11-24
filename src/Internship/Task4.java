package Internship;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class QuizQuestion {
    String question;
    String[] options;
    char correctOption;

    public QuizQuestion(String question, String[] options, char correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class Task4 {
    private static int score = 0;
    private static int currentQuestionIndex = 0;
    private static Timer timer;
    private static boolean isAnswerSubmitted = false;

    private static QuizQuestion[] questions = {
        new QuizQuestion("What is the largest state in India by area?", new String[]{"A. Maharashtra", "B. Rajasthan", "C. Uttar Pradesh", "D. Madhya Pradesh"}, 'B'),
        new QuizQuestion("Which river is known as the 'Ganga of the South' in India?", new String[]{"A. Godavari", "B. Yamuna", "C. Narmada", "D. Kaveri"}, 'A'),
        new QuizQuestion("Who was the first Prime Minister of India?", new String[]{"A. Jawaharlal Nehru", "B. Mahatma Gandhi", "C. Indira Gandhi", "D. Rajendra Prasad"}, 'A')
    };

    public static void main(String[] args) {
        startQuiz();
    }

    private static void startQuiz() {
        if (currentQuestionIndex < questions.length) {
            QuizQuestion currentQuestion = questions[currentQuestionIndex];
            displayQuestion(currentQuestion);

            // Set up timer for 20 seconds
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!isAnswerSubmitted) {
                        System.out.println("\nTime's up! Moving to the next question.");
                        nextQuestion();
                    }
                }
            }, 20000);

            // Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            // Check user's answer
            checkAnswer(userAnswer.toUpperCase().charAt(0), currentQuestion.correctOption);
        } else {
            endQuiz();
        }
    }

    private static void displayQuestion(QuizQuestion question) {
        System.out.println(question.question);
        for (String option : question.options) {
            System.out.println(option);
        }
    }

    private static void checkAnswer(char userAnswer, char correctOption) {
        isAnswerSubmitted = true;
        timer.cancel(); // Stop the timer

        if (userAnswer == correctOption) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is: " + correctOption);
        }

        // Move to the next question
        nextQuestion();
    }

    private static void nextQuestion() {
        currentQuestionIndex++;
        isAnswerSubmitted = false;
        startQuiz();
    }

    private static void endQuiz() {
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);
    }
}
