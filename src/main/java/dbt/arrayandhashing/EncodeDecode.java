package dbt.arrayandhashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length())
                    .append("#")
                    .append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        StringBuilder len =  new StringBuilder();
        int length;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '#') {
                length = Integer.parseInt(len.toString());
                len.setLength(0);
                list.add(str.substring(i+1, i + length+1));
                i = i + length;
//                System.out.println(list);
            } else {
                len.append(str.charAt(i));
            }
        }
        return list;
    }
}
