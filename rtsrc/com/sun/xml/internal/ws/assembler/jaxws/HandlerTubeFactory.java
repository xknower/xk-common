/*    */ package com.sun.xml.internal.ws.assembler.jaxws;
/*    */ 
/*    */ import com.sun.xml.internal.ws.api.pipe.Tube;
/*    */ import com.sun.xml.internal.ws.assembler.dev.ClientTubelineAssemblyContext;
/*    */ import com.sun.xml.internal.ws.assembler.dev.ServerTubelineAssemblyContext;
/*    */ import com.sun.xml.internal.ws.assembler.dev.TubeFactory;
/*    */ import javax.xml.ws.WebServiceException;
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
/*    */ public final class HandlerTubeFactory
/*    */   implements TubeFactory
/*    */ {
/*    */   public Tube createTube(ClientTubelineAssemblyContext context) throws WebServiceException {
/* 43 */     return context.getWrappedContext().createHandlerTube(context.getTubelineHead());
/*    */   }
/*    */   
/*    */   public Tube createTube(ServerTubelineAssemblyContext context) throws WebServiceException {
/* 47 */     return context.getWrappedContext().createHandlerTube(context.getTubelineHead());
/*    */   }
/*    */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\com\sun\xml\internal\ws\assembler\jaxws\HandlerTubeFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */