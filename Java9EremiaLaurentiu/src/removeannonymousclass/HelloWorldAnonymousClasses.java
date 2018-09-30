/*
 * Removing anonymous code
 */
package removeannonymousclass;

/**
 *
 * @author Laurentiu
 */
public class HelloWorldAnonymousClasses {
    // Inner interface HelloWorld

    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);
    }
    // Method sayHello prints

    public void sayHello() {

        // Local class EnglishGreetings implemented in the method sayHello()
        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        } // end of EnglishGreeting local class 

        // Local class FrenchGreetings implemented in the method sayHello()
        class FrenchGreeting implements HelloWorld {

            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        } // end of FrenchGreeting local class 
     

        // Local class SpanishGreetings implemented in the method sayHello()
        class SpanishGreeting implements HelloWorld {

            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        } // end of SpanishGreeting local class
       
        //Creating Instances
        HelloWorld spanishGreeting = new SpanishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld englishGreeting = new EnglishGreeting();

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    // main method

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}

