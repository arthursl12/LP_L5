class MyInt {
    int i;
    MyInt(int k) {
        i = k;
    }
    
    void swap1(MyInt j){
        MyInt tmp = j;
        j = new MyInt(i);
        i = tmp.i;
    }
        
    void swap2(MyInt j){
        MyInt tmp = j;
        j.i = i;
        i = tmp.i;
    }
    
    void swap3(int j) {
        int tmp = j;
        j = i;
        i = tmp;
        
    }
}

public class Main{
    public static void main(String[] args){
        MyInt m1 = new MyInt(3);
        MyInt m2 = new MyInt(4);
        System.out.printf("Swap %d\n",1);
        System.out.printf("Antes:\t m1.i=%d, m2.i=%d\n", m1.i, m2.i);
        m1.swap1(m2);
        System.out.printf("Depois:\t m1.i=%d, m2.i=%d\n", m1.i, m2.i);
        
        m1 = new MyInt(3);
        m2 = new MyInt(4);
        System.out.printf("Swap %d\n",2);
        System.out.printf("Antes:\t m1.i=%d, m2.i=%d\n", m1.i, m2.i);
        m1.swap2(m2);
        System.out.printf("Depois:\t m1.i=%d, m2.i=%d\n", m1.i, m2.i);
        
                
        m1 = new MyInt(3);
        m2 = new MyInt(4);
        System.out.printf("Swap %d\n",3);
        System.out.printf("Antes:\t m1.i=%d, m2.i=%d\n", m1.i, m2.i);
        m1.swap3(m2.i);
        System.out.printf("Depois:\t m1.i=%d, m2.i=%d\n", m1.i, m2.i);
    }
}