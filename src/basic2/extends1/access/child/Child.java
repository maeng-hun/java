package basic2.extends1.access.child;

import basic2.extends1.access.parrent.Parrent;

public class Child extends Parrent {

    public void call() {
        publicValue =1;
        protectedValue = 2;
        //defaultValue 다른 패키지 접근 불가, 컴파일 오류
        //private도 당연히 불가

        publicMethod();
        protectedMethod();
        //defaultMethod(); 다른 패키지 접근 불가

        printParent();
    }

}
