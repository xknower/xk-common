/*    */ package com.sun.org.apache.xml.internal.security.c14n.implementations;
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
/*    */ public class Canonicalizer11_OmitComments
/*    */   extends Canonicalizer11
/*    */ {
/*    */   public Canonicalizer11_OmitComments() {
/* 33 */     super(false);
/*    */   }
/*    */   
/*    */   public final String engineGetURI() {
/* 37 */     return "http://www.w3.org/2006/12/xml-c14n11";
/*    */   }
/*    */   
/*    */   public final boolean engineGetIncludeComments() {
/* 41 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\com\sun\org\apache\xml\internal\security\c14n\implementations\Canonicalizer11_OmitComments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */