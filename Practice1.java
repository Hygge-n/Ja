/*
import java.util.Scanner;
public class Practice1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.next();
        char c=num.charAt(0);
        if (c=='1'){
            if (isNumber(num)){
                if (num.length()==11){
                    System.out.println("Yes");
                }
            }
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean isNumber(String num){
        char[] a=num.toCharArray();
        for (int i=0;i<a.length;i++){
            if (a[i]>'9' || a[i]<'0'){
                return false;
            }
        }
        return true;
    }
}
*/
/*
import java.util.Scanner;
public class Practice1{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] arr=new int[N];
        int[] brr=new int[N];
        int sum=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                sum+=arr[i];

            }
        }
    }
}
*/
/*
public class Practice1{
    public static void main(String[] args) {
        Emp e=new Emp(0521,"王晓宁");
        System.out.println(e.getinfor());
    }
}
class Emp{
    private int empno;
    private String ename;
    private double sal;
    private String dept;
    public Emp(){
        this.empno=0;
        this.ename=null;
        this.sal=0.0;
        this.dept=null;
    }
    public Emp(int empno){
        this.empno=empno;
        this.ename="兼职";
        this.sal=1200;
        this.dept="服务员";
    }
    public Emp(int empno,String ename){
        this.empno=empno;
        this.ename=ename;
        this.sal=1500;
        this.dept="管家";
    }
    public Emp(int empno,String ename,double sal){
        this.empno=empno;
        this.ename=ename;
        this.sal=sal;
        this.dept="收银";
    }
    public Emp(int empno,String ename,double sal,String dept){
        this.empno=empno;
        this.ename=ename;
        this.sal=sal;
        this.dept=dept;
    }
    public String getinfor(){
        return "雇员编号:"+this.empno+'\n'+
                "雇员姓名:"+this.ename+'\n'+
                "工资:"+this.sal+'\n'+
                "岗位:"+this.dept;
    }
}
*/
/*
public class Practice1{
    public static void main(String[] args) {
        Outer o=new Outer();
        o.fun();
        Outer.Inner in=new Outer().new Inner();
        in.print();
    }
}
class Outer{
    private String msg="hello world";
    class Inner{
        public void print(){
            System.out.println(msg);
        }
    }
    public void fun(){
        new Inner().print();
    }
}
