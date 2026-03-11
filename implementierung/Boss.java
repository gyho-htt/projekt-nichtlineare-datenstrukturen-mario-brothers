public class Boss implements ComparableContent<Boss>{
  Verwaltung ja = new Verwaltung();
  private String name;
  private int leben;
  private double schaden;
  private int stance;
  private int runen;
    
  public Boss(String pName, int pLeben, double pSchaden, int pStance, int pRunen){
    this.name = pName;
    this.leben = pLeben;
    this.schaden = pSchaden;
    this.stance = pStance;
    this.runen = pRunen; 
  }
  
  public String getName() {                                                                     
    return name;
  }

  public int getLeben() {
    return leben;
  }

  public double getSchaden() {
    return schaden;
  }

  public int getStance() {
    return stance;
  }

  public int getRunen() {
    return runen;
  }
 
  public boolean isEqual(Boss zwischenspeicher);
  public boolean isLess(Boss zwischenspeicher);
  public boolean isGreater(Boss zwischenspeicher);
}
