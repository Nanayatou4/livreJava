public class TestLivre {
  public static void main(String[] args) {
  Livre book = new Livre("Victor Hugo","les miserables",234);
    System.out.println("l'auteur du premier livre est : "+book.getAuteur());
    book.setNbPages(234);
    System.out.println("Ce livre a "+book.getNbPages()+" pages");
  Livre book2 = new Livre("Balzac","Pere Goriot",412);
    System.out.println("l'auteur du deuxieme livre est : "+book2.getAuteur());
    book2.setNbPages(412);
    System.out.println("Ce livre a "+book2.getNbPages()+" pages");
  int totalBook ;
    totalBook = book.getNbPages() + book2.getNbPages();
    System.out.println("Le nombre de pages total de ces deux livres est "+totalBook+" pages");
    
    
   Livre bookOne = new Livre();
    bookOne.setNbPages(300);
    System.out.println("Ce livre a "+bookOne.getNbPages()+" pages");
   Livre bookTwo = new Livre("Seydou Bodian","Sous l'orage");
    bookTwo.setNbPages(300);
   Livre bookThree = new Livre("Mariama Ba","Une si longue lettre",300);
    bookThree.setNbPages(300);
    
     Livre book3 = new Livre(1000.6);
    book3.setPrix(1000.6);
    System.out.println("le prix du livre est "+book3.getPrix());
   }
}
