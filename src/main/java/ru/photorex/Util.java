package ru.photorex;

public class Util {

    public static boolean checkIp(String ip) {
        boolean result = true;

        if (!ip.contains(".")) return false;

        String[] array = ip.split("\\.");

        if (array.length < 4) return false;

        try {
            for (String a : array)
                Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            return false;
        }

        return result;
    }

    public static long ipToLong(String ip) {

        String[] ipInArray = ip.split("\\.");

        long result = 0;
        for (int i = 0; i < ipInArray.length; i++) {

            int power = 3 - i;
            int temp = Integer.parseInt(ipInArray[i]);
            result += temp * Math.pow(256, power);

        }

        return result;
    }

    public static String longToIp(long ip) {
        StringBuilder sb = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {
            sb.insert(0, Long.toString(ip & 0xff));

            if (i < 3) {
                sb.insert(0, '.');
            }
            ip = ip >> 8;
        }

        return sb.toString();
    }
}
