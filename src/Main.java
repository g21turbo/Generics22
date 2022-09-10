public class Main {

            //generics - enable types (classes and interface) to be  parameters when defining:
            //           classes, interfaces and methods
            //           a benefit is to eliminate the need to create multiple versions
            //           of methods or classes for various data types
            //           Use one version for all reference data types


    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"F", "G", "H", "I", "J"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);



    }

    public static void displayArray(Integer[] array){
        for (Integer x : array){
            System.out.println(x+ " ");
        }
        System.out.println();
    }

    public static void displayArray(Double[] array){
        for (Double x : array){
            System.out.println(x+ " ");
        }
        System.out.println();
    }

    public static void displayArray(Character[] array){
        for (Character x : array){
            System.out.println(x+ " ");
        }
        System.out.println();
    }

    public static void displayArray(String[] array){
        for (String x : array){
            System.out.println(x+ " ");
        }
        System.out.println();
    }


}
