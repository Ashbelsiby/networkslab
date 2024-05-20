import java.util.*;
class shape{
public double getarea()
{return 0;
}}
class rectangle extends shape
{
public double getarea(double x,double y)
{
return x*y;
}}
class abcde
{
public static void main(String[] args)
{
rectangle r = new rectangle();
double area= r.getarea(10.2,8.3);
System.out.println("Area= "+area);
}
}
