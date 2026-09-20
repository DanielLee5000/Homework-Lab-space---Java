 /*Daniel Lee, CS1A, 3/3/2025, Dr.Harden, Project 2
 * Initial file comment:
 * The user selects the number of problems per set, specifies the maximum operand value,  
 * and solves randomly generated addition, subtraction, and multiplication problems.  
 * After completing all sets, the program provides a performance report.  
 *  
 * The Method Descriptions shows below:  
 * - getProbsPerSet(): Prompts the user for the number of problems per set.  
 * - getMaxNum(): Asks the user to specify the maximum operand value for the problems.  
 * - doOneSet(char Symbol, int problemAmount): Conducts a set of math problems for a given operation.  
 * - doOneProblem(char Symbol, int MaxNum): Generates a problem, takes user input, and checks correctness.  
 * - generateOperands(int MaxNum): Produces a random operand within the specified range.  
 * - calculateCorrectAnswer(char operate, int numA, int numB): Computes the correct result for the given operation.  
 * - checkAnswer(int userInput, int correctAnswer): Compares user input with the correct answer.  
 * - printHeader(char symbol): Displays a formatted header for each set of problems.  
 * - printReport(int stageOneResult, int stageTwoResult, int stageThreeResult, int ProblemsInEachStage):  
 *   Summarizes the user's performance and displays scores for each set.  
 */

 import java.util.Random;
 import java.util.Scanner;

 public class MathTutor{
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random(1);

    public static int getProbsPerSet(){     
        System.out.print("Enter problems per set: ");
        return input.nextInt();
    }

    public static int doOneSet(char Symbol, int problemAmount){
        int MaxNum;
        int correctProblemAmount = 0;

        printHeader(Symbol);
        MaxNum = getMaxNum();

        for(int i = 0; i < problemAmount; i++){
            if(doOneProblem(Symbol, MaxNum))
                correctProblemAmount++;
        }
        
        return correctProblemAmount;
        }

        public static void printHeader(char symbol){
            int stage = 0;
            switch(symbol){
                case '+':
                    stage = 1;
                    break;
                case '-':
                    stage = 2;
                    break;
                case '*':
                    stage = 3;
                    break;
            }

            System.out.println("Set #" + stage);
            System.out.println("----------");
        }

        public static int getMaxNum(){
            System.out.print("What is the maximum number for this set? ");
            int MaxNum = input.nextInt();
            return MaxNum;
        }
    
        public static boolean doOneProblem(char Symbol, int MaxNum){
            int numOne =  generateOperands(MaxNum);
            int numSecond =  generateOperands(MaxNum);

            int correctAnswer = calculateCorrectAnswer(Symbol, numOne, numSecond);

            System.out.print( numOne + " " + Symbol + " " + numSecond + " = ");
            
            int userInput = input.nextInt();
            if(checkAnswer(userInput, correctAnswer)){
                System.out.println("Correct!");}
                else{
                    System.out.println("Incorrect.");
                }

            return checkAnswer(userInput, correctAnswer);
        }
        
            public static int generateOperands(int MaxNum){
                return rand.nextInt(MaxNum + 1);
            }

            public static int calculateCorrectAnswer(char operate, int numA, int numB){
                switch(operate){
                    case '+':
                        return numA + numB;
                    case '-':
                        return numA - numB;
                    case '*':
                        return numA * numB;
                }
                return -1;
            }

            public static boolean checkAnswer(int userInput, int correctAnswer){
                if (userInput == correctAnswer) {
                    return true;
                }else{
                    return false;
                }
            }
    
    public static void printReport(int stageOneResult, int stageTwoResult, int stageThreeResult, int ProblemsInEachStage){
        System.out.print("Set #1: You got " + stageOneResult + " correct out of " + ProblemsInEachStage + " for ");
        System.out.printf("%.1f", (double)stageOneResult / ProblemsInEachStage * 100);
        System.out.println("%.");

        System.out.print("Set #2: You got " + stageTwoResult + " correct out of " + ProblemsInEachStage + " for ");
        System.out.printf("%.1f", (double)stageTwoResult / ProblemsInEachStage * 100);
        System.out.println("%.");

        System.out.print("Set #3: You got " + stageThreeResult + " correct out of " + ProblemsInEachStage + " for ");
        System.out.printf("%.1f", (double)stageThreeResult / ProblemsInEachStage * 100);
        System.out.println("%.");

        System.out.print("Overall you got " + (stageOneResult + stageTwoResult + stageThreeResult) + " correct out of " + (ProblemsInEachStage * 3) + " for ");
        System.out.printf("%.1f", (double)(stageOneResult + stageTwoResult + stageThreeResult) / (ProblemsInEachStage * 3) * 100);
        System.out.println("%.");
    }

    public static void main(String[] args) {
        int probsPerSet;
        int plus_correctProblemsAmount;
        int minus_correctProblemsAmount;
        int times_correctProblemsAmount;
     
        probsPerSet = getProbsPerSet();
        plus_correctProblemsAmount = doOneSet('+', probsPerSet);
        minus_correctProblemsAmount = doOneSet('-', probsPerSet);
        times_correctProblemsAmount = doOneSet('*', probsPerSet);
        printReport(plus_correctProblemsAmount, minus_correctProblemsAmount, times_correctProblemsAmount, probsPerSet);
    }
 }