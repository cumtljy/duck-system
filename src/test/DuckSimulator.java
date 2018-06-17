package test;


import model.Duck;
import model.FlyRocketPowered;
import model.MallardDuck;
import model.RedHeadDuck;
import model.RubberDuck;


public class DuckSimulator {
	public static void main(String[] args) {  
        Duck mallard = new MallardDuck();  
        mallard.performFly();  
        mallard.performQuack();  
        mallard.display();  
          
        Duck redhead = new RedHeadDuck();  
        redhead.performFly();  
        redhead.performQuack();  
        redhead.display();
        redhead.setmFlyBehavior(new FlyRocketPowered());  
        redhead.performFly();;  
        redhead.performQuack();  
        redhead.display();  
          
        Duck rubber = new RubberDuck();  
        rubber.performFly();;  
        rubber.performQuack();  
        rubber.display();  
        //动态地改变鸭子的行为  
       
    }  
  
	}

