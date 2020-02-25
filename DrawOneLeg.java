class DrawOneLeg {
  public static void main(String[] args) {
    draw(5);
    /*
     * FORMÅL: 
     * loops (for og while) samt parametrisere printf
     * dvs at System.out.printf("%14s%n","#") bliver til
     * format = "%" + variabel + "s%n";
     * myChar = "*"
     * System.out.printf(format,myChar);
     * 
     *
     * OPGAVEN:
     * tegn fire bogstavsben vha metoden draw hvor højden er parameter.
     *
     * TESTKØRSEL:
     * drawx(5) giver flg. figur

      A
       A
        A
         A
          A
      A
       A 
        A  
         A   
          A    
      A
       A 
        A  
         A   
          A    
      A
       A 
        A  
         A   
          A    

*/

  }
  public static void draw(int height) {
    String format = "";
    String sign = "A";
    String space  = "";

    for(int i=1;i<=height;i++) {
      format = String.format("%%%ds%n",i);
      System.out.printf(format,sign);
    }
    for(int i=1;i<=height;i++) {
      System.out.printf("%s%s%s%n",space,sign,space);
      space += " ";
    }

    int counter=0;
    space  = "";

    do{
      counter++;
      System.out.printf("%s%s%s%n",space,sign,space);
      space += " ";
    } while (counter<height);

    counter=0;
    space  = "";
    while (counter<height) {
      counter++;
      System.out.printf("%s%s%s%n",space,sign,space);
      space += " ";
    }
  }
}
