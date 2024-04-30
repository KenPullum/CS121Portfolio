public class Dog {
    private String name;
    private String breed;
    private int weight;
    private int age;

    public Dog(){
    }
    public Dog(String dogName){
        this.name = dogName;
    }
    public Dog(String dogName, String dogBreed, int dogWeight, int dogAge){
        this.name = dogName;
        this.breed = dogBreed;
        this.weight = dogWeight;
        this.age = dogAge;
    }

    public String getName(){return name;}
    public String getBreed(){return breed;}
    public int getWeight(){return weight;}
    public void setWeight(int newWeight){
        weight=weight+newWeight;
    }
    public void setWeight(int newWeight, int age){
        if (age<10){
            weight = weight+newWeight+5;
        }
        else{
            weight = weight+newWeight;
        }
    }
    public int getAge(){return age;}

}
