
class StringPerfromance {

    public static void main(String[] args) {

        String series = "";
        for(int i = 0 ; i < 26 ; i++) {
            char ch = (char)('a'+i);
            series = series + ch; // series += ch
        }
        System.out.println(series);
        
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            string = string.append(ch); 
        }
        System.out.println(string);
    }
}
