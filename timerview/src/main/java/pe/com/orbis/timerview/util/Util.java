package pe.com.orbis.timerview.util;

import android.content.Context;

import pe.com.orbis.timerview.R;

/**
 * Created by Ricardo Bravo on 30/01/17.
 */

public class Util {

    public static String twoDigits(Context context, long number) {
        if (number >= 0 && number < 10) {
            return context.getString(R.string.concat_number, String.valueOf(number));
        }

        return String.valueOf(number);
    }

}
