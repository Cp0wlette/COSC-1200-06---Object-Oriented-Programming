import java.util.Scanner; //this is how you import, must be used for "scanner" functions
    //class name must match file  name
    class Main {
        //main program begins here
        public static void main(String[] args) {
            System.out.println("Java Programming");
            String height;
            String weight;
            String BMI;
            boolean numeric = true;
            Scanner Input = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);//"new" keyword must be used to define new stored thing
            System.out.println("Enter your height:");
            height = Input.next();
            System.out.println("Enter your weight:");
            weight = Input.next();
            //BMI = weight % height * height;\\
            try {
                int num = int.parseint(height);
            }catch (NumberFormatException e) {
                numeric = false;
            }
            if (height <= 0.6 || height >= 2.44) {
                System.out.println("height must be greater than 23 kg, less than 180 kg inclusive. you entered:" + height);
            }
            if (weight <= 23 || weight >= 180) {
                 System.out.println("weight must be greater than 23 kg, less than 180 kg inclusive. you entered:" + weight);
              }
           //System.out.println("The BMI for a " + height + "meters tall person who weighs " + weight + " kilograms is " + BMI); \\

            else {
                System.out.println("ERROR: Value entered is not numeric. Have a nice day" );
            }
            scanner.close();
        }
    }

