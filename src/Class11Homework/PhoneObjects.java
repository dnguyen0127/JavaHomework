package Class11Homework;

public class PhoneObjects {
    public static void main(String[] args) {
        Phone   iPhone=new Phone();

        iPhone.modelName    =   "iPhone X";
        iPhone.color        =   "black";
        iPhone.smartphone   =   true;

        Phone   Pixel=new Phone();

        Pixel.modelName    =   "Pixel Slate 3";
        Pixel.color        =   "gray";
        Pixel.smartphone   =   true;

        Phone   Samsung=new Phone();

        Samsung.modelName   =   "Ultra Basic";
        Samsung.color       =   "White";
        Samsung.smartphone  =   false;

        System.out.println(Samsung.modelName);

        Samsung.vibrate();

        System.out.println(Pixel.color);

        iPhone.ring();
    }
}
