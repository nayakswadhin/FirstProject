public class Dog extends Animal {
  private boolean bites;  
  
  public Dog(boolean bites) {
    this.bites = bites;
  }
  public Dog(String sound, String name, String colour, int age, int height, boolean bites) {
    super(sound, name, colour, age, height);
    this.bites = bites;
  }
  public boolean getBites(){
    return bites;
  }
  public void setBites(boolean bites){
    this.bites=bites;
  } 

  public int getAge(){
    return 4;
  }

  public String toString(){
    return "Properties dog is:\nSound "+super.getSound();
  }

}
