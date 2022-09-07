package main.java.com.sojern;

public class VersionChecker {

    public static String checkVersion(String version1, String version2){
        String[] version1Arr = version1.split("[.]");
        String[] version2Arr = version2.split("[.]");

        int max = version1Arr.length>version2Arr.length?version1Arr.length:version2Arr.length;

        int version1Val = 0;
        for(int i=0;i<version1Arr.length;i++){
            version1Val+=new Integer(version1Arr[version1Arr.length-i-1])*Math.pow(10, (max-version1Arr.length+1));
        }

        int version2Val = 0;
        for(int i=0;i<version2Arr.length;i++){
            version2Val+=new Integer(version2Arr[version2Arr.length-i-1])*Math.pow(10, (max-version2Arr.length+1));
        }

        if( version2Val > version1Val)  return version2;
        return version1;

    }

    public static void main(String[] args) {
        System.out.println(checkVersion("1.3.0","1.3.2"));
    }
}

