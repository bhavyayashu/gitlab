public class demo {
    public static void main(String[] args) {
        int choice = 4;

        switch (choice){
            case 1:
                System.out.println("Monday: Ah the i need cofee day...");
                break;
            case 2:
                System.out.println("Tuesday: still not friday, but we are getting there!..");
                break;
            case 3:
                System.out.println("Wednesday: hump day, halfway to the weekend..!");
                break;
            case 4:
                System.out.println("Thurday: Almost friday! hold the celabration.. for now..!");
                break;
            case 5:
                System.out.println("Friday: prty time..! or yoi know sleep time..!");
                break;
            case 6:
                System.out.println("Saturday: universal day : do northing day"); 
                break;
            case 7:
                System.out.println("Sunday: panic day..tomorrow monday again..!");
                break;
            default:
            System.out.println("error: you enterd a day that doesn't exists");
        }
    }
}