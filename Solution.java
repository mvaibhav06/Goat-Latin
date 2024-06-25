class Solution {
    public String toGoatLatin(String sentence) {
        String[] temp = sentence.split(" ");
        String out = "";
        String add = "a";

        for(int i=0; i<temp.length; i++){
            String s = temp[i];
            char ch = s.charAt(0);
            if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                out += s.substring(1);
                out += ch;
            }else{
                out += s;
            }
            out += "ma";
            out += add;
            add += 'a';
            if(i != temp.length-1){
                out += " ";
            }
        }
        return out;
    }
}
