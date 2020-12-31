package _13OverrideCloneJudiciously;

import _11AlwaysOverrideHashCodeWhenYouOverideEquals.PhoneNumber;

public class main13 {
    public static void main(String[] args) {
        PhoneNumber phone0 = new PhoneNumber(123,123,1234);
        PhoneNumber phone1 = phone0.clone();
        if(phone0.equals(phone1))
            System.out.println("equal");
    }
}
