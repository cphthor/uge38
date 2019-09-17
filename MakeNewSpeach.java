import java.util.Scanner;

public class MakeNewSpeach {
  public static void main(String[] args) {
    /*
     * FORMÅL: At læse og forstå et program så man kan ændre i det
     *
     * OPGAVEN: copy/paste programmet og tilføj nu to pladsholdere i templaten så din tale ud over 
     * erindringsstedet også rummer en begivenhed og en følelse
     * Resten af programmet skal så udvides så de to nye pladsholdere bliver udskiftet på samme måde
     * som erindringsstedet
     *
     */

    String speachTemplate = "Vi har kendt hinanden siden TEMPPLACE. Jeg husker tydeligt ...\n"; 
    String erindringsSted = userSpeachInput("erindringssted");
    String mySpeach = speachComposer(speachTemplate,erindringsSted);
    System.out.print(mySpeach);
  }
  public static String speachComposer(String speachTemplate, String erindringsSted) {
    String myString = speachTemplate.replaceAll("TEMPPLACE",erindringsSted);
    return myString;
  }
  public static String userSpeachInput(String typeOfQuestion) {
    Scanner input = new Scanner(System.in);
    String ditValg;
    System.out.println("Hvad er dit " + typeOfQuestion);
    ditValg = input.nextLine();
    return ditValg;
  }
}
