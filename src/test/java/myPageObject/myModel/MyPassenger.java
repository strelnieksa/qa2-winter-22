package myPageObject.myModel;

import org.apache.commons.lang3.RandomStringUtils;

public class MyPassenger {
    private String firstName;
    private String lastName;

    public MyPassenger(String firstName, String lastName) {
        if(firstName.equals("random")){
            this.firstName = RandomStringUtils.randomAlphabetic(10);
        }else{this.firstName = firstName;}
//        this.firstName = firstName.equals("random") ? RandomStringUtils.randomAlphabetic(10) : firstName;
//                        |-------- expression--------|------------------true------------------|---false----


        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}

