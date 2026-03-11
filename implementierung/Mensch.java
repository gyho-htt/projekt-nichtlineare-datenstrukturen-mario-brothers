public class Mensch implements ComparableContent<Mensch>{
    private String name;
    private double groesse;
    
    public Mensch(String pName, double pGroesse){
        this.name = pName;
        this.groesse = pGroesse;
    }
     public String gibName(){
       return this.name;
       }
    public double getGroesse(){
        return this.groesse;
    }
  public boolean isEqual(Mensch zwischenspeicher){
    if (this.getGroesse() == zwischenspeicher.getGroesse()) {
       return true;
    }
    else {
       return false;
    } 
    }
  public boolean isLess(Mensch zwischenspeicher){
    if (this.getGroesse() < zwischenspeicher.getGroesse()) {
       return true;
    }
    else {
       return false;
    }
    }
    public boolean isGreater(Mensch zwischenspeicher){
    if (this.getGroesse() > zwischenspeicher.getGroesse()) {
       return true;
    }
    else {
       return false;
    }
      }
}
