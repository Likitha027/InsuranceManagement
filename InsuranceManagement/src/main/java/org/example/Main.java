package org.example;

public class Main {
    public static void main(String[] args) {

        PolicyHolder P = new PolicyHolder();
        P.setFirstName("Charan");
        P.setLastname("V");
        P.setAge(30);
        P.setGender("Male");
        P.setPassword("Ih579");
        P.setEmailId("Charan@gmail.com");
        P.setOccupation("Software Engineer");
        P.setCity("Mandya");
        P.setState("Karnataka");
        P.setPincode(578931);

        BankDetails B = new BankDetails();
        B.setAccountNum(467821324);
        B.setAccountType("Savings");
        B.setPolicyNum(7894579);
        B.setInsuranceType("Health Insurance");
        B.setBankName("Union Bank Of India");
        B.setBankBranch("Vijaynagar,Mysore");

        System.out.println("FirstName:" + P.getFirstName());
        System.out.println("Lastname:" + P.getLastname());
        System.out.println("Age:" + P.getAge());
        System.out.println("Gender:" + P.getGender());
        System.out.println("Password:" + P.getPassword());
        System.out.println("EmailId:" + P.getEmailId());
        System.out.println("Occupation:" + P.getOccupation());
        System.out.println("City:" + P.getCity());
        System.out.println("State:" + P.getState());
        System.out.println("Pincode:" + P.getPincode());
        System.out.println(" ");
        System.out.println("Policy Holder PolicyNum:" + B.getPolicyNum());
        System.out.println("Policy Holder Insurance Type:" + B.getInsuranceType());
        System.out.println("Policy Holder Bank AccountNum:" + B.getAccountNum());
        System.out.println("Policy Holder Bank AccountType:" + B.getAccountType());
        System.out.println("Policy Holder Bank Name:" + B.getBankName());
        System.out.println("Policy Holder Bank Branch:" + B.getBankBranch());


    }
}