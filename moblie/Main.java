package moblie;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

/**
 * Created by RajathBharadwaj on 7/6/2017.
 */
public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8095552163");



    public static void main(String [] args) {

    boolean quit = false;
    startPhone();
    printActions();
    while (!quit) {
        System.out.println("\n Enter action: (6 available actions)");
        int action = s.nextInt();
        s.nextLine();


        switch (action) {
            case 0:
                System.out.println("\n Shutting down...");
                quit = true;
                break;


            case 1:
                mobilePhone.printContacts();
                break;



            case 2:
                addnewContact();
                break;


            case 3:
                updateContact();
                break;

            case 4:
                removeContact();
                break;


            case 5:
                queryContact();
                break;


            case 6:
                printActions();
                break;
        }


    }




    }


    private static void addnewContact() {
        System.out.println("Enter Contact name: ");
        String name = s.nextLine();
        System.out.println("Enter Phone number");
        String phone = s.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added Name: " + name + " phone: " + phone);
        }else {
            System.out.println("Cannot add contact " +name + " already in contacts" );
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
            
        }

        System.out.println("Enter new Contact name: ");
        String newName = s.nextLine();
        System.out.println("Enter new Contact phone number: ");
        String newNumber = s.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating record");
        }

    }


    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;

        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }


    }


    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;

        }

        System.out.println("Name: " +existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }


    }





    private static void startPhone() {
        System.out.println("Phone's Starting...");
    }

    private static void printActions() {
        System.out.println("\n Available actions : \n press");
        System.out.println("0 - to shutdown \n" +
                           "1 - to print Contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to query if a contact exists\n" +
                           "6 - to print list of available actions");


        System.out.println("Choose Your option");
    }

}





