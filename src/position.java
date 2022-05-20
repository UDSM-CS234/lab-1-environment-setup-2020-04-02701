public class position {

        double a;
        double t;
        double Vi;
        double Xi;
        // acceleration = a , time = t , inintial velocity = Vi , initial position = Xi

        void  position( double a ,double t ,double Vi ,double Xi ){
            System.out.println("the final position is " +  0.5*a*t*t + Vi*t + Xi);
        }
    }

    class position1{
        public static void main(String[] args){
            position object1 = new position();
            object1.position(-9.81, 10 , 0, 0);
        }
    }



