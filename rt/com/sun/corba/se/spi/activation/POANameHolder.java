/*    */ package com.sun.corba.se.spi.activation;
/*    */ 
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ import org.omg.CORBA.portable.Streamable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class POANameHolder
/*    */   implements Streamable
/*    */ {
/* 13 */   public String[] value = null;
/*    */ 
/*    */ 
/*    */   
/*    */   public POANameHolder() {}
/*    */ 
/*    */   
/*    */   public POANameHolder(String[] paramArrayOfString) {
/* 21 */     this.value = paramArrayOfString;
/*    */   }
/*    */ 
/*    */   
/*    */   public void _read(InputStream paramInputStream) {
/* 26 */     this.value = POANameHelper.read(paramInputStream);
/*    */   }
/*    */ 
/*    */   
/*    */   public void _write(OutputStream paramOutputStream) {
/* 31 */     POANameHelper.write(paramOutputStream, this.value);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeCode _type() {
/* 36 */     return POANameHelper.type();
/*    */   }
/*    */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\com\sun\corba\se\spi\activation\POANameHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */