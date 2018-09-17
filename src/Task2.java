import static java.lang.Math.*;
public class Task2 {
    private double y;
   private double exercise9(double x)
   {
       y=1.1*pow(E,-x)+abs(cos(sqrt(PI*x)))-(1/8);
       return y;
   }
    private double exercise10(double x)
    {
        y=(1./3)*sqrt(abs(sin(x)))*pow(pow(E,0.12*x),(1/3));
        return y;
    }
    private double exercise11(double x)
    {
        y=2.0*PI*x-abs(sin(sqrt(10.5*x)))*(1/(pow(pow(x,2),(1/3)))+(1.7));
        return y;
    }
    private double exercise12(double x)
    {
        y=log(sqrt(abs(2.0-x))+1.2)*(1/(2+pow(E,-x)))+pow((2/x),(1/3));
        return y;
    }
    private double exercise13(double x)
    {
        y=pow(pow(E,-2+x),1/5)*(1/(sqrt(pow(x,2)+pow(x,4)+log(abs(x-3.14)))));
        return y;
    }
    private double exercise14(double x)
    {
        y=(sqrt(pow(sin(x/2),3))+pow(pow(E,1.3*x)+pow(E,-1.3*x),1/3))*(1/abs(x+(5/2)));
        return y;
    }
    private double exercise15(double x)
    {
        y=(abs(x*log(x)-4)*sqrt(x))*(1/pow(pow(E,4*x-1),1.5));
        return y;
    }
    private double exercise16(double x)
    {
        y=pow(pow(E,2*x)*sqrt(x)-(x+(1./3)/x),1/3)*abs(cos(2.5*x));
        return y;
    }
    private double exercise17(double x)
    {
        y=(pow(x,3)/3)-pow(E,x)*log(abs(pow(1.3,3)+pow(x,3)))+(4/3);
        return y;
    }
    private double exercise18(double x)
    {
        y=(abs(7.2-10*x)/pow(pow(x,2)+pow(E,x),1/3))*atan(4*(x/3)/sqrt(pow(1.1,3)+pow(x,2)));
        return y;
    }
    private double exercise19(double x)
    {
        y=acos(tan((5.0*x)/PI))+pow(x,3.2)/28.0;
        return y;
    }
    private double exercise20(double x)
    {
        y=(pow(pow(log(x),2),1/3)+tan(cos(PI*x)))*abs(log(x/10.5)+(1/3));
        return y;
    }
    private double exercise21(double x)
    {
        y=(pow(log(x),1/4)+acos(x+3))*(1/abs(x+2*pow(x,2)));
        return y;
    }
    private double exercise22(double x)
    {
        y=asin(log10(x)/(pow(x,2)+5*x+1))-(pow(x,3.2)/28);
        return y;
    }
    private double exercise23(double x)
    {
        y=acos(tan(5*x/PI))+(pow(x,5.7)/23);
        return y;
    }
    private double exercise24(double x)
    {
        y=atan(abs(8.3-21*pow(x,2)-0.8*x)/pow(2.5+(1/pow(x,2)),1/3));
        return y;
    }
    private double exercise26(double x)
    {
        y=log(abs(sin(x)))+2*pow(E,x)+2*cos(abs(x))+2;
        return y;
    }
    public static void main(String[] args) {
       Task2 task2=new Task2();
        System.out.println(task2.exercise9(56.9));
        System.out.println(task2.exercise10(67.2));
        System.out.println(task2.exercise11(21.9));
        System.out.println(task2.exercise12(18.45));
        System.out.println(task2.exercise13(-67.66));
        System.out.println(task2.exercise14(-12.1));
        System.out.println(task2.exercise15(6.90));
        System.out.println(task2.exercise16(134.21));
        System.out.println(task2.exercise17(98.02));
        System.out.println(task2.exercise18(12.498));
        System.out.println(task2.exercise19(0.08));
        System.out.println(task2.exercise20(23.4));
        System.out.println(task2.exercise21(-2.34));
        System.out.println(task2.exercise22(34.5));
        System.out.println(task2.exercise23(0.03));
        System.out.println(task2.exercise24(5.87));
        System.out.println(task2.exercise26(1.678));
    }
}
