/*
 * Java Cookbook
 * Example 2.4
 * Writing Operating System Dependent Code
 */
package darwin.ch02;

import java.util.Properties;

/**
 *
 * @author sivatma
 */
public class SysPropDemo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("System Properties:");
    Properties p = System.getProperties();
    p.list(System.out);
    System.out.println(p.getProperty("java.class.path"));
  }
  
}
