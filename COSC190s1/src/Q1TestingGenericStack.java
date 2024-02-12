public class Q1TestingGenericStack {

    public static void main(String[] args) {
        Q1GenericStack<String> genericStack = new Q1GenericStack<>();

        genericStack.push("Bryce");
        genericStack.push("Coralee");
        genericStack.push("Ron");
        genericStack.push("Michael");
        genericStack.push("Rick");
        genericStack.push("Jason");

        System.out.printf("The names longer than 4 characters: %s\n",
                genericStack.fetchMatching(x -> x.length() <= 4)
        );
        // expected output
        // The names longer than 4 characters: [Ron, Rick]

        System.out.println(genericStack.convert(x -> x + " has a short Name", x -> x.length() < 5));
        // expected output
        // [Ron has a short Name, Rick has a short Name]


        Q1GenericStack<Integer> genericStackI = new Q1GenericStack<>();
        genericStackI.push(10);
        genericStackI.push(200);
        genericStackI.push(30);
        genericStackI.push(40);
        genericStackI.push(500);

        System.out.printf("The integers with digits more than 2: %s\n",
                genericStackI.fetchMatching(x -> x.toString().length() > 2)
        );
        // expected output
        // The integers with digits more than 2 is [200, 500]

        System.out.println(genericStackI.convert(x -> x*2, x -> x > 99));
        // expected output
        // [400, 1000]

    }
}
