public class rectangle {
    int x;
    int y;
    int width;
    int height;
    public rectangle(){
        this.width=0;
        this.height=0;
    }
    public int getArea(){
        return(width*height);
    }
    public rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public static void main(String[] args) {
        rectangle rect1 = new rectangle();
        System.out.println(rect1.getArea());
        rectangle rect2 = new rectangle(2, 3);
        System.out.println(rect2.getArea());
        rectangle rect3 = new rectangle(0, 0, 2, 3);
        System.out.println(rect3.getArea());
    }
}
