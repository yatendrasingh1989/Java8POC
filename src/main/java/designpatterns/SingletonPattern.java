package designpatterns;

import java.io.Serializable;
import java.util.Objects;

public class SingletonPattern implements Serializable, Cloneable {

    private SingletonPattern(){
        System.out.println("Object created successfully");
    }


    private static SingletonPattern obj;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return obj;
    }

    public static SingletonPattern getSinglePatternInstance(){
        if(Objects.isNull(obj)){
            synchronized (SingletonPattern.class){
                if(Objects.isNull(obj)){
                    obj= new SingletonPattern();
                }
                System.out.println("Object returned - Double Checking.");
            }
            System.out.println("Object returned.");
        }
        return obj;
    }


}
