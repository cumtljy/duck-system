package model;

public class MallardDuck extends Duck {  
    
    
    /** 
     * 申明我是一只用翅膀飞并会嘎嘎叫的鸭子 
     */  
    public MallardDuck() {  
        super();  
        mFlyBehavior = new FlyWithWings();  
        mQuackBehavior = new Quack();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("I'm a real Mallard duck");  
    }  
  
}  