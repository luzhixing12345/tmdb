/* parse.java */
/* Generated By:JavaCC: Do not edit this line. parse.java */
package drz.oddb.parse;
import java.util.*;
public class parse implements parseConstants {

public static final int OPT_CREATE_ORIGINCLASS    = 1;
public static final int OPT_CREATE_SELECTDEPUTY   = 2;
public static final int OPT_DROP                  = 3;
public static final int OPT_INSERT                = 4;
public static final int OPT_DELETE                = 5;
public static final int OPT_SELECT_DERECTSELECT   = 6;
public static final int OPT_SELECT_INDERECTSELECT = 7;
public static final int OPT_CREATE_UPDATE         = 8;
public static final int OPT_UNION                 = 9;
public static final int OPT_CREATE_UNIONDEPUTY    = 10;

        static Queue<String > st= new LinkedList<String>(); ;
  public static void main(String args[]) throws ParseException {
    parse parser = new parse(System.in);
    parser.Run();
     }

  final public String[] Run() throws ParseException {
    trace_call("Run");
    try {
String[] s;
      s = sql();
//System.out.println(s+"\n");
    {if ("" != null) return s ;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("Run");
    }
}

  final public String[] sql() throws ParseException {
    trace_call("sql");
    try {
String sql_s;
        String create_s;
        String drop_s;
        String select_s;
        String insert_s;
        String delete_s;
        String update_s;
  String union_s;
      if (jj_2_1(3)) {
        create_s = create();
sql_s = create_s;System.out.println(sql_s+"\n");{if ("" != null) return sql_s.split(",");}
      } else if (jj_2_2(3)) {
        drop_s = drop();
sql_s = drop_s;System.out.println(sql_s+"\n");{if ("" != null) return sql_s.split(",");}
      } else if (jj_2_3(3)) {
        select_s = select();
sql_s = select_s;System.out.println(sql_s+"\n");{if ("" != null) return sql_s.split(",");}
      } else if (jj_2_4(3)) {
        insert_s = insert2();
sql_s = insert_s;System.out.println(sql_s+"\n");{if ("" != null) return sql_s.split(",");}
      } else if (jj_2_5(3)) {
        delete_s = delete();
sql_s = delete_s;System.out.println(sql_s+"\n");{if ("" != null) return sql_s.split(",");}
      } else if (jj_2_6(3)) {
        update_s = update();
sql_s = update_s;System.out.println(sql_s+"\n");{if ("" != null) return sql_s.split(",");}
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("sql");
    }
}

  final public String create() throws ParseException {
    trace_call("create");
    try {
String create_s;
        int count;
      if (jj_2_7(3)) {
        jj_consume_token(CREATE);
        count = originclass();
        jj_consume_token(SEMICOLON);
create_s = OPT_CREATE_ORIGINCLASS+",";
      create_s += count;
      while(!st.isEmpty())
      {
        create_s +=",";
        create_s += st.poll();

      }
      {if ("" != null) return create_s;}
      } else if (jj_2_8(3)) {
        jj_consume_token(CREATE);
        count = selectdeputy();
        jj_consume_token(SEMICOLON);
create_s = OPT_CREATE_SELECTDEPUTY+",";
      create_s += count;
      while(!st.isEmpty())
      {
        create_s +=",";
        create_s += st.poll();

      }
      {if ("" != null) return create_s;}
      } else if (jj_2_9(3)) {
        jj_consume_token(CREATE);
        count = uniondeputy();
        jj_consume_token(SEMICOLON);
create_s = OPT_CREATE_UNIONDEPUTY+",";
      create_s += count;
      while(!st.isEmpty())
      {
        create_s +=",";
        create_s += st.poll();
      }
      {if ("" != null) return create_s;}
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("create");
    }
}

  final public String drop() throws ParseException {
    trace_call("drop");
    try {
String cln;
        String drop_s;
      jj_consume_token(DROP);
      jj_consume_token(CLASS);
      cln = classname();
      jj_consume_token(SEMICOLON);
drop_s = OPT_DROP+","+cln;{if ("" != null) return drop_s;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("drop");
    }
}

  final public String insert2() throws ParseException {
    trace_call("insert2");
    try {
String insert_s;
        int count;
      count = insert();
insert_s = OPT_INSERT+",";
      insert_s += count;
      while(!st.isEmpty())
      {
        insert_s +=",";
        insert_s += st.poll();

      }
      {if ("" != null) return insert_s;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("insert2");
    }
}

  final public int insert() throws ParseException {
    trace_call("insert");
    try {
String cln;
        String vl;
        int count = 0;
      jj_consume_token(INSERT);
      jj_consume_token(INTO);
      cln = classname();
st.add(cln);
      jj_consume_token(VALUES);
      jj_consume_token(LEFT_BRACKET);
      vl = value();
count++;st.add(vl);
      label_1:
      while (true) {
        if (jj_2_10(3)) {
          ;
        } else {
          break label_1;
        }
        jj_consume_token(COMMA);
        vl = value();
count++;st.add(vl);
      }
      jj_consume_token(RIGHT_BRACKET);
      jj_consume_token(SEMICOLON);
{if ("" != null) return count;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("insert");
    }
}

  final public String delete() throws ParseException {
    trace_call("delete");
    try {
String cln;
        String delete_s;
        String cond;
      jj_consume_token(DELETE);
delete_s = OPT_DELETE+",";
      jj_consume_token(FROM);
      cln = classname();
delete_s += cln+",";
      jj_consume_token(WHERE);
      cond = condition();
delete_s += cond;
      jj_consume_token(SEMICOLON);
{if ("" != null) return delete_s;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("delete");
    }
}

  final public String select() throws ParseException {
    trace_call("select");
    try {
String select_s;
        int count;
  int union_count = 0;
  String union_s; // 用于判断是否是union

      if (jj_2_11(3)) {
        jj_consume_token(SELECT);
        count = directselect();
select_s = OPT_SELECT_DERECTSELECT+",";
      select_s += count;
      while(!st.isEmpty()){
          select_s +=",";
          select_s += st.poll();
      }
        union_s = union();
if (union_s == "END") {if ("" != null) return select_s;}
      else {
        select_s = select_s.substring(1);
        select_s = OPT_UNION + select_s;
        select_s += union_s;
        {if ("" != null) return select_s;}
      }
      } else if (jj_2_12(3)) {
        jj_consume_token(SELECT);
        count = indirectselect();
        jj_consume_token(SEMICOLON);
select_s = OPT_SELECT_INDERECTSELECT+",";
      select_s += count;
      while(!st.isEmpty())
      {
        select_s +=",";
        select_s += st.poll();

      }
      {if ("" != null) return select_s;}
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("select");
    }
}

  final public int originclass() throws ParseException {
    trace_call("originclass");
    try {
String cln;
        String attr_s;
        String attrtype_s;
        int count = 0;
      jj_consume_token(CLASS);
      cln = classname();
st.add(cln);
      jj_consume_token(LEFT_BRACKET);
      attr_s = attr();
st.add(attr_s);
      attrtype_s = attrtype();
st.add(attrtype_s); count++;
      label_2:
      while (true) {
        if (jj_2_13(3)) {
          ;
        } else {
          break label_2;
        }
        jj_consume_token(COMMA);
        attr_s = attr();
st.add(attr_s);
        attrtype_s = attrtype();
st.add(attrtype_s); count++;
      }
      jj_consume_token(RIGHT_BRACKET);
{if ("" != null) return count;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("originclass");
    }
}

  final public int selectdeputy() throws ParseException {
    trace_call("selectdeputy");
    try {
String cln;
        int count;
      jj_consume_token(SELECTDEPUTY);
      cln = classname();
st.add(cln);
      jj_consume_token(SELECT);
      count = directselect();
{if ("" != null) return count;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("selectdeputy");
    }
}

  final public int uniondeputy() throws ParseException {
    trace_call("uniondeputy");
    try {
String cln;
  int count;
      jj_consume_token(UNIONDEPUTY);
      cln = classname();
st.add(cln);
      jj_consume_token(SELECT);
      count = directselect();
      label_3:
      while (true) {
        jj_consume_token(UNION);
        jj_consume_token(SELECT);
        count = directselect();
        if (jj_2_14(3)) {
          ;
        } else {
          break label_3;
        }
      }
{if ("" != null) return count;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("uniondeputy");
    }
}

  final public String classname() throws ParseException {
    trace_call("classname");
    try {
Token s;
      s = jj_consume_token(ID);
{if ("" != null) return s.image;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("classname");
    }
}

  final public String attrtype() throws ParseException {
    trace_call("attrtype");
    try {
Token s;
      s = jj_consume_token(ID);
{if ("" != null) return s.image;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("attrtype");
    }
}

  final public String attr() throws ParseException {
    trace_call("attr");
    try {
Token s;
      s = jj_consume_token(ID);
{if ("" != null) return s.image;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("attr");
    }
}

  final public String dattr() throws ParseException {
    trace_call("dattr");
    try {
Token s;
      s = jj_consume_token(ID);
{if ("" != null) return s.image;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("dattr");
    }
}

  final public String condition() throws ParseException {
    trace_call("condition");
    try {
String attr_s;
        String cond;
        Token s;
      if (jj_2_15(3)) {
        attr_s = attr();
        jj_consume_token(EQUAL);
        s = jj_consume_token(INT);
cond = attr_s+",=,"+s.image; {if ("" != null) return cond;}
      } else if (jj_2_16(3)) {
        attr_s = attr();
        jj_consume_token(EQUAL);
        s = jj_consume_token(STRING);
cond = attr_s+",=,"+s.image; {if ("" != null) return cond;}
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("condition");
    }
}

  final public String value() throws ParseException {
    trace_call("value");
    try {
Token s;
      if (jj_2_17(3)) {
        s = jj_consume_token(INT);
{if ("" != null) return s.image;}
      } else if (jj_2_18(3)) {
        s = jj_consume_token(STRING);
{if ("" != null) return s.image;}
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("value");
    }
}

  final public int directselect() throws ParseException {
    trace_call("directselect");
    try {
String dattr_s;
        String attr_s;
        String value_s = "";
        boolean plus = false;
        String cln;
        String cond;
        int count = 0;
      attr_s = attr();
st.add(attr_s);count++;
      if (jj_2_19(3)) {
        jj_consume_token(PLUS);
        value_s = value();
plus = true;
      } else {
        ;
      }
if(plus) { st.add("1"); st.add(value_s);}else {st.add("0"); st.add("0"); } plus = false;
      jj_consume_token(AS);
      dattr_s = dattr();
st.add(dattr_s);
      label_4:
      while (true) {
        if (jj_2_20(3)) {
          ;
        } else {
          break label_4;
        }
        jj_consume_token(COMMA);
        attr_s = attr();
st.add(attr_s);count++;
        if (jj_2_21(3)) {
          jj_consume_token(PLUS);
          value_s = value();
plus = true;
        } else {
          ;
        }
if(plus) { st.add("1"); st.add(value_s);}else {st.add("0"); st.add("0"); } plus = false;
        jj_consume_token(AS);
        dattr_s = dattr();
st.add(dattr_s);
      }
      jj_consume_token(FROM);
      cln = classname();
st.add(cln);
      jj_consume_token(WHERE);
      cond = condition();
st.add(cond);{if ("" != null) return count;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("directselect");
    }
}

  final public int indirectselect() throws ParseException {
    trace_call("indirectselect");
    try {
String cln;
        int count = 0;
        String attr_s;
        String cond;
      cln = classname();
st.add(cln);count++;
      label_5:
      while (true) {
        if (jj_2_22(3)) {
          ;
        } else {
          break label_5;
        }
        jj_consume_token(CROSS);
        cln = classname();
st.add(cln);count++;
      }
      jj_consume_token(DOT);
      attr_s = attr();
st.add(attr_s);
      jj_consume_token(FROM);
      cln = classname();
st.add(cln);
      jj_consume_token(WHERE);
      cond = condition();
st.add(cond); {if ("" != null) return count;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("indirectselect");
    }
}

  final public String update() throws ParseException {
    trace_call("update");
    try {
String cln;
        String value_s;
        String attr_s;
        String cond;
        String update_s;
      jj_consume_token(UPDATE);
update_s = OPT_CREATE_UPDATE+",";
      cln = classname();
update_s += cln + ",";
      jj_consume_token(SET);
      attr_s = attr();
update_s += attr_s+",";
      jj_consume_token(EQUAL);
      value_s = value();
update_s += value_s+",";
      jj_consume_token(WHERE);
      cond = condition();
update_s += cond;
      jj_consume_token(SEMICOLON);
{if ("" != null) return update_s;}
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("update");
    }
}

  final public String union() throws ParseException {
    trace_call("union");
    try {
String union_s ="";
  int count;
      if (jj_2_24(3)) {
        jj_consume_token(SEMICOLON);
union_s = "END";
    {if ("" != null) return union_s;}
      } else if (jj_2_25(3)) {
        label_6:
        while (true) {
          jj_consume_token(UNION);
          jj_consume_token(SELECT);
          count = directselect();
union_s += ",";
    union_s += count;
    while(!st.isEmpty()){
      union_s +=",";
      union_s += st.poll();
    }
          if (jj_2_23(3)) {
            ;
          } else {
            break label_6;
          }
        }
        jj_consume_token(SEMICOLON);
{if ("" != null) return union_s;}
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("union");
    }
}

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_2()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_3()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_4()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_5()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_6()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_7()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_2_8(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_8()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  private boolean jj_2_9(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_9()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  private boolean jj_2_10(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_10()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  private boolean jj_2_11(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_11()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  private boolean jj_2_12(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_12()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  private boolean jj_2_13(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_13()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  private boolean jj_2_14(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_14()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  private boolean jj_2_15(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_15()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  private boolean jj_2_16(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_16()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  private boolean jj_2_17(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_17()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  private boolean jj_2_18(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_18()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  private boolean jj_2_19(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_19()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  private boolean jj_2_20(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_20()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  private boolean jj_2_21(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_21()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(20, xla); }
  }

  private boolean jj_2_22(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_22()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(21, xla); }
  }

  private boolean jj_2_23(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_23()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(22, xla); }
  }

  private boolean jj_2_24(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_24()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(23, xla); }
  }

  private boolean jj_2_25(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_25()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(24, xla); }
  }

  private boolean jj_3R_indirectselect_373_5_18()
 {
    if (jj_3R_classname_295_4_21()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_22()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(DOT)) return true;
    return false;
  }

  private boolean jj_3_14()
 {
    if (jj_scan_token(UNION)) return true;
    if (jj_scan_token(SELECT)) return true;
    if (jj_3R_directselect_354_5_17()) return true;
    return false;
  }

  private boolean jj_3_13()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_attr_310_4_19()) return true;
    if (jj_3R_attrtype_303_4_20()) return true;
    return false;
  }

  private boolean jj_3_20()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_attr_310_4_19()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_21()) jj_scanpos = xsp;
    if (jj_scan_token(AS)) return true;
    return false;
  }

  private boolean jj_3R_insert2_164_9_10()
 {
    if (jj_3R_insert_185_5_22()) return true;
    return false;
  }

  private boolean jj_3R_originclass_263_5_13()
 {
    if (jj_scan_token(CLASS)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  private boolean jj_3_19()
 {
    if (jj_scan_token(PLUS)) return true;
    if (jj_3R_value_338_5_16()) return true;
    return false;
  }

  private boolean jj_3R_directselect_354_5_17()
 {
    if (jj_3R_attr_310_4_19()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_19()) jj_scanpos = xsp;
    if (jj_scan_token(AS)) return true;
    return false;
  }

  private boolean jj_3R_drop_156_5_8()
 {
    if (jj_scan_token(DROP)) return true;
    if (jj_scan_token(CLASS)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  private boolean jj_3_18()
 {
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  private boolean jj_3_17()
 {
    if (jj_scan_token(INT)) return true;
    return false;
  }

  private boolean jj_3R_value_338_5_16()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_17()) {
    jj_scanpos = xsp;
    if (jj_3_18()) return true;
    }
    return false;
  }

  private boolean jj_3_12()
 {
    if (jj_scan_token(SELECT)) return true;
    if (jj_3R_indirectselect_373_5_18()) return true;
    return false;
  }

  private boolean jj_3_16()
 {
    if (jj_3R_attr_310_4_19()) return true;
    if (jj_scan_token(EQUAL)) return true;
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  private boolean jj_3_15()
 {
    if (jj_3R_attr_310_4_19()) return true;
    if (jj_scan_token(EQUAL)) return true;
    if (jj_scan_token(INT)) return true;
    return false;
  }

  private boolean jj_3_9()
 {
    if (jj_scan_token(CREATE)) return true;
    if (jj_3R_uniondeputy_289_5_15()) return true;
    return false;
  }

  private boolean jj_3_23()
 {
    if (jj_scan_token(UNION)) return true;
    if (jj_scan_token(SELECT)) return true;
    if (jj_3R_directselect_354_5_17()) return true;
    return false;
  }

  private boolean jj_3_25()
 {
    Token xsp;
    if (jj_3_23()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_23()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_21()
 {
    if (jj_scan_token(PLUS)) return true;
    if (jj_3R_value_338_5_16()) return true;
    return false;
  }

  private boolean jj_3_8()
 {
    if (jj_scan_token(CREATE)) return true;
    if (jj_3R_selectdeputy_280_5_14()) return true;
    return false;
  }

  private boolean jj_3_11()
 {
    if (jj_scan_token(SELECT)) return true;
    if (jj_3R_directselect_354_5_17()) return true;
    return false;
  }

  private boolean jj_3R_select_219_5_9()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_11()) {
    jj_scanpos = xsp;
    if (jj_3_12()) return true;
    }
    return false;
  }

  private boolean jj_3_24()
 {
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_attr_310_4_19()
 {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  private boolean jj_3R_attrtype_303_4_20()
 {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  private boolean jj_3_7()
 {
    if (jj_scan_token(CREATE)) return true;
    if (jj_3R_originclass_263_5_13()) return true;
    return false;
  }

  private boolean jj_3R_create_111_5_7()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3_8()) {
    jj_scanpos = xsp;
    if (jj_3_9()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_delete_203_5_11()
 {
    if (jj_scan_token(DELETE)) return true;
    if (jj_scan_token(FROM)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  private boolean jj_3R_update_392_3_12()
 {
    if (jj_scan_token(UPDATE)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    if (jj_scan_token(SET)) return true;
    return false;
  }

  private boolean jj_3R_classname_295_4_21()
 {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  private boolean jj_3_6()
 {
    if (jj_3R_update_392_3_12()) return true;
    return false;
  }

  private boolean jj_3_5()
 {
    if (jj_3R_delete_203_5_11()) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_3R_insert2_164_9_10()) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_3R_select_219_5_9()) return true;
    return false;
  }

  private boolean jj_3R_uniondeputy_289_5_15()
 {
    if (jj_scan_token(UNIONDEPUTY)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_3R_drop_156_5_8()) return true;
    return false;
  }

  private boolean jj_3_10()
 {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_value_338_5_16()) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_create_111_5_7()) return true;
    return false;
  }

  private boolean jj_3R_insert_185_5_22()
 {
    if (jj_scan_token(INSERT)) return true;
    if (jj_scan_token(INTO)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  private boolean jj_3R_selectdeputy_280_5_14()
 {
    if (jj_scan_token(SELECTDEPUTY)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  private boolean jj_3_22()
 {
    if (jj_scan_token(CROSS)) return true;
    if (jj_3R_classname_295_4_21()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public parseTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {};
	}
  final private JJCalls[] jj_2_rtns = new JJCalls[25];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  {
      enable_tracing();
  }
  /** Constructor with InputStream. */
  public parse(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public parse(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new parseTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 0; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public parse(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new parseTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new parseTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public parse(parseTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(parseTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   if (++jj_gc > 100) {
		 jj_gc = 0;
		 for (int i = 0; i < jj_2_rtns.length; i++) {
		   JJCalls c = jj_2_rtns[i];
		   while (c != null) {
			 if (c.gen < jj_gen) c.first = null;
			 c = c.next;
		   }
		 }
	   }
	   trace_token(token, "");
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error {
    @Override
    public Throwable fillInStackTrace() {
      return this;
    }
  }
  static private final LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_rescan) {
	   int i = 0; Token tok = token;
	   while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
	   if (tok != null) jj_add_error_token(kind, i);
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	   trace_token(token, " (in getNextToken)");
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
	 if (pos >= 100) {
		return;
	 }

	 if (pos == jj_endpos + 1) {
	   jj_lasttokens[jj_endpos++] = kind;
	 } else if (jj_endpos != 0) {
	   jj_expentry = new int[jj_endpos];

	   for (int i = 0; i < jj_endpos; i++) {
		 jj_expentry[i] = jj_lasttokens[i];
	   }

	   for (int[] oldentry : jj_expentries) {
		 if (oldentry.length == jj_expentry.length) {
		   boolean isMatched = true;

		   for (int i = 0; i < jj_expentry.length; i++) {
			 if (oldentry[i] != jj_expentry[i]) {
			   isMatched = false;
			   break;
			 }

		   }
		   if (isMatched) {
			 jj_expentries.add(jj_expentry);
			 break;
		   }
		 }
	   }

	   if (pos != 0) {
		 jj_lasttokens[(jj_endpos = pos) - 1] = kind;
	   }
	 }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[32];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 0; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 32; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 jj_endpos = 0;
	 jj_rescan_token();
	 jj_add_error_token(0, 0);
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  private int trace_indent = 0;
/** Enable tracing. */
  final public void enable_tracing() {
	 trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
	 trace_enabled = false;
  }

  protected void trace_call(String s) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.println("Call:	" + s);
	 }
	 trace_indent = trace_indent + 2;
  }

  protected void trace_return(String s) {
	 trace_indent = trace_indent - 2;
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.println("Return: " + s);
	 }
  }

  protected void trace_token(Token t, String where) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.print("Consumed token: <" + tokenImage[t.kind]);
	   if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
		 System.out.print(": \"" + TokenMgrError.addEscapes(t.image) + "\"");
	   }
	   System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
	 }
  }

  protected void trace_scan(Token t1, int t2) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.print("Visited token: <" + tokenImage[t1.kind]);
	   if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
		 System.out.print(": \"" + TokenMgrError.addEscapes(t1.image) + "\"");
	   }
	   System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
	 }
  }

  private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 25; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			   case 1: jj_3_2(); break;
			   case 2: jj_3_3(); break;
			   case 3: jj_3_4(); break;
			   case 4: jj_3_5(); break;
			   case 5: jj_3_6(); break;
			   case 6: jj_3_7(); break;
			   case 7: jj_3_8(); break;
			   case 8: jj_3_9(); break;
			   case 9: jj_3_10(); break;
			   case 10: jj_3_11(); break;
			   case 11: jj_3_12(); break;
			   case 12: jj_3_13(); break;
			   case 13: jj_3_14(); break;
			   case 14: jj_3_15(); break;
			   case 15: jj_3_16(); break;
			   case 16: jj_3_17(); break;
			   case 17: jj_3_18(); break;
			   case 18: jj_3_19(); break;
			   case 19: jj_3_20(); break;
			   case 20: jj_3_21(); break;
			   case 21: jj_3_22(); break;
			   case 22: jj_3_23(); break;
			   case 23: jj_3_24(); break;
			   case 24: jj_3_25(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
	 JJCalls p = jj_2_rtns[index];
	 while (p.gen > jj_gen) {
	   if (p.next == null) { p = p.next = new JJCalls(); break; }
	   p = p.next;
	 }

	 p.gen = jj_gen + xla - jj_la; 
	 p.first = token;
	 p.arg = xla;
  }

  static final class JJCalls {
	 int gen;
	 Token first;
	 int arg;
	 JJCalls next;
  }

}
