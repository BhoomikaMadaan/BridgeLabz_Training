package BridgeLabz_Training;

class remove_duplicates {

    public static void main(String[] args) {
        String s = "Programming";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.indexOf(c) == -1) {
                res += c;
            }
        }
        System.out.println(res);
    }
}
