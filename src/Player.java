//Dan Chovanes
//Code provided by Robert Lafore

class Player {

    int number,age,weight;
    String fName,lName,college,position,height,years;

    public Player (String first, String last, int num, String pos, String h, int lbs, int a, String yrs, String school) {
        fName = first;
        lName = last;
        number = num;
        position = pos;
        height = h;
        weight = lbs;
        age = a;
        years = yrs;
        college = school;
    }

    public void displayPlayer() {
        System.out.println(fName + " " + lName + ". Age: " + age);
        System.out.println("Height: " + height + " | Weight: " + weight);
        System.out.println("Number: " + number + " | Position: " + position + " | Years active: " + years);
        System.out.println("Graduated from: " + college);
    }

    public int getNumber() {return number;}
    public int getAge() {return age;}
    public int getWeight() {return weight;}
    public String getYears() {return years;}
    public String getHeight() {return height;}
    public String getfName() {return fName;}
    public String getlName() {return lName;}
    public String getCollege() {return college;}
    public String getPosition() {return position;}

}
