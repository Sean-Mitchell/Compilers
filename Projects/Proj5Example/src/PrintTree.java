package Project5;

import Project5.analysis.*;
import Project5.node.*;
import java.util.*;

class PrintTree extends DepthFirstAdapter
{
	static LinkedList<Hashtable<Object, Object>> scopeList = new LinkedList<>();
	
 	public PrintTree() {
		System.out.println("Start of the Printing Action");
		scopeList.addFirst(new Hashtable<>());
	}
	
	public void caseAProg(AProg node) {
        node.getClassmethodstmts().apply(this);
	}
	
	public void caseAClasStmtsClassmethodstmts(AClassStmtsClassmethodstmts node) {
		node.getClassmethodstmts().apply(this);
		node.getClassmethodstmt().apply(this);
	}
	
	public void caseAEpsilonClassmethodstmts(AEpsilonClassmethodstmts node) {
		
	}
	
	public void caseAClassDefClassmethodstmt(AClassDefClassmethodstmt node) {
		TId id = node.getId();
		
		// If Id is already declared in this scope stop
		if (scopeList.peek().contains(id)) {
			System.out.println("ERROR: " + id + " is already declared in this scope.");
			java.lang.System.exit(0);
		}
		
		Hashtable<Object, Object> newScope = new Hashtable<>();
		
		ExtendedNode extNode = new ExtendedNode(ExtendedNode.CLASS, ExtendedNode.VOID, newScope);
		
		// Put this into the symbol table
		scopeList.peek().put(id, extNode);
		
		// Switch to new scope
		scopeList.addFirst(newScope);
		
		node.getMethodstmtseqs().apply(this);
		
		// Switch out of new scope
		scopeList.poll();
	}
	
	public void caseAMethodDeclClassmethodstmt(AMethodDeclClassmethodstmt node) {
		TId id = node.getId();
		
		// If Id is already declared in this scope stop
		if (scopeList.peek().contains(id)) {
			System.out.println("ERROR: " + id + " is already declared in this scope.");
			java.lang.System.exit(0);
		}
		
		PType type = node.getType();
		int typeNum = -1;
		
		switch (type.toString()) {
			case "INT": typeNum = ExtendedNode.INT; break;
			case "REAL": typeNum = ExtendedNode.REAL; break;
			case "STRING": typeNum = ExtendedNode.STRING; break;
			case "BOOLEAN": typeNum = ExtendedNode.BOOLEAN; break;
			case "VOID": typeNum = ExtendedNode.VOID; break;
		}
		
		node.getVarlist().apply(this);
		
		Hashtable<Object, Object> newScope = new Hashtable<>();
		
		ExtendedNode extNode = new ExtendedNode(ExtendedNode.METHOD, typeNum, newScope);
		
		// Put this into the symbol table
		scopeList.peek().put(id, extNode);
		
		// Switch to new scope
		scopeList.addFirst(newScope);
		
		node.getStmtseq().apply(this);
		
		// Switch out of new scope
		scopeList.poll();
	}
	
	public void caseAVarDeclClassmethodstmt(AVarDeclClassmethodstmt node) {
		TId id = node.getId();
		
		// If Id is already declared in this scope stop
		if (scopeList.peek().contains(id)) {
			System.out.println("ERROR: " + id + " is already declared in this scope.");
			java.lang.System.exit(0);
		}
		
		PType type = node.getType();
		int typeNum = -1;
		
		switch (type.toString()) {
			case "INT": typeNum = ExtendedNode.INT; break;
			case "REAL": typeNum = ExtendedNode.REAL; break;
			case "STRING": typeNum = ExtendedNode.STRING; break;
			case "BOOLEAN": typeNum = ExtendedNode.BOOLEAN; break;
			case "VOID": typeNum = ExtendedNode.VOID; break;
		}
		
		ExtendedNode extNode = new ExtendedNode(ExtendedNode.VAR, typeNum);
		
		scopeList.peek().put(id, extNode);
	}
	
	public void caseAMethodStmtsMethodstmtseqs(AMethodStmtsMethodstmtseqs node) {
		node.getMethodstmtseqs().apply(this);
		node.getMethodstmtseq().apply(this);
	}
	
	public void caseAEpsilonMethodstmtseqs(AEpsilonMethodstmtseqs node) {
		
	}
	
	public void caseAMethodDeclMethodstmtseq(AMethodDeclMethodstmtseq node) {
		TId id = node.getId();
		
		// If Id is already declared in this scope stop
		if (scopeList.peek().contains(id)) {
			System.out.println("ERROR: " + id + " is already declared in this scope.");
			java.lang.System.exit(0);
		}
		
		PType type = node.getType();
		int typeNum = -1;
		
		switch (type.toString()) {
			case "INT": typeNum = ExtendedNode.INT; break;
			case "REAL": typeNum = ExtendedNode.REAL; break;
			case "STRING": typeNum = ExtendedNode.STRING; break;
			case "BOOLEAN": typeNum = ExtendedNode.BOOLEAN; break;
			case "VOID": typeNum = ExtendedNode.VOID; break;
		}
		
		node.getVarlist().apply(this);
		
		Hashtable<Object, Object> newScope = new Hashtable<>();
		
		ExtendedNode extNode = new ExtendedNode(ExtendedNode.METHOD, typeNum, newScope);
		
		// Put this into the symbol table
		scopeList.peek().put(id, extNode);
		
		// Switch to new scope
		scopeList.addFirst(newScope);
		
		node.getStmtseq().apply(this);
		
		// Switch out of new scope
		scopeList.poll();
	}
	
	public void caseAVarDeclMethodstmtseq(AVarDeclMethodstmtseq node) {
		TId id = node.getId();
		
		// If Id is already declared in this scope stop
		if (scopeList.peek().contains(id)) {
			System.out.println("ERROR: " + id + " is already declared in this scope.");
			java.lang.System.exit(0);
		}
		
		PType type = node.getType();
		int typeNum = -1;
		
		switch (type.toString()) {
			case "INT": typeNum = ExtendedNode.INT; break;
			case "REAL": typeNum = ExtendedNode.REAL; break;
			case "STRING": typeNum = ExtendedNode.STRING; break;
			case "BOOLEAN": typeNum = ExtendedNode.BOOLEAN; break;
			case "VOID": typeNum = ExtendedNode.VOID; break;
		}
		
		ExtendedNode extNode = new ExtendedNode(ExtendedNode.VAR, typeNum);
		
		scopeList.peek().put(id, extNode);
	}
	
	public void caseAAssignEqualsMethodstmtseq(AAssignEqualsMethodstmtseq node) {
		TId id = node.getId();
		boolean tableEntryFound = false;

		for(int i = 0; i < scopeList.size(); i++) {
			if(scopeList.get(i).contains(id)) {
				tableEntryFound = true;
			}
		}
		
		if(!tableEntryFound) {
			System.out.println("ERROR: " + id + " has not been declared.");
		}
	}
	
	public void caseAAssignStringMethodstmtseq(AAssignStringMethodstmtseq node) {
		
	}
	
	public void caseAPrintStmtMethodstmtseq(APrintStmtMethodstmtseq node) {
		
	}
	
	public void caseAAssignReadInMethodstmtseq(AAssignReadInMethodstmtseq node) {
		
	}
	
	public void caseAAssignIncMethodstmtseq(AAssignIncMethodstmtseq node) {
		
	}
	
	public void caseAAssignDecMethodstmtseq(AAssignDecMethodstmtseq node) {
		
	}
	
	public void caseADeclObjectMethodstmtseq(ADeclObjectMethodstmtseq node) {
		
	}
	
	public void caseAAssignBooleanMethodstmtseq(AAssignBooleanMethodstmtseq node) {
		
	}
	
	public void caseAFirstStmtStmtseq(AFirstStmtStmtseq node) {
		
	}
	
	public void caseAEpsilonStmtseq(AEpsilonStmtseq node) {
		
	}
	
	public void caseAAssignExprStmt(AAssignExprStmt node) {
		
	}
	
	public void caseAAssignStringStmt(AAssignStringStmt node) {
		
	}
	
	public void caseAVarDeclStmt(AVarDeclStmt node) {
		
	}
	
	public void caseAIfBlockStmt(AIfBlockStmt node) {
		
	}
	
	public void caseAIfElseBlockStmt(AIfElseBlockStmt node) {
		
	}
	
	public void caseAWhileStmt(AWhileStmt node) {
		
	}
	
	public void caseAForStmt(AForStmt node) {
		
	}
	
	public void caseAGetStmt(AGetStmt node) {
		
	}
	
	public void caseAPutStmt(APutStmt node) {
		
	}
	
	public void caseAIncrStmt(AIncrStmt node) {
		
	}
	
	public void caseADecrStmt(ADecrStmt node) {
		
	}
	
	public void caseADeclObjectStmt(ADeclObjectStmt node) {
		
	}
	
	public void caseAMethodCallStmt(AMethodCallStmt node) {
		
	}
	
	public void caseAMethodCallInClassStmt(AMethodCallInClassStmt node) {
		
	}
	
	public void caseAReturnStmt(AReturnStmt node) {
		
	}
	
	public void caseAAssignBooleanStmt(AAssignBooleanStmt node) {
		
	}
	
	public void caseASwitchStmt(ASwitchStmt node) {
		
	}
	
	public void caseAAnotherCaseCaseHelper(AAnotherCaseCaseHelper node) {
		
	}
	
	public void caseAEpsilonCaseHelper(AEpsilonCaseHelper node) {
		
	}
	
	public void caseABreakBreakHelper(ABreakBreakHelper node) {
		
	}
	
	public void caseAEpsilonBreakHelper(AEpsilonBreakHelper node) {
		
	}
	
	public void caseAMethodCallMethodChainingOption(AMethodCallMethodChainingOption node) {
		
	}
	
	public void caseAEpsilonMethodChainingOption(AEpsilonMethodChainingOption node) {
		
	}
	
	public void caseAIncrForIncrStep(AIncrForIncrStep node) {
		
	}
	
	public void caseADecrForIncrStep(ADecrForIncrStep node) {
		
	}
	
	public void caseAAssignmentForIncrStep(AAssignmentForIncrStep node) {
		
	}
	
	public void caseAForOptionalType(AForOptionalType node) {
		
	}
	
	public void caseAEpsilonForOptionalType(AEpsilonForOptionalType node) {
		
	}
	
	public void caseAMoreIdsMoreIds(AMoreIdsMoreIds node) {
		
	}
	
	public void caseAEpsilonMoreIds(AEpsilonMoreIds node) {
		
	}
	
	public void caseAMoreIdsVarlist(AMoreIdsVarlist node) {
		
	}
	
	public void caseAEpsilonVarlist(AEpsilonVarlist node) {
		
	}
	
	public void caseAArrayArrayOption(AArrayArrayOption node) {
		
	}
	
	public void caseAEpsilonArrayOption(AEpsilonArrayOption node) {
		
	}
	
	public void caseAMoreIdsMoreVarlist(AMoreIdsMoreVarlist node) {
		
	}
	
	public void caseAEpsilonMoreVarlist(AEpsilonMoreVarlist node) {
		
	}
	
	public void caseAVarListVarListTwo(AVarListVarListTwo node) {
		
	}
	
	public void caseAEpsilonVarListTwo(AEpsilonVarListTwo node) {
		
	}
	
	public void caseAExprOrBool(AExprOrBool node) {
		
	}
	
	public void caseABoolExprOrBool(ABoolExprOrBool node) {
		
	}
	
	public void caseAMoreVarListTwo(AMoreVarListTwo node) {
		
	}
	
	public void caseAEpsilonMoreVarListTwo(AEpsilonMoreVarListTwo node) {
		
	}
	
	public void caseAAddExpr(AAddExpr node) {
		
	}
	
	public void caseATermExpr(ATermExpr node) {
		
	}
	
	public void caseAMultTerm(AMultTerm node) {
		
	}
	
	public void caseAFactorTerm(AFactorTerm node) {
		
	}
	
	public void caseAExprFactor(AExprFactor node) {
		
	}
	
	public void caseAIntFactor(AIntFactor node) {
		
	}
	
	public void caseARealFactor(ARealFactor node) {
		
	}
	
	public void caseAArrayFactor(AArrayFactor node) {
		
	}
	
	public void caseAIdvarlistFactor(AIdvarlistFactor node) {
		
	}
	
	public void caseALastFactor(ALastFactor node) {
		
	}
	
	public void caseAArrayArrayOrId(AArrayArrayOrId node) {
		
	}
	
	public void caseAIdArrayOrId(AIdArrayOrId node) {
		
	}
	
	public void caseATrueBoolean(ATrueBoolean node) {
		
	}
	
	public void caseAFalseBoolean(AFalseBoolean node) {
		
	}
	
	public void caseAConditionalBoolean(AConditionalBoolean node) {
		
	}
	
	public void caseABooleanBoolid(ABooleanBoolid node) {
		
	}
	
	public void caseAIdBoolid(AIdBoolid node) {
		
	}
	
	public void caseAPlusAddop(APlusAddop node) {
		
	}
	
	public void caseAMinusAddop(AMinusAddop node) {
		
	}
	
	public void caseATypesType(ATypesType node) {
		
	}
	
	public void caseAIdType(AIdType node) {
		
	}

	/*//this gets called if the production is prog --> id digit
    public void caseAFirstProg(AFirstProg node){
        System.out.println("\tGot a first prog!");
    }

	//prog --> lotnumbers
    public void caseASecondProg(ASecondProg node){
        System.out.println("\tGot a second prog!");
        node.getLotnumbers().apply(this);
    }

	//prog --> id id digit digit
    public void caseAThirdProg(AThirdProg node){
        System.out.println("\tGot a third prog!");
        node.getEachsymbolisuniqueinaproduction().apply(this);
        node.getSecondid().apply(this);
        node.getDigitone().apply(this);
        node.getDigittwo().apply(this);
    }

	//if it reaches an id, print it off
    public void caseTId(TId node){
		 System.out.println("\tGot myself an id: <"+node.getText()+">");
	}

	//if it reaches a digit, print it off
    public void caseTDigit(TDigit node){
		 System.out.println("\tGot myself a digit: <"+node.getText()+">");
	}

	//if it reaches a ALotnumbers, print off the digit stored inside of it
	public void caseALotnumbers(ALotnumbers node){
		System.out.println("\tPrinting the first number: "+node.getDigit());
	}*/
}