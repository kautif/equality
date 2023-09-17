public class equality {
    static String mathFunction (Integer num1, Integer num2, Integer num3) {
        String operators = "";
        Boolean isAdded = false;
        Boolean isMultiplied = false;
        Boolean isDivided = false;
        Boolean isSubtracted = false; 

        if (num1 + num2 == num3) {
            // This if statement is used 4 times
                // Ideally, I would've liked to make a method out of it instead, but I was having issues with nesting a method
                    // So, that's why you see it repeating, but I know that its not ideal.

            // I did not do unit testing
                // I understand it's considered best practice to do them. With the time that I currently have available, 
                // I'm not able to complete it at this time. But, given the time and opportunities, I'd be willing to try to learn how to do it
                // Although I did not do unit testing, I did spot check the outputs of my code based on the examples that were provided in the assignment
            if (operators.length() > 0) {
                operators += "+";
            } else {
                operators = "+";
            }
            isAdded = true;
        }

        if (num1 * num2 == num3) {
            if (operators.length() > 0) {
                operators += "*";
            } else {
                operators = "*";
            }
            isMultiplied = true;
        }

        if (num1 / num2 == num3) {
            if (operators.length() > 0) {
                operators += "/";
            } else {
                operators = "/";
            }
            isDivided = true;
        }

        if (num1 - num2 == num3) {
            if (operators.length() > 0) {
                operators += "-";
            } else {
                operators = "-";
            }
            isSubtracted = true;
        }

        if (isAdded == false && 
            isMultiplied == false && 
            isDivided == false && 
            isSubtracted == false) {
            operators = "None";
        }
        System.out.println(operators);
        return operators;
    }
    public static void main(String[] args) {
        System.out.println("Hello :-)");
        mathFunction(1, 2, 3);
        mathFunction(2, 2, 4);
        mathFunction(3, -3, -9);
        mathFunction(1, 2, -1);
        mathFunction(3, 3, 1);
        mathFunction(7, 1, 11);
    }
}