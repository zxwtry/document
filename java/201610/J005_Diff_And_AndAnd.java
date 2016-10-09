/*
    总结就一句化，  &转换为二进制再一位一位&&
                    &&是true和false的逻辑运算
*/
public class J005_Diff_And_AndAnd {
    public static void main(String[] args) {
        System.out.println("false&j() is");
        System.out.println(false&j());
        System.out.println("false&&j() is");
        System.out.println(false&&j());
    }
    static boolean j() {
        System.out.println("j called");
        return false;
    }
}
