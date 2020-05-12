/*    */ package com.sun.corba.se.spi.activation;
/*    */ 
/*    */ import org.omg.CORBA.Any;
/*    */ import org.omg.CORBA.ORB;
/*    */ import org.omg.CORBA.StructMember;
/*    */ import org.omg.CORBA.TCKind;
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ 
/*    */ public abstract class ServerAlreadyUninstalledHelper
/*    */ {
/* 13 */   private static String _id = "IDL:activation/ServerAlreadyUninstalled:1.0";
/*    */ 
/*    */   
/*    */   public static void insert(Any paramAny, ServerAlreadyUninstalled paramServerAlreadyUninstalled) {
/* 17 */     OutputStream outputStream = paramAny.create_output_stream();
/* 18 */     paramAny.type(type());
/* 19 */     write(outputStream, paramServerAlreadyUninstalled);
/* 20 */     paramAny.read_value(outputStream.create_input_stream(), type());
/*    */   }
/*    */ 
/*    */   
/*    */   public static ServerAlreadyUninstalled extract(Any paramAny) {
/* 25 */     return read(paramAny.create_input_stream());
/*    */   }
/*    */   
/* 28 */   private static TypeCode __typeCode = null;
/*    */   private static boolean __active = false;
/*    */   
/*    */   public static synchronized TypeCode type() {
/* 32 */     if (__typeCode == null)
/*    */     {
/* 34 */       synchronized (TypeCode.class) {
/*    */         
/* 36 */         if (__typeCode == null) {
/*    */           
/* 38 */           if (__active)
/*    */           {
/* 40 */             return ORB.init().create_recursive_tc(_id);
/*    */           }
/* 42 */           __active = true;
/* 43 */           StructMember[] arrayOfStructMember = new StructMember[1];
/* 44 */           TypeCode typeCode = null;
/* 45 */           typeCode = ORB.init().get_primitive_tc(TCKind.tk_long);
/* 46 */           typeCode = ORB.init().create_alias_tc(ServerIdHelper.id(), "ServerId", typeCode);
/* 47 */           arrayOfStructMember[0] = new StructMember("serverId", typeCode, null);
/*    */ 
/*    */ 
/*    */           
/* 51 */           __typeCode = ORB.init().create_exception_tc(id(), "ServerAlreadyUninstalled", arrayOfStructMember);
/* 52 */           __active = false;
/*    */         } 
/*    */       } 
/*    */     }
/* 56 */     return __typeCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public static String id() {
/* 61 */     return _id;
/*    */   }
/*    */ 
/*    */   
/*    */   public static ServerAlreadyUninstalled read(InputStream paramInputStream) {
/* 66 */     ServerAlreadyUninstalled serverAlreadyUninstalled = new ServerAlreadyUninstalled();
/*    */     
/* 68 */     paramInputStream.read_string();
/* 69 */     serverAlreadyUninstalled.serverId = paramInputStream.read_long();
/* 70 */     return serverAlreadyUninstalled;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void write(OutputStream paramOutputStream, ServerAlreadyUninstalled paramServerAlreadyUninstalled) {
/* 76 */     paramOutputStream.write_string(id());
/* 77 */     paramOutputStream.write_long(paramServerAlreadyUninstalled.serverId);
/*    */   }
/*    */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\com\sun\corba\se\spi\activation\ServerAlreadyUninstalledHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */