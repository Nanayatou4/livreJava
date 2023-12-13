public class Livre {
  private String titre ; 
  private String auteur ;
  private int nbPages;
  private double prix;
 public Livre(String unAuteur , String unTitre ) {
   auteur = unAuteur;
   titre = unTitre;
  }
  
 public Livre() {
   this.auteur = auteur;
   this.titre = titre;
   this.nbPages = nbPages;
  }
  
 public Livre(String unAuteur , String unTitre , int nbPages) {
    auteur = unAuteur;
   titre = unTitre;
   this.nbPages = nbPages;
  }
  
 public Livre(double prixLivre) {
   prix = prixLivre;
  }
  
 public String getAuteur() {
    return auteur;

   }
   
  public String getTitre() {
    return titre;
    }
    
  public int getNbPages() {
     return nbPages;
    }
   
  public double getPrix(){
    return prix;
   }
   
  public void setPrix(double p ) {
     boolean prixFixe;
     int nbr=0;
    prixFixe = false;
     if (prixFixe){
       System.out.println("Prix non fixe");
      }
     else {
      prix = p;
      }
    do{
      nbr++; 
      }while(prix == p);
    if(nbr > 1 && prix != p) {
      System.out.println("Prix bloque!!!");
   } 
   }
   
  public void setAuteur(String newAuteur) {
      auteur = newAuteur;
    }
    
  public void setTitre(String newTitle) {
     titre = newTitle;
   }
   
 public void setNbPages(int n){
   if (n > 0){
     nbPages = n;
    }
    else {
   System.out.println("Ce nombre de pages n'existe pas!!");
   }
  }
  
 public String afficheToi() {
  return "Ce livre "+titre+" a "+nbPages+" pages et est ecrit par "+auteur;
  }
  
 public String toString() {
   // return afficheToi();
   if(prix == 0){
     setPrix(prix);
    }
    return "Prix pas encore fixe";
    
  }
  
//public static void main(String[] args) {
}
  
