/*
 * Java Cookbook
 * Example 2.4
 * Writing Operating System Dependent Code
 */
package darwin.ch02;

/**
 *
 * @author sivatma
 */
public class SysDep {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Null device: "+SysDep.getDevNull());
  }
  
  /** Return the name of the Null device on platforms which support it,
   *  or "junk" otherwise.
   */
  public static String getDevNull(){
    String sys = System.getProperty("os.name");
    if (sys==null || sys.indexOf("Mac") >= 0)
      return "junk";
    if (sys.startsWith("Windows"))
      return "NUL:";
    return "/dev/null";
  }
  
}
