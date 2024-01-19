package ra.validate;

import java.util.regex.Pattern;

public class Validate {
    public static boolean checkSongId(String songId){
        String pattern = "^S[a-zA-Z0-9]{3}$";
        return Pattern.compile(pattern).matcher(songId).matches();
    }
}
