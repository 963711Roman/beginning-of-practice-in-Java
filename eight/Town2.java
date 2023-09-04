package com.Lyambda.eight;
//ВЛОЖЕНІ КЛАСИ
public class Town2 {
    private String postCode = "33333" ;
    public void createAddress (){
        final int houseNumber = 34;
                class Street {
                    public void printAddress(){
                        System.out.println("PostCode is" + postCode );
                        System.out.println("House Number is" + houseNumber);
                    }
                }
                // ВНЕ МЕТОДА КЛАС Street НЕДОСТУПЕН
                Street street = new Street();
                street.printAddress();
    }
    //МОЖНА ОБЯВИТИ ВЛОЖЕНИЙ КЛАС І В СТАТИЧНОМУ МЕТОДІ
    private static String postCode1 = "3333" ;
    public static void createAddress1 (){
        final int houseNumber1 = 34;
        class Street1 {
            public void printAddress1(){
                System.out.println("PostCode1 is" + postCode1 );
                System.out.println("House Number1 is" + houseNumber1);
            }
        }
        // ВНЕ МЕТОДА КЛАС Street НЕДОСТУПЕН
        Street1 street1 = new Street1();
        street1.printAddress1();
    }

    public static void main(String[] args) {
        Town2 town = new Town2();
        town.createAddress();
        Town2.createAddress1();
    }
}
