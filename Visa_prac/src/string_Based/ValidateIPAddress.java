package string_Based;

import java.util.ArrayList;
import java.util.Arrays;

///  WE need to segregate the given string query in IP address of IPV4 or IPV6 and Neither.
///  # Rules for IPV4:
///  1. Min length >=7 and max length <=15
///  2. Seprated by 3 dots.
///  3. Total 4 octets.
///  4. In each octets values ranges between 1-255.
///  5. Leading zeroes not allowed.
///  # Rules for IPV6
///
public class ValidateIPAddress {
    public static String isValidIp(String queryIP){
        int len = queryIP.length();
        boolean is_ipv4 = false;
        boolean is_ipv6 = false;
        ArrayList<String> str = new ArrayList<>();
        if (queryIP.endsWith(".") || queryIP.endsWith(":")) {
            return "Neither";
        }

        // if(len>=7 && len<=15) {
        //     str.addAll(Arrays.asList(queryIP.split("\\.")));
        //     is_ipv4 = true;
        // }
        // else if(len>=15 && len<=39){
        //     str.addAll(Arrays.asList(queryIP.split("\\:")));
        //     is_ipv6  = true;
        // }
        if (queryIP.contains(".")) {
            str.addAll(Arrays.asList(queryIP.split("\\.")));
            if(str.size()!=4){
                return "Neither";
            }
            is_ipv4 = true;
        } else if (queryIP.contains(":")) {
            str.addAll(Arrays.asList(queryIP.split("\\:")));
            if(str.size()!=8){
                return "Neither";
            }
            is_ipv6 = true;
        } else {
            return "Neither";
        }
        if(is_ipv4){
            is_ipv4= false;
            if(str.size()!= 4){
                return "Neither";
            }else{
                for(int i=0;i<str.size();i++){
                    String st = str.get(i);
                    if(st.length()>1 && st.charAt(0)=='0'){
                        return "Neither";
                    }else if(st.length()<1 || st.length()>3){
                        return "Neither";
                    }
                    else if(!st.isEmpty() && st.length()<4){
                        boolean canSee = st.matches("^[0-9]+$");
                        if(canSee){
                            int range = Integer.parseInt(st);
                            if(range>255){
                                return "Neither";
                            }else{
                                is_ipv4 = true;
                            }
                        }else{
                            return "Neither";
                        }
                    }
                }
            }
        }
        else if(is_ipv6){
            if(str.size() != 8){
                return "Neither";
            }else{
                for(int i= 0;i<str.size();i++){
                    String st= str.get(i);
                    if(st.isEmpty() || st.length()>4){
                        return "Neither";
                    }
                    else {
                        boolean cor_oct = st.matches("^[0-9a-fA-F]+$");
                        if(!cor_oct){
                            return "Neither";
                        }else{
                            is_ipv6 = true;
                        }
                    }
                }
            }
        }
        if(is_ipv6) return "IPv6";
        if(is_ipv4) return "IPv4";
        return "Neither";
    }
    public static void main(String[] args) {

    }
}
