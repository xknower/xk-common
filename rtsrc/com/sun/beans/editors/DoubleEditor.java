/*    */ package com.sun.beans.editors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DoubleEditor
/*    */   extends NumberEditor
/*    */ {
/*    */   public void setAsText(String paramString) throws IllegalArgumentException {
/* 38 */     setValue((paramString == null) ? null : Double.valueOf(paramString));
/*    */   }
/*    */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\com\sun\beans\editors\DoubleEditor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */