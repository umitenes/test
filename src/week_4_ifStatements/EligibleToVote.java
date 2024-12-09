package week_4_ifStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";
        boolean isEligible = age >= 21 && citizen == "USA"; //True

        System.out.println(isEligible + " You're an American citizen");

        //  Logical operators  &&,||, !

        if (age>=21 && citizen=="USA") {
            System.out.println("You're an American citizen");
        }else {
            System.out.println("You're not American citizen");
        }








        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible){ // !True ==> not true==> false
            System.out.println("Not Eligible");
        }


    }

}
