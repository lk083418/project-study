package imooc.test2.test;

public class Matches_test {
    public static void main(String[] args) {
        String match="1+1+reroute";
//        if (match.matches("noProtection|reroute")||match.matches("1+1"))
        boolean matches = match.matches("noProtection|reroute|1+1|1+1+reroute|permanent1+1");
        boolean matches2 = match.matches("1+1+reroute");
        System.out.println(matches2);
    }
}
