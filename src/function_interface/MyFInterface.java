package function_interface;


interface MyLogger{
    String customLogger(String str);
}

class Converter{
    public static String addId(String s){
        return s + System.currentTimeMillis();
    }
}

class Printer{
    public void print(String str, MyLogger logger){
        str = logger.customLogger(str);
        System.out.println(str);
    }
}


public class MyFInterface {

    public static void main(String[] args) {
        new Printer().print("hello", Converter::addId);
    }

}
