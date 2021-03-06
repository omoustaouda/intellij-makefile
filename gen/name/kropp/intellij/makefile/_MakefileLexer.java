/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package name.kropp.intellij.makefile;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static name.kropp.intellij.makefile.psi.MakefileTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>MakefileLexer.flex</tt>
 */
public class _MakefileLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INCLUDES = 2;
  public static final int SOURCE = 4;
  public static final int SOURCE_FORCED = 6;
  public static final int DEFINE = 8;
  public static final int DEFINEBODY = 10;
  public static final int CONDITIONALS = 12;
  public static final int FUNCTION = 14;
  public static final int EXPORT = 16;
  public static final int EXPORTVAR = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  3,  2,  3,  2,  3,  2,  3,  2,  3,  2,  3,  2,  3, 
     2,  3,  2, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\5\1\1\2\0\1\4\22\0\1\2\1\44\1\46\1\6\1\51\2\45\1\47\1\52\1\53\1\45"+
    "\1\44\1\41\1\30\14\45\1\37\1\40\1\45\1\43\1\45\1\44\1\36\33\45\1\3\4\45\1"+
    "\13\1\24\1\34\1\27\1\7\1\17\1\16\1\21\1\15\1\33\1\45\1\22\1\32\1\14\1\11\1"+
    "\26\1\50\1\10\1\20\1\25\1\23\1\35\1\12\1\31\2\45\1\54\1\42\1\55\1\45\201\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\3\1\5\24\4"+
    "\1\6\1\7\1\10\1\11\1\12\3\4\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\4\1\1\2\21\2\5"+
    "\1\22\6\4\1\23\11\4\1\23\24\4\1\24\1\0"+
    "\1\25\2\0\1\4\1\0\1\22\13\4\1\23\33\4"+
    "\1\25\2\26\2\4\1\27\2\4\1\23\7\4\1\30"+
    "\20\4\1\31\1\32\11\4\1\33\1\4\1\34\12\4"+
    "\1\35\1\36\5\4\1\37\1\4\1\23\3\4\1\40"+
    "\1\4\1\41\2\4\1\42\1\43\1\4\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[214];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284\0\u02b2"+
    "\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4\0\u0422"+
    "\0\u0450\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536\0\u0564\0\270"+
    "\0\270\0\270\0\270\0\u0592\0\u05c0\0\u05ee\0\270\0\270"+
    "\0\270\0\270\0\270\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4"+
    "\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816\0\u0844"+
    "\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958\0\u0986\0\u09b4"+
    "\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24"+
    "\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94"+
    "\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04"+
    "\0\u0e32\0\u0e60\0\u0398\0\u0e8e\0\u0ebc\0\u0eea\0\u0f18\0\u0f46"+
    "\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe\0\u102c\0\u105a\0\u1088\0\u10b6"+
    "\0\u10e4\0\u1112\0\u1140\0\u0398\0\u116e\0\u119c\0\u11ca\0\u11f8"+
    "\0\u1226\0\u1254\0\u1282\0\u12b0\0\u12de\0\u130c\0\u133a\0\u1368"+
    "\0\u1396\0\u13c4\0\u13f2\0\u1420\0\u144e\0\u147c\0\u14aa\0\u14d8"+
    "\0\u1506\0\u1534\0\u1562\0\u1590\0\u15be\0\u15ec\0\u161a\0\270"+
    "\0\270\0\u0398\0\u1648\0\u1676\0\u0398\0\u16a4\0\u16d2\0\u1700"+
    "\0\u172e\0\u175c\0\u178a\0\u17b8\0\u17e6\0\u1814\0\u1842\0\u0398"+
    "\0\u1870\0\u189e\0\u18cc\0\u18fa\0\u1928\0\u1956\0\u1984\0\u19b2"+
    "\0\u19e0\0\u1a0e\0\u1a3c\0\u1a6a\0\u1a98\0\u1ac6\0\u1af4\0\u1b22"+
    "\0\u0398\0\u0398\0\u1b50\0\u1b7e\0\u1bac\0\u1bda\0\u1c08\0\u1c36"+
    "\0\u1c64\0\u1c92\0\u1cc0\0\u0398\0\u1cee\0\u0398\0\u1d1c\0\u1d4a"+
    "\0\u1d78\0\u1da6\0\u1dd4\0\u1e02\0\u1e30\0\u1e5e\0\u1e8c\0\u1eba"+
    "\0\u0398\0\u0398\0\u1ee8\0\u1f16\0\u1f44\0\u1f72\0\u1fa0\0\u0398"+
    "\0\u1fce\0\u1ffc\0\u202a\0\u2058\0\u2086\0\u0398\0\u20b4\0\u0398"+
    "\0\u20e2\0\u2110\0\u0398\0\u0398\0\u213e\0\u0398";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[214];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\1\6\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\25\1\31\1\32"+
    "\1\33\2\25\1\34\1\35\1\36\1\25\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\25\1\45\1\46\1\25"+
    "\1\47\1\50\1\51\1\52\1\53\1\5\1\6\1\7"+
    "\1\10\1\6\1\54\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\25\1\31\1\32\1\33\2\25\1\34"+
    "\1\35\1\36\1\55\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\25\1\45\1\46\1\25\1\47\1\50\1\51"+
    "\1\52\1\53\6\5\1\12\55\5\1\12\27\5\1\56"+
    "\17\5\57\0\1\6\2\0\1\6\53\0\1\7\54\0"+
    "\1\57\1\0\1\25\1\60\2\0\30\25\5\0\5\25"+
    "\12\0\1\11\50\0\1\61\1\0\1\61\1\62\1\0"+
    "\1\61\1\63\47\61\3\0\1\25\3\0\1\25\1\64"+
    "\3\25\1\65\5\25\1\66\6\25\1\67\3\25\1\70"+
    "\1\25\5\0\5\25\10\0\1\25\3\0\1\71\27\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\25\1\72\24\25"+
    "\1\73\1\25\5\0\5\25\10\0\1\25\3\0\2\25"+
    "\1\74\1\25\1\75\1\25\1\76\21\25\5\0\5\25"+
    "\10\0\1\25\3\0\5\25\1\77\7\25\1\100\2\25"+
    "\1\101\7\25\5\0\5\25\10\0\1\25\3\0\2\25"+
    "\1\102\25\25\5\0\5\25\10\0\1\25\3\0\5\25"+
    "\1\103\2\25\1\104\17\25\5\0\5\25\10\0\1\25"+
    "\3\0\14\25\1\105\13\25\5\0\5\25\10\0\1\25"+
    "\3\0\2\25\1\106\3\25\1\107\4\25\1\110\14\25"+
    "\5\0\5\25\10\0\1\25\3\0\2\25\1\111\3\25"+
    "\1\112\3\25\1\113\1\25\1\114\1\25\1\115\11\25"+
    "\5\0\5\25\10\0\1\25\3\0\30\25\5\0\5\25"+
    "\10\0\1\25\3\0\4\25\1\116\23\25\5\0\5\25"+
    "\10\0\1\25\3\0\5\25\1\117\22\25\5\0\5\25"+
    "\10\0\1\25\3\0\4\25\1\120\23\25\5\0\5\25"+
    "\10\0\1\25\3\0\1\25\1\121\2\25\1\122\23\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\123\5\25\1\124"+
    "\21\25\5\0\5\25\10\0\1\25\3\0\6\25\1\112"+
    "\21\25\5\0\5\25\10\0\1\25\3\0\2\25\1\125"+
    "\25\25\5\0\5\25\10\0\1\25\3\0\4\25\1\126"+
    "\23\25\5\0\5\25\10\0\1\25\3\0\4\25\1\127"+
    "\12\25\1\130\10\25\5\0\5\25\44\0\1\131\3\0"+
    "\1\43\15\0\1\25\3\0\30\25\4\0\1\43\5\25"+
    "\5\0\3\132\1\45\3\132\30\45\5\132\2\45\1\133"+
    "\2\45\5\132\3\134\1\46\3\134\30\46\5\134\3\46"+
    "\1\133\1\46\5\134\5\0\1\54\50\0\1\135\2\0"+
    "\1\136\1\0\2\135\27\136\1\25\5\135\5\136\6\135"+
    "\2\0\1\135\1\0\31\135\1\0\17\135\2\0\1\57"+
    "\2\0\1\57\51\0\2\57\2\0\1\57\50\0\1\61"+
    "\1\0\1\61\1\62\1\0\54\61\1\62\1\137\51\61"+
    "\1\63\1\0\1\63\1\140\1\0\51\63\3\0\1\25"+
    "\3\0\1\25\1\141\26\25\5\0\5\25\10\0\1\25"+
    "\3\0\20\25\1\142\7\25\5\0\5\25\10\0\1\25"+
    "\3\0\11\25\1\143\16\25\5\0\5\25\10\0\1\25"+
    "\3\0\17\25\1\144\10\25\5\0\5\25\10\0\1\25"+
    "\3\0\4\25\1\145\23\25\5\0\5\25\10\0\1\25"+
    "\3\0\4\25\1\146\23\25\5\0\5\25\10\0\1\25"+
    "\3\0\6\25\1\147\21\25\5\0\5\25\10\0\1\25"+
    "\3\0\1\150\27\25\5\0\5\25\10\0\1\25\3\0"+
    "\1\25\1\151\26\25\5\0\5\25\10\0\1\25\3\0"+
    "\1\25\1\152\26\25\5\0\5\25\10\0\1\25\3\0"+
    "\13\25\1\153\14\25\5\0\5\25\10\0\1\25\3\0"+
    "\20\25\1\154\7\25\5\0\5\25\10\0\1\25\3\0"+
    "\11\25\1\155\16\25\5\0\5\25\10\0\1\25\3\0"+
    "\20\25\1\156\7\25\5\0\5\25\10\0\1\25\3\0"+
    "\16\25\1\157\11\25\5\0\5\25\10\0\1\25\3\0"+
    "\10\25\1\160\14\25\1\161\2\25\5\0\5\25\10\0"+
    "\1\25\3\0\1\162\4\25\1\163\12\25\1\164\7\25"+
    "\5\0\5\25\10\0\1\25\3\0\6\25\1\165\21\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\25\1\166\26\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\25\1\116\3\25"+
    "\1\167\5\25\1\170\14\25\5\0\5\25\10\0\1\25"+
    "\3\0\4\25\1\171\23\25\5\0\5\25\10\0\1\25"+
    "\3\0\1\25\1\172\26\25\5\0\5\25\10\0\1\25"+
    "\3\0\5\25\1\173\22\25\5\0\5\25\10\0\1\25"+
    "\3\0\1\126\27\25\5\0\5\25\10\0\1\25\3\0"+
    "\10\25\1\174\4\25\1\175\12\25\5\0\5\25\10\0"+
    "\1\25\3\0\1\25\1\176\26\25\5\0\5\25\10\0"+
    "\1\25\3\0\11\25\1\177\16\25\5\0\5\25\10\0"+
    "\1\25\3\0\20\25\1\200\7\25\5\0\5\25\10\0"+
    "\1\25\3\0\11\25\1\201\16\25\5\0\5\25\10\0"+
    "\1\25\3\0\6\25\1\202\21\25\5\0\5\25\10\0"+
    "\1\25\3\0\16\25\1\203\11\25\5\0\5\25\10\0"+
    "\1\25\3\0\10\25\1\204\17\25\5\0\5\25\10\0"+
    "\1\25\3\0\1\25\1\154\26\25\5\0\5\25\10\0"+
    "\1\25\3\0\6\25\1\205\21\25\5\0\5\25\10\0"+
    "\1\25\3\0\13\25\1\145\14\25\5\0\5\25\10\0"+
    "\1\25\3\0\13\25\1\206\14\25\5\0\5\25\10\0"+
    "\1\25\3\0\4\25\1\207\23\25\5\0\5\25\50\0"+
    "\1\43\12\0\46\132\1\210\7\132\47\134\1\210\6\134"+
    "\1\135\2\0\1\135\1\0\31\135\1\211\20\135\2\0"+
    "\1\136\1\0\2\135\27\136\1\212\5\135\5\136\5\135"+
    "\1\0\1\61\54\0\1\63\1\61\1\63\1\140\1\137"+
    "\51\63\3\0\1\25\3\0\2\25\1\124\25\25\5\0"+
    "\5\25\10\0\1\25\3\0\1\213\5\25\1\214\21\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\215\27\25\5\0"+
    "\5\25\10\0\1\25\3\0\2\25\1\216\25\25\5\0"+
    "\5\25\10\0\1\25\3\0\13\25\1\154\14\25\5\0"+
    "\5\25\10\0\1\25\3\0\13\25\1\155\14\25\5\0"+
    "\5\25\10\0\1\25\3\0\7\25\1\125\20\25\5\0"+
    "\5\25\10\0\1\25\3\0\1\25\1\217\26\25\5\0"+
    "\5\25\10\0\1\25\3\0\20\25\1\220\7\25\5\0"+
    "\5\25\10\0\1\25\3\0\5\25\1\221\22\25\5\0"+
    "\5\25\10\0\1\25\3\0\20\25\1\222\7\25\5\0"+
    "\5\25\10\0\1\25\3\0\17\25\1\223\10\25\5\0"+
    "\5\25\10\0\1\25\3\0\11\25\1\224\5\25\1\225"+
    "\10\25\5\0\5\25\10\0\1\25\3\0\20\25\1\226"+
    "\7\25\5\0\5\25\10\0\1\25\3\0\2\25\1\154"+
    "\25\25\5\0\5\25\10\0\1\25\3\0\13\25\1\227"+
    "\14\25\5\0\5\25\10\0\1\25\3\0\30\25\5\0"+
    "\4\25\1\230\10\0\1\25\3\0\1\231\17\25\1\232"+
    "\7\25\5\0\5\25\10\0\1\25\3\0\1\233\27\25"+
    "\5\0\5\25\10\0\1\25\3\0\13\25\1\234\14\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\235\27\25\5\0"+
    "\5\25\10\0\1\25\3\0\20\25\1\236\7\25\5\0"+
    "\5\25\10\0\1\25\3\0\1\154\15\25\1\237\11\25"+
    "\5\0\5\25\10\0\1\25\3\0\26\25\1\141\1\25"+
    "\5\0\5\25\10\0\1\25\3\0\16\25\1\154\11\25"+
    "\5\0\5\25\10\0\1\25\3\0\25\25\1\161\2\25"+
    "\5\0\5\25\10\0\1\25\3\0\10\25\1\240\17\25"+
    "\5\0\5\25\10\0\1\25\3\0\11\25\1\172\16\25"+
    "\5\0\5\25\10\0\1\25\3\0\6\25\1\241\21\25"+
    "\5\0\5\25\10\0\1\25\3\0\16\25\1\242\11\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\243\27\25\5\0"+
    "\5\25\10\0\1\25\3\0\1\244\27\25\5\0\5\25"+
    "\10\0\1\25\3\0\26\25\1\245\1\25\5\0\5\25"+
    "\10\0\1\25\3\0\11\25\1\246\16\25\5\0\5\25"+
    "\10\0\1\25\3\0\6\25\1\247\21\25\5\0\5\25"+
    "\10\0\1\25\3\0\5\25\1\154\22\25\5\0\5\25"+
    "\10\0\1\25\3\0\14\25\1\234\13\25\5\0\5\25"+
    "\10\0\1\25\3\0\16\25\1\250\11\25\5\0\5\25"+
    "\10\0\1\25\3\0\10\25\1\251\17\25\5\0\5\25"+
    "\10\0\1\25\3\0\10\25\1\252\17\25\5\0\5\25"+
    "\10\0\1\25\3\0\1\25\1\253\26\25\5\0\5\25"+
    "\10\0\1\25\3\0\1\25\1\254\26\25\5\0\5\25"+
    "\10\0\1\25\3\0\11\25\1\154\1\25\1\255\14\25"+
    "\5\0\5\25\10\0\1\25\3\0\6\25\1\256\21\25"+
    "\5\0\5\25\10\0\1\25\3\0\25\25\1\257\2\25"+
    "\5\0\5\25\10\0\1\25\3\0\4\25\1\260\23\25"+
    "\5\0\5\25\10\0\1\25\3\0\14\25\1\261\13\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\25\1\262\26\25"+
    "\5\0\5\25\10\0\1\25\3\0\6\25\1\124\21\25"+
    "\5\0\5\25\10\0\1\25\3\0\14\25\1\263\13\25"+
    "\5\0\5\25\10\0\1\25\3\0\30\25\5\0\4\25"+
    "\1\264\10\0\1\25\3\0\1\265\27\25\5\0\5\25"+
    "\10\0\1\25\3\0\10\25\1\266\17\25\5\0\5\25"+
    "\10\0\1\25\3\0\1\154\27\25\5\0\5\25\10\0"+
    "\1\25\3\0\4\25\1\267\23\25\5\0\5\25\10\0"+
    "\1\25\3\0\11\25\1\270\16\25\5\0\5\25\10\0"+
    "\1\25\3\0\1\271\27\25\5\0\5\25\10\0\1\25"+
    "\3\0\6\25\1\272\21\25\5\0\5\25\10\0\1\25"+
    "\3\0\17\25\1\154\10\25\5\0\5\25\10\0\1\25"+
    "\3\0\3\25\1\273\24\25\5\0\5\25\10\0\1\25"+
    "\3\0\10\25\1\274\17\25\5\0\5\25\10\0\1\25"+
    "\3\0\5\25\1\275\22\25\5\0\5\25\10\0\1\25"+
    "\3\0\4\25\1\276\23\25\5\0\5\25\10\0\1\25"+
    "\3\0\14\25\1\277\13\25\5\0\5\25\10\0\1\25"+
    "\3\0\5\25\1\300\22\25\5\0\5\25\10\0\1\25"+
    "\3\0\12\25\1\301\15\25\5\0\5\25\10\0\1\25"+
    "\3\0\16\25\1\302\11\25\5\0\5\25\10\0\1\25"+
    "\3\0\6\25\1\303\21\25\5\0\5\25\10\0\1\25"+
    "\3\0\6\25\1\175\21\25\5\0\5\25\10\0\1\25"+
    "\3\0\5\25\1\304\22\25\5\0\5\25\10\0\1\25"+
    "\3\0\4\25\1\305\23\25\5\0\5\25\10\0\1\25"+
    "\3\0\16\25\1\306\11\25\5\0\5\25\10\0\1\25"+
    "\3\0\10\25\1\174\17\25\5\0\5\25\10\0\1\25"+
    "\3\0\1\174\27\25\5\0\5\25\10\0\1\25\3\0"+
    "\20\25\1\307\7\25\5\0\5\25\10\0\1\25\3\0"+
    "\10\25\1\310\17\25\5\0\5\25\10\0\1\25\3\0"+
    "\25\25\1\306\2\25\5\0\5\25\10\0\1\25\3\0"+
    "\16\25\1\311\11\25\5\0\5\25\10\0\1\25\3\0"+
    "\1\25\1\312\26\25\5\0\5\25\10\0\1\25\3\0"+
    "\22\25\1\154\5\25\5\0\5\25\10\0\1\25\3\0"+
    "\2\25\1\305\25\25\5\0\5\25\10\0\1\25\3\0"+
    "\6\25\1\313\21\25\5\0\5\25\10\0\1\25\3\0"+
    "\4\25\1\314\23\25\5\0\5\25\10\0\1\25\3\0"+
    "\16\25\1\315\11\25\5\0\5\25\10\0\1\25\3\0"+
    "\15\25\1\175\12\25\5\0\5\25\10\0\1\25\3\0"+
    "\1\316\27\25\5\0\5\25\10\0\1\25\3\0\20\25"+
    "\1\317\7\25\5\0\5\25\10\0\1\25\3\0\7\25"+
    "\1\154\20\25\5\0\5\25\10\0\1\25\3\0\1\25"+
    "\1\77\26\25\5\0\5\25\10\0\1\25\3\0\12\25"+
    "\1\154\15\25\5\0\5\25\10\0\1\25\3\0\1\320"+
    "\27\25\5\0\5\25\10\0\1\25\3\0\1\25\1\221"+
    "\26\25\5\0\5\25\10\0\1\25\3\0\21\25\1\321"+
    "\6\25\5\0\5\25\10\0\1\25\3\0\5\25\1\322"+
    "\22\25\5\0\5\25\10\0\1\25\3\0\23\25\1\234"+
    "\4\25\5\0\5\25\10\0\1\25\3\0\1\323\27\25"+
    "\5\0\5\25\10\0\1\25\3\0\1\324\27\25\5\0"+
    "\5\25\10\0\1\25\3\0\2\25\1\325\25\25\5\0"+
    "\5\25\10\0\1\25\3\0\1\326\27\25\5\0\5\25"+
    "\10\0\1\25\3\0\14\25\1\172\13\25\5\0\5\25"+
    "\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8556];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\32\1\4\11\3\1\5\11\56\1\1\0"+
    "\1\1\2\0\1\1\1\0\50\1\2\11\115\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[214];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MakefileLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MakefileLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':  // fall through
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 37: break;
          case 2: 
            { return EOL;
            } 
            // fall through
          case 38: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 39: break;
          case 4: 
            { return CHARS;
            } 
            // fall through
          case 40: break;
          case 5: 
            { return COMMENT;
            } 
            // fall through
          case 41: break;
          case 6: 
            { return COLON;
            } 
            // fall through
          case 42: break;
          case 7: 
            { return SEMICOLON;
            } 
            // fall through
          case 43: break;
          case 8: 
            { return COMMA;
            } 
            // fall through
          case 44: break;
          case 9: 
            { return PIPE;
            } 
            // fall through
          case 45: break;
          case 10: 
            { return ASSIGN;
            } 
            // fall through
          case 46: break;
          case 11: 
            { return DOLLAR;
            } 
            // fall through
          case 47: break;
          case 12: 
            { return OPEN_PAREN;
            } 
            // fall through
          case 48: break;
          case 13: 
            { return CLOSE_PAREN;
            } 
            // fall through
          case 49: break;
          case 14: 
            { return OPEN_CURLY;
            } 
            // fall through
          case 50: break;
          case 15: 
            { return CLOSE_CURLY;
            } 
            // fall through
          case 51: break;
          case 16: 
            { return TAB;
            } 
            // fall through
          case 52: break;
          case 17: 
            { return SPLIT;
            } 
            // fall through
          case 53: break;
          case 18: 
            { return DOC_COMMENT;
            } 
            // fall through
          case 54: break;
          case 19: 
            { return FUNCTION_NAME;
            } 
            // fall through
          case 55: break;
          case 20: 
            { return DOUBLECOLON;
            } 
            // fall through
          case 56: break;
          case 21: 
            { return STRING;
            } 
            // fall through
          case 57: break;
          case 22: 
            { return MACRO;
            } 
            // fall through
          case 58: break;
          case 23: 
            { return KEYWORD_ELSE;
            } 
            // fall through
          case 59: break;
          case 24: 
            { return KEYWORD_IFEQ;
            } 
            // fall through
          case 60: break;
          case 25: 
            { return KEYWORD_ENDEF;
            } 
            // fall through
          case 61: break;
          case 26: 
            { return KEYWORD_ENDIF;
            } 
            // fall through
          case 62: break;
          case 27: 
            { return KEYWORD_IFNEQ;
            } 
            // fall through
          case 63: break;
          case 28: 
            { return KEYWORD_IFDEF;
            } 
            // fall through
          case 64: break;
          case 29: 
            { return KEYWORD_VPATH;
            } 
            // fall through
          case 65: break;
          case 30: 
            { return KEYWORD_EXPORT;
            } 
            // fall through
          case 66: break;
          case 31: 
            { return KEYWORD_IFNDEF;
            } 
            // fall through
          case 67: break;
          case 32: 
            { return KEYWORD_DEFINE;
            } 
            // fall through
          case 68: break;
          case 33: 
            { return KEYWORD_INCLUDE;
            } 
            // fall through
          case 69: break;
          case 34: 
            { return KEYWORD_PRIVATE;
            } 
            // fall through
          case 70: break;
          case 35: 
            { return KEYWORD_OVERRIDE;
            } 
            // fall through
          case 71: break;
          case 36: 
            { return KEYWORD_UNDEFINE;
            } 
            // fall through
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
