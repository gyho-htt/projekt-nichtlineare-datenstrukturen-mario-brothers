public class schaden implements Boss<schaden>{
  public boolean isEqual(Boss zwischenspeicher){
    if (this.getschaden() > 100) {
       return true;
    } // end of if
    }
  public boolean isLess(Boss zwischenspeicher){
    return false;
    }
  public boolean isGreater(Boss zwischenspeicher){
      return false;
    }
  }