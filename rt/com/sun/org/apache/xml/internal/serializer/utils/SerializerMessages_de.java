/*     */ package com.sun.org.apache.xml.internal.serializer.utils;
/*     */ 
/*     */ import java.util.ListResourceBundle;
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
/*     */ public class SerializerMessages_de
/*     */   extends ListResourceBundle
/*     */ {
/*     */   public Object[][] getContents() {
/*  71 */     Object[][] contents = { { "BAD_MSGKEY", "Der Nachrichtenschlüssel \"{0}\" ist nicht in der Nachrichtenklasse \"{1}\" enthalten" }, { "BAD_MSGFORMAT", "Das Format der Nachricht \"{0}\" in der Nachrichtenklasse \"{1}\" war nicht erfolgreich." }, { "ER_SERIALIZER_NOT_CONTENTHANDLER", "Serializer-Klasse \"{0}\" implementiert org.xml.sax.ContentHandler nicht." }, { "ER_RESOURCE_COULD_NOT_FIND", "Ressource [ {0} ] konnte nicht gefunden werden.\n {1}" }, { "ER_RESOURCE_COULD_NOT_LOAD", "Ressource [ {0} ] konnte nicht geladen werden: {1} \n {2} \t {3}" }, { "ER_BUFFER_SIZE_LESSTHAN_ZERO", "Puffergröße <=0" }, { "ER_INVALID_UTF16_SURROGATE", "Ungültige UTF-16-Ersetzung festgestellt: {0}?" }, { "ER_OIERROR", "I/O-Fehler" }, { "ER_ILLEGAL_ATTRIBUTE_POSITION", "Attribut {0} kann nicht nach untergeordneten Knoten oder vor dem Erstellen eines Elements hinzugefügt werden. Attribut wird ignoriert." }, { "ER_NAMESPACE_PREFIX", "Namespace für Präfix \"{0}\" wurde nicht deklariert." }, { "ER_STRAY_ATTRIBUTE", "Attribut \"{0}\" außerhalb des Elements." }, { "ER_STRAY_NAMESPACE", "Namespace-Deklaration {0}={1} außerhalb des Elements." }, { "ER_COULD_NOT_LOAD_RESOURCE", "\"{0}\" konnte nicht geladen werden (CLASSPATH prüfen). Die Standardwerte werden verwendet" }, { "ER_ILLEGAL_CHARACTER", "Versuch, Zeichen mit Integralwert {0} auszugeben, das nicht in der speziellen Ausgabecodierung von {1} dargestellt wird." }, { "ER_COULD_NOT_LOAD_METHOD_PROPERTY", "Property-Datei \"{0}\" konnte für Ausgabemethode \"{1}\" nicht geladen werden (CLASSPATH prüfen)" }, { "ER_INVALID_PORT", "Ungültige Portnummer" }, { "ER_PORT_WHEN_HOST_NULL", "Port kann nicht festgelegt werden, wenn der Host null ist" }, { "ER_HOST_ADDRESS_NOT_WELLFORMED", "Host ist keine wohlgeformte Adresse" }, { "ER_SCHEME_NOT_CONFORMANT", "Schema ist nicht konform." }, { "ER_SCHEME_FROM_NULL_STRING", "Schema kann nicht von Nullzeichenfolge festgelegt werden" }, { "ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE", "Pfad enthält eine ungültige Escapesequenz" }, { "ER_PATH_INVALID_CHAR", "Pfad enthält ungültiges Zeichen: {0}" }, { "ER_FRAG_INVALID_CHAR", "Fragment enthält ein ungültiges Zeichen" }, { "ER_FRAG_WHEN_PATH_NULL", "Fragment kann nicht festgelegt werden, wenn der Pfad null ist" }, { "ER_FRAG_FOR_GENERIC_URI", "Fragment kann nur für einen generischen URI festgelegt werden" }, { "ER_NO_SCHEME_IN_URI", "Kein Schema gefunden in URI" }, { "ER_CANNOT_INIT_URI_EMPTY_PARMS", "URI kann nicht mit leeren Parametern initialisiert werden" }, { "ER_NO_FRAGMENT_STRING_IN_PATH", "Fragment kann nicht im Pfad und im Fragment angegeben werden" }, { "ER_NO_QUERY_STRING_IN_PATH", "Abfragezeichenfolge kann nicht im Pfad und in der Abfragezeichenfolge angegeben werden" }, { "ER_NO_PORT_IF_NO_HOST", "Port kann nicht angegeben werden, wenn der Host nicht angegeben wurde" }, { "ER_NO_USERINFO_IF_NO_HOST", "Benutzerinformationen können nicht angegeben werden, wenn der Host nicht angegeben wurde" }, { "ER_XML_VERSION_NOT_SUPPORTED", "Warnung: Die Version des Ausgabedokuments soll \"{0}\" sein. Diese Version von XML wird nicht unterstützt. Die Version des Ausgabedokuments wird \"1.0\" sein." }, { "ER_SCHEME_REQUIRED", "Schema ist erforderlich." }, { "ER_FACTORY_PROPERTY_MISSING", "Das an die SerializerFactory übergebene Properties-Objekt verfügt über keine Eigenschaft \"{0}\"." }, { "ER_ENCODING_NOT_SUPPORTED", "Warnung: Die Codierung \"{0}\" wird nicht von der Java-Laufzeit unterstützt." } };
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
/* 203 */     return contents;
/*     */   }
/*     */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\com\sun\org\apache\xml\internal\serialize\\utils\SerializerMessages_de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */