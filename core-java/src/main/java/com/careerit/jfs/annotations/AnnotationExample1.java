package com.careerit.jfs.annotations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
@NoArgsConstructor
class Address {
    private String city;
    private String state;
    private String street;
    private String zip;

}
public class AnnotationExample1 {

    public static void main(String[] args) {
        Address address = new Address("Hyderabad", "TS", "Ameerpet", "500016");
        System.out.println(address);

        int num = 100;

        System.out.println("End of main method");
    }



    public void printAddress(Address address){
        System.out.println(address);
    }
}
