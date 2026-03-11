public class Verwaltung {
  BinarySearchTree<Boss> name = new BinarySearchTree<>();
  BinarySearchTree<Boss> leben = new BinarySearchTree<>();
  BinarySearchTree<Boss> schaden = new BinarySearchTree<>();
  BinarySearchTree<Boss> stance = new BinarySearchTree<>();
  BinarySearchTree<Boss> runen = new BinarySearchTree<>();
  Boss margit = new Boss("Margit, the Fell Omen", 4174, 250.5, 80, 12000);
  Boss godrick = new Boss("Godrick the Grafted", 6080, 320, 120, 20000);
  Boss radahn = new Boss("General Radahn", 9572, 450.0, 200, 70000);
  Boss test1 = new Boss("Test1", 100, 700.0, 120, 100000000);
  Boss malenia = new Boss("Malenia, Blade of Miquella", 18000, 520, 120, 480000);
  Boss maliketh = new Boss("Maliketh, the Black Blade", 10620, 600, 150, 220000);
  Boss radagon = new Boss("Radagon of the Golden Order", 13339, 550, 160, 500000);
  public void vorbereitung() {
    
    
    name.insert(maliketh);
    name.insert(godrick);
    name.insert(radagon);
    name.insert(margit);
    name.insert(malenia);
    name.insert(radahn);
    name.insert(test1);
    
    leben.insert(radahn);
    leben.insert(godrick);
    leben.insert(maliketh);
    leben.insert(margit);
    leben.insert(test1);
    leben.insert(radagon);
    leben.insert(malenia);
    
    schaden.insert(malenia);
    schaden.insert(godrick);
    schaden.insert(radagon);
    schaden.insert(margit);
    schaden.insert(radahn);
    schaden.insert(maliketh);
    schaden.insert(test1);
    
    stance.insert(maliketh);
    stance.insert(godrick);
    stance.insert(radagon);
    stance.insert(margit);
    stance.insert(malenia);
    stance.insert(radahn);
    stance.insert(test1);
    
    runen.insert(maliketh);
    runen.insert(godrick);
    runen.insert(malenia);
    runen.insert(margit);
    runen.insert(radahn);
    runen.insert(radagon);
    runen.insert(test1);
  }

  public Boss sucheboss(){
    
    return test1;
    
    
  }
}