public class Animal {
   private String sound;
   private String name;
   private String colour;
   private int age;
   private int height;
   Animal(){
      
   }
   
   public Animal(String sound, String name, String colour, int age, int height) {
      this.sound = sound;
      this.name = name;
      this.colour = colour;
      this.age = age;
      this.height = height;
   }
   public String getSound(){
    return sound;
   }
   public void setSound(String sound){
    this.sound= sound;
   }
   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name= name;
   }
   public String getColour(){
    return colour;
   }
   public void setColour(String colour){
    this.colour= colour;
   }
   public int getAge(){
    return 6;
   }
   public void setAge(int age){
    this.age= age;
   }
   public int getHeight(){
    return height;
   }
   public void setHeight(int height){
    this.height= height;
   }
}
