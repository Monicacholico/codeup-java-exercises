package Interface_demo;

public class Developer extends Employee implements WritesCode, Meetable{
    public Developer (String name, String department){
        super(name, department);
    }

    @Override
    public String work(){
        return "Think, think, think, code, code, code";
    }

    public boolean debug(){
        int randomNumber = (int) Math.floor(Math.random() * 2);
        return randomNumber == 0 ? false : true;
    }

    public void drinkCoffee(){
        System.out.println("zoomg, I love coffee");
    }

    public void searchForAnswer(){
        System.out.println("Seraching StacOverflow and the documentations for answers");
    }

    public void goToMeeting(){
        System.out.println("Crap, I forogt the meeting");
    }

}
