/*     */ package java.lang;
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
/*     */ class CharacterData0E
/*     */   extends CharacterData
/*     */ {
/*     */   int getProperties(int paramInt) {
/*  70 */     char c = (char)paramInt;
/*  71 */     return A[Y[X[c >> 5] | c >> 1 & 0xF] | c & 0x1];
/*     */   }
/*     */ 
/*     */   
/*     */   int getPropertiesEx(int paramInt) {
/*  76 */     char c = (char)paramInt;
/*  77 */     return B[Y[X[c >> 5] | c >> 1 & 0xF] | c & 0x1];
/*     */   }
/*     */ 
/*     */   
/*     */   boolean isOtherLowercase(int paramInt) {
/*  82 */     int i = getPropertiesEx(paramInt);
/*  83 */     return ((i & 0x1) != 0);
/*     */   }
/*     */   
/*     */   boolean isOtherUppercase(int paramInt) {
/*  87 */     int i = getPropertiesEx(paramInt);
/*  88 */     return ((i & 0x2) != 0);
/*     */   }
/*     */   
/*     */   boolean isOtherAlphabetic(int paramInt) {
/*  92 */     int i = getPropertiesEx(paramInt);
/*  93 */     return ((i & 0x4) != 0);
/*     */   }
/*     */   
/*     */   boolean isIdeographic(int paramInt) {
/*  97 */     int i = getPropertiesEx(paramInt);
/*  98 */     return ((i & 0x10) != 0);
/*     */   }
/*     */   
/*     */   int getType(int paramInt) {
/* 102 */     int i = getProperties(paramInt);
/* 103 */     return i & 0x1F;
/*     */   }
/*     */   
/*     */   boolean isJavaIdentifierStart(int paramInt) {
/* 107 */     int i = getProperties(paramInt);
/* 108 */     return ((i & 0x7000) >= 20480);
/*     */   }
/*     */   
/*     */   boolean isJavaIdentifierPart(int paramInt) {
/* 112 */     int i = getProperties(paramInt);
/* 113 */     return ((i & 0x3000) != 0);
/*     */   }
/*     */   
/*     */   boolean isUnicodeIdentifierStart(int paramInt) {
/* 117 */     int i = getProperties(paramInt);
/* 118 */     return ((i & 0x7000) == 28672);
/*     */   }
/*     */   
/*     */   boolean isUnicodeIdentifierPart(int paramInt) {
/* 122 */     int i = getProperties(paramInt);
/* 123 */     return ((i & 0x1000) != 0);
/*     */   }
/*     */   
/*     */   boolean isIdentifierIgnorable(int paramInt) {
/* 127 */     int i = getProperties(paramInt);
/* 128 */     return ((i & 0x7000) == 4096);
/*     */   }
/*     */   
/*     */   int toLowerCase(int paramInt) {
/* 132 */     int i = paramInt;
/* 133 */     int j = getProperties(paramInt);
/*     */     
/* 135 */     if ((j & 0x20000) != 0) {
/* 136 */       int k = j << 5 >> 23;
/* 137 */       i = paramInt + k;
/*     */     } 
/* 139 */     return i;
/*     */   }
/*     */   
/*     */   int toUpperCase(int paramInt) {
/* 143 */     int i = paramInt;
/* 144 */     int j = getProperties(paramInt);
/*     */     
/* 146 */     if ((j & 0x10000) != 0) {
/* 147 */       int k = j << 5 >> 23;
/* 148 */       i = paramInt - k;
/*     */     } 
/* 150 */     return i;
/*     */   }
/*     */   
/*     */   int toTitleCase(int paramInt) {
/* 154 */     int i = paramInt;
/* 155 */     int j = getProperties(paramInt);
/*     */     
/* 157 */     if ((j & 0x8000) != 0) {
/*     */       
/* 159 */       if ((j & 0x10000) == 0)
/*     */       {
/*     */         
/* 162 */         i = paramInt + 1;
/*     */       }
/* 164 */       else if ((j & 0x20000) == 0)
/*     */       {
/*     */         
/* 167 */         i = paramInt - 1;
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 175 */     else if ((j & 0x10000) != 0) {
/*     */ 
/*     */       
/* 178 */       i = toUpperCase(paramInt);
/*     */     } 
/* 180 */     return i;
/*     */   }
/*     */   
/*     */   int digit(int paramInt1, int paramInt2) {
/* 184 */     int i = -1;
/* 185 */     if (paramInt2 >= 2 && paramInt2 <= 36) {
/* 186 */       int j = getProperties(paramInt1);
/* 187 */       int k = j & 0x1F;
/* 188 */       if (k == 9) {
/* 189 */         i = paramInt1 + ((j & 0x3E0) >> 5) & 0x1F;
/*     */       }
/* 191 */       else if ((j & 0xC00) == 3072) {
/*     */         
/* 193 */         i = (paramInt1 + ((j & 0x3E0) >> 5) & 0x1F) + 10;
/*     */       } 
/*     */     } 
/* 196 */     return (i < paramInt2) ? i : -1;
/*     */   }
/*     */   
/*     */   int getNumericValue(int paramInt) {
/* 200 */     int i = getProperties(paramInt);
/* 201 */     int j = -1;
/*     */     
/* 203 */     switch (i & 0xC00)
/*     */     
/*     */     { default:
/* 206 */         j = -1;
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
/* 218 */         return j;case 1024: j = paramInt + ((i & 0x3E0) >> 5) & 0x1F; return j;case 2048: j = -2; return j;case 3072: break; }  j = (paramInt + ((i & 0x3E0) >> 5) & 0x1F) + 10; return j;
/*     */   }
/*     */   
/*     */   boolean isWhitespace(int paramInt) {
/* 222 */     int i = getProperties(paramInt);
/* 223 */     return ((i & 0x7000) == 16384);
/*     */   }
/*     */   
/*     */   byte getDirectionality(int paramInt) {
/* 227 */     int i = getProperties(paramInt);
/* 228 */     byte b = (byte)((i & 0x78000000) >> 27);
/* 229 */     if (b == 15) {
/* 230 */       b = -1;
/*     */     }
/* 232 */     return b;
/*     */   }
/*     */   
/*     */   boolean isMirrored(int paramInt) {
/* 236 */     int i = getProperties(paramInt);
/* 237 */     return ((i & Integer.MIN_VALUE) != 0);
/*     */   }
/*     */   
/* 240 */   static final CharacterData instance = new CharacterData0E();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 247 */   static final char[] X = "\000\020\020\020    0000000@                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                "
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
/* 355 */     .toCharArray();
/*     */ 
/*     */ 
/*     */   
/* 359 */   static final char[] Y = "\000\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\004\004\004\004\004\004\004\004\004\004\004\004\004\004\004\004\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\002\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\006\002\002\002\002\002\002\002\002"
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     .toCharArray();
/*     */ 
/*     */ 
/*     */   
/* 368 */   static final int[] A = new int[8];
/*     */ 
/*     */ 
/*     */   
/*     */   static final String A_DATA = "砀\000䠀တ砀\000砀\000䠀တ䠀တ䀀〆䀀〆";
/*     */ 
/*     */   
/* 375 */   static final char[] B = "\000\000\000\000\000\000\000\000"
/* 376 */     .toCharArray();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 382 */     char[] arrayOfChar = "砀\000䠀တ砀\000砀\000䠀တ䠀တ䀀〆䀀〆".toCharArray();
/* 383 */     assert arrayOfChar.length == 16;
/* 384 */     byte b1 = 0, b2 = 0;
/* 385 */     while (b1 < 16) {
/* 386 */       int i = arrayOfChar[b1++] << 16;
/* 387 */       A[b2++] = i | arrayOfChar[b1++];
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\java\lang\CharacterData0E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */