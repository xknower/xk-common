package org.xml.sax.ext;

import org.xml.sax.Attributes;

public interface Attributes2 extends Attributes {
  boolean isDeclared(int paramInt);
  
  boolean isDeclared(String paramString);
  
  boolean isDeclared(String paramString1, String paramString2);
  
  boolean isSpecified(int paramInt);
  
  boolean isSpecified(String paramString1, String paramString2);
  
  boolean isSpecified(String paramString);
}


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\org\xml\sax\ext\Attributes2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */