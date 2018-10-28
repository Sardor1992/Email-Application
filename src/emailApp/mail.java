package emailApp;

import java.util.Scanner;

/**
 * Created by Sardor on 26.10.2018.
 */
public class mail {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity = 500;
    private String alernateMail;
    private String companySuffix = "company.com";

    // Constractor to receive the first and last name

    public mail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // call deparmetn method
        this.department = setDpartment();
        System.out.println("Department:" + this.department);

        // call random password method

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combaine to generate Email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department  + "."+ companySuffix;
    }

    // Ask for the department

    public String setDpartment() {
        System.out.println("Enter the department\n1 for Sale \n2 for Development\n3 for Accounting\n0 none");
        Scanner scan = new Scanner(System.in);
        int depcahoice = scan.nextInt();
        if (depcahoice == 1) {
            return "sales";
        } else if (depcahoice == 2) {
            return "dev";
        } else if (depcahoice == 3) {
            return "acct";
        } else return "";
    }




    // Generate rasndom password

        public String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
            }

            return new String(password);
        }

    //Set the mail box capacity

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;

    }

    // Set the alternate email

    public void setAlernateMail(String altMail){
        this.alernateMail = altMail;
    }

    // Change the password

    public void changePassword(String password){
        this.password = password;
    }


    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlernateMail() {
        return alernateMail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "Display name: " + firstName  + " " +
                lastName + "\n" + "Company email: "
                + email + "\n" + "Mailbox Capacity " +  mailBoxCapacity + "mb";
    }
}








