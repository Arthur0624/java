
public  class javaTest{
    public static void main(String[] args) {
        Circle circle = new Circle(10);//创建circle对象,对radius进行初始化
        System.out.println("圆的面积为："+circle.radiusArea());//打印半径为10的圆的面积
        square s = new square(10.0,5.0);//创建s对象，对squareLong,squareWide初始化
        System.out.println("长方形的面积为"+s.squareArea());//打印长方形的面积
        System.out.println("长方形的周长为："+s.squarePerimeter());//打印长方形的周长
        Student student = new Student("憨憨",18,100);//创建student对象，对name ，age，mathScore初始化
        //打印学生数据
        System.out.println("学生："+student.name+"，年龄"+student.age+"，数学成绩为："+student.getMathScore());

    }
}

class Circle {
    private double radius;
    final  static double PI = 3.14;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius){//Circle一个参数的有参构造器
        this.radius = radius;
    }

    //计算圆的面积
    public double radiusArea(){
        return radius*radius*PI;
    }
}

class square{//创建一个方类
    private double squareLong;//长方形长
    private double squareWide;//长方形宽

    public double getSquareLong() {
        return squareLong;
    }

    public void setSquareLong(double squareLong) {
        this.squareLong = squareLong;
    }

    public double getSquareWide() {
        return squareWide;
    }

    public void setSquareWide(double squareWide) {
        this.squareWide = squareWide;
    }

    public square(double squareLong, double squareWide) {//square传入两个参数的有参构造器
        this.squareLong = squareLong;
        this.squareWide = squareWide;
    }
    public double squareArea(){//计算长方形面积
        return squareLong*squareWide;
    }
    public  double squarePerimeter(){//计算长方形的周长
        return 2*squareLong*squareWide;
    }


}

class Student{
    public String name;
    public int age;
    private double mathScore;

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public Student(String name, int age, double mathScore) {//创建三个参数的有参构造器
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
    }

}