/*    */ package sun.management.snmp.jvmmib;
/*    */ 
/*    */ import com.sun.jmx.snmp.Enumerated;
/*    */ import java.io.Serializable;
/*    */ import java.util.Hashtable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EnumJvmThreadCpuTimeMonitoring
/*    */   extends Enumerated
/*    */   implements Serializable
/*    */ {
/*    */   static final long serialVersionUID = -532837824105215699L;
/* 47 */   protected static Hashtable<Integer, String> intTable = new Hashtable<>();
/*    */   
/* 49 */   protected static Hashtable<String, Integer> stringTable = new Hashtable<>();
/*    */   
/*    */   static {
/* 52 */     intTable.put(new Integer(3), "enabled");
/* 53 */     intTable.put(new Integer(4), "disabled");
/* 54 */     intTable.put(new Integer(1), "unsupported");
/* 55 */     stringTable.put("enabled", new Integer(3));
/* 56 */     stringTable.put("disabled", new Integer(4));
/* 57 */     stringTable.put("unsupported", new Integer(1));
/*    */   }
/*    */   
/*    */   public EnumJvmThreadCpuTimeMonitoring(int paramInt) throws IllegalArgumentException {
/* 61 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public EnumJvmThreadCpuTimeMonitoring(Integer paramInteger) throws IllegalArgumentException {
/* 65 */     super(paramInteger);
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumJvmThreadCpuTimeMonitoring() throws IllegalArgumentException {}
/*    */ 
/*    */   
/*    */   public EnumJvmThreadCpuTimeMonitoring(String paramString) throws IllegalArgumentException {
/* 73 */     super(paramString);
/*    */   }
/*    */   
/*    */   protected Hashtable<Integer, String> getIntTable() {
/* 77 */     return intTable;
/*    */   }
/*    */   
/*    */   protected Hashtable<String, Integer> getStringTable() {
/* 81 */     return stringTable;
/*    */   }
/*    */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\sun\management\snmp\jvmmib\EnumJvmThreadCpuTimeMonitoring.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */