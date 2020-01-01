public class HashCode {
    public static void main(String[] args) {
//        System.out.println("45".hashCode());
        person p1=new person();
        int h1=p1.hashCode();
        System.out.println("h1:    "+h1);



        person p2=new person();
        int h2=p2.hashCode();
        System.out.println("h2:    "+h2);
        /**
         *
         * tostring 方法
         *
         *
         * public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        System.out.println(p1);//1163157884的十六进制表示形式
        System.out.println(p2);//1956725890的十六进制表示形式
    }
}
