/*
    Authors: Aaron, Aaron, John, Jordan 
    Student IDs: x19404024, x19435964, x19141301, x19765711 
    Created On: 11/11/2021
    Last Modified: 20/11/2021
    Description: 
    ------------------------
    Detects what OS the application is running on
 */

public class OSDetection 
{
    //Private variables//
    private static boolean isWindowsOS = false;
    private static boolean isLinuxOS = false;
    private static boolean isMacOS = false;

    /*
    Check what OS the Java application is running on and 
    return a boolean on which one is running. 
    i.e: if Windows is the end-users OS, return it true
    and everything else false.
    */
    static 
    {
        String os = System.getProperty("os.name").toLowerCase();
        isWindowsOS = os.contains("win");
        isLinuxOS = os.contains("nux") || os.contains("nix");
        isMacOS = os.contains("mac");
    }
    //Return if the OS is a Windows OS//
    public static boolean isWindowsOS() 
    {
        return isWindowsOS;
    }
    //Return if the OS is a Linux OS//
    public static boolean isLinuxOS() 
    {
        return isLinuxOS;
    }
   //Return if the OS is a Mac OS//
    public static boolean isMacOS() 
    {
        return isMacOS;
    }
}
