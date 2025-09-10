public class StudentClass{
    // creating a new datatype
  public static void Change(student s){
    s.name="riya";
    return;
    }
        public static void main(String args[]){
        student x=new student();
        x.name="Shruti";
        x.rno=90;
        x.percentage=98.7;
        System.out.println(x.rno);
        student y=new student();
        y.name="Sama";
        y.rno=80;
        y.percentage=78.7;
        System.out.println(y.name);
        Change(y);
        System.out.println(y.name);
    }
    }
