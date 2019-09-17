class DrawBox {
  public static void main(String[] args) {
    drawBox(5,10);
    /*
     * FORMÅL: 
     * for-loops samt parametrisere printf
     * dvs at System.out.printf("%14s%n","#") bliver til
     * format = "%" + variabel + "s%n";
     * myChar = "*"
     * System.out.printf(format,myChar);
     * 
     *
     * OPGAVEN:
     * tegn en firkant vha  metoden drawBox hvor højde og bredde 
     * angives som parametre. 
     *
     * TESTKØRSEL:
     * drawBox(5,10);
     * tegn en firkant vha  metoden drawBox hvor højde og bredde 
     * angives som  parametre. 
     *
     * TESTKØRSEL:
     * drawBox(5,10) giver flg. figur

        **********
        *        *
        *        *
        *        *
        *        *
        **********

*/

  }
  public static void drawBox(int height, int width) {
    String format = "";
    String myEmpty = " ";
    writeChars('*',width);
    // TODO: skriv for-loop hvor hver iteration tegner en linje
    // og hvor antallet af loops begrænses af height samt at
    // width indgår i formateringen af printf.
    for (int i = 1; i< height;i++) {
      format = "*%"+(width - 2)+"s*%n"; 
      System.out.printf(format,myEmpty);
    }
    writeChars('*',width);

  }
  public static void writeChars(char myChar, int frequency) {
    //TODO: skriv for-loopet der printer myChar 
    for(int i=1;i<=frequency;i++) {
      System.out.print(myChar);
    }
    System.out.println();
  }
}