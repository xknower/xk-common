/*     */ package sun.security.krb5.internal.crypto;
/*     */ 
/*     */ import java.security.GeneralSecurityException;
/*     */ import sun.security.krb5.KrbCryptoException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HmacSha1Aes256CksumType
/*     */   extends CksumType
/*     */ {
/*     */   public int confounderSize() {
/*  47 */     return 16;
/*     */   }
/*     */   
/*     */   public int cksumType() {
/*  51 */     return 16;
/*     */   }
/*     */   
/*     */   public boolean isSafe() {
/*  55 */     return true;
/*     */   }
/*     */   
/*     */   public int cksumSize() {
/*  59 */     return 12;
/*     */   }
/*     */   
/*     */   public int keyType() {
/*  63 */     return 3;
/*     */   }
/*     */   
/*     */   public int keySize() {
/*  67 */     return 32;
/*     */   }
/*     */   
/*     */   public byte[] calculateChecksum(byte[] paramArrayOfbyte, int paramInt) {
/*  71 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] calculateKeyedChecksum(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) throws KrbCryptoException {
/*     */     try {
/*  85 */       return Aes256.calculateChecksum(paramArrayOfbyte2, paramInt2, paramArrayOfbyte1, 0, paramInt1);
/*  86 */     } catch (GeneralSecurityException generalSecurityException) {
/*  87 */       KrbCryptoException krbCryptoException = new KrbCryptoException(generalSecurityException.getMessage());
/*  88 */       krbCryptoException.initCause(generalSecurityException);
/*  89 */       throw krbCryptoException;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean verifyKeyedChecksum(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt2) throws KrbCryptoException {
/*     */     try {
/* 105 */       byte[] arrayOfByte = Aes256.calculateChecksum(paramArrayOfbyte2, paramInt2, paramArrayOfbyte1, 0, paramInt1);
/*     */       
/* 107 */       return isChecksumEqual(paramArrayOfbyte3, arrayOfByte);
/* 108 */     } catch (GeneralSecurityException generalSecurityException) {
/* 109 */       KrbCryptoException krbCryptoException = new KrbCryptoException(generalSecurityException.getMessage());
/* 110 */       krbCryptoException.initCause(generalSecurityException);
/* 111 */       throw krbCryptoException;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\sun\security\krb5\internal\crypto\HmacSha1Aes256CksumType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */