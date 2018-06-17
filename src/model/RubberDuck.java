package model;

public class RubberDuck extends Duck {  
	  
    
    public RubberDuck() {  
        super();  
        // TODO Auto-generated constructor stub  
        mFlyBehavior = new FlyNoWays();  
        mQuackBehavior = new Squeak();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("I'm a rubber duck");  
    }  
  
}  