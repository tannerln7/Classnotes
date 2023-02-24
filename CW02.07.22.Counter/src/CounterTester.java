public class CounterTester {
    public static void main(String[] args){
        Counter C1 = new Counter();
        System.out.println(C1.display()); //output starting value (0)
        C1.increment(); //increment +1
        C1.increment(); //increment +1
        System.out.println(C1.display()); //output new value (2)
        System.out.println("looping");
        while (C1.display() < 10) {
            C1.increment(); //increment until C1 = 10
            System.out.println(C1.display()); //output new value (10)
        }
        C1.reset(); // reset to 0
        System.out.println("reset");
        System.out.println(C1.display()); //display reset value (0)
        Counter C2 = new Counter(10); //create new counter starting at 10
        System.out.println("C2 " + C2.display()); //display starting value (10)
        C2.increment(10); //increment by 10
        System.out.println("C2 " + C2.display()); //display new value (20)
    }
}
