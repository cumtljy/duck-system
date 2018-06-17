package model;

public abstract class Duck {  
    public Duck() {  
        super();  
        // TODO Auto-generated constructor stub  
    }  
     FlyBehavior mFlyBehavior; //has A 组合行为  
     QuackBehavior mQuackBehavior; //has A 组合行为  
    public void swim(){  
        System.out.println("All ducks float!");  
    }  
    public abstract void display();  
    public   void performFly(){  
        mFlyBehavior.fly(); //委托给行为类处理  
    }  
    public   void performQuack(){  
        mQuackBehavior.quack(); //委托给行为类处理  
    }  
    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {  
        this.mFlyBehavior = mFlyBehavior;  
    }  
    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {  
        this.mQuackBehavior = mQuackBehavior;  
    }  
          
      
  
}  