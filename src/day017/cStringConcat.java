package day017;

public class cStringConcat {
    public static void main(String[] args) {

        String fName="Alkan";
        String lName="Tuncer";

        System.out.println(fName.concat("JUGKING"));
        System.out.println(fName.concat(" "+"JUGKING"));
        System.out.println(fName.concat(" "+"JUGKING")+" "+lName);
        System.out.println(fName.concat(lName));
        System.out.println(fName.concat(" ").concat(lName));
        System.out.println(fName.concat(" ").concat("'JUGKING'").concat(" ").concat(lName).toUpperCase());

    }
}
