package untitled;
public class MyException extends Exception {
String string;
MyException(String str){string=str;}
public String toString(){
    return ("ProductNotFoundException"+string);
}
}

