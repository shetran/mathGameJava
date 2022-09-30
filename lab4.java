import java.util.Scanner;
import java.util.Random; 

public class lab4 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int correctAnswer = 0;
        int studentAnswer; 
        int numCorrect = 0;
        char operatorSwitch = '?';
        int feedback;
        int cont = 0;

        
    //USER INPUT 
    while (cont == 0){
        System.out.println("Enter either the level (1-2): ");
        int level = input.nextInt();

        while (level < 1 || level > 2){
            System.out.println("Invalid number, please try again");
            level = input.nextInt();
        } 

        System.out.println("Enter a problem type (1-5): ");
        int problemType = input.nextInt();

        while (problemType < 1 || problemType > 5){
            System.out.println("Invalid number, please try again");
            problemType = input.nextInt();
        } 

        //Levels 
        for (int i = 1; i <= 10; i++){

            //FEEDBACK
            String[] positive={"You are correct!","Correct answer.","Nice."};
            String[] negative={"Get better.","ur ass","You're stupid"};

            //RANDOM NUMBER GENERATOR 
            switch(level) {
                case 1:
                    num1 = random.nextInt(10);
                    num2 = random.nextInt(10);
                    break;
                case 2:
                    num1 = random.nextInt(100);
                    num2 = random.nextInt(100);
                    break;
            }
            //PROBLEM TYPES 
            switch(problemType) {
                //ADDITION
                case 1:
                    if (level == 1){
                        correctAnswer = num1 + num2; 
                        System.out.println(num1 + "+" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                            System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                        
                    }
                    else if(level == 2){
                        correctAnswer = num1 + num2;
                        System.out.println(num1 + "+" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                            System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                        
                    } break;

                //SUBTRACTION 
                case 2:
                    if(level == 1){
                        if(num1<num2){
                            while(num1<num2){
                                num1 = random.nextInt(10);
                            }
                        }
                        correctAnswer = num1 - num2;
                        System.out.println(num1 + "-" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                            System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                        
                    }
                    else if(level == 2){
                        if(num1<num2){
                            while(num1<num2){
                                num1 = random.nextInt(100);
                            }
                        }
                        correctAnswer = num1 - num2;
                        System.out.println(num1 + "-" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                            System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                        
                    } 
                    break;

                //MULTIPLICATION
                case 3:
                    if(level == 1){
                        correctAnswer = num1 * num2;
                        System.out.println(num1 + "*" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                            System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                    }
                    else if(level == 2){
                        correctAnswer = num1 * num2;
                        System.out.println(num1 + "*" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                            System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                    }
                        break;

                //DIVISION
                case 4:
                    if(level == 1){
                        if(num1<num2 || num2 == 0){
                            while(num1<num2 || num2 == 0){
                                num1 = random.nextInt(10);
                                num2 = random.nextInt(10);
                            }
                        }
                        correctAnswer = num1 / num2;
                        System.out.println(num1 + "/" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                                System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                    }
                    else if(level == 2){
                        if(num1<num2 || num2 == 0){
                            while(num1<num2 || num2 == 0){
                                num1 = random.nextInt(100);
                                num2 = random.nextInt(100);
                            }
                        }
                        correctAnswer = num1 / num2;
                        System.out.println(num1 + "/" + num2 + "=");
                        studentAnswer = input.nextInt();
                        if (studentAnswer == correctAnswer){
                            numCorrect++;
                            feedback = random.nextInt(3);
                                System.out.println(positive[feedback]);
                        } else{
                            feedback = random.nextInt(3);
                            System.out.println(negative[feedback]);
                        }
                        
                    }
                break;

                //RANDOM OPERATORS
                case 5:
                    Random operatorC = new Random();
                    int operator = operatorC.nextInt(4);
                    if(level == 1){
                        switch(operator) {
                            //ADDITION
                            case 0: operatorSwitch = '+';
                                correctAnswer = num1 + num2;
                                System.out.println(num1 + "+" + num2 + "=");
                                studentAnswer = input.nextInt();
                                if (studentAnswer == correctAnswer){
                                    numCorrect++;
                                    feedback = random.nextInt(3);
                                    System.out.println(positive[feedback]);
                                } else{
                                    feedback = random.nextInt(3);
                                    System.out.println(negative[feedback]);
                                }
                            break;
                            //SUBTRACTION
                            case 1: operatorSwitch = '-';
                                if(num1<num2){
                                    while(num1<num2){
                                        num1 = random.nextInt(10);
                                    }
                                }
                                    correctAnswer = num1 - num2;
                                    System.out.println(num1 + "-" + num2 + "=");
                                    studentAnswer = input.nextInt();
                                    if (studentAnswer == correctAnswer){
                                        numCorrect++;
                                        feedback = random.nextInt(3);
                                        System.out.println(positive[feedback]);
                                    } else{
                                        feedback = random.nextInt(3);
                                        System.out.println(negative[feedback]);
                                    }
                            break;
                            
                            //MULTIPLICATION
                            case 2: operatorSwitch = '*';
                                correctAnswer = num1 * num2;
                                    System.out.println(num1 + "*" + num2 + "=");
                                    studentAnswer = input.nextInt();
                                    if (studentAnswer == correctAnswer){
                                        numCorrect++;
                                        feedback = random.nextInt(3);
                                        System.out.println(positive[feedback]);
                                    } else{
                                        feedback = random.nextInt(3);
                                        System.out.println(negative[feedback]);
                                    }
                            break;
                            
                            //DIVISION
                            case 3: operatorSwitch = '/';
                                if(num1<num2 || num2 == 0){
                                    while(num1<num2 || num2 == 0){
                                        num1 = random.nextInt(10);
                                        num2 = random.nextInt(10);
                                    }
                                }
                                    correctAnswer = num1 / num2;
                                        System.out.println(num1 + "/" + num2 + "=");
                                        studentAnswer = input.nextInt();
                                        if (studentAnswer == correctAnswer){
                                            numCorrect++;
                                            feedback = random.nextInt(3);
                                            System.out.println(positive[feedback]);
                                        } else{
                                            feedback = random.nextInt(3);
                                            System.out.println(negative[feedback]);
                                        }
                        }
                    }
                    else if(level == 2){
                        switch(operator) {
                            //ADDITION
                            case 0: operatorSwitch = '+';
                                correctAnswer = num1 + num2;
                                System.out.println(num1 + "+" + num2 + "=");
                                studentAnswer = input.nextInt();
                                if (studentAnswer == correctAnswer){
                                    numCorrect++;
                                    feedback = random.nextInt(3);
                                    System.out.println(positive[feedback]);
                                } else{
                                    feedback = random.nextInt(3);
                                    System.out.println(negative[feedback]);
                                }
                            break;
                            
                            //SUBTRACTION
                            case 1: operatorSwitch = '-';
                                if(num1<num2){
                                    while(num1<num2){
                                        num1 = random.nextInt(100);
                                    }
                                }
                                    correctAnswer = num1 - num2;
                                    System.out.println(num1 + "-" + num2 + "=");
                                    studentAnswer = input.nextInt();
                                    if (studentAnswer == correctAnswer){
                                        numCorrect++;
                                        feedback = random.nextInt(3);
                                        System.out.println(positive[feedback]);
                                    } else{
                                        feedback = random.nextInt(3);
                                        System.out.println(negative[feedback]);
                                    }
                            break;
                            
                            //MULTIPLICATION
                            case 2: operatorSwitch = '*';
                                correctAnswer = num1 * num2;
                                System.out.println(num1 + "*" + num2 + "=");
                                studentAnswer = input.nextInt();
                                if (studentAnswer == correctAnswer){
                                    numCorrect++;
                                    feedback = random.nextInt(3);
                                    System.out.println(positive[feedback]);
                                } else{
                                    feedback = random.nextInt(3);
                                    System.out.println(negative[feedback]);
                                }
                            break;
                            
                            //DIVISION
                            case 3: operatorSwitch = '/';
                                if(num1<num2 || num2 == 0){
                                    while(num1<num2 || num2 == 0){
                                        num1 = random.nextInt(100);
                                        num2 = random.nextInt(100);
                                        
                                    }
                                }
                                correctAnswer = num1 / num2;
                                System.out.println(num1 + "/" + num2 + "=");
                                studentAnswer = input.nextInt();
                                if (studentAnswer == correctAnswer){
                                    numCorrect++;
                                    feedback = random.nextInt(3);
                                    System.out.println(positive[feedback]);
                                } else{
                                    feedback = random.nextInt(3);
                                    System.out.println(negative[feedback]);
                                }
                            break;
                                
                    }
                    
                }
                
                }
                    
        }
        //PLAY AGAIN
        System.out.println("You got " + numCorrect + " correct!");
        numCorrect = 0;
        System.out.println("Do you want to play again? Type 0 for yes and 1 for no");
        cont = input.nextInt();
    }
        
        
    }

        
}
