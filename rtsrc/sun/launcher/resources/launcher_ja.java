/*   */ package sun.launcher.resources;
/*   */ 
/*   */ import java.util.ListResourceBundle;
/*   */ 
/*   */ public final class launcher_ja extends ListResourceBundle {
/*   */   protected final Object[][] getContents() {
/* 7 */     return new Object[][] { { "java.launcher.X.macosx.usage", "\n次のオプションはMac OS X固有です。\n    -XstartOnFirstThread\n                      main()メソッドを最初(AppKit)のスレッドで実行する\n    -Xdock:name=<application name>\"\n                      Dockに表示されるデフォルト・アプリケーション名をオーバーライドする\n    -Xdock:icon=<path to icon file>\n                      Dockに表示されるデフォルト・アイコンをオーバーライドする\n\n" }, { "java.launcher.X.usage", "    -Xmixed           混合モードの実行(デフォルト)\n    -Xint             インタプリタ・モードの実行のみ\n    -Xbootclasspath:<{0}で区切られたディレクトリおよびzip/jarファイル>\n                      ブートストラップのクラスとリソースの検索パスを設定する\n    -Xbootclasspath/a:<{0}で区切られたディレクトリおよびzip/jarファイル>\n                      ブートストラップ・クラス・パスの最後に追加する\n    -Xbootclasspath/p:<{0}で区切られたディレクトリおよびzip/jarファイル>\n                      ブートストラップ・クラス・パスの前に付加する\n    -Xdiag            追加の診断メッセージを表示する\n    -Xnoclassgc       クラスのガベージ・コレクションを無効にする\n    -Xincgc           増分ガベージ・コレクションを有効にする\n    -Xloggc:<file>    タイムスタンプが付いたファイルにGCステータスのログを記録する\n    -Xbatch           バックグラウンドのコンパイルを無効にする\n    -Xms<size>        Javaの初期ヒープ・サイズを設定する\n    -Xmx<size>        Javaの最大ヒープ・サイズを設定する\n    -Xss<size>        Javaのスレッド・スタック・サイズを設定する\n    -Xprof            CPUプロファイル・データを出力する\n    -Xfuture          将来のデフォルトを見越して、最も厳密なチェックを有効にする\n    -Xrs              Java/VMによるOSシグナルの使用を削減する(ドキュメントを参照)\n    -Xcheck:jni       JNI関数に対する追加のチェックを実行する\n    -Xshare:off       共有クラスのデータを使用しようとしない\n    -Xshare:auto      可能であれば共有クラスのデータを使用する(デフォルト)\n    -Xshare:on        共有クラス・データの使用を必須にし、できなければ失敗する。\n    -XshowSettings    すべての設定を表示して続行する\n    -XshowSettings:all\n                      すべての設定を表示して続行する\n    -XshowSettings:vm すべてのVM関連の設定を表示して続行する\n    -XshowSettings:properties\n                      すべてのプロパティ設定を表示して続行する\n    -XshowSettings:locale\n                      すべてのロケール関連の設定を表示して続行する\n\n-Xオプションは非標準なので、予告なく変更される場合があります。\n" }, { "java.launcher.cls.error1", "エラー: メイン・クラス{0}が見つからなかったかロードできませんでした" }, { "java.launcher.cls.error2", "エラー: メイン・メソッドがクラス{1}の{0}ではありません。次のようにメイン・メソッドを定義してください。\n   public static void main(String[] args)" }, { "java.launcher.cls.error3", "エラー: メイン・メソッドはクラス{0}のvoid型の値を返す必要があります。\n次のようにメイン・メソッドを定義してください。\n   public static void main(String[] args)" }, { "java.launcher.cls.error4", "エラー: メイン・メソッドがクラス{0}で見つかりません。次のようにメイン・メソッドを定義してください。\n   public static void main(String[] args)\nまたはJavaFXアプリケーション・クラスは{1}を拡張する必要があります" }, { "java.launcher.cls.error5", "エラー: JavaFXランタイム・コンポーネントが不足しており、このアプリケーションの実行に必要です" }, { "java.launcher.ergo.message1", "                  デフォルトVMは{0}です" }, { "java.launcher.ergo.message2", "                  これはサーバークラスのマシンで実行しているためです。\n" }, { "java.launcher.init.error", "初期化エラー" }, { "java.launcher.jar.error1", "エラー: ファイル{0}を開こうとしているときに、予期しないエラーが発生しました" }, { "java.launcher.jar.error2", "{0}にマニフェストが見つかりません" }, { "java.launcher.jar.error3", "{0}にメイン・マニフェスト属性がありません" }, { "java.launcher.javafx.error1", "エラー: JavaFX launchApplicationメソッドに誤ったシグネチャがあり、\nstaticを宣言してvoid型の値を返す必要があります" }, { "java.launcher.opt.datamodel", "    -d{0}\t  使用可能な場合は{0}ビットのデータ・モデルを使用する\n" }, { "java.launcher.opt.footer", "    -cp <ディレクトリおよびzip/jarファイルのクラス検索パス>\n    -classpath <ディレクトリおよびzip/jarファイルのクラス検索パス>\n                  クラス・ファイルを検索するディレクトリ、\n                  JARアーカイブおよびZIPアーカイブの{0}で区切られたリストです。\n    -D<name>=<value>\n                  システム・プロパティを設定する\n    -verbose:[class|gc|jni]\n                  詳細な出力を行う\n    -version      製品バージョンを出力して終了する\n    -version:<value>\n                  警告: この機能は非推奨であり、詳細のリリースで\n                  廃止されます。\n                  指定したバージョンを実行に必須にする\n    -showversion  製品バージョンを出力して続行する\n    -jre-restrict-search | -no-jre-restrict-search\n                  警告: この機能は非推奨であり、詳細のリリースで\n                  廃止されます。\n                  ユーザーのプライベートJREをバージョン検索に含める/除外する\n    -? -help      このヘルプ・メッセージを出力する\n    -X            非標準オプションに関するヘルプを出力する\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  指定した粒度でアサーションを有効にする\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  指定した粒度でアサーションを無効にする\n    -esa | -enablesystemassertions\n                  システム・アサーションを有効にする\n    -dsa | -disablesystemassertions\n                  システム・アサーションを無効にする\n    -agentlib:<libname>[=<options>]\n                  ネイティブ・エージェント・ライブラリ<libname>をロードする。例: -agentlib:hprof\n                  -agentlib:jdwp=helpと-agentlib:hprof=helpも参照\n    -agentpath:<pathname>[=<options>]\n                  フルパス名でネイティブ・エージェント・ライブラリをロードする\n    -javaagent:<jarpath>[=<options>]\n                  Javaプログラミング言語エージェントをロードする。java.lang.instrumentを参照\n    -splash:<imagepath>\n                  指定したイメージでスプラッシュ画面を表示する\n詳細はhttp://www.oracle.com/technetwork/java/javase/documentation/index.htmlを参照してください。" }, { "java.launcher.opt.header", "使用方法: {0} [-options] class [args...]\n           (クラスを実行する場合)\n   または  {0} [-options] -jar jarfile [args...]\n           (jarファイルを実行する場合)\noptionsには次のものがあります。\n" }, { "java.launcher.opt.hotspot", "    {0}\t  は\"{1}\" VMのシノニムです  [非推奨]\n" }, { "java.launcher.opt.vmselect", "    {0}\t  \"{1}\" VMを選択する場合\n" } };
/*   */   }
/*   */ }


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\sun\launcher\resources\launcher_ja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */