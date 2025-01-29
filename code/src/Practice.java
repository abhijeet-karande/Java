public class Practice {
    int base,height;
    public void area(int b,int h){
        base=b;
        height=h;
        System.out.println("area of triangle ="+ (base*height)/2);

    }

}
class Triangle_area{
    public static void main(String[]arg) {
        Practice practice = new Practice();
        practice.area(10, 20);
    }
}